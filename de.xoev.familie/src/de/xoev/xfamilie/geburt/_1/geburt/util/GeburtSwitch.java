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
package de.xoev.xfamilie.geburt._1.geburt.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.geburt._1.geburt.*;

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
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage
 * @generated
 */
public class GeburtSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeburtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeburtSwitch() {
		if (modelPackage == null) {
			modelPackage = GeburtPackage.eINSTANCE;
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
			case GeburtPackage.ANGABEN_GESETZLICHER_VERTRETER_ELTERNTEIL_TYPE: {
				AngabenGesetzlicherVertreterElternteilType angabenGesetzlicherVertreterElternteilType = (AngabenGesetzlicherVertreterElternteilType)theEObject;
				T result = caseAngabenGesetzlicherVertreterElternteilType(angabenGesetzlicherVertreterElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL1_TYPE: {
				AngabenZumElternteil1Type angabenZumElternteil1Type = (AngabenZumElternteil1Type)theEObject;
				T result = caseAngabenZumElternteil1Type(angabenZumElternteil1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE: {
				AngabenZumElternteil2Type angabenZumElternteil2Type = (AngabenZumElternteil2Type)theEObject;
				T result = caseAngabenZumElternteil2Type(angabenZumElternteil2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.ANGABEN_ZUM_KIND_TYPE: {
				AngabenZumKindType angabenZumKindType = (AngabenZumKindType)theEObject;
				T result = caseAngabenZumKindType(angabenZumKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.CODE_ALLEINSORGE_EINTRAGUNG_TYPE: {
				CodeAlleinsorgeEintragungType codeAlleinsorgeEintragungType = (CodeAlleinsorgeEintragungType)theEObject;
				T result = caseCodeAlleinsorgeEintragungType(codeAlleinsorgeEintragungType);
				if (result == null) result = caseCode(codeAlleinsorgeEintragungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE: {
				EintragungNachweisregisterType eintragungNachweisregisterType = (EintragungNachweisregisterType)theEObject;
				T result = caseEintragungNachweisregisterType(eintragungNachweisregisterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.NACHGEBURTLICHE_ANGABEN_ZUM_KIND_TYPE: {
				NachgeburtlicheAngabenZumKindType nachgeburtlicheAngabenZumKindType = (NachgeburtlicheAngabenZumKindType)theEObject;
				T result = caseNachgeburtlicheAngabenZumKindType(nachgeburtlicheAngabenZumKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.SORGE_ALLEINSORGE_ANTRAG0801_TYPE: {
				SorgeAlleinsorgeAntrag0801Type sorgeAlleinsorgeAntrag0801Type = (SorgeAlleinsorgeAntrag0801Type)theEObject;
				T result = caseSorgeAlleinsorgeAntrag0801Type(sorgeAlleinsorgeAntrag0801Type);
				if (result == null) result = caseAntragsnachrichtType(sorgeAlleinsorgeAntrag0801Type);
				if (result == null) result = caseNachrichtType(sorgeAlleinsorgeAntrag0801Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.SORGE_ALLEINSORGE_AUSKUNFT0803_TYPE: {
				SorgeAlleinsorgeAuskunft0803Type sorgeAlleinsorgeAuskunft0803Type = (SorgeAlleinsorgeAuskunft0803Type)theEObject;
				T result = caseSorgeAlleinsorgeAuskunft0803Type(sorgeAlleinsorgeAuskunft0803Type);
				if (result == null) result = caseAntragsnachrichtType(sorgeAlleinsorgeAuskunft0803Type);
				if (result == null) result = caseNachrichtType(sorgeAlleinsorgeAuskunft0803Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE: {
				SorgeErklaerungVorbeitung0802Type sorgeErklaerungVorbeitung0802Type = (SorgeErklaerungVorbeitung0802Type)theEObject;
				T result = caseSorgeErklaerungVorbeitung0802Type(sorgeErklaerungVorbeitung0802Type);
				if (result == null) result = caseAntragsnachrichtType(sorgeErklaerungVorbeitung0802Type);
				if (result == null) result = caseNachrichtType(sorgeErklaerungVorbeitung0802Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.SORGE_NACHWEISREGISTER_EINTRAGUNG0804_TYPE: {
				SorgeNachweisregisterEintragung0804Type sorgeNachweisregisterEintragung0804Type = (SorgeNachweisregisterEintragung0804Type)theEObject;
				T result = caseSorgeNachweisregisterEintragung0804Type(sorgeNachweisregisterEintragung0804Type);
				if (result == null) result = caseAntragsnachrichtType(sorgeNachweisregisterEintragung0804Type);
				if (result == null) result = caseNachrichtType(sorgeNachweisregisterEintragung0804Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE: {
				SorgeNachweisregisterKorrektur0805Type sorgeNachweisregisterKorrektur0805Type = (SorgeNachweisregisterKorrektur0805Type)theEObject;
				T result = caseSorgeNachweisregisterKorrektur0805Type(sorgeNachweisregisterKorrektur0805Type);
				if (result == null) result = caseAntragsnachrichtType(sorgeNachweisregisterKorrektur0805Type);
				if (result == null) result = caseNachrichtType(sorgeNachweisregisterKorrektur0805Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE: {
				SorgeNachweisregisterLoeschung0806Type sorgeNachweisregisterLoeschung0806Type = (SorgeNachweisregisterLoeschung0806Type)theEObject;
				T result = caseSorgeNachweisregisterLoeschung0806Type(sorgeNachweisregisterLoeschung0806Type);
				if (result == null) result = caseAntragsnachrichtType(sorgeNachweisregisterLoeschung0806Type);
				if (result == null) result = caseNachrichtType(sorgeNachweisregisterLoeschung0806Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GeburtPackage.ZUSATZANGABEN_TYPE: {
				ZusatzangabenType zusatzangabenType = (ZusatzangabenType)theEObject;
				T result = caseZusatzangabenType(zusatzangabenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Gesetzlicher Vertreter Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Gesetzlicher Vertreter Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenGesetzlicherVertreterElternteilType(AngabenGesetzlicherVertreterElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zum Elternteil1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zum Elternteil1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZumElternteil1Type(AngabenZumElternteil1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zum Elternteil2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zum Elternteil2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZumElternteil2Type(AngabenZumElternteil2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Zum Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Zum Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenZumKindType(AngabenZumKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Alleinsorge Eintragung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Alleinsorge Eintragung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAlleinsorgeEintragungType(CodeAlleinsorgeEintragungType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Eintragung Nachweisregister Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eintragung Nachweisregister Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEintragungNachweisregisterType(EintragungNachweisregisterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachgeburtliche Angaben Zum Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachgeburtliche Angaben Zum Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachgeburtlicheAngabenZumKindType(NachgeburtlicheAngabenZumKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorge Alleinsorge Antrag0801 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorge Alleinsorge Antrag0801 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSorgeAlleinsorgeAntrag0801Type(SorgeAlleinsorgeAntrag0801Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorge Alleinsorge Auskunft0803 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorge Alleinsorge Auskunft0803 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSorgeAlleinsorgeAuskunft0803Type(SorgeAlleinsorgeAuskunft0803Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorge Erklaerung Vorbeitung0802 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorge Erklaerung Vorbeitung0802 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSorgeErklaerungVorbeitung0802Type(SorgeErklaerungVorbeitung0802Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorge Nachweisregister Eintragung0804 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorge Nachweisregister Eintragung0804 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSorgeNachweisregisterEintragung0804Type(SorgeNachweisregisterEintragung0804Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorge Nachweisregister Korrektur0805 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorge Nachweisregister Korrektur0805 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSorgeNachweisregisterKorrektur0805Type(SorgeNachweisregisterKorrektur0805Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorge Nachweisregister Loeschung0806 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorge Nachweisregister Loeschung0806 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSorgeNachweisregisterLoeschung0806Type(SorgeNachweisregisterLoeschung0806Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zusatzangaben Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zusatzangaben Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZusatzangabenType(ZusatzangabenType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Antragsnachricht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragsnachricht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragsnachrichtType(AntragsnachrichtType object) {
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

} //GeburtSwitch
