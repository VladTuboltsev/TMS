public class Run {
    public static void main(String[] args) throws Exception {
        DAO dao = new DAO();
        String text = dao.ReadText("./string.txt");
        String[] a = text.split("\\s");
        for(String str : a){
            if(PolyndCheck.polyndCheck(str)){
                dao.WriteText("./new.txt", str);
            }
        }

    }
}
