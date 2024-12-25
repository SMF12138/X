package NewLearn.Learn195;

public class Learn195 {
    public static void main(String[] args) {
        //Java12新特性文本块
        //不使用新特性，想输出一段有格式的代码只能手动拼接
        String htmlCode = """
                <head>
                    <style type="text/css">\
                        body {background-color:yellow;}\s\s
                        p {color:blue;}
                    </style>
                </head>
                """;//文本格式不变，\s空格，\表示取消换行
        System.out.println(htmlCode);
    }
}
