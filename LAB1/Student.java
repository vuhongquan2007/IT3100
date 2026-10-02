public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Ghi đè (Override) phương thức equals của lớp Thủy tổ Object
    @Override
    public boolean equals(Object obj) {
        // Bước 1: Kiểm tra xem có trỏ cùng vào một ô nhớ không (Tối ưu tốc độ)
        if (this == obj) {
            return true;
        }

        // Bước 2: Kiểm tra null và kiểm tra xem có cùng là class Student không
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Bước 3: Ép kiểu (Cast) từ Object chung chung về đúng hình hài Student
        Student otherStudent = (Student) obj;

        // Bước 4: So sánh từng thuộc tính
        // Vì ID và Name là String (Đối tượng), ta PHẢI dùng equals() của String, không dùng ==
        return this.id.equals(otherStudent.id) && this.name.equals(otherStudent.name);
        
        // Lưu ý thực tế: Thông thường với sinh viên, chỉ cần so sánh ID là đủ vì ID là duy nhất. 
        // Nhưng ở đây ta so sánh cả hai theo đúng yêu cầu đề bài.
    }

    public static void main(String[] args) {
        // Tạo 2 đối tượng khác biệt trên vùng nhớ Heap nhưng nội dung giống hệt nhau
        Student sv1 = new Student("202516230", "Vũ Hồng Quân");
        Student sv2 = new Student("202516230", "Vũ Hồng Quân");
        
        // Tạo một sinh viên khác
        Student sv3 = new Student("202500000", "Nguyễn Văn A");

        // Kiểm tra kết quả
        System.out.println("sv1 có bằng sv2 không? " + sv1.equals(sv2)); // Kết quả: true
        System.out.println("sv1 có bằng sv3 không? " + sv1.equals(sv3)); // Kết quả: false
    }
}