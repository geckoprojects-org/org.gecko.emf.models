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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.*;

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
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage
 * @generated
 */
public class ElterngeldSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ElterngeldPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElterngeldSwitch() {
		if (modelPackage == null) {
			modelPackage = ElterngeldPackage.eINSTANCE;
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
			case ElterngeldPackage.ADOPTION_TYPE: {
				AdoptionType adoptionType = (AdoptionType)theEObject;
				T result = caseAdoptionType(adoptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ALGI_TYPE: {
				ALGIType algiType = (ALGIType)theEObject;
				T result = caseALGIType(algiType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ALLEINERZIEHENDENANSPRUCH_TYPE: {
				AlleinerziehendenanspruchType alleinerziehendenanspruchType = (AlleinerziehendenanspruchType)theEObject;
				T result = caseAlleinerziehendenanspruchType(alleinerziehendenanspruchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE: {
				AndereLeistungenType andereLeistungenType = (AndereLeistungenType)theEObject;
				T result = caseAndereLeistungenType(andereLeistungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE: {
				AngabenSozialversicherungType angabenSozialversicherungType = (AngabenSozialversicherungType)theEObject;
				T result = caseAngabenSozialversicherungType(angabenSozialversicherungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ANGABEN_WEITERES_KIND_TYPE: {
				AngabenWeiteresKindType angabenWeiteresKindType = (AngabenWeiteresKindType)theEObject;
				T result = caseAngabenWeiteresKindType(angabenWeiteresKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE: {
				AnschriftKindOptionalType anschriftKindOptionalType = (AnschriftKindOptionalType)theEObject;
				T result = caseAnschriftKindOptionalType(anschriftKindOptionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ANSCHRIFT_TYPE: {
				AnschriftType anschriftType = (AnschriftType)theEObject;
				T result = caseAnschriftType(anschriftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ANTRAGSTELLENDER_ELTERNTEIL_VORABMELDUNG_TYPE: {
				AntragstellenderElternteilVorabmeldungType antragstellenderElternteilVorabmeldungType = (AntragstellenderElternteilVorabmeldungType)theEObject;
				T result = caseAntragstellenderElternteilVorabmeldungType(antragstellenderElternteilVorabmeldungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ARBEITSZEIT_TYPE: {
				ArbeitszeitType arbeitszeitType = (ArbeitszeitType)theEObject;
				T result = caseArbeitszeitType(arbeitszeitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE: {
				AuslaendischesArbeitsverhaeltnisType auslaendischesArbeitsverhaeltnisType = (AuslaendischesArbeitsverhaeltnisType)theEObject;
				T result = caseAuslaendischesArbeitsverhaeltnisType(auslaendischesArbeitsverhaeltnisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE: {
				AuslandsaufenthaltBefrType auslandsaufenthaltBefrType = (AuslandsaufenthaltBefrType)theEObject;
				T result = caseAuslandsaufenthaltBefrType(auslandsaufenthaltBefrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.AUSLANDSAUFENTHALT_TYPE: {
				AuslandsaufenthaltType auslandsaufenthaltType = (AuslandsaufenthaltType)theEObject;
				T result = caseAuslandsaufenthaltType(auslandsaufenthaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE: {
				BeantragungElterngeldType beantragungElterngeldType = (BeantragungElterngeldType)theEObject;
				T result = caseBeantragungElterngeldType(beantragungElterngeldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.BEHINDERUNG_KIND_TYPE: {
				BehinderungKindType behinderungKindType = (BehinderungKindType)theEObject;
				T result = caseBehinderungKindType(behinderungKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE: {
				BerufsausbildungType berufsausbildungType = (BerufsausbildungType)theEObject;
				T result = caseBerufsausbildungType(berufsausbildungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.BERUFSBILDUNG_TYPE: {
				BerufsbildungType berufsbildungType = (BerufsbildungType)theEObject;
				T result = caseBerufsbildungType(berufsbildungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.BESONDERS_FRUEH_GEBORENES_KIND_TYPE: {
				BesondersFruehGeborenesKindType besondersFruehGeborenesKindType = (BesondersFruehGeborenesKindType)theEObject;
				T result = caseBesondersFruehGeborenesKindType(besondersFruehGeborenesKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.BUERGERGELD_TYPE: {
				BuergergeldType buergergeldType = (BuergergeldType)theEObject;
				T result = caseBuergergeldType(buergergeldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_ABBRUCHGRUND_TYPE: {
				CodeAbbruchgrundType codeAbbruchgrundType = (CodeAbbruchgrundType)theEObject;
				T result = caseCodeAbbruchgrundType(codeAbbruchgrundType);
				if (result == null) result = caseCode(codeAbbruchgrundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_ANFRAGEGRUND_TYPE: {
				CodeAnfragegrundType codeAnfragegrundType = (CodeAnfragegrundType)theEObject;
				T result = caseCodeAnfragegrundType(codeAnfragegrundType);
				if (result == null) result = caseCode(codeAnfragegrundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_ELTERNGELDANTRAG_TYPE: {
				CodeElterngeldantragType codeElterngeldantragType = (CodeElterngeldantragType)theEObject;
				T result = caseCodeElterngeldantragType(codeElterngeldantragType);
				if (result == null) result = caseCode(codeElterngeldantragType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_FEHLERFALL_TYPE: {
				CodeFehlerfallType codeFehlerfallType = (CodeFehlerfallType)theEObject;
				T result = caseCodeFehlerfallType(codeFehlerfallType);
				if (result == null) result = caseCode(codeFehlerfallType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_GESAMTEINKOMMEN_TYPE: {
				CodeGesamteinkommenType codeGesamteinkommenType = (CodeGesamteinkommenType)theEObject;
				T result = caseCodeGesamteinkommenType(codeGesamteinkommenType);
				if (result == null) result = caseCode(codeGesamteinkommenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_KINDSCHAFTSVERHAELTNIS_TYPE: {
				CodeKindschaftsverhaeltnisType codeKindschaftsverhaeltnisType = (CodeKindschaftsverhaeltnisType)theEObject;
				T result = caseCodeKindschaftsverhaeltnisType(codeKindschaftsverhaeltnisType);
				if (result == null) result = caseCode(codeKindschaftsverhaeltnisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_LEISTUNGSHOEHE_TYPE: {
				CodeLeistungshoeheType codeLeistungshoeheType = (CodeLeistungshoeheType)theEObject;
				T result = caseCodeLeistungshoeheType(codeLeistungshoeheType);
				if (result == null) result = caseCode(codeLeistungshoeheType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_VERSANDWEG_TYPE: {
				CodeVersandwegType codeVersandwegType = (CodeVersandwegType)theEObject;
				T result = caseCodeVersandwegType(codeVersandwegType);
				if (result == null) result = caseCode(codeVersandwegType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.CODE_VERSICHERUNGSART_TYPE: {
				CodeVersicherungsartType codeVersicherungsartType = (CodeVersicherungsartType)theEObject;
				T result = caseCodeVersicherungsartType(codeVersicherungsartType);
				if (result == null) result = caseCode(codeVersicherungsartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.EG_AELTERES_KIND_TYPE: {
				EGAelteresKindType egAelteresKindType = (EGAelteresKindType)theEObject;
				T result = caseEGAelteresKindType(egAelteresKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE: {
				EinkommensersatzleistungenBezugszeitraumType einkommensersatzleistungenBezugszeitraumType = (EinkommensersatzleistungenBezugszeitraumType)theEObject;
				T result = caseEinkommensersatzleistungenBezugszeitraumType(einkommensersatzleistungenBezugszeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE: {
				EinkommensersatzleistungenVorGeburtType einkommensersatzleistungenVorGeburtType = (EinkommensersatzleistungenVorGeburtType)theEObject;
				T result = caseEinkommensersatzleistungenVorGeburtType(einkommensersatzleistungenVorGeburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE: {
				EinkommenVorGeburtType einkommenVorGeburtType = (EinkommenVorGeburtType)theEObject;
				T result = caseEinkommenVorGeburtType(einkommenVorGeburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE: {
				EinkommenWaehrendBezugszeitraumType einkommenWaehrendBezugszeitraumType = (EinkommenWaehrendBezugszeitraumType)theEObject;
				T result = caseEinkommenWaehrendBezugszeitraumType(einkommenWaehrendBezugszeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE: {
				EinkuenfteBeantragterZeitraumType einkuenfteBeantragterZeitraumType = (EinkuenfteBeantragterZeitraumType)theEObject;
				T result = caseEinkuenfteBeantragterZeitraumType(einkuenfteBeantragterZeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_WAEHREND_BEZUGSZEITRAUM_TYPE: {
				EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType = (EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType)theEObject;
				T result = caseEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType(einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNGELDANTRAG_ABBRUCH0206_TYPE: {
				ElterngeldantragAbbruch0206Type elterngeldantragAbbruch0206Type = (ElterngeldantragAbbruch0206Type)theEObject;
				T result = caseElterngeldantragAbbruch0206Type(elterngeldantragAbbruch0206Type);
				if (result == null) result = caseAntragsnachrichtType(elterngeldantragAbbruch0206Type);
				if (result == null) result = caseNachrichtType(elterngeldantragAbbruch0206Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGE0204_TYPE: {
				ElterngeldantragAnfrage0204Type elterngeldantragAnfrage0204Type = (ElterngeldantragAnfrage0204Type)theEObject;
				T result = caseElterngeldantragAnfrage0204Type(elterngeldantragAnfrage0204Type);
				if (result == null) result = caseAntragsnachrichtType(elterngeldantragAnfrage0204Type);
				if (result == null) result = caseNachrichtType(elterngeldantragAnfrage0204Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205_TYPE: {
				ElterngeldantragAnfrageabschluss0205Type elterngeldantragAnfrageabschluss0205Type = (ElterngeldantragAnfrageabschluss0205Type)theEObject;
				T result = caseElterngeldantragAnfrageabschluss0205Type(elterngeldantragAnfrageabschluss0205Type);
				if (result == null) result = caseAntragsnachrichtType(elterngeldantragAnfrageabschluss0205Type);
				if (result == null) result = caseNachrichtType(elterngeldantragAnfrageabschluss0205Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE: {
				ElterngeldantragAntrag0201Type elterngeldantragAntrag0201Type = (ElterngeldantragAntrag0201Type)theEObject;
				T result = caseElterngeldantragAntrag0201Type(elterngeldantragAntrag0201Type);
				if (result == null) result = caseAntragsnachrichtType(elterngeldantragAntrag0201Type);
				if (result == null) result = caseNachrichtType(elterngeldantragAntrag0201Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203_TYPE: {
				ElterngeldantragStandesamtsmeldung0203Type elterngeldantragStandesamtsmeldung0203Type = (ElterngeldantragStandesamtsmeldung0203Type)theEObject;
				T result = caseElterngeldantragStandesamtsmeldung0203Type(elterngeldantragStandesamtsmeldung0203Type);
				if (result == null) result = caseAntragsnachrichtType(elterngeldantragStandesamtsmeldung0203Type);
				if (result == null) result = caseNachrichtType(elterngeldantragStandesamtsmeldung0203Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE: {
				ElterngeldantragVorabmeldung0202Type elterngeldantragVorabmeldung0202Type = (ElterngeldantragVorabmeldung0202Type)theEObject;
				T result = caseElterngeldantragVorabmeldung0202Type(elterngeldantragVorabmeldung0202Type);
				if (result == null) result = caseAntragsnachrichtType(elterngeldantragVorabmeldung0202Type);
				if (result == null) result = caseNachrichtType(elterngeldantragVorabmeldung0202Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE: {
				ElternteilEinsElterngeldantragType elternteilEinsElterngeldantragType = (ElternteilEinsElterngeldantragType)theEObject;
				T result = caseElternteilEinsElterngeldantragType(elternteilEinsElterngeldantragType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNTEIL_ZWEI_ELTERNGELDANTRAG_TYPE: {
				ElternteilZweiElterngeldantragType elternteilZweiElterngeldantragType = (ElternteilZweiElterngeldantragType)theEObject;
				T result = caseElternteilZweiElterngeldantragType(elternteilZweiElterngeldantragType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ELTERNZEIT_TYPE: {
				ElternzeitType elternzeitType = (ElternzeitType)theEObject;
				T result = caseElternzeitType(elternzeitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ERWERBSTAETIGKEIT_BEZUGSZEITRAUM_TYPE: {
				ErwerbstaetigkeitBezugszeitraumType erwerbstaetigkeitBezugszeitraumType = (ErwerbstaetigkeitBezugszeitraumType)theEObject;
				T result = caseErwerbstaetigkeitBezugszeitraumType(erwerbstaetigkeitBezugszeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE: {
				FreiwilligendienstType freiwilligendienstType = (FreiwilligendienstType)theEObject;
				T result = caseFreiwilligendienstType(freiwilligendienstType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE: {
				GeringesEinkommenCovid19Type geringesEinkommenCovid19Type = (GeringesEinkommenCovid19Type)theEObject;
				T result = caseGeringesEinkommenCovid19Type(geringesEinkommenCovid19Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.GESAMTEINKOMMEN_TYPE: {
				GesamteinkommenType gesamteinkommenType = (GesamteinkommenType)theEObject;
				T result = caseGesamteinkommenType(gesamteinkommenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.GESETZLICHE_VERTRETUNG_TYPE: {
				GesetzlicheVertretungType gesetzlicheVertretungType = (GesetzlicheVertretungType)theEObject;
				T result = caseGesetzlicheVertretungType(gesetzlicheVertretungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE: {
				GewoehnlicherAufenthaltType gewoehnlicherAufenthaltType = (GewoehnlicherAufenthaltType)theEObject;
				T result = caseGewoehnlicherAufenthaltType(gewoehnlicherAufenthaltType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.HAUSHALTSZUGEHOERIGKEIT_DES_KINDES_TYPE: {
				HaushaltszugehoerigkeitDesKindesType haushaltszugehoerigkeitDesKindesType = (HaushaltszugehoerigkeitDesKindesType)theEObject;
				T result = caseHaushaltszugehoerigkeitDesKindesType(haushaltszugehoerigkeitDesKindesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.KIND_ELTERNGELD_TYPE: {
				KindElterngeldType kindElterngeldType = (KindElterngeldType)theEObject;
				T result = caseKindElterngeldType(kindElterngeldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.KINDSCHAFTSVERHAELTNIS_TYPE: {
				KindschaftsverhaeltnisType kindschaftsverhaeltnisType = (KindschaftsverhaeltnisType)theEObject;
				T result = caseKindschaftsverhaeltnisType(kindschaftsverhaeltnisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE: {
				KindVorabmeldungType kindVorabmeldungType = (KindVorabmeldungType)theEObject;
				T result = caseKindVorabmeldungType(kindVorabmeldungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.KRANKENGELD_TYPE: {
				KrankengeldType krankengeldType = (KrankengeldType)theEObject;
				T result = caseKrankengeldType(krankengeldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.KRANKENTAGEGELD_TYPE: {
				KrankentagegeldType krankentagegeldType = (KrankentagegeldType)theEObject;
				T result = caseKrankentagegeldType(krankentagegeldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.KRANKENVERSICHERUNG_TYPE: {
				KrankenversicherungType krankenversicherungType = (KrankenversicherungType)theEObject;
				T result = caseKrankenversicherungType(krankenversicherungType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.LEBENSSITUATION_TYPE: {
				LebenssituationType lebenssituationType = (LebenssituationType)theEObject;
				T result = caseLebenssituationType(lebenssituationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE: {
				MehrlingsgeburtType mehrlingsgeburtType = (MehrlingsgeburtType)theEObject;
				T result = caseMehrlingsgeburtType(mehrlingsgeburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.MIDIJOB_TYPE: {
				MidijobType midijobType = (MidijobType)theEObject;
				T result = caseMidijobType(midijobType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.MINIJOB_TYPE: {
				MinijobType minijobType = (MinijobType)theEObject;
				T result = caseMinijobType(minijobType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE: {
				MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType mutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType = (MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType)theEObject;
				T result = caseMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType(mutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE: {
				NichtselbststaendigeBeschaeftigungVorGeburtType nichtselbststaendigeBeschaeftigungVorGeburtType = (NichtselbststaendigeBeschaeftigungVorGeburtType)theEObject;
				T result = caseNichtselbststaendigeBeschaeftigungVorGeburtType(nichtselbststaendigeBeschaeftigungVorGeburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE: {
				NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType nichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType = (NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType)theEObject;
				T result = caseNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType(nichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE: {
				NichtselbststaendigkeitAusklammerungstatbestaendeType nichtselbststaendigkeitAusklammerungstatbestaendeType = (NichtselbststaendigkeitAusklammerungstatbestaendeType)theEObject;
				T result = caseNichtselbststaendigkeitAusklammerungstatbestaendeType(nichtselbststaendigkeitAusklammerungstatbestaendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE: {
				PersoenlicheAngabenETType persoenlicheAngabenETType = (PersoenlicheAngabenETType)theEObject;
				T result = casePersoenlicheAngabenETType(persoenlicheAngabenETType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.RENTEN_TYPE: {
				RentenType rentenType = (RentenType)theEObject;
				T result = caseRentenType(rentenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.RESTURLAUB_TYPE: {
				ResturlaubType resturlaubType = (ResturlaubType)theEObject;
				T result = caseResturlaubType(resturlaubType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE: {
				SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType selbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType = (SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType)theEObject;
				T result = caseSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType(selbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_VERSCHIEBETATBESTAENDE_TYPE: {
				SelbststaendigkeitVerschiebetatbestaendeType selbststaendigkeitVerschiebetatbestaendeType = (SelbststaendigkeitVerschiebetatbestaendeType)theEObject;
				T result = caseSelbststaendigkeitVerschiebetatbestaendeType(selbststaendigkeitVerschiebetatbestaendeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE: {
				SonstigeLeistungenBezugszeitraumType sonstigeLeistungenBezugszeitraumType = (SonstigeLeistungenBezugszeitraumType)theEObject;
				T result = caseSonstigeLeistungenBezugszeitraumType(sonstigeLeistungenBezugszeitraumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE: {
				StaatsangehoerigkeitType staatsangehoerigkeitType = (StaatsangehoerigkeitType)theEObject;
				T result = caseStaatsangehoerigkeitType(staatsangehoerigkeitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.TAGESPFLEGE_TYPE: {
				TagespflegeType tagespflegeType = (TagespflegeType)theEObject;
				T result = caseTagespflegeType(tagespflegeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.TEILZEITTAETIGKEIT_TYPE: {
				TeilzeittaetigkeitType teilzeittaetigkeitType = (TeilzeittaetigkeitType)theEObject;
				T result = caseTeilzeittaetigkeitType(teilzeittaetigkeitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.WEITERE_KINDER_TYPE: {
				WeitereKinderType weitereKinderType = (WeitereKinderType)theEObject;
				T result = caseWeitereKinderType(weitereKinderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE: {
				ZustimmungDatenabrufeType zustimmungDatenabrufeType = (ZustimmungDatenabrufeType)theEObject;
				T result = caseZustimmungDatenabrufeType(zustimmungDatenabrufeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adoption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adoption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdoptionType(AdoptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALGI Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALGI Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALGIType(ALGIType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alleinerziehendenanspruch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alleinerziehendenanspruch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlleinerziehendenanspruchType(AlleinerziehendenanspruchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Andere Leistungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Andere Leistungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndereLeistungenType(AndereLeistungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Sozialversicherung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Sozialversicherung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenSozialversicherungType(AngabenSozialversicherungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angaben Weiteres Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angaben Weiteres Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngabenWeiteresKindType(AngabenWeiteresKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anschrift Kind Optional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anschrift Kind Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnschriftKindOptionalType(AnschriftKindOptionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anschrift Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anschrift Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnschriftType(AnschriftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Vorabmeldung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antragstellender Elternteil Vorabmeldung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntragstellenderElternteilVorabmeldungType(AntragstellenderElternteilVorabmeldungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbeitszeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbeitszeit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbeitszeitType(ArbeitszeitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auslaendisches Arbeitsverhaeltnis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auslaendisches Arbeitsverhaeltnis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuslaendischesArbeitsverhaeltnisType(AuslaendischesArbeitsverhaeltnisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auslandsaufenthalt Befr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auslandsaufenthalt Befr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuslandsaufenthaltBefrType(AuslandsaufenthaltBefrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auslandsaufenthalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auslandsaufenthalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuslandsaufenthaltType(AuslandsaufenthaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beantragung Elterngeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beantragung Elterngeld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeantragungElterngeldType(BeantragungElterngeldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behinderung Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behinderung Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehinderungKindType(BehinderungKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Berufsausbildung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Berufsausbildung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBerufsausbildungType(BerufsausbildungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Berufsbildung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Berufsbildung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBerufsbildungType(BerufsbildungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Besonders Frueh Geborenes Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Besonders Frueh Geborenes Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBesondersFruehGeborenesKindType(BesondersFruehGeborenesKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buergergeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buergergeld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuergergeldType(BuergergeldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Abbruchgrund Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Abbruchgrund Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAbbruchgrundType(CodeAbbruchgrundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Anfragegrund Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Anfragegrund Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeAnfragegrundType(CodeAnfragegrundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Elterngeldantrag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Elterngeldantrag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeElterngeldantragType(CodeElterngeldantragType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Fehlerfall Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Fehlerfall Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeFehlerfallType(CodeFehlerfallType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Gesamteinkommen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Gesamteinkommen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeGesamteinkommenType(CodeGesamteinkommenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Kindschaftsverhaeltnis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Kindschaftsverhaeltnis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeKindschaftsverhaeltnisType(CodeKindschaftsverhaeltnisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Leistungshoehe Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Leistungshoehe Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLeistungshoeheType(CodeLeistungshoeheType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Versandweg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Versandweg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeVersandwegType(CodeVersandwegType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Versicherungsart Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Versicherungsart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeVersicherungsartType(CodeVersicherungsartType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EG Aelteres Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EG Aelteres Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGAelteresKindType(EGAelteresKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkommensersatzleistungen Bezugszeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkommensersatzleistungen Bezugszeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkommensersatzleistungenBezugszeitraumType(EinkommensersatzleistungenBezugszeitraumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkommensersatzleistungen Vor Geburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkommensersatzleistungen Vor Geburt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkommensersatzleistungenVorGeburtType(EinkommensersatzleistungenVorGeburtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkommen Vor Geburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkommen Vor Geburt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkommenVorGeburtType(EinkommenVorGeburtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkommen Waehrend Bezugszeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkommen Waehrend Bezugszeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkommenWaehrendBezugszeitraumType(EinkommenWaehrendBezugszeitraumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkuenfte Beantragter Zeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkuenfte Beantragter Zeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkuenfteBeantragterZeitraumType(EinkuenfteBeantragterZeitraumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType(EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elterngeldantrag Abbruch0206 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elterngeldantrag Abbruch0206 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElterngeldantragAbbruch0206Type(ElterngeldantragAbbruch0206Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elterngeldantrag Anfrage0204 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elterngeldantrag Anfrage0204 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElterngeldantragAnfrage0204Type(ElterngeldantragAnfrage0204Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elterngeldantrag Anfrageabschluss0205 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elterngeldantrag Anfrageabschluss0205 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElterngeldantragAnfrageabschluss0205Type(ElterngeldantragAnfrageabschluss0205Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elterngeldantrag Antrag0201 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elterngeldantrag Antrag0201 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElterngeldantragAntrag0201Type(ElterngeldantragAntrag0201Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elterngeldantrag Standesamtsmeldung0203 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elterngeldantrag Standesamtsmeldung0203 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElterngeldantragStandesamtsmeldung0203Type(ElterngeldantragStandesamtsmeldung0203Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elterngeldantrag Vorabmeldung0202 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elterngeldantrag Vorabmeldung0202 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElterngeldantragVorabmeldung0202Type(ElterngeldantragVorabmeldung0202Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elternteil Eins Elterngeldantrag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elternteil Eins Elterngeldantrag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElternteilEinsElterngeldantragType(ElternteilEinsElterngeldantragType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elternteil Zwei Elterngeldantrag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elternteil Zwei Elterngeldantrag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElternteilZweiElterngeldantragType(ElternteilZweiElterngeldantragType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elternzeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elternzeit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElternzeitType(ElternzeitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erwerbstaetigkeit Bezugszeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erwerbstaetigkeit Bezugszeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErwerbstaetigkeitBezugszeitraumType(ErwerbstaetigkeitBezugszeitraumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freiwilligendienst Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freiwilligendienst Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreiwilligendienstType(FreiwilligendienstType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geringes Einkommen Covid19 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geringes Einkommen Covid19 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeringesEinkommenCovid19Type(GeringesEinkommenCovid19Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gesamteinkommen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gesamteinkommen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGesamteinkommenType(GesamteinkommenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gesetzliche Vertretung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gesetzliche Vertretung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGesetzlicheVertretungType(GesetzlicheVertretungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gewoehnlicher Aufenthalt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gewoehnlicher Aufenthalt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGewoehnlicherAufenthaltType(GewoehnlicherAufenthaltType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Haushaltszugehoerigkeit Des Kindes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Haushaltszugehoerigkeit Des Kindes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaushaltszugehoerigkeitDesKindesType(HaushaltszugehoerigkeitDesKindesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kind Elterngeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kind Elterngeld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKindElterngeldType(KindElterngeldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kindschaftsverhaeltnis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kindschaftsverhaeltnis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKindschaftsverhaeltnisType(KindschaftsverhaeltnisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kind Vorabmeldung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kind Vorabmeldung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKindVorabmeldungType(KindVorabmeldungType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Krankengeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Krankengeld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKrankengeldType(KrankengeldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Krankentagegeld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Krankentagegeld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKrankentagegeldType(KrankentagegeldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Krankenversicherung Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Krankenversicherung Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKrankenversicherungType(KrankenversicherungType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mehrlingsgeburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mehrlingsgeburt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMehrlingsgeburtType(MehrlingsgeburtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midijob Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midijob Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidijobType(MidijobType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minijob Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minijob Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinijobType(MinijobType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType(MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nichtselbststaendige Beschaeftigung Vor Geburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nichtselbststaendige Beschaeftigung Vor Geburt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNichtselbststaendigeBeschaeftigungVorGeburtType(NichtselbststaendigeBeschaeftigungVorGeburtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType(NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNichtselbststaendigkeitAusklammerungstatbestaendeType(NichtselbststaendigkeitAusklammerungstatbestaendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persoenliche Angaben ET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persoenliche Angaben ET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersoenlicheAngabenETType(PersoenlicheAngabenETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renten Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renten Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRentenType(RentenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resturlaub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resturlaub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResturlaubType(ResturlaubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType(SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selbststaendigkeit Verschiebetatbestaende Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selbststaendigkeit Verschiebetatbestaende Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelbststaendigkeitVerschiebetatbestaendeType(SelbststaendigkeitVerschiebetatbestaendeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sonstige Leistungen Bezugszeitraum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sonstige Leistungen Bezugszeitraum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSonstigeLeistungenBezugszeitraumType(SonstigeLeistungenBezugszeitraumType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tagespflege Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagespflege Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagespflegeType(TagespflegeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teilzeittaetigkeit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teilzeittaetigkeit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeilzeittaetigkeitType(TeilzeittaetigkeitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weitere Kinder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weitere Kinder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeitereKinderType(WeitereKinderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zustimmung Datenabrufe Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zustimmung Datenabrufe Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZustimmungDatenabrufeType(ZustimmungDatenabrufeType object) {
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

} //ElterngeldSwitch
