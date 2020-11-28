<template>
  <div>
    <el-row>
      <el-col :span="8" class="center">
        <el-input
          v-model="search"
          @focus="focus"
          @blur="blur"
          @keyup.enter.native="searchHandler"
          placeholder="Durchsuche mich bitte"
        >
          <el-button slot="append" icon="el-icon-search" id="search" @click="searchHandler"></el-button>
        </el-input>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  data () {
    return {
      image: require('@/assets/wiki.png'),
      search: '',
      isFocus: false
    }
  },
  methods: {
    focus () {
      this.isFocus = true
    }
  }
}
</script>

<style>
.center {
  margin-top: 15px;
  margin-left: 33%;
}
</style>
