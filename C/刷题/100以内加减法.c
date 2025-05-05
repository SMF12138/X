#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX_PROBLEMS 50
#define COLS 5  // 每行显示5个算式

// 结构体保存加减法算式
typedef struct {
    int a;
    int b;
    int result;
    int operation; // 0为加法，1为减法
} Problem;

// 判断新生成的算式是否已经存在
int is_duplicate(Problem problems[], int count, Problem new_problem) {
    for (int i = 0; i < count; i++) {
        if (problems[i].a == new_problem.a && problems[i].b == new_problem.b && problems[i].operation == new_problem.operation) {
            return 1; // 存在重复
        }
    }
    return 0; // 没有重复
}

int main() {
    int num_problems = MAX_PROBLEMS;
    Problem problems[MAX_PROBLEMS]; // 用于存储生成的算式
    int count = 0;

    // 初始化随机数种子
    srand(time(0));

    while (count < num_problems) {
        Problem new_problem;

        // 随机选择加法或减法
        new_problem.operation = rand() % 2; // 0为加法，1为减法
        
        if (new_problem.operation == 0) { // 加法
            // 确保 a + b <= 100
            new_problem.a = rand() % 51; // a 范围 [0, 50]
            new_problem.b = rand() % (101 - new_problem.a); // b 范围 [0, 100-a]
            new_problem.result = new_problem.a + new_problem.b;
        } else { // 减法
            // 确保 a - b >= 0 且 a <= 100
            new_problem.a = rand() % 101; // a 范围 [0, 100]
            new_problem.b = rand() % (new_problem.a + 1); // b 范围 [0, a]
            new_problem.result = new_problem.a - new_problem.b;
        }
        
        // 检查是否重复
        if (!is_duplicate(problems, count, new_problem)) {
            problems[count] = new_problem; // 存储新算式
            count++;
        }
    }

    // 输出结果，每行五列
    for (int i = 0; i < num_problems; i++) {
        Problem p = problems[i];
        // 打印每道题目
        if (p.operation == 0) {
            printf("%2d + %2d =    ", p.a, p.b); // 对齐输出
        } else {
            printf("%2d - %2d =    ", p.a, p.b); // 对齐输出
        }

        // 每行5列，打印完5个算式后换行
        if ((i + 1) % COLS == 0) {
            printf("\n");
        }
    }

	printf("\n");
    printf("答案\n"); // 在题目和答案之间留一行空行
    printf("\n");

    // 输出答案
    for (int i = 0; i < num_problems; i++) {
        Problem p = problems[i];
        // 打印答案
        printf("= %4d   ", p.result); // 对齐输出答案

        // 每行5列，打印完5个答案后换行
        if ((i + 1) % COLS == 0) {
            printf("\n");
        }
    }

    return 0;
}

