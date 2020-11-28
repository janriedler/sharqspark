<template>
    <el-row>
        <el-col :span="4" class="navbar__logo-box">
           <img :src="image" alt="" class="navbar__logo">
        </el-col>
        <el-col :span="20" class="navbar__menu-box">
            <ul class="el-menu el-menu--horizontal navbar__menu">
                <li class="el-menu-item">SPARQL</li>
                <li class="el-menu-item">Admin Panel</li>
                <li class="el-menu-item">
                    <el-dropdown trigger="click" v-on:command="handleNavDropdownCommand">
                        <span class="el-dropdown-link">Sprache <i class="el-icon-caret-bottom el-icon--right"></i></span>
                        <el-dropdown-menu slot="dropdown" class="navbar__dropdown-menu">
                            <el-dropdown-item><router-link to="/user/recharge">Englisch</router-link></el-dropdown-item>
                            <el-dropdown-item><router-link to="/user/account">Deutsch</router-link></el-dropdown-item>
                            <el-dropdown-item command="logout" divided>beides</el-dropdown-item>
                        </el-dropdown-menu>
                    </el-dropdown>
                </li>
                <li class="el-menu-item">Account</li>
                <li class="el-menu-item">Logout</li>
            </ul>
            <p class="navbar__title"><a href="#">SparqShark</a></p>
        </el-col>
    </el-row>
</template>
<script>
export default {
  data () {
    return {
      image: require('@/assets/wiki.png')
    }
  },
  methods: {
    handleNavDropdownCommand: function (command) {
      if (command === 'logout') {
        this.$confirm('Beide Sprachen?', 'Es kann zu langen Wartezeiten kommen', {
          confirmButtonText: 'Verstande',
          cancelButtonText: 'Abrechen',
          type: 'warning'
        }).then(function () {
          this.$message('Es wird jetzt in beiden Sprachen gesucht')
        }.bind(this))
      }
    }
  }
}
</script>
<style>
    .navbar__logo {
        display: block;
        height: 60px;
        margin-left: auto;
        margin-right: auto;
    }
    .navbar__menu-box {
        background-color: #fff;
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
    }
    .navbar__menu {
        float: right;
        background-color: #fff;
    }
    .navbar__dropdown-menu a {
        color: inherit;
        text-decoration: none;
    }
    .navbar__title {
        margin-top: 0;
        margin-bottom: 0;
        margin-left: 12px;
        height: 60px;
        line-height: 60px;
        font-size: 1.5em;
        font-weight: bold;
    }
    .navbar__title a {
        color: #48576a;
        text-decoration: none;
    }
</style>
