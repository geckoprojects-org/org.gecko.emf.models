/**
 */
package org.w3.rdf.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.w3.rdf.*;
import org.w3.rdfs.RDFClass;
import org.w3.rdfs.RDFContainer;
import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.w3.rdf.RdfPackage
 * @generated
 */
public class RdfSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdfPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfSwitch() {
		if (modelPackage == null) {
			modelPackage = RdfPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RdfPackage.RDF_LIST: {
				RDFList rdfList = (RDFList)theEObject;
				T result = caseRDFList(rdfList);
				if (result == null) result = caseRDFResource(rdfList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.REST: {
				Rest rest = (Rest)theEObject;
				T result = caseRest(rest);
				if (result == null) result = caseRDFList(rest);
				if (result == null) result = caseRDFResource(rest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.ALT: {
				Alt alt = (Alt)theEObject;
				T result = caseAlt(alt);
				if (result == null) result = caseRDFContainer(alt);
				if (result == null) result = caseRDFClass(alt);
				if (result == null) result = caseRDFResource(alt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.BAG: {
				Bag bag = (Bag)theEObject;
				T result = caseBag(bag);
				if (result == null) result = caseRDFContainer(bag);
				if (result == null) result = caseRDFClass(bag);
				if (result == null) result = caseRDFResource(bag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.IRI: {
				IRI iri = (IRI)theEObject;
				T result = caseIRI(iri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.RDF_SUBJECT: {
				RDFSubject rdfSubject = (RDFSubject)theEObject;
				T result = caseRDFSubject(rdfSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.RDF_STATEMENT: {
				RDFStatement rdfStatement = (RDFStatement)theEObject;
				T result = caseRDFStatement(rdfStatement);
				if (result == null) result = caseRDFResource(rdfStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.RDF_PREDICATE: {
				RDFPredicate rdfPredicate = (RDFPredicate)theEObject;
				T result = caseRDFPredicate(rdfPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.RDF_TYPE: {
				RDFType rdfType = (RDFType)theEObject;
				T result = caseRDFType(rdfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.RDF_VALUE: {
				RDFValue rdfValue = (RDFValue)theEObject;
				T result = caseRDFValue(rdfValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.FIRST: {
				First first = (First)theEObject;
				T result = caseFirst(first);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.SEQ: {
				Seq seq = (Seq)theEObject;
				T result = caseSeq(seq);
				if (result == null) result = caseRDFContainer(seq);
				if (result == null) result = caseRDFClass(seq);
				if (result == null) result = caseRDFResource(seq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.RDF_OBJECT: {
				RDFObject rdfObject = (RDFObject)theEObject;
				T result = caseRDFObject(rdfObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.RDFURI: {
				RDFURI rdfuri = (RDFURI)theEObject;
				T result = caseRDFURI(rdfuri);
				if (result == null) result = caseIRI(rdfuri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfPackage.RDF_PROPERTY: {
				RDFProperty rdfProperty = (RDFProperty)theEObject;
				T result = caseRDFProperty(rdfProperty);
				if (result == null) result = caseRDFResource(rdfProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFList(RDFList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRest(Rest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlt(Alt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBag(Bag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRI(IRI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSubject(RDFSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFStatement(RDFStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFPredicate(RDFPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFType(RDFType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFValue(RDFValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirst(First object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeq(Seq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFObject(RDFObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFURI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFURI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFURI(RDFURI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFProperty(RDFProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFResource(RDFResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFClass(RDFClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFContainer(RDFContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RdfSwitch
