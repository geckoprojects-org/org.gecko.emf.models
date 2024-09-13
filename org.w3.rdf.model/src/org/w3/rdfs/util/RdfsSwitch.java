/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.w3.rdfs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.w3.rdf.RDFProperty;

import org.w3.rdfs.*;

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
 * @see org.w3.rdfs.RdfsPackage
 * @generated
 */
public class RdfsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdfsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsSwitch() {
		if (modelPackage == null) {
			modelPackage = RdfsPackage.eINSTANCE;
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
			case RdfsPackage.SEE_ALSO: {
				SeeAlso seeAlso = (SeeAlso)theEObject;
				T result = caseSeeAlso(seeAlso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_RESOURCE: {
				RDFResource rdfResource = (RDFResource)theEObject;
				T result = caseRDFResource(rdfResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_LABEL: {
				RDFLabel rdfLabel = (RDFLabel)theEObject;
				T result = caseRDFLabel(rdfLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_LITERAL: {
				RDFLiteral rdfLiteral = (RDFLiteral)theEObject;
				T result = caseRDFLiteral(rdfLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_CONTAINER: {
				RDFContainer rdfContainer = (RDFContainer)theEObject;
				T result = caseRDFContainer(rdfContainer);
				if (result == null) result = caseRDFClass(rdfContainer);
				if (result == null) result = caseRDFResource(rdfContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_CLASS: {
				RDFClass rdfClass = (RDFClass)theEObject;
				T result = caseRDFClass(rdfClass);
				if (result == null) result = caseRDFResource(rdfClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.SUB_PROPERTY_OF: {
				SubPropertyOf subPropertyOf = (SubPropertyOf)theEObject;
				T result = caseSubPropertyOf(subPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.SUB_CLASS_OF: {
				SubClassOf subClassOf = (SubClassOf)theEObject;
				T result = caseSubClassOf(subClassOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.IS_DEFINED_BY: {
				IsDefinedBy isDefinedBy = (IsDefinedBy)theEObject;
				T result = caseIsDefinedBy(isDefinedBy);
				if (result == null) result = caseSeeAlso(isDefinedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_COMMENT: {
				RDFComment rdfComment = (RDFComment)theEObject;
				T result = caseRDFComment(rdfComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_DATATYPE: {
				RDFDatatype rdfDatatype = (RDFDatatype)theEObject;
				T result = caseRDFDatatype(rdfDatatype);
				if (result == null) result = caseRDFClass(rdfDatatype);
				if (result == null) result = caseRDFResource(rdfDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.CONTAINER_MEMBERSHIP_PROPERTY: {
				ContainerMembershipProperty containerMembershipProperty = (ContainerMembershipProperty)theEObject;
				T result = caseContainerMembershipProperty(containerMembershipProperty);
				if (result == null) result = caseRDFProperty(containerMembershipProperty);
				if (result == null) result = caseRDFResource(containerMembershipProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>See Also</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>See Also</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeeAlso(SeeAlso object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>RDF Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFLabel(RDFLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFLiteral(RDFLiteral object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPropertyOf(SubPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubClassOf(SubClassOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Defined By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Defined By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsDefinedBy(IsDefinedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFComment(RDFComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFDatatype(RDFDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Membership Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Membership Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerMembershipProperty(ContainerMembershipProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
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

} //RdfsSwitch
