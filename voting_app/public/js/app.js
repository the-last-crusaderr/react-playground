


class ProductList extends React.Component{

       constructor(props){
          super(props)
	  this.state = { products:[] };
	       }

	componentDidMount(){
          this.setState({products: Seed.products}); 
		}       

	handleProductUpVote(productId){
          console.log(productId +' was upvoted');
		}
 render(){
   const products = Seed.products.sort((a, b) => (
      b.votes - a.votes
    ));	 

   const productComponents = products.map((product) => 	 
    (
      <Product
       key = {"product-"+product.id}
       id = {product.id}
       description = {product.description}
       title = {product.title}
       url = {product.url}
       votes = {product.votes}
       submitterAvatarUrl={product.submitterAvatarUrl}
       productImageUrl={product.productImageUrl}
       onVote = {this.handleProductUpVote}
      />
    ));

   return(
    <div className="ui unstackable items">
     {productComponents}
    </div>
   )

	}

}


class Product extends React.Component{
  render(){
   


   return(
     <div className="item">
       <div className="image">
        	<img src={this.props.productImageUrl}/>
       </div>
       <div className="middle aligned content">
       <div className='header'>
            	<a onClick = {() => this.props.onVote(this.props.id)}>
              		<i className='large caret up icon' />
            	</a>
            	{this.props.votes}
        </div>
        <div className="description">
        	 <a href={this.props.url}>{this.props.title}</a>
	 	<p>{this.props.description}</p>
        </div>
	<div className="extra">
          	<span>Submitted by:</span>
	  	<img className='ui avatar image' src={this.props.submitterAvatarUrl}/>
        </div>
       </div>
    </div>
   )
	  }
	}




ReactDOM.render(<ProductList />,
        document.getElementById("content"));



