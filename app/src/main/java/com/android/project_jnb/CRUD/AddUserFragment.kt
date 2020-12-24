import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.android.project_jnb.HomeActivity


class AddUserFragment : Fragment() {
    @Nullable
    fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View {
        val fragmentAddUserBinding: FragmentAddUserBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_user, container, false)
        fragmentAddUserBinding.btnSubmit.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                val id: Int = fragmentAddUserBinding.id.getText().toString().toInt()
                val name: String = fragmentAddUserBinding.name.getText().toString()
                val email: String = fragmentAddUserBinding.email.getText().toString()
                val user = User()
                user.setId(id)
                user.setName(name)
                user.setEmail(email)
                HomeActivity.PeminjamRoomDatabase.myDao().addUser(user)
                Toast.makeText(getContext(), "User added successfully", Toast.LENGTH_SHORT).show()
            }
        })
        return fragmentAddUserBinding.getRoot()
    }
}