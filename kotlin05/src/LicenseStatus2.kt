//密封
sealed class LicenseStatus2 {
    //object 单例的 里面没有属性就可以用单例的
    object UnQualified : LicenseStatus2 ()
    object Learning : LicenseStatus2()
    //可以引入属性 保存数据
    class Qualified(val licenseId: String) : LicenseStatus2()

}

class Driver2 (var status: LicenseStatus2) {
    fun checkLicense() : String {
        return when(status) {
            is LicenseStatus2.UnQualified -> "没资格"
            is LicenseStatus2.Learning -> "在学"
            //将status转为LicenseStatus2.Qualified 来获取编号
            is LicenseStatus2.Qualified -> "有资格, 驾驶证编号:${(this.status as LicenseStatus2.Qualified).licenseId}"
        }
    }
}

fun main() {
    val status = LicenseStatus2.Qualified("xxx")
    val driver = Driver2(status)
    println(driver.checkLicense())
}