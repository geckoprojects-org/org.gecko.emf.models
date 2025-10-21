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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.*;

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
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage
 * @generated
 */
public class UnterhaltsvorschussSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnterhaltsvorschussPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnterhaltsvorschussSwitch() {
		if (modelPackage == null) {
			modelPackage = UnterhaltsvorschussPackage.eINSTANCE;
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
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE: {
				AmtspflegendeType amtspflegendeType = (AmtspflegendeType)theEObject;
				T result = caseAmtspflegendeType(amtspflegendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANDERE_PERSON_TYPE: {
				AnderePersonType anderePersonType = (AnderePersonType)theEObject;
				T result = caseAnderePersonType(anderePersonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE: {
				AndererElternteilBasisType andererElternteilBasisType = (AndererElternteilBasisType)theEObject;
				T result = caseAndererElternteilBasisType(andererElternteilBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_TYPE: {
				AndererElternteilType andererElternteilType = (AndererElternteilType)theEObject;
				T result = caseAndererElternteilType(andererElternteilType);
				if (result == null) result = caseAndererElternteilBasisType(andererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_UEBERPRUEFUNG_TYPE: {
				AndererElternteilUeberpruefungType andererElternteilUeberpruefungType = (AndererElternteilUeberpruefungType)theEObject;
				T result = caseAndererElternteilUeberpruefungType(andererElternteilUeberpruefungType);
				if (result == null) result = caseAndererElternteilBasisType(andererElternteilUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANGABEN_KIND_NACHREICHEN_TYPE: {
				AngabenKindNachreichenType angabenKindNachreichenType = (AngabenKindNachreichenType)theEObject;
				T result = caseAngabenKindNachreichenType(angabenKindNachreichenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANSCHRIFT_OPTIONAL_TYPE: {
				AnschriftOptionalType anschriftOptionalType = (AnschriftOptionalType)theEObject;
				T result = caseAnschriftOptionalType(anschriftOptionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANTRAGSKIND_BASIS_TYPE: {
				AntragskindBasisType antragskindBasisType = (AntragskindBasisType)theEObject;
				T result = caseAntragskindBasisType(antragskindBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANTRAGSKIND_TYPE: {
				AntragskindType antragskindType = (AntragskindType)theEObject;
				T result = caseAntragskindType(antragskindType);
				if (result == null) result = caseAntragskindBasisType(antragskindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANTRAGSKIND_UEBERPRUEFUNG_TYPE: {
				AntragskindUeberpruefungType antragskindUeberpruefungType = (AntragskindUeberpruefungType)theEObject;
				T result = caseAntragskindUeberpruefungType(antragskindUeberpruefungType);
				if (result == null) result = caseAntragskindBasisType(antragskindUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE: {
				AntragstellenderElternteilBasisType antragstellenderElternteilBasisType = (AntragstellenderElternteilBasisType)theEObject;
				T result = caseAntragstellenderElternteilBasisType(antragstellenderElternteilBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_TYPE: {
				AntragstellenderElternteilType antragstellenderElternteilType = (AntragstellenderElternteilType)theEObject;
				T result = caseAntragstellenderElternteilType(antragstellenderElternteilType);
				if (result == null) result = caseAntragstellenderElternteilBasisType(antragstellenderElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_UEBERPRUEFUNG_TYPE: {
				AntragstellenderElternteilUeberpruefungType antragstellenderElternteilUeberpruefungType = (AntragstellenderElternteilUeberpruefungType)theEObject;
				T result = caseAntragstellenderElternteilUeberpruefungType(antragstellenderElternteilUeberpruefungType);
				if (result == null) result = caseAntragstellenderElternteilBasisType(antragstellenderElternteilUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_BASIS_TYPE: {
				AufenthaltKindBasisType aufenthaltKindBasisType = (AufenthaltKindBasisType)theEObject;
				T result = caseAufenthaltKindBasisType(aufenthaltKindBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_TYPE: {
				AufenthaltKindType aufenthaltKindType = (AufenthaltKindType)theEObject;
				T result = caseAufenthaltKindType(aufenthaltKindType);
				if (result == null) result = caseAufenthaltKindBasisType(aufenthaltKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.AUFENTHALT_KIND_UEBERPRUEFUNG_TYPE: {
				AufenthaltKindUeberpruefungType aufenthaltKindUeberpruefungType = (AufenthaltKindUeberpruefungType)theEObject;
				T result = caseAufenthaltKindUeberpruefungType(aufenthaltKindUeberpruefungType);
				if (result == null) result = caseAufenthaltKindBasisType(aufenthaltKindUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.AUSBILDUNG_ANDERER_ELTERNTEIL_TYPE: {
				AusbildungAndererElternteilType ausbildungAndererElternteilType = (AusbildungAndererElternteilType)theEObject;
				T result = caseAusbildungAndererElternteilType(ausbildungAndererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.BEISTAND_TYPE: {
				BeistandType beistandType = (BeistandType)theEObject;
				T result = caseBeistandType(beistandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE: {
				BemuehungenUnterhaltType bemuehungenUnterhaltType = (BemuehungenUnterhaltType)theEObject;
				T result = caseBemuehungenUnterhaltType(bemuehungenUnterhaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.BESTAETIGUNG_ANGABEN_TYPE: {
				BestaetigungAngabenType bestaetigungAngabenType = (BestaetigungAngabenType)theEObject;
				T result = caseBestaetigungAngabenType(bestaetigungAngabenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.BETREUER_TYPE: {
				BetreuerType betreuerType = (BetreuerType)theEObject;
				T result = caseBetreuerType(betreuerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.BEZUG_UV_KIND_TYPE: {
				BezugUvKindType bezugUvKindType = (BezugUvKindType)theEObject;
				T result = caseBezugUvKindType(bezugUvKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.CODE_AUSBILDUNG_TYPE: {
				CodeAusbildungType codeAusbildungType = (CodeAusbildungType)theEObject;
				T result = caseCodeAusbildungType(codeAusbildungType);
				if (result == null) result = caseCode(codeAusbildungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.CODE_EINKUENFTE_ANDERER_ELTERNTEIL_TYPE: {
				CodeEinkuenfteAndererElternteilType codeEinkuenfteAndererElternteilType = (CodeEinkuenfteAndererElternteilType)theEObject;
				T result = caseCodeEinkuenfteAndererElternteilType(codeEinkuenfteAndererElternteilType);
				if (result == null) result = caseCode(codeEinkuenfteAndererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.CODE_EINKUENFTE_KIND_TYPE: {
				CodeEinkuenfteKindType codeEinkuenfteKindType = (CodeEinkuenfteKindType)theEObject;
				T result = caseCodeEinkuenfteKindType(codeEinkuenfteKindType);
				if (result == null) result = caseCode(codeEinkuenfteKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.CODE_SONSTIGE_LEISTUNGEN_UV_TYPE: {
				CodeSonstigeLeistungenUVType codeSonstigeLeistungenUVType = (CodeSonstigeLeistungenUVType)theEObject;
				T result = caseCodeSonstigeLeistungenUVType(codeSonstigeLeistungenUVType);
				if (result == null) result = caseCode(codeSonstigeLeistungenUVType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.CODE_STAATSANGEHOERIGKEIT_UV_TYPE: {
				CodeStaatsangehoerigkeitUVType codeStaatsangehoerigkeitUVType = (CodeStaatsangehoerigkeitUVType)theEObject;
				T result = caseCodeStaatsangehoerigkeitUVType(codeStaatsangehoerigkeitUVType);
				if (result == null) result = caseCode(codeStaatsangehoerigkeitUVType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.CODE_STEUERKLASSE_TYPE: {
				CodeSteuerklasseType codeSteuerklasseType = (CodeSteuerklasseType)theEObject;
				T result = caseCodeSteuerklasseType(codeSteuerklasseType);
				if (result == null) result = caseCode(codeSteuerklasseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.CODE_UNTERHALTSBEMUEHUNGEN_TYPE: {
				CodeUnterhaltsbemuehungenType codeUnterhaltsbemuehungenType = (CodeUnterhaltsbemuehungenType)theEObject;
				T result = caseCodeUnterhaltsbemuehungenType(codeUnterhaltsbemuehungenType);
				if (result == null) result = caseCode(codeUnterhaltsbemuehungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE: {
				EinkuenfteAndererElternteilType einkuenfteAndererElternteilType = (EinkuenfteAndererElternteilType)theEObject;
				T result = caseEinkuenfteAndererElternteilType(einkuenfteAndererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE: {
				EinkuenfteKindType einkuenfteKindType = (EinkuenfteKindType)theEObject;
				T result = caseEinkuenfteKindType(einkuenfteKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE: {
				ElternschaftType elternschaftType = (ElternschaftType)theEObject;
				T result = caseElternschaftType(elternschaftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE: {
				FamilienstandBasisType familienstandBasisType = (FamilienstandBasisType)theEObject;
				T result = caseFamilienstandBasisType(familienstandBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.FAMILIENSTAND_TYPE: {
				FamilienstandType familienstandType = (FamilienstandType)theEObject;
				T result = caseFamilienstandType(familienstandType);
				if (result == null) result = caseFamilienstandBasisType(familienstandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.FAMILIENSTAND_UEBERPRUEFUNG_TYPE: {
				FamilienstandUeberpruefungType familienstandUeberpruefungType = (FamilienstandUeberpruefungType)theEObject;
				T result = caseFamilienstandUeberpruefungType(familienstandUeberpruefungType);
				if (result == null) result = caseFamilienstandBasisType(familienstandUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.GEBURT_GEBURTSORT_PFLICHT_TYPE: {
				GeburtGeburtsortPflichtType geburtGeburtsortPflichtType = (GeburtGeburtsortPflichtType)theEObject;
				T result = caseGeburtGeburtsortPflichtType(geburtGeburtsortPflichtType);
				if (result == null) result = caseGeburtType(geburtGeburtsortPflichtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.GEBURT_NUR_GEBURTSDATUM_TYPE: {
				GeburtNurGeburtsdatumType geburtNurGeburtsdatumType = (GeburtNurGeburtsdatumType)theEObject;
				T result = caseGeburtNurGeburtsdatumType(geburtNurGeburtsdatumType);
				if (result == null) result = caseGeburtType(geburtNurGeburtsdatumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.GEBURT_TYPE: {
				GeburtType geburtType = (GeburtType)theEObject;
				T result = caseGeburtType(geburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.GESCHIEDEN_ANTRAGSTELLENDE_BASIS_TYPE: {
				GeschiedenAntragstellendeBasisType geschiedenAntragstellendeBasisType = (GeschiedenAntragstellendeBasisType)theEObject;
				T result = caseGeschiedenAntragstellendeBasisType(geschiedenAntragstellendeBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.GESCHIEDEN_ANTRAGSTELLENDE_TYPE: {
				GeschiedenAntragstellendeType geschiedenAntragstellendeType = (GeschiedenAntragstellendeType)theEObject;
				T result = caseGeschiedenAntragstellendeType(geschiedenAntragstellendeType);
				if (result == null) result = caseGeschiedenAntragstellendeBasisType(geschiedenAntragstellendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.GESCHIEDEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: {
				GeschiedenAntragstellendeUeberpruefungType geschiedenAntragstellendeUeberpruefungType = (GeschiedenAntragstellendeUeberpruefungType)theEObject;
				T result = caseGeschiedenAntragstellendeUeberpruefungType(geschiedenAntragstellendeUeberpruefungType);
				if (result == null) result = caseGeschiedenAntragstellendeBasisType(geschiedenAntragstellendeUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.INSTITUTION_UNTERHALTSTITEL_TYPE: {
				InstitutionUnterhaltstitelType institutionUnterhaltstitelType = (InstitutionUnterhaltstitelType)theEObject;
				T result = caseInstitutionUnterhaltstitelType(institutionUnterhaltstitelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE: {
				LebenspartnerschaftAntragstellendeBasisType lebenspartnerschaftAntragstellendeBasisType = (LebenspartnerschaftAntragstellendeBasisType)theEObject;
				T result = caseLebenspartnerschaftAntragstellendeBasisType(lebenspartnerschaftAntragstellendeBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_TYPE: {
				LebenspartnerschaftAntragstellendeType lebenspartnerschaftAntragstellendeType = (LebenspartnerschaftAntragstellendeType)theEObject;
				T result = caseLebenspartnerschaftAntragstellendeType(lebenspartnerschaftAntragstellendeType);
				if (result == null) result = caseLebenspartnerschaftAntragstellendeBasisType(lebenspartnerschaftAntragstellendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: {
				LebenspartnerschaftAntragstellendeUeberpruefungType lebenspartnerschaftAntragstellendeUeberpruefungType = (LebenspartnerschaftAntragstellendeUeberpruefungType)theEObject;
				T result = caseLebenspartnerschaftAntragstellendeUeberpruefungType(lebenspartnerschaftAntragstellendeUeberpruefungType);
				if (result == null) result = caseLebenspartnerschaftAntragstellendeBasisType(lebenspartnerschaftAntragstellendeUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_BASIS_TYPE: {
				LebenspartnerschaftAufgehobenAntragstellendeBasisType lebenspartnerschaftAufgehobenAntragstellendeBasisType = (LebenspartnerschaftAufgehobenAntragstellendeBasisType)theEObject;
				T result = caseLebenspartnerschaftAufgehobenAntragstellendeBasisType(lebenspartnerschaftAufgehobenAntragstellendeBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_TYPE: {
				LebenspartnerschaftAufgehobenAntragstellendeType lebenspartnerschaftAufgehobenAntragstellendeType = (LebenspartnerschaftAufgehobenAntragstellendeType)theEObject;
				T result = caseLebenspartnerschaftAufgehobenAntragstellendeType(lebenspartnerschaftAufgehobenAntragstellendeType);
				if (result == null) result = caseLebenspartnerschaftAufgehobenAntragstellendeBasisType(lebenspartnerschaftAufgehobenAntragstellendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_AUFGEHOBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: {
				LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType = (LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType)theEObject;
				T result = caseLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType(lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType);
				if (result == null) result = caseLebenspartnerschaftAufgehobenAntragstellendeBasisType(lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_BASIS_TYPE: {
				LebenspartnerVerstorbenAntragstellendeBasisType lebenspartnerVerstorbenAntragstellendeBasisType = (LebenspartnerVerstorbenAntragstellendeBasisType)theEObject;
				T result = caseLebenspartnerVerstorbenAntragstellendeBasisType(lebenspartnerVerstorbenAntragstellendeBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_TYPE: {
				LebenspartnerVerstorbenAntragstellendeType lebenspartnerVerstorbenAntragstellendeType = (LebenspartnerVerstorbenAntragstellendeType)theEObject;
				T result = caseLebenspartnerVerstorbenAntragstellendeType(lebenspartnerVerstorbenAntragstellendeType);
				if (result == null) result = caseLebenspartnerVerstorbenAntragstellendeBasisType(lebenspartnerVerstorbenAntragstellendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSPARTNER_VERSTORBEN_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: {
				LebenspartnerVerstorbenAntragstellendeUeberpruefungType lebenspartnerVerstorbenAntragstellendeUeberpruefungType = (LebenspartnerVerstorbenAntragstellendeUeberpruefungType)theEObject;
				T result = caseLebenspartnerVerstorbenAntragstellendeUeberpruefungType(lebenspartnerVerstorbenAntragstellendeUeberpruefungType);
				if (result == null) result = caseLebenspartnerVerstorbenAntragstellendeBasisType(lebenspartnerVerstorbenAntragstellendeUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSSITUATION_BASIS_TYPE: {
				LebenssituationBasisType lebenssituationBasisType = (LebenssituationBasisType)theEObject;
				T result = caseLebenssituationBasisType(lebenssituationBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSSITUATION_TYPE: {
				LebenssituationType lebenssituationType = (LebenssituationType)theEObject;
				T result = caseLebenssituationType(lebenssituationType);
				if (result == null) result = caseLebenssituationBasisType(lebenssituationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEBENSSITUATION_UEBERPRUEFUNG_TYPE: {
				LebenssituationUeberpruefungType lebenssituationUeberpruefungType = (LebenssituationUeberpruefungType)theEObject;
				T result = caseLebenssituationUeberpruefungType(lebenssituationUeberpruefungType);
				if (result == null) result = caseLebenssituationBasisType(lebenssituationUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE: {
				LedigAntragstellendeBasisType ledigAntragstellendeBasisType = (LedigAntragstellendeBasisType)theEObject;
				T result = caseLedigAntragstellendeBasisType(ledigAntragstellendeBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_TYPE: {
				LedigAntragstellendeType ledigAntragstellendeType = (LedigAntragstellendeType)theEObject;
				T result = caseLedigAntragstellendeType(ledigAntragstellendeType);
				if (result == null) result = caseLedigAntragstellendeBasisType(ledigAntragstellendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: {
				LedigAntragstellendeUeberpruefungType ledigAntragstellendeUeberpruefungType = (LedigAntragstellendeUeberpruefungType)theEObject;
				T result = caseLedigAntragstellendeUeberpruefungType(ledigAntragstellendeUeberpruefungType);
				if (result == null) result = caseLedigAntragstellendeBasisType(ledigAntragstellendeUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEISTUNGSERHALT_TYPE: {
				LeistungserhaltType leistungserhaltType = (LeistungserhaltType)theEObject;
				T result = caseLeistungserhaltType(leistungserhaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LEISTUNGSGEWAEHRUNG_TYPE: {
				LeistungsgewaehrungType leistungsgewaehrungType = (LeistungsgewaehrungType)theEObject;
				T result = caseLeistungsgewaehrungType(leistungsgewaehrungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE: {
				LohnsteuerklasseType lohnsteuerklasseType = (LohnsteuerklasseType)theEObject;
				T result = caseLohnsteuerklasseType(lohnsteuerklasseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.NAME_MIT_GEBURTSNAME_TYPE: {
				NameMitGeburtsnameType nameMitGeburtsnameType = (NameMitGeburtsnameType)theEObject;
				T result = caseNameMitGeburtsnameType(nameMitGeburtsnameType);
				if (result == null) result = caseNameOptionalType(nameMitGeburtsnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.NAME_OHNE_GEBURTSNAME_TYPE: {
				NameOhneGeburtsnameType nameOhneGeburtsnameType = (NameOhneGeburtsnameType)theEObject;
				T result = caseNameOhneGeburtsnameType(nameOhneGeburtsnameType);
				if (result == null) result = caseNameOptionalType(nameOhneGeburtsnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE: {
				NameOptionalType nameOptionalType = (NameOptionalType)theEObject;
				T result = caseNameOptionalType(nameOptionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.RECHTSANWALT_TYPE: {
				RechtsanwaltType rechtsanwaltType = (RechtsanwaltType)theEObject;
				T result = caseRechtsanwaltType(rechtsanwaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.SCHULE_TYPE: {
				SchuleType schuleType = (SchuleType)theEObject;
				T result = caseSchuleType(schuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE: {
				SonstigeLeistungAndererElternteilType sonstigeLeistungAndererElternteilType = (SonstigeLeistungAndererElternteilType)theEObject;
				T result = caseSonstigeLeistungAndererElternteilType(sonstigeLeistungAndererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE: {
				SonstigeLeistungKindType sonstigeLeistungKindType = (SonstigeLeistungKindType)theEObject;
				T result = caseSonstigeLeistungKindType(sonstigeLeistungKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_UEBERPRUEFUNG_TYPE: {
				SonstigeLeistungKindUeberpruefungType sonstigeLeistungKindUeberpruefungType = (SonstigeLeistungKindUeberpruefungType)theEObject;
				T result = caseSonstigeLeistungKindUeberpruefungType(sonstigeLeistungKindUeberpruefungType);
				if (result == null) result = caseSonstigeLeistungKindType(sonstigeLeistungKindUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_ANDERER_ELTERNTEIL_TYPE: {
				StaatsangehoerigkeitAndererElternteilType staatsangehoerigkeitAndererElternteilType = (StaatsangehoerigkeitAndererElternteilType)theEObject;
				T result = caseStaatsangehoerigkeitAndererElternteilType(staatsangehoerigkeitAndererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.STAATSANGEHOERIGKEIT_TYPE: {
				StaatsangehoerigkeitType staatsangehoerigkeitType = (StaatsangehoerigkeitType)theEObject;
				T result = caseStaatsangehoerigkeitType(staatsangehoerigkeitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.TRAEGER_KRANKENVERSICHERUNG_TYPE: {
				TraegerKrankenversicherungType traegerKrankenversicherungType = (TraegerKrankenversicherungType)theEObject;
				T result = caseTraegerKrankenversicherungType(traegerKrankenversicherungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE: {
				UnterhaltBasisType unterhaltBasisType = (UnterhaltBasisType)theEObject;
				T result = caseUnterhaltBasisType(unterhaltBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_TYPE: {
				UnterhaltstitelType unterhaltstitelType = (UnterhaltstitelType)theEObject;
				T result = caseUnterhaltstitelType(unterhaltstitelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALTSTITEL_UEBERPRUEFUNG_TYPE: {
				UnterhaltstitelUeberpruefungType unterhaltstitelUeberpruefungType = (UnterhaltstitelUeberpruefungType)theEObject;
				T result = caseUnterhaltstitelUeberpruefungType(unterhaltstitelUeberpruefungType);
				if (result == null) result = caseUnterhaltstitelType(unterhaltstitelUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALTSVORAUSZAHLUNGEN_TYPE: {
				UnterhaltsvorauszahlungenType unterhaltsvorauszahlungenType = (UnterhaltsvorauszahlungenType)theEObject;
				T result = caseUnterhaltsvorauszahlungenType(unterhaltsvorauszahlungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301_TYPE: {
				UnterhaltsvorschussantragAntrag0301Type unterhaltsvorschussantragAntrag0301Type = (UnterhaltsvorschussantragAntrag0301Type)theEObject;
				T result = caseUnterhaltsvorschussantragAntrag0301Type(unterhaltsvorschussantragAntrag0301Type);
				if (result == null) result = caseAntragsnachrichtType(unterhaltsvorschussantragAntrag0301Type);
				if (result == null) result = caseNachrichtType(unterhaltsvorschussantragAntrag0301Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE: {
				UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type unterhaltsvorschussantragJaehrlicheUeberpruefung0302Type = (UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type)theEObject;
				T result = caseUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type(unterhaltsvorschussantragJaehrlicheUeberpruefung0302Type);
				if (result == null) result = caseAntragsnachrichtType(unterhaltsvorschussantragJaehrlicheUeberpruefung0302Type);
				if (result == null) result = caseNachrichtType(unterhaltsvorschussantragJaehrlicheUeberpruefung0302Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303_TYPE: {
				UnterhaltsvorschussantragNachreichen0303Type unterhaltsvorschussantragNachreichen0303Type = (UnterhaltsvorschussantragNachreichen0303Type)theEObject;
				T result = caseUnterhaltsvorschussantragNachreichen0303Type(unterhaltsvorschussantragNachreichen0303Type);
				if (result == null) result = caseAntragsnachrichtType(unterhaltsvorschussantragNachreichen0303Type);
				if (result == null) result = caseNachrichtType(unterhaltsvorschussantragNachreichen0303Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311_TYPE: {
				UnterhaltsvorschussantragNachweisnachricht0311Type unterhaltsvorschussantragNachweisnachricht0311Type = (UnterhaltsvorschussantragNachweisnachricht0311Type)theEObject;
				T result = caseUnterhaltsvorschussantragNachweisnachricht0311Type(unterhaltsvorschussantragNachweisnachricht0311Type);
				if (result == null) result = caseNachrichtType(unterhaltsvorschussantragNachweisnachricht0311Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE: {
				UnterhaltszahlungenType unterhaltszahlungenType = (UnterhaltszahlungenType)theEObject;
				T result = caseUnterhaltszahlungenType(unterhaltszahlungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALT_TYPE: {
				UnterhaltType unterhaltType = (UnterhaltType)theEObject;
				T result = caseUnterhaltType(unterhaltType);
				if (result == null) result = caseUnterhaltBasisType(unterhaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.UNTERHALT_UEBERPRUEFUNG_TYPE: {
				UnterhaltUeberpruefungType unterhaltUeberpruefungType = (UnterhaltUeberpruefungType)theEObject;
				T result = caseUnterhaltUeberpruefungType(unterhaltUeberpruefungType);
				if (result == null) result = caseUnterhaltBasisType(unterhaltUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE: {
				VerheiratetAntragstellendeBasisType verheiratetAntragstellendeBasisType = (VerheiratetAntragstellendeBasisType)theEObject;
				T result = caseVerheiratetAntragstellendeBasisType(verheiratetAntragstellendeBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_TYPE: {
				VerheiratetAntragstellendeType verheiratetAntragstellendeType = (VerheiratetAntragstellendeType)theEObject;
				T result = caseVerheiratetAntragstellendeType(verheiratetAntragstellendeType);
				if (result == null) result = caseVerheiratetAntragstellendeBasisType(verheiratetAntragstellendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: {
				VerheiratetAntragstellendeUeberpruefungType verheiratetAntragstellendeUeberpruefungType = (VerheiratetAntragstellendeUeberpruefungType)theEObject;
				T result = caseVerheiratetAntragstellendeUeberpruefungType(verheiratetAntragstellendeUeberpruefungType);
				if (result == null) result = caseVerheiratetAntragstellendeBasisType(verheiratetAntragstellendeUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERMOEGEN_ANDERER_ELTERNTEIL_TYPE: {
				VermoegenAndererElternteilType vermoegenAndererElternteilType = (VermoegenAndererElternteilType)theEObject;
				T result = caseVermoegenAndererElternteilType(vermoegenAndererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE: {
				VertretungType vertretungType = (VertretungType)theEObject;
				T result = caseVertretungType(vertretungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERTRETUNG_UEBERPRUEFUNG_TYPE: {
				VertretungUeberpruefungType vertretungUeberpruefungType = (VertretungUeberpruefungType)theEObject;
				T result = caseVertretungUeberpruefungType(vertretungUeberpruefungType);
				if (result == null) result = caseVertretungType(vertretungUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_BASIS_TYPE: {
				VerwitwetAntragstellendeBasisType verwitwetAntragstellendeBasisType = (VerwitwetAntragstellendeBasisType)theEObject;
				T result = caseVerwitwetAntragstellendeBasisType(verwitwetAntragstellendeBasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_TYPE: {
				VerwitwetAntragstellendeType verwitwetAntragstellendeType = (VerwitwetAntragstellendeType)theEObject;
				T result = caseVerwitwetAntragstellendeType(verwitwetAntragstellendeType);
				if (result == null) result = caseVerwitwetAntragstellendeBasisType(verwitwetAntragstellendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VERWITWET_ANTRAGSTELLENDE_UEBERPRUEFUNG_TYPE: {
				VerwitwetAntragstellendeUeberpruefungType verwitwetAntragstellendeUeberpruefungType = (VerwitwetAntragstellendeUeberpruefungType)theEObject;
				T result = caseVerwitwetAntragstellendeUeberpruefungType(verwitwetAntragstellendeUeberpruefungType);
				if (result == null) result = caseVerwitwetAntragstellendeBasisType(verwitwetAntragstellendeUeberpruefungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.VORMUND_TYPE: {
				VormundType vormundType = (VormundType)theEObject;
				T result = caseVormundType(vormundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE: {
				WeitereGemeinsameKinderType weitereGemeinsameKinderType = (WeitereGemeinsameKinderType)theEObject;
				T result = caseWeitereGemeinsameKinderType(weitereGemeinsameKinderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE: {
				WeitereKinderAndererElternteilType weitereKinderAndererElternteilType = (WeitereKinderAndererElternteilType)theEObject;
				T result = caseWeitereKinderAndererElternteilType(weitereKinderAndererElternteilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amtspflegende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amtspflegende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmtspflegendeType(AmtspflegendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Andere Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Andere Person Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnderePersonType(AnderePersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anderer Elternteil Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anderer Elternteil Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndererElternteilBasisType(AndererElternteilBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndererElternteilType(AndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anderer Elternteil Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anderer Elternteil Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndererElternteilUeberpruefungType(AndererElternteilUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Kind Nachreichen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Kind Nachreichen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenKindNachreichenType(AngabenKindNachreichenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anschrift Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anschrift Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnschriftOptionalType(AnschriftOptionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragskind Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragskind Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragskindBasisType(AntragskindBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragskind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragskind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragskindType(AntragskindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragskind Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragskind Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragskindUeberpruefungType(AntragskindUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderElternteilBasisType(AntragstellenderElternteilBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderElternteilType(AntragstellenderElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderElternteilUeberpruefungType(AntragstellenderElternteilUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aufenthalt Kind Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aufenthalt Kind Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAufenthaltKindBasisType(AufenthaltKindBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aufenthalt Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aufenthalt Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAufenthaltKindType(AufenthaltKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aufenthalt Kind Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aufenthalt Kind Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAufenthaltKindUeberpruefungType(AufenthaltKindUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ausbildung Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ausbildung Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAusbildungAndererElternteilType(AusbildungAndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beistand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beistand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeistandType(BeistandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bemuehungen Unterhalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bemuehungen Unterhalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBemuehungenUnterhaltType(BemuehungenUnterhaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bestaetigung Angaben Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bestaetigung Angaben Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBestaetigungAngabenType(BestaetigungAngabenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Betreuer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Betreuer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBetreuerType(BetreuerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezug Uv Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezug Uv Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezugUvKindType(BezugUvKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Ausbildung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Ausbildung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAusbildungType(CodeAusbildungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Einkuenfte Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Einkuenfte Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeEinkuenfteAndererElternteilType(CodeEinkuenfteAndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Einkuenfte Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Einkuenfte Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeEinkuenfteKindType(CodeEinkuenfteKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Sonstige Leistungen UV Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Sonstige Leistungen UV Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSonstigeLeistungenUVType(CodeSonstigeLeistungenUVType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Staatsangehoerigkeit UV Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Staatsangehoerigkeit UV Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeStaatsangehoerigkeitUVType(CodeStaatsangehoerigkeitUVType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Steuerklasse Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Steuerklasse Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSteuerklasseType(CodeSteuerklasseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Unterhaltsbemuehungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Unterhaltsbemuehungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeUnterhaltsbemuehungenType(CodeUnterhaltsbemuehungenType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Einkuenfte Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkuenfte Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkuenfteAndererElternteilType(EinkuenfteAndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkuenfte Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkuenfte Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkuenfteKindType(EinkuenfteKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elternschaft Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elternschaft Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElternschaftType(ElternschaftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familienstand Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familienstand Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilienstandBasisType(FamilienstandBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familienstand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familienstand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilienstandType(FamilienstandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familienstand Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familienstand Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilienstandUeberpruefungType(FamilienstandUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geburt Geburtsort Pflicht Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geburt Geburtsort Pflicht Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeburtGeburtsortPflichtType(GeburtGeburtsortPflichtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geburt Nur Geburtsdatum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geburt Nur Geburtsdatum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeburtNurGeburtsdatumType(GeburtNurGeburtsdatumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geburt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeburtType(GeburtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschieden Antragstellende Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschieden Antragstellende Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschiedenAntragstellendeBasisType(GeschiedenAntragstellendeBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschieden Antragstellende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschieden Antragstellende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschiedenAntragstellendeType(GeschiedenAntragstellendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geschieden Antragstellende Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geschieden Antragstellende Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeschiedenAntragstellendeUeberpruefungType(GeschiedenAntragstellendeUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Institution Unterhaltstitel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Institution Unterhaltstitel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstitutionUnterhaltstitelType(InstitutionUnterhaltstitelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Antragstellende Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Antragstellende Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerschaftAntragstellendeBasisType(LebenspartnerschaftAntragstellendeBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Antragstellende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Antragstellende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerschaftAntragstellendeType(LebenspartnerschaftAntragstellendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Antragstellende Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Antragstellende Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerschaftAntragstellendeUeberpruefungType(LebenspartnerschaftAntragstellendeUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerschaftAufgehobenAntragstellendeBasisType(LebenspartnerschaftAufgehobenAntragstellendeBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Aufgehoben Antragstellende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Aufgehoben Antragstellende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerschaftAufgehobenAntragstellendeType(LebenspartnerschaftAufgehobenAntragstellendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Aufgehoben Antragstellende Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartnerschaft Aufgehoben Antragstellende Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType(LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartner Verstorben Antragstellende Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartner Verstorben Antragstellende Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerVerstorbenAntragstellendeBasisType(LebenspartnerVerstorbenAntragstellendeBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartner Verstorben Antragstellende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartner Verstorben Antragstellende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerVerstorbenAntragstellendeType(LebenspartnerVerstorbenAntragstellendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenspartner Verstorben Antragstellende Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenspartner Verstorben Antragstellende Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenspartnerVerstorbenAntragstellendeUeberpruefungType(LebenspartnerVerstorbenAntragstellendeUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenssituation Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenssituation Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenssituationBasisType(LebenssituationBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenssituation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenssituation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenssituationType(LebenssituationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lebenssituation Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lebenssituation Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLebenssituationUeberpruefungType(LebenssituationUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ledig Antragstellende Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ledig Antragstellende Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLedigAntragstellendeBasisType(LedigAntragstellendeBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ledig Antragstellende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ledig Antragstellende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLedigAntragstellendeType(LedigAntragstellendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ledig Antragstellende Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ledig Antragstellende Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLedigAntragstellendeUeberpruefungType(LedigAntragstellendeUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leistungserhalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leistungserhalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeistungserhaltType(LeistungserhaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leistungsgewaehrung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leistungsgewaehrung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeistungsgewaehrungType(LeistungsgewaehrungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lohnsteuerklasse Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lohnsteuerklasse Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLohnsteuerklasseType(LohnsteuerklasseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Mit Geburtsname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Mit Geburtsname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameMitGeburtsnameType(NameMitGeburtsnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Ohne Geburtsname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Ohne Geburtsname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameOhneGeburtsnameType(NameOhneGeburtsnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameOptionalType(NameOptionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rechtsanwalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rechtsanwalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRechtsanwaltType(RechtsanwaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchuleType(SchuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstige Leistung Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstige Leistung Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstigeLeistungAndererElternteilType(SonstigeLeistungAndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstige Leistung Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstige Leistung Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstigeLeistungKindType(SonstigeLeistungKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstige Leistung Kind Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstige Leistung Kind Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstigeLeistungKindUeberpruefungType(SonstigeLeistungKindUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staatsangehoerigkeit Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staatsangehoerigkeit Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaatsangehoerigkeitAndererElternteilType(StaatsangehoerigkeitAndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staatsangehoerigkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staatsangehoerigkeit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaatsangehoerigkeitType(StaatsangehoerigkeitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traeger Krankenversicherung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traeger Krankenversicherung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraegerKrankenversicherungType(TraegerKrankenversicherungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhalt Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhalt Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltBasisType(UnterhaltBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhaltstitel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhaltstitel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltstitelType(UnterhaltstitelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhaltstitel Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhaltstitel Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltstitelUeberpruefungType(UnterhaltstitelUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhaltsvorauszahlungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhaltsvorauszahlungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltsvorauszahlungenType(UnterhaltsvorauszahlungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhaltsvorschussantrag Antrag0301 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhaltsvorschussantrag Antrag0301 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltsvorschussantragAntrag0301Type(UnterhaltsvorschussantragAntrag0301Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type(UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhaltsvorschussantrag Nachreichen0303 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhaltsvorschussantrag Nachreichen0303 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltsvorschussantragNachreichen0303Type(UnterhaltsvorschussantragNachreichen0303Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltsvorschussantragNachweisnachricht0311Type(UnterhaltsvorschussantragNachweisnachricht0311Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhaltszahlungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhaltszahlungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltszahlungenType(UnterhaltszahlungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltType(UnterhaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unterhalt Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unterhalt Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnterhaltUeberpruefungType(UnterhaltUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verheiratet Antragstellende Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verheiratet Antragstellende Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerheiratetAntragstellendeBasisType(VerheiratetAntragstellendeBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verheiratet Antragstellende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verheiratet Antragstellende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerheiratetAntragstellendeType(VerheiratetAntragstellendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verheiratet Antragstellende Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verheiratet Antragstellende Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerheiratetAntragstellendeUeberpruefungType(VerheiratetAntragstellendeUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vermoegen Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vermoegen Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVermoegenAndererElternteilType(VermoegenAndererElternteilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertretung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertretung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertretungType(VertretungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertretung Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertretung Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertretungUeberpruefungType(VertretungUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verwitwet Antragstellende Basis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verwitwet Antragstellende Basis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerwitwetAntragstellendeBasisType(VerwitwetAntragstellendeBasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verwitwet Antragstellende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verwitwet Antragstellende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerwitwetAntragstellendeType(VerwitwetAntragstellendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verwitwet Antragstellende Ueberpruefung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verwitwet Antragstellende Ueberpruefung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerwitwetAntragstellendeUeberpruefungType(VerwitwetAntragstellendeUeberpruefungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vormund Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vormund Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVormundType(VormundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weitere Gemeinsame Kinder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weitere Gemeinsame Kinder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeitereGemeinsameKinderType(WeitereGemeinsameKinderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weitere Kinder Anderer Elternteil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weitere Kinder Anderer Elternteil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeitereKinderAndererElternteilType(WeitereKinderAndererElternteilType object) {
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

} //UnterhaltsvorschussSwitch
