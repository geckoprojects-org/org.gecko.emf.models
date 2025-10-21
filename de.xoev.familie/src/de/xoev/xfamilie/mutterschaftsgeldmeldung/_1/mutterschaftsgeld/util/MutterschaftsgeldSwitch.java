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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.*;

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
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage
 * @generated
 */
public class MutterschaftsgeldSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MutterschaftsgeldPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutterschaftsgeldSwitch() {
		if (modelPackage == null) {
			modelPackage = MutterschaftsgeldPackage.eINSTANCE;
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
			case MutterschaftsgeldPackage.ANGABEN_ENTBINDUNG_TYPE: {
				AngabenEntbindungType angabenEntbindungType = (AngabenEntbindungType)theEObject;
				T result = caseAngabenEntbindungType(angabenEntbindungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE: {
				AngabenMutterschaftsgeldType angabenMutterschaftsgeldType = (AngabenMutterschaftsgeldType)theEObject;
				T result = caseAngabenMutterschaftsgeldType(angabenMutterschaftsgeldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_RUECK_TYPE: {
				AntragstellenderElternteilMutterschaftsgeldmeldungRueckType antragstellenderElternteilMutterschaftsgeldmeldungRueckType = (AntragstellenderElternteilMutterschaftsgeldmeldungRueckType)theEObject;
				T result = caseAntragstellenderElternteilMutterschaftsgeldmeldungRueckType(antragstellenderElternteilMutterschaftsgeldmeldungRueckType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_MUTTERSCHAFTSGELDMELDUNG_TYPE: {
				AntragstellenderElternteilMutterschaftsgeldmeldungType antragstellenderElternteilMutterschaftsgeldmeldungType = (AntragstellenderElternteilMutterschaftsgeldmeldungType)theEObject;
				T result = caseAntragstellenderElternteilMutterschaftsgeldmeldungType(antragstellenderElternteilMutterschaftsgeldmeldungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.CODE_KENNZEICHEN_MUTTERSCHAFTSGELD_TYPE: {
				CodeKennzeichenMutterschaftsgeldType codeKennzeichenMutterschaftsgeldType = (CodeKennzeichenMutterschaftsgeldType)theEObject;
				T result = caseCodeKennzeichenMutterschaftsgeldType(codeKennzeichenMutterschaftsgeldType);
				if (result == null) result = caseCode(codeKennzeichenMutterschaftsgeldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE: {
				MutterschaftsgeldmeldungAnforderung0501Type mutterschaftsgeldmeldungAnforderung0501Type = (MutterschaftsgeldmeldungAnforderung0501Type)theEObject;
				T result = caseMutterschaftsgeldmeldungAnforderung0501Type(mutterschaftsgeldmeldungAnforderung0501Type);
				if (result == null) result = caseNachrichtType(mutterschaftsgeldmeldungAnforderung0501Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE: {
				MutterschaftsgeldmeldungRueckmeldung0502Type mutterschaftsgeldmeldungRueckmeldung0502Type = (MutterschaftsgeldmeldungRueckmeldung0502Type)theEObject;
				T result = caseMutterschaftsgeldmeldungRueckmeldung0502Type(mutterschaftsgeldmeldungRueckmeldung0502Type);
				if (result == null) result = caseNachrichtType(mutterschaftsgeldmeldungRueckmeldung0502Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE: {
				StornierungType stornierungType = (StornierungType)theEObject;
				T result = caseStornierungType(stornierungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE1: {
				StornierungType1 stornierungType1 = (StornierungType1)theEObject;
				T result = caseStornierungType1(stornierungType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Entbindung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Entbindung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenEntbindungType(AngabenEntbindungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Mutterschaftsgeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Mutterschaftsgeld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenMutterschaftsgeldType(AngabenMutterschaftsgeldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Rueck Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderElternteilMutterschaftsgeldmeldungRueckType(AntragstellenderElternteilMutterschaftsgeldmeldungRueckType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderElternteilMutterschaftsgeldmeldungType(AntragstellenderElternteilMutterschaftsgeldmeldungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Kennzeichen Mutterschaftsgeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Kennzeichen Mutterschaftsgeld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeKennzeichenMutterschaftsgeldType(CodeKennzeichenMutterschaftsgeldType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutterschaftsgeldmeldung Anforderung0501 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutterschaftsgeldmeldungAnforderung0501Type(MutterschaftsgeldmeldungAnforderung0501Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutterschaftsgeldmeldungRueckmeldung0502Type(MutterschaftsgeldmeldungRueckmeldung0502Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stornierung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stornierung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStornierungType(StornierungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stornierung Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stornierung Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStornierungType1(StornierungType1 object) {
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

} //MutterschaftsgeldSwitch
