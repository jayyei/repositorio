const app = Vue.createApp({
  data() {
    return {
      counter: 10,
      name: "",

    };
  },
  methods: {
    outputFullname(){
      console.log('running again')
      if(this.name === '') return ''
      return this.name + ' ' + 'Sanchez'
    },
    submitForm(e) {
      //e.preventDefault();
      alert("Submitted!");
    },
    setName(e, lastName) {
      this.name = `${e.target.value}`;
      //e.target.value = '';
    },
    add(n) {
      this.counter = this.counter + n;
    },
    reduce(e, n) {
      if (this.counter <= 0) {
        this.counter = 0;
        return;
      }
      this.counter = this.counter - n;
    },
    resetInput(){
      this.name = ""
    }
  },
});

app.mount("#events");
