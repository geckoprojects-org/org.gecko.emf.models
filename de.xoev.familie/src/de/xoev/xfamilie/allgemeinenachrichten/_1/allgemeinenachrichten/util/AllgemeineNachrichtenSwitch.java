/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.*;

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

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
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage
 * @generated
 */
public class AllgemeineNachrichtenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AllgemeineNachrichtenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllgemeineNachrichtenSwitch() {
		if (modelPackage == null) {
			modelPackage = AllgemeineNachrichtenPackage.eINSTANCE;
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_QUITTUNG0011_TYPE: {
				AllgemeinenachrichtenQuittung0011Type allgemeinenachrichtenQuittung0011Type = (AllgemeinenachrichtenQuittung0011Type)theEObject;
				T result = caseAllgemeinenachrichtenQuittung0011Type(allgemeinenachrichtenQuittung0011Type);
				if (result == null) result = caseNachrichtType(allgemeinenachrichtenQuittung0011Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE: {
				AllgemeinenachrichtenRueckweisung0001Type allgemeinenachrichtenRueckweisung0001Type = (AllgemeinenachrichtenRueckweisung0001Type)theEObject;
				T result = caseAllgemeinenachrichtenRueckweisung0001Type(allgemeinenachrichtenRueckweisung0001Type);
				if (result == null) result = caseNachrichtType(allgemeinenachrichtenRueckweisung0001Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllgemeineNachrichtenPackage.CODE_RUECKWEISUNGSGRUND_TYPE: {
				CodeRueckweisungsgrundType codeRueckweisungsgrundType = (CodeRueckweisungsgrundType)theEObject;
				T result = caseCodeRueckweisungsgrundType(codeRueckweisungsgrundType);
				if (result == null) result = caseCode(codeRueckweisungsgrundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE: {
				RueckweisendeStelleType rueckweisendeStelleType = (RueckweisendeStelleType)theEObject;
				T result = caseRueckweisendeStelleType(rueckweisendeStelleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE: {
				RueckweisungsgrundSpezifischType rueckweisungsgrundSpezifischType = (RueckweisungsgrundSpezifischType)theEObject;
				T result = caseRueckweisungsgrundSpezifischType(rueckweisungsgrundSpezifischType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_TYPE: {
				RueckweisungsgrundType rueckweisungsgrundType = (RueckweisungsgrundType)theEObject;
				T result = caseRueckweisungsgrundType(rueckweisungsgrundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE: {
				TransportinformationenType transportinformationenType = (TransportinformationenType)theEObject;
				T result = caseTransportinformationenType(transportinformationenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeinenachrichten Quittung0011 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeinenachrichten Quittung0011 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeinenachrichtenQuittung0011Type(AllgemeinenachrichtenQuittung0011Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allgemeinenachrichten Rueckweisung0001 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allgemeinenachrichten Rueckweisung0001 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllgemeinenachrichtenRueckweisung0001Type(AllgemeinenachrichtenRueckweisung0001Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Rueckweisungsgrund Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Rueckweisungsgrund Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeRueckweisungsgrundType(CodeRueckweisungsgrundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rueckweisende Stelle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rueckweisende Stelle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRueckweisendeStelleType(RueckweisendeStelleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rueckweisungsgrund Spezifisch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rueckweisungsgrund Spezifisch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRueckweisungsgrundSpezifischType(RueckweisungsgrundSpezifischType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rueckweisungsgrund Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rueckweisungsgrund Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRueckweisungsgrundType(RueckweisungsgrundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportinformationen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportinformationen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportinformationenType(TransportinformationenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachrichtType(NachrichtType object) {
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

} //AllgemeineNachrichtenSwitch
