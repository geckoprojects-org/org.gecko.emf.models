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
package de.xoev.basisnachricht.unqualified.util;

import de.xoev.basisnachricht.unqualified.*;

import de.xoev.code.Code;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.xoev.basisnachricht.unqualified.UnqualifiedPackage
 * @generated
 */
public class UnqualifiedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnqualifiedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnqualifiedSwitch() {
		if (modelPackage == null) {
			modelPackage = UnqualifiedPackage.eINSTANCE;
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
			case UnqualifiedPackage.BEHOERDE_TYPE: {
				BehoerdeType behoerdeType = (BehoerdeType)theEObject;
				T result = caseBehoerdeType(behoerdeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnqualifiedPackage.CODE_KOMMUNIKATION_KANAL_TYPE: {
				CodeKommunikationKanalType codeKommunikationKanalType = (CodeKommunikationKanalType)theEObject;
				T result = caseCodeKommunikationKanalType(codeKommunikationKanalType);
				if (result == null) result = caseCode(codeKommunikationKanalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnqualifiedPackage.CODE_VERZEICHNISDIENST_TYPE: {
				CodeVerzeichnisdienstType codeVerzeichnisdienstType = (CodeVerzeichnisdienstType)theEObject;
				T result = caseCodeVerzeichnisdienstType(codeVerzeichnisdienstType);
				if (result == null) result = caseCode(codeVerzeichnisdienstType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnqualifiedPackage.IDENTIFIKATION_NACHRICHT_TYPE: {
				IdentifikationNachrichtType identifikationNachrichtType = (IdentifikationNachrichtType)theEObject;
				T result = caseIdentifikationNachrichtType(identifikationNachrichtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnqualifiedPackage.KOMMUNIKATION_TYPE: {
				KommunikationType kommunikationType = (KommunikationType)theEObject;
				T result = caseKommunikationType(kommunikationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnqualifiedPackage.NACHRICHTENKOPF_G2G_TYPE: {
				NachrichtenkopfG2GType nachrichtenkopfG2GType = (NachrichtenkopfG2GType)theEObject;
				T result = caseNachrichtenkopfG2GType(nachrichtenkopfG2GType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnqualifiedPackage.NACHRICHT_G2G_TYPE: {
				NachrichtG2GType nachrichtG2GType = (NachrichtG2GType)theEObject;
				T result = caseNachrichtG2GType(nachrichtG2GType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behoerde Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behoerde Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehoerdeType(BehoerdeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Kommunikation Kanal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Kommunikation Kanal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeKommunikationKanalType(CodeKommunikationKanalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Verzeichnisdienst Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Verzeichnisdienst Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeVerzeichnisdienstType(CodeVerzeichnisdienstType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifikation Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifikation Nachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifikationNachrichtType(IdentifikationNachrichtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kommunikation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kommunikation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKommunikationType(KommunikationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachrichtenkopf G2G Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachrichtenkopf G2G Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachrichtenkopfG2GType(NachrichtenkopfG2GType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachricht G2G Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachricht G2G Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachrichtG2GType(NachrichtG2GType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
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

} //UnqualifiedSwitch
