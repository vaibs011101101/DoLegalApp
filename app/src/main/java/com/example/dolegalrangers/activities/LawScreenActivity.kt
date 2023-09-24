package com.example.dolegalrangers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.dolegalrangers.R
import com.example.dolegalrangers.models.LawViewModel

class LawScreenActivity : AppCompatActivity() {
    private lateinit var list:ArrayList<LawViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_law_screen)

        list = ArrayList()

        val image = findViewById<ImageView>(R.id.law_image)
        val name = findViewById<TextView>(R.id.law_name_view)
        val section = findViewById<TextView>(R.id.law_section_view)
        val description_eng = findViewById<TextView>(R.id.law_desc_eng)
        val description_hindi = findViewById<TextView>(R.id.law_desc_hindi)

        val lawIndex = intent.getStringExtra("index")?.toInt()

        list.add(LawViewModel(R.drawable.rte,"The Right to Education","Act (RTE), 2009","The RTE Act makes elementary education a fundamental right for children between the ages of 6 and 14. It mandates free and compulsory education, prohibits discrimination, and outlines the responsibilities of the government and schools in providing quality education.","RTE अधिनियम बच्चों के लिए आठ से 14 वर्ष की आयु के बीच प्रारंभिक शिक्षा को एक मौलिक अधिकार बनाता है। इसमें मुफ्त और अनिवार्य शिक्षा की विवाद नहीं करने, भेदभाव को रोकने और सरकार और स्कूलों की गुणवत्ता शिक्षा प्रदान करने में जिम्मेदारियों का विवरण दिया गया है।"))
        list.add(LawViewModel(R.drawable.childabuse,"The Protection of Children from Sexual Offences","(POCSO) Act, 2012","This act is designed to protect children from sexual abuse and exploitation. It defines various sexual offenses against children and prescribes stringent punishments for offenders. It also ensures the speedy trial of such cases.","इस अधिनियम का उद्देश्य बच्चों को यौन शोषण और शोषण से बचाना है। इसमें बच्चों के खिलाफ विभिन्न यौन अपराधों को परिभाषित किया गया है और अपराधी के लिए कठिन कानूनी कार्रवाई की प्रावधानिकता है। इसका उद्देश्य ऐसे मामलों की त्वरित न्यायिक प्रक्रिया सुनिश्चित करना है।"))
        list.add(LawViewModel(R.drawable.childlabour,"The Child Labour (Prohibition and Regulation)"," Act, 1986","This act prohibits the employment of children below the age of 14 in certain hazardous occupations and processes while regulating their work conditions in non-hazardous employment. It aims to eliminate child labor.","इस अधिनियम से कुछ खतरनाक व्यवसायों और प्रक्रियाओं में 14 वर्ष से कम आयु के बच्चों का रोजगार प्रतिषेध है, जबकि गैर-खतरनाक रोजगार में उनकी काम की स्थितियों को विनियमित करता है। इसका उद्देश्य बच्चे श्रम से मुक्ति दिलाना है।"))

        image.setImageResource(list[lawIndex!!].image)
        name.text = list[lawIndex].name
        section.text = list[lawIndex].Section
        description_eng.text = list[lawIndex].description_english
        description_hindi.text = list[lawIndex].description_hindi

    }
}