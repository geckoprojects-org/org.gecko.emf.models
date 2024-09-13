/**
 */
package org.w3.owl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.owl.OwlPackage
 * @generated
 */
public interface OwlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OwlFactory eINSTANCE = org.w3.owl.impl.OwlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Nothing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nothing</em>'.
	 * @generated
	 */
	Nothing createNothing();

	/**
	 * Returns a new object of class '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing</em>'.
	 * @generated
	 */
	Thing createThing();

	/**
	 * Returns a new object of class '<em>Typed Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Thing</em>'.
	 * @generated
	 */
	TypedThing createTypedThing();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Range</em>'.
	 * @generated
	 */
	DataRange createDataRange();

	/**
	 * Returns a new object of class '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Property</em>'.
	 * @generated
	 */
	ObjectProperty createObjectProperty();

	/**
	 * Returns a new object of class '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Individual</em>'.
	 * @generated
	 */
	NamedIndividual createNamedIndividual();

	/**
	 * Returns a new object of class '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual</em>'.
	 * @generated
	 */
	Individual createIndividual();

	/**
	 * Returns a new object of class '<em>real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>real</em>'.
	 * @generated
	 */
	real createreal();

	/**
	 * Returns a new object of class '<em>Ontology Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology Property</em>'.
	 * @generated
	 */
	OntologyProperty createOntologyProperty();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction</em>'.
	 * @generated
	 */
	Restriction createRestriction();

	/**
	 * Returns a new object of class '<em>Asymmetric Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asymmetric Property</em>'.
	 * @generated
	 */
	AsymmetricProperty createAsymmetricProperty();

	/**
	 * Returns a new object of class '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Individual</em>'.
	 * @generated
	 */
	AnonymousIndividual createAnonymousIndividual();

	/**
	 * Returns a new object of class '<em>Transitive Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transitive Property</em>'.
	 * @generated
	 */
	TransitiveProperty createTransitiveProperty();

	/**
	 * Returns a new object of class '<em>rational</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>rational</em>'.
	 * @generated
	 */
	rational createrational();

	/**
	 * Returns a new object of class '<em>Reflexive Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reflexive Property</em>'.
	 * @generated
	 */
	ReflexiveProperty createReflexiveProperty();

	/**
	 * Returns a new object of class '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology</em>'.
	 * @generated
	 */
	Ontology createOntology();

	/**
	 * Returns a new object of class '<em>Symmetric Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symmetric Property</em>'.
	 * @generated
	 */
	SymmetricProperty createSymmetricProperty();

	/**
	 * Returns a new object of class '<em>All Disjoint Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Disjoint Properties</em>'.
	 * @generated
	 */
	AllDisjointProperties createAllDisjointProperties();

	/**
	 * Returns a new object of class '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axiom</em>'.
	 * @generated
	 */
	Axiom createAxiom();

	/**
	 * Returns a new object of class '<em>Datatype Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Property</em>'.
	 * @generated
	 */
	DatatypeProperty createDatatypeProperty();

	/**
	 * Returns a new object of class '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype</em>'.
	 * @generated
	 */
	Datatype createDatatype();

	/**
	 * Returns a new object of class '<em>Negative Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Property Assertion</em>'.
	 * @generated
	 */
	NegativePropertyAssertion createNegativePropertyAssertion();

	/**
	 * Returns a new object of class '<em>Functional Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Property</em>'.
	 * @generated
	 */
	FunctionalProperty createFunctionalProperty();

	/**
	 * Returns a new object of class '<em>All Disjoint Classes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Disjoint Classes</em>'.
	 * @generated
	 */
	AllDisjointClasses createAllDisjointClasses();

	/**
	 * Returns a new object of class '<em>All Different</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Different</em>'.
	 * @generated
	 */
	AllDifferent createAllDifferent();

	/**
	 * Returns a new object of class '<em>Irreflexive Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irreflexive Property</em>'.
	 * @generated
	 */
	IrreflexiveProperty createIrreflexiveProperty();

	/**
	 * Returns a new object of class '<em>Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Property</em>'.
	 * @generated
	 */
	AnnotationProperty createAnnotationProperty();

	/**
	 * Returns a new object of class '<em>Inverse Functional Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverse Functional Property</em>'.
	 * @generated
	 */
	InverseFunctionalProperty createInverseFunctionalProperty();

	/**
	 * Returns a new object of class '<em>Deprecated Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deprecated Class</em>'.
	 * @generated
	 */
	DeprecatedClass createDeprecatedClass();

	/**
	 * Returns a new object of class '<em>Deprecated Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deprecated Property</em>'.
	 * @generated
	 */
	DeprecatedProperty createDeprecatedProperty();

	/**
	 * Returns a new object of class '<em>Property Chain Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Chain Axiom</em>'.
	 * @generated
	 */
	PropertyChainAxiom createPropertyChainAxiom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OwlPackage getOwlPackage();

} //OwlFactory
