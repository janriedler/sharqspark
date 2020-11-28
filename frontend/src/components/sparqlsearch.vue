<template>
<div>
    <el-row>
        <el-col :span="2">
            <div class='parent'>
              <div class='child inline-block-child'>
              <el-button v-on:click="isHidden = !isHidden" id="button">SPARQL Suche
              </el-button></div><div class='child inline-block-child'>
              <img :src="image" alt="" class="logo">
              </div>
            </div>
        </el-col>
      <el-col :span="8" v-if="!isHidden" class="centerSearch">
        <el-input
          v-model="search"
          @focus="focus"
          @blur="blur"
          @keyup.enter.native="searchHandler"
          placeholder="Deine SPARQL Anfrage"
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
      image: require('@/assets/Dreieck.png'),
      isHidden: true
    }
  }
}
</script>

<style>
.inline-block-child {
    display: inline-block;
}
.logo {
    display: block;
    height: 15px;
    margin-left: 60%;
    margin-top: 20px;
}
#button {
    margin-left: 5%;
    margin-top: 5%;
    padding: 0;
    border: 0px;
    background: none;
}
.centerSearch {
  margin-top: 3%;
  margin-left: 24.6%;
}
</style>
