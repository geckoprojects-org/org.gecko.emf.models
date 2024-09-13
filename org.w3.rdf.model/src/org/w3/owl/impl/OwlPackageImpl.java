/**
 */
package org.w3.owl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;
import org.w3.owl.AllDifferent;
import org.w3.owl.AllDisjointClasses;
import org.w3.owl.AllDisjointProperties;
import org.w3.owl.Annotation;
import org.w3.owl.AnnotationProperty;
import org.w3.owl.AnonymousIndividual;
import org.w3.owl.AsymmetricProperty;
import org.w3.owl.Axiom;
import org.w3.owl.DataRange;
import org.w3.owl.Datatype;
import org.w3.owl.DatatypeProperty;
import org.w3.owl.DeprecatedClass;
import org.w3.owl.DeprecatedProperty;
import org.w3.owl.FunctionalProperty;
import org.w3.owl.Individual;
import org.w3.owl.InverseFunctionalProperty;
import org.w3.owl.IrreflexiveProperty;
import org.w3.owl.NamedIndividual;
import org.w3.owl.NegativePropertyAssertion;
import org.w3.owl.Nothing;
import org.w3.owl.ObjectProperty;
import org.w3.owl.Ontology;
import org.w3.owl.OntologyProperty;
import org.w3.owl.OwlFactory;
import org.w3.owl.OwlPackage;
import org.w3.owl.PropertyChainAxiom;
import org.w3.owl.ReflexiveProperty;
import org.w3.owl.Restriction;
import org.w3.owl.SymmetricProperty;
import org.w3.owl.Thing;
import org.w3.owl.TransitiveProperty;
import org.w3.owl.Type;
import org.w3.owl.TypedThing;
import org.w3.owl.rational;
import org.w3.owl.real;
import org.w3.rdf.RdfPackage;
import org.w3.rdf.impl.RdfPackageImpl;
import org.w3.rdfs.RdfsPackage;
import org.w3.rdfs.impl.RdfsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlPackageImpl extends EPackageImpl implements OwlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nothingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asymmetricPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitivePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexivePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allDisjointPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativePropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allDisjointClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allDifferentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irreflexivePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseFunctionalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deprecatedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deprecatedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyChainAxiomEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.w3.owl.OwlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OwlPackageImpl() {
		super(eNS_URI, OwlFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OwlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OwlPackage init() {
		if (isInited) return (OwlPackage)EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOwlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OwlPackageImpl theOwlPackage = registeredOwlPackage instanceof OwlPackageImpl ? (OwlPackageImpl)registeredOwlPackage : new OwlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI);
		RdfsPackageImpl theRdfsPackage = (RdfsPackageImpl)(registeredPackage instanceof RdfsPackageImpl ? registeredPackage : RdfsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		RdfPackageImpl theRdfPackage = (RdfPackageImpl)(registeredPackage instanceof RdfPackageImpl ? registeredPackage : RdfPackage.eINSTANCE);

		// Create package meta-data objects
		theOwlPackage.createPackageContents();
		theRdfsPackage.createPackageContents();
		theRdfPackage.createPackageContents();

		// Initialize created meta-data
		theOwlPackage.initializePackageContents();
		theRdfsPackage.initializePackageContents();
		theRdfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOwlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OwlPackage.eNS_URI, theOwlPackage);
		return theOwlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNothing() {
		return nothingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedThing() {
		return typedThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRange() {
		return dataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectProperty() {
		return objectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectProperty_PropertyChainAxiom() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedIndividual() {
		return namedIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getreal() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologyProperty() {
		return ontologyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_HasKey() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_DisjointUnionOf() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestriction() {
		return restrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestriction_Cardinality() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestriction_MaxCardinality() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestriction_MaxQualifiedCardinality() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestriction_MinCardinality() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestriction_MinQualifiedCardinality() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRestriction_QualifiedCardinality() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestriction_HasSelf() {
		return (EReference)restrictionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestriction_OnProperites() {
		return (EReference)restrictionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsymmetricProperty() {
		return asymmetricPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousIndividual() {
		return anonymousIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitiveProperty() {
		return transitivePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getrational() {
		return rationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReflexiveProperty() {
		return reflexivePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntology() {
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymmetricProperty() {
		return symmetricPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllDisjointProperties() {
		return allDisjointPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAxiom() {
		return axiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatatypeProperty() {
		return datatypePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativePropertyAssertion() {
		return negativePropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNegativePropertyAssertion_SourceIndividual() {
		return (EReference)negativePropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNegativePropertyAssertion_TargetIndividual() {
		return (EReference)negativePropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNegativePropertyAssertion_TargetValue() {
		return (EReference)negativePropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNegativePropertyAssertion_AssertionProperty() {
		return (EReference)negativePropertyAssertionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalProperty() {
		return functionalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllDisjointClasses() {
		return allDisjointClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllDifferent() {
		return allDifferentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllDifferent_DistinctMembers() {
		return (EReference)allDifferentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIrreflexiveProperty() {
		return irreflexivePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationProperty() {
		return annotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInverseFunctionalProperty() {
		return inverseFunctionalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeprecatedClass() {
		return deprecatedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeprecatedProperty() {
		return deprecatedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyChainAxiom() {
		return propertyChainAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OwlFactory getOwlFactory() {
		return (OwlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nothingEClass = createEClass(NOTHING);

		thingEClass = createEClass(THING);

		typedThingEClass = createEClass(TYPED_THING);

		annotationEClass = createEClass(ANNOTATION);

		dataRangeEClass = createEClass(DATA_RANGE);

		objectPropertyEClass = createEClass(OBJECT_PROPERTY);
		createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__PROPERTY_CHAIN_AXIOM);

		namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

		individualEClass = createEClass(INDIVIDUAL);

		realEClass = createEClass(REAL);

		ontologyPropertyEClass = createEClass(ONTOLOGY_PROPERTY);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__HAS_KEY);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__DISJOINT_UNION_OF);

		restrictionEClass = createEClass(RESTRICTION);
		createEAttribute(restrictionEClass, RESTRICTION__CARDINALITY);
		createEAttribute(restrictionEClass, RESTRICTION__MAX_CARDINALITY);
		createEAttribute(restrictionEClass, RESTRICTION__MAX_QUALIFIED_CARDINALITY);
		createEAttribute(restrictionEClass, RESTRICTION__MIN_CARDINALITY);
		createEAttribute(restrictionEClass, RESTRICTION__MIN_QUALIFIED_CARDINALITY);
		createEAttribute(restrictionEClass, RESTRICTION__QUALIFIED_CARDINALITY);
		createEReference(restrictionEClass, RESTRICTION__HAS_SELF);
		createEReference(restrictionEClass, RESTRICTION__ON_PROPERITES);

		asymmetricPropertyEClass = createEClass(ASYMMETRIC_PROPERTY);

		anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);

		transitivePropertyEClass = createEClass(TRANSITIVE_PROPERTY);

		rationalEClass = createEClass(RATIONAL);

		reflexivePropertyEClass = createEClass(REFLEXIVE_PROPERTY);

		ontologyEClass = createEClass(ONTOLOGY);

		symmetricPropertyEClass = createEClass(SYMMETRIC_PROPERTY);

		allDisjointPropertiesEClass = createEClass(ALL_DISJOINT_PROPERTIES);

		axiomEClass = createEClass(AXIOM);

		datatypePropertyEClass = createEClass(DATATYPE_PROPERTY);

		datatypeEClass = createEClass(DATATYPE);

		negativePropertyAssertionEClass = createEClass(NEGATIVE_PROPERTY_ASSERTION);
		createEReference(negativePropertyAssertionEClass, NEGATIVE_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
		createEReference(negativePropertyAssertionEClass, NEGATIVE_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);
		createEReference(negativePropertyAssertionEClass, NEGATIVE_PROPERTY_ASSERTION__TARGET_VALUE);
		createEReference(negativePropertyAssertionEClass, NEGATIVE_PROPERTY_ASSERTION__ASSERTION_PROPERTY);

		functionalPropertyEClass = createEClass(FUNCTIONAL_PROPERTY);

		allDisjointClassesEClass = createEClass(ALL_DISJOINT_CLASSES);

		allDifferentEClass = createEClass(ALL_DIFFERENT);
		createEReference(allDifferentEClass, ALL_DIFFERENT__DISTINCT_MEMBERS);

		irreflexivePropertyEClass = createEClass(IRREFLEXIVE_PROPERTY);

		annotationPropertyEClass = createEClass(ANNOTATION_PROPERTY);

		inverseFunctionalPropertyEClass = createEClass(INVERSE_FUNCTIONAL_PROPERTY);

		deprecatedClassEClass = createEClass(DEPRECATED_CLASS);

		deprecatedPropertyEClass = createEClass(DEPRECATED_PROPERTY);

		propertyChainAxiomEClass = createEClass(PROPERTY_CHAIN_AXIOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RdfsPackage theRdfsPackage = (RdfsPackage)EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		RdfPackage theRdfPackage = (RdfPackage)EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nothingEClass.getESuperTypes().add(this.getThing());
		thingEClass.getESuperTypes().add(this.getTypedThing());
		typedThingEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		annotationEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		dataRangeEClass.getESuperTypes().add(theRdfsPackage.getRDFDatatype());
		objectPropertyEClass.getESuperTypes().add(theRdfsPackage.getRDFDatatype());
		namedIndividualEClass.getESuperTypes().add(this.getIndividual());
		individualEClass.getESuperTypes().add(this.getThing());
		realEClass.getESuperTypes().add(theRdfsPackage.getRDFLiteral());
		ontologyPropertyEClass.getESuperTypes().add(theRdfPackage.getRDFProperty());
		classEClass.getESuperTypes().add(this.getType());
		typeEClass.getESuperTypes().add(theUMLPackage.getClass_());
		restrictionEClass.getESuperTypes().add(this.getClass_());
		asymmetricPropertyEClass.getESuperTypes().add(this.getObjectProperty());
		anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
		transitivePropertyEClass.getESuperTypes().add(this.getObjectProperty());
		rationalEClass.getESuperTypes().add(this.getreal());
		reflexivePropertyEClass.getESuperTypes().add(this.getObjectProperty());
		ontologyEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		symmetricPropertyEClass.getESuperTypes().add(this.getObjectProperty());
		allDisjointPropertiesEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		axiomEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		datatypePropertyEClass.getESuperTypes().add(theRdfPackage.getRDFProperty());
		datatypeEClass.getESuperTypes().add(this.getType());
		datatypeEClass.getESuperTypes().add(theRdfsPackage.getRDFDatatype());
		negativePropertyAssertionEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		functionalPropertyEClass.getESuperTypes().add(theRdfPackage.getRDFProperty());
		allDisjointClassesEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		allDifferentEClass.getESuperTypes().add(theRdfsPackage.getRDFResource());
		irreflexivePropertyEClass.getESuperTypes().add(this.getObjectProperty());
		annotationPropertyEClass.getESuperTypes().add(theRdfPackage.getRDFProperty());
		inverseFunctionalPropertyEClass.getESuperTypes().add(this.getObjectProperty());
		deprecatedClassEClass.getESuperTypes().add(theRdfsPackage.getRDFClass());
		deprecatedPropertyEClass.getESuperTypes().add(theRdfPackage.getRDFProperty());
		propertyChainAxiomEClass.getESuperTypes().add(this.getObjectProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(nothingEClass, Nothing.class, "Nothing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedThingEClass, TypedThing.class, "TypedThing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRangeEClass, DataRange.class, "DataRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectProperty_PropertyChainAxiom(), theUMLPackage.getObjectNodeOrderingKind(), "propertyChainAxiom", null, 0, -1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realEClass, real.class, "real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ontologyPropertyEClass, OntologyProperty.class, "OntologyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, org.w3.owl.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_HasKey(), theRdfPackage.getRDFProperty(), null, "hasKey", null, 0, -1, org.w3.owl.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_DisjointUnionOf(), this.getType(), null, "disjointUnionOf", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestriction_Cardinality(), theXMLTypePackage.getNonNegativeInteger(), "cardinality", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRestriction_MaxCardinality(), theXMLTypePackage.getNonNegativeInteger(), "maxCardinality", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRestriction_MaxQualifiedCardinality(), theXMLTypePackage.getNonNegativeInteger(), "maxQualifiedCardinality", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRestriction_MinCardinality(), theXMLTypePackage.getNonNegativeInteger(), "minCardinality", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRestriction_MinQualifiedCardinality(), theXMLTypePackage.getNonNegativeInteger(), "minQualifiedCardinality", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRestriction_QualifiedCardinality(), theXMLTypePackage.getNonNegativeInteger(), "qualifiedCardinality", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestriction_HasSelf(), theRdfsPackage.getRDFResource(), null, "hasSelf", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestriction_OnProperites(), theRdfsPackage.getRDFResource(), null, "onProperites", null, 0, -1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asymmetricPropertyEClass, AsymmetricProperty.class, "AsymmetricProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitivePropertyEClass, TransitiveProperty.class, "TransitiveProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rationalEClass, rational.class, "rational", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reflexivePropertyEClass, ReflexiveProperty.class, "ReflexiveProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(symmetricPropertyEClass, SymmetricProperty.class, "SymmetricProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allDisjointPropertiesEClass, AllDisjointProperties.class, "AllDisjointProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(axiomEClass, Axiom.class, "Axiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypePropertyEClass, DatatypeProperty.class, "DatatypeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativePropertyAssertionEClass, NegativePropertyAssertion.class, "NegativePropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativePropertyAssertion_SourceIndividual(), this.getThing(), null, "sourceIndividual", null, 0, 1, NegativePropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNegativePropertyAssertion_TargetIndividual(), this.getThing(), null, "targetIndividual", null, 0, 1, NegativePropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNegativePropertyAssertion_TargetValue(), this.getDatatype(), null, "targetValue", null, 0, 1, NegativePropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegativePropertyAssertion_AssertionProperty(), theRdfPackage.getRDFProperty(), null, "assertionProperty", null, 0, 1, NegativePropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalPropertyEClass, FunctionalProperty.class, "FunctionalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allDisjointClassesEClass, AllDisjointClasses.class, "AllDisjointClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allDifferentEClass, AllDifferent.class, "AllDifferent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllDifferent_DistinctMembers(), this.getThing(), null, "distinctMembers", null, 0, -1, AllDifferent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(irreflexivePropertyEClass, IrreflexiveProperty.class, "IrreflexiveProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationPropertyEClass, AnnotationProperty.class, "AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverseFunctionalPropertyEClass, InverseFunctionalProperty.class, "InverseFunctionalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deprecatedClassEClass, DeprecatedClass.class, "DeprecatedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deprecatedPropertyEClass, DeprecatedProperty.class, "DeprecatedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyChainAxiomEClass, PropertyChainAxiom.class, "PropertyChainAxiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OwlPackageImpl
