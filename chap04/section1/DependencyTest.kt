package chap04.section1

class Patient41(val name: String, var id: Int){
    fun doctorList(d: Doctor){
        println("Patient: $name, Doctor: ${d.name}")
    }
}
class Doctor2(val name: String, val p: Patient41){
    val customerId: Int = p.id

    fun patientList(){
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}
fun main() {
    val patient1 = Patient41("Kildong", 1234)
    val doc1 = Doctor2("KimSabu", patient1)
    doc1.patientList()
}