/**
 */
package org.w3.rdfs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;
import org.w3.owl.OwlPackage;
import org.w3.owl.impl.OwlPackageImpl;
import org.w3.rdf.RdfPackage;
import org.w3.rdf.impl.RdfPackageImpl;
import org.w3.rdfs.ContainerMembershipProperty;
import org.w3.rdfs.IsDefinedBy;
import org.w3.rdfs.Member;
import org.w3.rdfs.RDFClass;
import org.w3.rdfs.RDFComment;
import org.w3.rdfs.RDFContainer;
import org.w3.rdfs.RDFDatatype;
import org.w3.rdfs.RDFDomain;
import org.w3.rdfs.RDFLabel;
import org.w3.rdfs.RDFLiteral;
import org.w3.rdfs.RDFResource;
import org.w3.rdfs.Range;
import org.w3.rdfs.RdfsFactory;
import org.w3.rdfs.RdfsPackage;
import org.w3.rdfs.SeeAlso;
import org.w3.rdfs.SubClassOf;
import org.w3.rdfs.SubPropertyOf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfsPackageImpl extends EPackageImpl implements RdfsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seeAlsoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subClassOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDefinedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerMembershipPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

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
	 * @see org.w3.rdfs.RdfsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RdfsPackageImpl() {
		super(eNS_URI, RdfsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RdfsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RdfsPackage init() {
		if (isInited) return (RdfsPackage)EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRdfsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RdfsPackageImpl theRdfsPackage = registeredRdfsPackage instanceof RdfsPackageImpl ? (RdfsPackageImpl)registeredRdfsPackage : new RdfsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);
		OwlPackageImpl theOwlPackage = (OwlPackageImpl)(registeredPackage instanceof OwlPackageImpl ? registeredPackage : OwlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		RdfPackageImpl theRdfPackage = (RdfPackageImpl)(registeredPackage instanceof RdfPackageImpl ? registeredPackage : RdfPackage.eINSTANCE);

		// Create package meta-data objects
		theRdfsPackage.createPackageContents();
		theOwlPackage.createPackageContents();
		theRdfPackage.createPackageContents();

		// Initialize created meta-data
		theRdfsPackage.initializePackageContents();
		theOwlPackage.initializePackageContents();
		theRdfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRdfsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RdfsPackage.eNS_URI, theRdfsPackage);
		return theRdfsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeeAlso() {
		return seeAlsoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeeAlso_Resource() {
		return (EReference)seeAlsoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeeAlso_SeeAlso() {
		return (EReference)seeAlsoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFResource() {
		return rdfResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFResource_RdfComment() {
		return (EReference)rdfResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFResource_IsDefinedBy() {
		return (EReference)rdfResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFResource_SeeAlso() {
		return (EReference)rdfResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFResource_RdfMembers() {
		return (EReference)rdfResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFResource_RdfLabel() {
		return (EReference)rdfResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFResource_RdfType() {
		return (EReference)rdfResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFResource_RdfValue() {
		return (EReference)rdfResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFLabel() {
		return rdfLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFLabel_Resource() {
		return (EReference)rdfLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFLabel_Label() {
		return (EReference)rdfLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFLiteral() {
		return rdfLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRDFLiteral_TextValue() {
		return (EAttribute)rdfLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFContainer() {
		return rdfContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFClass() {
		return rdfClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFClass_SubClassOf() {
		return (EReference)rdfClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFDomain() {
		return rdfDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFDomain_Property() {
		return (EReference)rdfDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFDomain_Domain() {
		return (EReference)rdfDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubPropertyOf() {
		return subPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPropertyOf_Property() {
		return (EReference)subPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubPropertyOf_SubPropertyOf() {
		return (EReference)subPropertyOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMember_Resource() {
		return (EReference)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMember_Member() {
		return (EReference)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubClassOf() {
		return subClassOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubClassOf_RdfClass() {
		return (EReference)subClassOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubClassOf_SubClassOf() {
		return (EReference)subClassOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsDefinedBy() {
		return isDefinedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIsDefinedBy_IsDefinedBy() {
		return (EReference)isDefinedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFComment() {
		return rdfCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFComment_Resource() {
		return (EReference)rdfCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRDFComment_Comment() {
		return (EReference)rdfCommentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRDFDatatype() {
		return rdfDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerMembershipProperty() {
		return containerMembershipPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRange_Property() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRange_Range() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfsFactory getRdfsFactory() {
		return (RdfsFactory)getEFactoryInstance();
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
		seeAlsoEClass = createEClass(SEE_ALSO);
		createEReference(seeAlsoEClass, SEE_ALSO__RESOURCE);
		createEReference(seeAlsoEClass, SEE_ALSO__SEE_ALSO);

		rdfResourceEClass = createEClass(RDF_RESOURCE);
		createEReference(rdfResourceEClass, RDF_RESOURCE__RDF_COMMENT);
		createEReference(rdfResourceEClass, RDF_RESOURCE__IS_DEFINED_BY);
		createEReference(rdfResourceEClass, RDF_RESOURCE__SEE_ALSO);
		createEReference(rdfResourceEClass, RDF_RESOURCE__RDF_MEMBERS);
		createEReference(rdfResourceEClass, RDF_RESOURCE__RDF_LABEL);
		createEReference(rdfResourceEClass, RDF_RESOURCE__RDF_TYPE);
		createEReference(rdfResourceEClass, RDF_RESOURCE__RDF_VALUE);

		rdfLabelEClass = createEClass(RDF_LABEL);
		createEReference(rdfLabelEClass, RDF_LABEL__RESOURCE);
		createEReference(rdfLabelEClass, RDF_LABEL__LABEL);

		rdfLiteralEClass = createEClass(RDF_LITERAL);
		createEAttribute(rdfLiteralEClass, RDF_LITERAL__TEXT_VALUE);

		rdfContainerEClass = createEClass(RDF_CONTAINER);

		rdfClassEClass = createEClass(RDF_CLASS);
		createEReference(rdfClassEClass, RDF_CLASS__SUB_CLASS_OF);

		rdfDomainEClass = createEClass(RDF_DOMAIN);
		createEReference(rdfDomainEClass, RDF_DOMAIN__PROPERTY);
		createEReference(rdfDomainEClass, RDF_DOMAIN__DOMAIN);

		subPropertyOfEClass = createEClass(SUB_PROPERTY_OF);
		createEReference(subPropertyOfEClass, SUB_PROPERTY_OF__PROPERTY);
		createEReference(subPropertyOfEClass, SUB_PROPERTY_OF__SUB_PROPERTY_OF);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__RESOURCE);
		createEReference(memberEClass, MEMBER__MEMBER);

		subClassOfEClass = createEClass(SUB_CLASS_OF);
		createEReference(subClassOfEClass, SUB_CLASS_OF__RDF_CLASS);
		createEReference(subClassOfEClass, SUB_CLASS_OF__SUB_CLASS_OF);

		isDefinedByEClass = createEClass(IS_DEFINED_BY);
		createEReference(isDefinedByEClass, IS_DEFINED_BY__IS_DEFINED_BY);

		rdfCommentEClass = createEClass(RDF_COMMENT);
		createEReference(rdfCommentEClass, RDF_COMMENT__RESOURCE);
		createEReference(rdfCommentEClass, RDF_COMMENT__COMMENT);

		rdfDatatypeEClass = createEClass(RDF_DATATYPE);

		containerMembershipPropertyEClass = createEClass(CONTAINER_MEMBERSHIP_PROPERTY);

		rangeEClass = createEClass(RANGE);
		createEReference(rangeEClass, RANGE__PROPERTY);
		createEReference(rangeEClass, RANGE__RANGE);
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
		RdfPackage theRdfPackage = (RdfPackage)EPackage.Registry.INSTANCE.getEPackage(RdfPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rdfContainerEClass.getESuperTypes().add(this.getRDFClass());
		rdfClassEClass.getESuperTypes().add(this.getRDFResource());
		isDefinedByEClass.getESuperTypes().add(this.getSeeAlso());
		rdfDatatypeEClass.getESuperTypes().add(this.getRDFClass());
		containerMembershipPropertyEClass.getESuperTypes().add(theRdfPackage.getRDFProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(seeAlsoEClass, SeeAlso.class, "SeeAlso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeeAlso_Resource(), this.getRDFResource(), this.getRDFResource_SeeAlso(), "resource", null, 1, 1, SeeAlso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSeeAlso_SeeAlso(), this.getRDFResource(), null, "seeAlso", null, 1, 1, SeeAlso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfResourceEClass, RDFResource.class, "RDFResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFResource_RdfComment(), this.getRDFComment(), this.getRDFComment_Resource(), "rdfComment", null, 1, 1, RDFResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFResource_IsDefinedBy(), this.getIsDefinedBy(), null, "isDefinedBy", null, 1, 1, RDFResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFResource_SeeAlso(), this.getSeeAlso(), this.getSeeAlso_Resource(), "seeAlso", null, 1, 1, RDFResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFResource_RdfMembers(), this.getMember(), this.getMember_Resource(), "rdfMembers", null, 0, -1, RDFResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFResource_RdfLabel(), this.getRDFLabel(), this.getRDFLabel_Resource(), "rdfLabel", null, 1, 1, RDFResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFResource_RdfType(), theRdfPackage.getRDFType(), theRdfPackage.getRDFType_Resource(), "rdfType", null, 1, 1, RDFResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFResource_RdfValue(), theRdfPackage.getRDFValue(), null, "rdfValue", null, 0, -1, RDFResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfLabelEClass, RDFLabel.class, "RDFLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFLabel_Resource(), this.getRDFResource(), this.getRDFResource_RdfLabel(), "resource", null, 1, 1, RDFLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFLabel_Label(), this.getRDFLiteral(), null, "label", null, 1, 1, RDFLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfLiteralEClass, RDFLiteral.class, "RDFLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDFLiteral_TextValue(), theTypesPackage.getString(), "textValue", null, 1, 1, RDFLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfContainerEClass, RDFContainer.class, "RDFContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfClassEClass, RDFClass.class, "RDFClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFClass_SubClassOf(), this.getSubClassOf(), this.getSubClassOf_RdfClass(), "subClassOf", null, 1, 1, RDFClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfDomainEClass, RDFDomain.class, "RDFDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFDomain_Property(), theRdfPackage.getRDFProperty(), null, "property", null, 1, 1, RDFDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFDomain_Domain(), this.getRDFClass(), null, "domain", null, 1, 1, RDFDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subPropertyOfEClass, SubPropertyOf.class, "SubPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubPropertyOf_Property(), theRdfPackage.getRDFProperty(), theRdfPackage.getRDFProperty_SubPropertyOf(), "property", null, 1, 1, SubPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubPropertyOf_SubPropertyOf(), theRdfPackage.getRDFProperty(), null, "subPropertyOf", null, 1, 1, SubPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMember_Resource(), this.getRDFResource(), this.getRDFResource_RdfMembers(), "resource", null, 1, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMember_Member(), this.getRDFResource(), null, "member", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subClassOfEClass, SubClassOf.class, "SubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubClassOf_RdfClass(), this.getRDFClass(), this.getRDFClass_SubClassOf(), "rdfClass", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubClassOf_SubClassOf(), this.getRDFClass(), null, "subClassOf", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(isDefinedByEClass, IsDefinedBy.class, "IsDefinedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsDefinedBy_IsDefinedBy(), this.getRDFResource(), null, "isDefinedBy", null, 1, 1, IsDefinedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfCommentEClass, RDFComment.class, "RDFComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFComment_Resource(), this.getRDFResource(), this.getRDFResource_RdfComment(), "resource", null, 1, 1, RDFComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRDFComment_Comment(), this.getRDFLiteral(), null, "comment", null, 1, 1, RDFComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rdfDatatypeEClass, RDFDatatype.class, "RDFDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerMembershipPropertyEClass, ContainerMembershipProperty.class, "ContainerMembershipProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRange_Property(), theRdfPackage.getRDFProperty(), null, "property", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRange_Range(), this.getRDFClass(), null, "range", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RdfsPackageImpl
