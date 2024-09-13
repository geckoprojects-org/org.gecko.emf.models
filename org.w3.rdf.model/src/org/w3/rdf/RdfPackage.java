/**
 */
package org.w3.rdf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.w3.rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This library models the elements in the RDF namespace, http://www.w3.org/1999/02/22-rdf-syntax-ns, for use in vocabulary development.
 * <!-- end-model-doc -->
 * @see org.w3.rdf.RdfFactory
 * @model kind="package"
 * @generated
 */
public interface RdfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfPackage eINSTANCE = org.w3.rdf.impl.RdfPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFListImpl <em>RDF List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFListImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFList()
	 * @generated
	 */
	int RDF_LIST = 0;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__REST = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__FIRST = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RDF List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RDF List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST_OPERATION_COUNT = RdfsPackage.RDF_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RestImpl <em>Rest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RestImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRest()
	 * @generated
	 */
	int REST = 1;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__RDF_COMMENT = RDF_LIST__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__IS_DEFINED_BY = RDF_LIST__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__SEE_ALSO = RDF_LIST__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__RDF_MEMBERS = RDF_LIST__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__RDF_LABEL = RDF_LIST__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__RDF_TYPE = RDF_LIST__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__RDF_VALUE = RDF_LIST__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__REST = RDF_LIST__REST;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__FIRST = RDF_LIST__FIRST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__PARENT = RDF_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_FEATURE_COUNT = RDF_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION_COUNT = RDF_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.AltImpl <em>Alt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.AltImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getAlt()
	 * @generated
	 */
	int ALT = 2;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__RDF_COMMENT = RdfsPackage.RDF_CONTAINER__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__IS_DEFINED_BY = RdfsPackage.RDF_CONTAINER__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__SEE_ALSO = RdfsPackage.RDF_CONTAINER__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__RDF_MEMBERS = RdfsPackage.RDF_CONTAINER__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__RDF_LABEL = RdfsPackage.RDF_CONTAINER__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__RDF_TYPE = RdfsPackage.RDF_CONTAINER__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__RDF_VALUE = RdfsPackage.RDF_CONTAINER__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__SUB_CLASS_OF = RdfsPackage.RDF_CONTAINER__SUB_CLASS_OF;

	/**
	 * The number of structural features of the '<em>Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_FEATURE_COUNT = RdfsPackage.RDF_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_OPERATION_COUNT = RdfsPackage.RDF_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.BagImpl <em>Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.BagImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getBag()
	 * @generated
	 */
	int BAG = 3;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__RDF_COMMENT = RdfsPackage.RDF_CONTAINER__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__IS_DEFINED_BY = RdfsPackage.RDF_CONTAINER__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SEE_ALSO = RdfsPackage.RDF_CONTAINER__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__RDF_MEMBERS = RdfsPackage.RDF_CONTAINER__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__RDF_LABEL = RdfsPackage.RDF_CONTAINER__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__RDF_TYPE = RdfsPackage.RDF_CONTAINER__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__RDF_VALUE = RdfsPackage.RDF_CONTAINER__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SUB_CLASS_OF = RdfsPackage.RDF_CONTAINER__SUB_CLASS_OF;

	/**
	 * The number of structural features of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_FEATURE_COUNT = RdfsPackage.RDF_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_OPERATION_COUNT = RdfsPackage.RDF_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.IRIImpl <em>IRI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.IRIImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getIRI()
	 * @generated
	 */
	int IRI = 4;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI__IRI = 0;

	/**
	 * The number of structural features of the '<em>IRI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IRI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFSubjectImpl <em>RDF Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFSubjectImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFSubject()
	 * @generated
	 */
	int RDF_SUBJECT = 5;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SUBJECT__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>RDF Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SUBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RDF Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFStatementImpl <em>RDF Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFStatementImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFStatement()
	 * @generated
	 */
	int RDF_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__PREDICATE = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__OBJECT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__SUBJECT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RDF Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RDF Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT_OPERATION_COUNT = RdfsPackage.RDF_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFPredicateImpl <em>RDF Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFPredicateImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFPredicate()
	 * @generated
	 */
	int RDF_PREDICATE = 7;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>RDF Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RDF Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFTypeImpl <em>RDF Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFTypeImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFType()
	 * @generated
	 */
	int RDF_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_TYPE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>RDF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RDF Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFValueImpl <em>RDF Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFValueImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFValue()
	 * @generated
	 */
	int RDF_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_VALUE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>RDF Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RDF Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.FirstImpl <em>First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.FirstImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getFirst()
	 * @generated
	 */
	int FIRST = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST__FIRST = 1;

	/**
	 * The number of structural features of the '<em>First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.SeqImpl <em>Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.SeqImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getSeq()
	 * @generated
	 */
	int SEQ = 11;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__RDF_COMMENT = RdfsPackage.RDF_CONTAINER__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__IS_DEFINED_BY = RdfsPackage.RDF_CONTAINER__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__SEE_ALSO = RdfsPackage.RDF_CONTAINER__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__RDF_MEMBERS = RdfsPackage.RDF_CONTAINER__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__RDF_LABEL = RdfsPackage.RDF_CONTAINER__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__RDF_TYPE = RdfsPackage.RDF_CONTAINER__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__RDF_VALUE = RdfsPackage.RDF_CONTAINER__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__SUB_CLASS_OF = RdfsPackage.RDF_CONTAINER__SUB_CLASS_OF;

	/**
	 * The number of structural features of the '<em>Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FEATURE_COUNT = RdfsPackage.RDF_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unnamed5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ___UNNAMED5__DIAGNOSTICCHAIN_MAP = RdfsPackage.RDF_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OPERATION_COUNT = RdfsPackage.RDF_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFObjectImpl <em>RDF Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFObjectImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFObject()
	 * @generated
	 */
	int RDF_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_OBJECT__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>RDF Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RDF Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFURIImpl <em>RDFURI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFURIImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFURI()
	 * @generated
	 */
	int RDFURI = 13;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFURI__IRI = IRI__IRI;

	/**
	 * The number of structural features of the '<em>RDFURI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFURI_FEATURE_COUNT = IRI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RDFURI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFURI_OPERATION_COUNT = IRI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdf.impl.RDFPropertyImpl <em>RDF Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdf.impl.RDFPropertyImpl
	 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFProperty()
	 * @generated
	 */
	int RDF_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDF_COMMENT = RdfsPackage.RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__IS_DEFINED_BY = RdfsPackage.RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__SEE_ALSO = RdfsPackage.RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDF_MEMBERS = RdfsPackage.RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDF_LABEL = RdfsPackage.RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDF_TYPE = RdfsPackage.RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDF_VALUE = RdfsPackage.RDF_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__DOMAIN = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__SUB_PROPERTY_OF = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RANGE = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RDF Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY_FEATURE_COUNT = RdfsPackage.RDF_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RDF Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY_OPERATION_COUNT = RdfsPackage.RDF_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Primitive Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.w3.rdf.impl.RdfPackageImpl#getPrimitiveLiteral()
	 * @generated
	 */
	int PRIMITIVE_LITERAL = 15;


	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFList <em>RDF List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF List</em>'.
	 * @see org.w3.rdf.RDFList
	 * @generated
	 */
	EClass getRDFList();

	/**
	 * Returns the meta object for the reference list '{@link org.w3.rdf.RDFList#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rest</em>'.
	 * @see org.w3.rdf.RDFList#getRest()
	 * @see #getRDFList()
	 * @generated
	 */
	EReference getRDFList_Rest();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFList#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.w3.rdf.RDFList#getFirst()
	 * @see #getRDFList()
	 * @generated
	 */
	EReference getRDFList_First();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.Rest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest</em>'.
	 * @see org.w3.rdf.Rest
	 * @generated
	 */
	EClass getRest();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.Rest#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.w3.rdf.Rest#getParent()
	 * @see #getRest()
	 * @generated
	 */
	EReference getRest_Parent();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.Alt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt</em>'.
	 * @see org.w3.rdf.Alt
	 * @generated
	 */
	EClass getAlt();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag</em>'.
	 * @see org.w3.rdf.Bag
	 * @generated
	 */
	EClass getBag();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.IRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRI</em>'.
	 * @see org.w3.rdf.IRI
	 * @generated
	 */
	EClass getIRI();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.rdf.IRI#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see org.w3.rdf.IRI#getIri()
	 * @see #getIRI()
	 * @generated
	 */
	EAttribute getIRI_Iri();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFSubject <em>RDF Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Subject</em>'.
	 * @see org.w3.rdf.RDFSubject
	 * @generated
	 */
	EClass getRDFSubject();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFSubject#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see org.w3.rdf.RDFSubject#getStatement()
	 * @see #getRDFSubject()
	 * @generated
	 */
	EReference getRDFSubject_Statement();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFStatement <em>RDF Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Statement</em>'.
	 * @see org.w3.rdf.RDFStatement
	 * @generated
	 */
	EClass getRDFStatement();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFStatement#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicate</em>'.
	 * @see org.w3.rdf.RDFStatement#getPredicate()
	 * @see #getRDFStatement()
	 * @generated
	 */
	EReference getRDFStatement_Predicate();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFStatement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.w3.rdf.RDFStatement#getObject()
	 * @see #getRDFStatement()
	 * @generated
	 */
	EReference getRDFStatement_Object();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFStatement#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see org.w3.rdf.RDFStatement#getSubject()
	 * @see #getRDFStatement()
	 * @generated
	 */
	EReference getRDFStatement_Subject();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFPredicate <em>RDF Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Predicate</em>'.
	 * @see org.w3.rdf.RDFPredicate
	 * @generated
	 */
	EClass getRDFPredicate();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFPredicate#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see org.w3.rdf.RDFPredicate#getStatement()
	 * @see #getRDFPredicate()
	 * @generated
	 */
	EReference getRDFPredicate_Statement();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFType <em>RDF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Type</em>'.
	 * @see org.w3.rdf.RDFType
	 * @generated
	 */
	EClass getRDFType();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.w3.rdf.RDFType#getResource()
	 * @see #getRDFType()
	 * @generated
	 */
	EReference getRDFType_Resource();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.w3.rdf.RDFType#getType()
	 * @see #getRDFType()
	 * @generated
	 */
	EReference getRDFType_Type();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFValue <em>RDF Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Value</em>'.
	 * @see org.w3.rdf.RDFValue
	 * @generated
	 */
	EClass getRDFValue();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFValue#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.w3.rdf.RDFValue#getResource()
	 * @see #getRDFValue()
	 * @generated
	 */
	EReference getRDFValue_Resource();

	/**
	 * Returns the meta object for the reference list '{@link org.w3.rdf.RDFValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.w3.rdf.RDFValue#getValue()
	 * @see #getRDFValue()
	 * @generated
	 */
	EReference getRDFValue_Value();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.First <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First</em>'.
	 * @see org.w3.rdf.First
	 * @generated
	 */
	EClass getFirst();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.First#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.w3.rdf.First#getParent()
	 * @see #getFirst()
	 * @generated
	 */
	EReference getFirst_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.First#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.w3.rdf.First#getFirst()
	 * @see #getFirst()
	 * @generated
	 */
	EReference getFirst_First();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq</em>'.
	 * @see org.w3.rdf.Seq
	 * @generated
	 */
	EClass getSeq();

	/**
	 * Returns the meta object for the '{@link org.w3.rdf.Seq#unnamed5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unnamed5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unnamed5</em>' operation.
	 * @see org.w3.rdf.Seq#unnamed5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSeq__Unnamed5__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFObject <em>RDF Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Object</em>'.
	 * @see org.w3.rdf.RDFObject
	 * @generated
	 */
	EClass getRDFObject();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFObject#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see org.w3.rdf.RDFObject#getStatement()
	 * @see #getRDFObject()
	 * @generated
	 */
	EReference getRDFObject_Statement();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFURI <em>RDFURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDFURI</em>'.
	 * @see org.w3.rdf.RDFURI
	 * @generated
	 */
	EClass getRDFURI();

	/**
	 * Returns the meta object for class '{@link org.w3.rdf.RDFProperty <em>RDF Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Property</em>'.
	 * @see org.w3.rdf.RDFProperty
	 * @generated
	 */
	EClass getRDFProperty();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFProperty#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org.w3.rdf.RDFProperty#getDomain()
	 * @see #getRDFProperty()
	 * @generated
	 */
	EReference getRDFProperty_Domain();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFProperty#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Property Of</em>'.
	 * @see org.w3.rdf.RDFProperty#getSubPropertyOf()
	 * @see #getRDFProperty()
	 * @generated
	 */
	EReference getRDFProperty_SubPropertyOf();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdf.RDFProperty#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see org.w3.rdf.RDFProperty#getRange()
	 * @see #getRDFProperty()
	 * @generated
	 */
	EReference getRDFProperty_Range();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Primitive Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Primitive Literal</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getPrimitiveLiteral();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdfFactory getRdfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFListImpl <em>RDF List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFListImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFList()
		 * @generated
		 */
		EClass RDF_LIST = eINSTANCE.getRDFList();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_LIST__REST = eINSTANCE.getRDFList_Rest();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_LIST__FIRST = eINSTANCE.getRDFList_First();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RestImpl <em>Rest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RestImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRest()
		 * @generated
		 */
		EClass REST = eINSTANCE.getRest();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST__PARENT = eINSTANCE.getRest_Parent();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.AltImpl <em>Alt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.AltImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getAlt()
		 * @generated
		 */
		EClass ALT = eINSTANCE.getAlt();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.BagImpl <em>Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.BagImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getBag()
		 * @generated
		 */
		EClass BAG = eINSTANCE.getBag();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.IRIImpl <em>IRI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.IRIImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getIRI()
		 * @generated
		 */
		EClass IRI = eINSTANCE.getIRI();

		/**
		 * The meta object literal for the '<em><b>Iri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRI__IRI = eINSTANCE.getIRI_Iri();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFSubjectImpl <em>RDF Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFSubjectImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFSubject()
		 * @generated
		 */
		EClass RDF_SUBJECT = eINSTANCE.getRDFSubject();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_SUBJECT__STATEMENT = eINSTANCE.getRDFSubject_Statement();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFStatementImpl <em>RDF Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFStatementImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFStatement()
		 * @generated
		 */
		EClass RDF_STATEMENT = eINSTANCE.getRDFStatement();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_STATEMENT__PREDICATE = eINSTANCE.getRDFStatement_Predicate();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_STATEMENT__OBJECT = eINSTANCE.getRDFStatement_Object();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_STATEMENT__SUBJECT = eINSTANCE.getRDFStatement_Subject();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFPredicateImpl <em>RDF Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFPredicateImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFPredicate()
		 * @generated
		 */
		EClass RDF_PREDICATE = eINSTANCE.getRDFPredicate();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PREDICATE__STATEMENT = eINSTANCE.getRDFPredicate_Statement();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFTypeImpl <em>RDF Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFTypeImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFType()
		 * @generated
		 */
		EClass RDF_TYPE = eINSTANCE.getRDFType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_TYPE__RESOURCE = eINSTANCE.getRDFType_Resource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_TYPE__TYPE = eINSTANCE.getRDFType_Type();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFValueImpl <em>RDF Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFValueImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFValue()
		 * @generated
		 */
		EClass RDF_VALUE = eINSTANCE.getRDFValue();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_VALUE__RESOURCE = eINSTANCE.getRDFValue_Resource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_VALUE__VALUE = eINSTANCE.getRDFValue_Value();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.FirstImpl <em>First</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.FirstImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getFirst()
		 * @generated
		 */
		EClass FIRST = eINSTANCE.getFirst();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIRST__PARENT = eINSTANCE.getFirst_Parent();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIRST__FIRST = eINSTANCE.getFirst_First();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.SeqImpl <em>Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.SeqImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getSeq()
		 * @generated
		 */
		EClass SEQ = eINSTANCE.getSeq();

		/**
		 * The meta object literal for the '<em><b>Unnamed5</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQ___UNNAMED5__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSeq__Unnamed5__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFObjectImpl <em>RDF Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFObjectImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFObject()
		 * @generated
		 */
		EClass RDF_OBJECT = eINSTANCE.getRDFObject();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_OBJECT__STATEMENT = eINSTANCE.getRDFObject_Statement();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFURIImpl <em>RDFURI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFURIImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFURI()
		 * @generated
		 */
		EClass RDFURI = eINSTANCE.getRDFURI();

		/**
		 * The meta object literal for the '{@link org.w3.rdf.impl.RDFPropertyImpl <em>RDF Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdf.impl.RDFPropertyImpl
		 * @see org.w3.rdf.impl.RdfPackageImpl#getRDFProperty()
		 * @generated
		 */
		EClass RDF_PROPERTY = eINSTANCE.getRDFProperty();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PROPERTY__DOMAIN = eINSTANCE.getRDFProperty_Domain();

		/**
		 * The meta object literal for the '<em><b>Sub Property Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PROPERTY__SUB_PROPERTY_OF = eINSTANCE.getRDFProperty_SubPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PROPERTY__RANGE = eINSTANCE.getRDFProperty_Range();

		/**
		 * The meta object literal for the '<em>Primitive Literal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.w3.rdf.impl.RdfPackageImpl#getPrimitiveLiteral()
		 * @generated
		 */
		EDataType PRIMITIVE_LITERAL = eINSTANCE.getPrimitiveLiteral();

	}

} //RdfPackage
