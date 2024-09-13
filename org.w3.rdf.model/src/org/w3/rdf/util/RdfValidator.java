/**
 */
package org.w3.rdf.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.w3.rdf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.w3.rdf.RdfPackage
 * @generated
 */
public class RdfValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RdfValidator INSTANCE = new RdfValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.w3.rdf";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unnamed5' of 'Seq'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEQ__UNNAMED5 = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RdfPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RdfPackage.RDF_LIST:
				return validateRDFList((RDFList)value, diagnostics, context);
			case RdfPackage.REST:
				return validateRest((Rest)value, diagnostics, context);
			case RdfPackage.ALT:
				return validateAlt((Alt)value, diagnostics, context);
			case RdfPackage.BAG:
				return validateBag((Bag)value, diagnostics, context);
			case RdfPackage.IRI:
				return validateIRI((IRI)value, diagnostics, context);
			case RdfPackage.RDF_SUBJECT:
				return validateRDFSubject((RDFSubject)value, diagnostics, context);
			case RdfPackage.RDF_STATEMENT:
				return validateRDFStatement((RDFStatement)value, diagnostics, context);
			case RdfPackage.RDF_PREDICATE:
				return validateRDFPredicate((RDFPredicate)value, diagnostics, context);
			case RdfPackage.RDF_TYPE:
				return validateRDFType((RDFType)value, diagnostics, context);
			case RdfPackage.RDF_VALUE:
				return validateRDFValue((RDFValue)value, diagnostics, context);
			case RdfPackage.FIRST:
				return validateFirst((First)value, diagnostics, context);
			case RdfPackage.SEQ:
				return validateSeq((Seq)value, diagnostics, context);
			case RdfPackage.RDF_OBJECT:
				return validateRDFObject((RDFObject)value, diagnostics, context);
			case RdfPackage.RDFURI:
				return validateRDFURI((RDFURI)value, diagnostics, context);
			case RdfPackage.RDF_PROPERTY:
				return validateRDFProperty((RDFProperty)value, diagnostics, context);
			case RdfPackage.PRIMITIVE_LITERAL:
				return validatePrimitiveLiteral((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFList(RDFList rdfList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRest(Rest rest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlt(Alt alt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBag(Bag bag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIRI(IRI iri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFSubject(RDFSubject rdfSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFStatement(RDFStatement rdfStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFPredicate(RDFPredicate rdfPredicate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFType(RDFType rdfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFValue(RDFValue rdfValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirst(First first, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(first, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeq(Seq seq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(seq, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(seq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(seq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(seq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(seq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(seq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(seq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(seq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(seq, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeq_unnamed5(seq, diagnostics, context);
		return result;
	}

	/**
	 * Validates the unnamed5 constraint of '<em>Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeq_unnamed5(Seq seq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return seq.unnamed5(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFObject(RDFObject rdfObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFURI(RDFURI rdfuri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfuri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDFProperty(RDFProperty rdfProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdfProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveLiteral(String primitiveLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RdfValidator
