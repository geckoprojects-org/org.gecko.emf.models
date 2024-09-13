/**
 */
package org.w3.rdf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.rdf.RdfPackage
 * @generated
 */
public interface RdfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfFactory eINSTANCE = org.w3.rdf.impl.RdfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RDF List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF List</em>'.
	 * @generated
	 */
	RDFList createRDFList();

	/**
	 * Returns a new object of class '<em>Rest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest</em>'.
	 * @generated
	 */
	Rest createRest();

	/**
	 * Returns a new object of class '<em>Alt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt</em>'.
	 * @generated
	 */
	Alt createAlt();

	/**
	 * Returns a new object of class '<em>Bag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag</em>'.
	 * @generated
	 */
	Bag createBag();

	/**
	 * Returns a new object of class '<em>IRI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IRI</em>'.
	 * @generated
	 */
	IRI createIRI();

	/**
	 * Returns a new object of class '<em>RDF Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Subject</em>'.
	 * @generated
	 */
	RDFSubject createRDFSubject();

	/**
	 * Returns a new object of class '<em>RDF Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Statement</em>'.
	 * @generated
	 */
	RDFStatement createRDFStatement();

	/**
	 * Returns a new object of class '<em>RDF Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Predicate</em>'.
	 * @generated
	 */
	RDFPredicate createRDFPredicate();

	/**
	 * Returns a new object of class '<em>RDF Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Type</em>'.
	 * @generated
	 */
	RDFType createRDFType();

	/**
	 * Returns a new object of class '<em>RDF Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Value</em>'.
	 * @generated
	 */
	RDFValue createRDFValue();

	/**
	 * Returns a new object of class '<em>First</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First</em>'.
	 * @generated
	 */
	First createFirst();

	/**
	 * Returns a new object of class '<em>Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq</em>'.
	 * @generated
	 */
	Seq createSeq();

	/**
	 * Returns a new object of class '<em>RDF Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Object</em>'.
	 * @generated
	 */
	RDFObject createRDFObject();

	/**
	 * Returns a new object of class '<em>RDFURI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDFURI</em>'.
	 * @generated
	 */
	RDFURI createRDFURI();

	/**
	 * Returns a new object of class '<em>RDF Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Property</em>'.
	 * @generated
	 */
	RDFProperty createRDFProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RdfPackage getRdfPackage();

} //RdfFactory
