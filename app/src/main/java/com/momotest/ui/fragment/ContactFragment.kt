package com.momotest.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.momotest.ui.R
import com.momotest.ui.adapter.ContactAdapter
import com.momotest.ui.model.Contact
import kotlinx.android.synthetic.main.fragment_contact.*


class ContactFragment : Fragment() {
    private lateinit var listContact : ArrayList<Contact>
    private lateinit var contactAdapter: ContactAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
    }
    private fun initData () {
        listContact = ArrayList()
        listContact.add(Contact(R.drawable.user_image,"Nguyen Huy"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Thanh"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Nghia"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Tien"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hao"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hai"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Huong"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hong"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Ha"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Son"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Luan"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Phat"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen An"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Huy"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Thanh"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Nghia"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Tien"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hao"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hai"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Huong"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hong"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Ha"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Son"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Luan"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Phat"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen An"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Huy"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Thanh"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Nghia"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Tien"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hao"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hai"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Huong"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Hong"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Ha"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Son"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Luan"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen Phat"))
        listContact.add(Contact(R.drawable.user_image,"Nguyen An"))

        contactAdapter = ContactAdapter(requireContext(), listContact)
        rvContact.adapter = contactAdapter


    }
}