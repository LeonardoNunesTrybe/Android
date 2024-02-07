package com.example.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R

class MainActivity : AppCompatActivity() {

    private val menuList: RecyclerView by lazy { findViewById(R.id.main_menu) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pratos = listOf(
            Prato("File de Carne com Fritas", R.drawable.prato_01, "Uma suculenta porção de filé de carne grelhado na perfeição, servido com deliciosas batatas fritas crocantes. Uma explosão de sabor que vai satisfazer seus desejos mais carnívoros.", "R\$ 65,00"),
            Prato("Frango Grelhado com Legumes", R.drawable.prato_02, "Uma opção saudável e saborosa: peitos de frango suculentos grelhados à perfeição, acompanhados de legumes frescos, preparados para manter a crocância e o sabor. Uma refeição leve e deliciosa para quem busca um toque de frescor.", "R\$ 45,00"),
            Prato("Mix de File de Carne e Frango Grelhados", R.drawable.prato_03, "A melhor escolha para os indecisos! Uma combinação harmoniosa de filé de carne suculento e peito de frango grelhado, oferecendo uma explosão de sabores em cada garfada. Acompanhado de opções de molhos que tornam essa escolha ainda mais especial.", "R\$ 85,00"),
            Prato("Picanha Grelhada com Macaxeira Frita", R.drawable.prato_04, "Uma refeição de dar água na boca! Picanha de primeira qualidade, grelhada à perfeição e servida com macaxeira frita crocante. Um prato que celebra o melhor da culinária brasileira.", "R\$ 90,00"),
            Prato("Porção de Batatas Fritas com Molho", R.drawable.prato_05, "Para os amantes de batatas, esta é a escolha ideal. Nossas batatas fritas são cortadas e preparadas na hora para garantir a crocância perfeita. Acompanhadas de uma variedade de molhos incríveis que vão tornar cada mordida ainda mais especial. Acompanhamento perfeito para qualquer refeição.", "R\$ 20,00"),
            Prato("Suco de Laranja", R.drawable.bebida_01, "Um gole de pura refrescância e vitalidade. Nosso suco de laranja é feito com as laranjas mais suculentas e frescas, espremidas na hora para garantir o sabor cítrico e natural que todos adoram. Perfeito para acompanhar suas refeições ou para matar a sede a qualquer hora do dia. Deleite-se com o gosto da natureza em um copo.", "R\$ 10,00"),
        )

        menuList.layoutManager = LinearLayoutManager(this)
        menuList.adapter = PratoAdapter(pratos)
    }
}
