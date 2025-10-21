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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage
 * @generated
 */
public class ElterngeldAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ElterngeldPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElterngeldAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ElterngeldPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElterngeldSwitch<Adapter> modelSwitch =
		new ElterngeldSwitch<Adapter>() {
			@Override
			public Adapter caseAdoptionType(AdoptionType object) {
				return createAdoptionTypeAdapter();
			}
			@Override
			public Adapter caseALGIType(ALGIType object) {
				return createALGITypeAdapter();
			}
			@Override
			public Adapter caseAlleinerziehendenanspruchType(AlleinerziehendenanspruchType object) {
				return createAlleinerziehendenanspruchTypeAdapter();
			}
			@Override
			public Adapter caseAndereLeistungenType(AndereLeistungenType object) {
				return createAndereLeistungenTypeAdapter();
			}
			@Override
			public Adapter caseAngabenSozialversicherungType(AngabenSozialversicherungType object) {
				return createAngabenSozialversicherungTypeAdapter();
			}
			@Override
			public Adapter caseAngabenWeiteresKindType(AngabenWeiteresKindType object) {
				return createAngabenWeiteresKindTypeAdapter();
			}
			@Override
			public Adapter caseAnschriftKindOptionalType(AnschriftKindOptionalType object) {
				return createAnschriftKindOptionalTypeAdapter();
			}
			@Override
			public Adapter caseAnschriftType(AnschriftType object) {
				return createAnschriftTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderElternteilVorabmeldungType(AntragstellenderElternteilVorabmeldungType object) {
				return createAntragstellenderElternteilVorabmeldungTypeAdapter();
			}
			@Override
			public Adapter caseArbeitszeitType(ArbeitszeitType object) {
				return createArbeitszeitTypeAdapter();
			}
			@Override
			public Adapter caseAuslaendischesArbeitsverhaeltnisType(AuslaendischesArbeitsverhaeltnisType object) {
				return createAuslaendischesArbeitsverhaeltnisTypeAdapter();
			}
			@Override
			public Adapter caseAuslandsaufenthaltBefrType(AuslandsaufenthaltBefrType object) {
				return createAuslandsaufenthaltBefrTypeAdapter();
			}
			@Override
			public Adapter caseAuslandsaufenthaltType(AuslandsaufenthaltType object) {
				return createAuslandsaufenthaltTypeAdapter();
			}
			@Override
			public Adapter caseBeantragungElterngeldType(BeantragungElterngeldType object) {
				return createBeantragungElterngeldTypeAdapter();
			}
			@Override
			public Adapter caseBehinderungKindType(BehinderungKindType object) {
				return createBehinderungKindTypeAdapter();
			}
			@Override
			public Adapter caseBerufsausbildungType(BerufsausbildungType object) {
				return createBerufsausbildungTypeAdapter();
			}
			@Override
			public Adapter caseBerufsbildungType(BerufsbildungType object) {
				return createBerufsbildungTypeAdapter();
			}
			@Override
			public Adapter caseBesondersFruehGeborenesKindType(BesondersFruehGeborenesKindType object) {
				return createBesondersFruehGeborenesKindTypeAdapter();
			}
			@Override
			public Adapter caseBuergergeldType(BuergergeldType object) {
				return createBuergergeldTypeAdapter();
			}
			@Override
			public Adapter caseCodeAbbruchgrundType(CodeAbbruchgrundType object) {
				return createCodeAbbruchgrundTypeAdapter();
			}
			@Override
			public Adapter caseCodeAnfragegrundType(CodeAnfragegrundType object) {
				return createCodeAnfragegrundTypeAdapter();
			}
			@Override
			public Adapter caseCodeElterngeldantragType(CodeElterngeldantragType object) {
				return createCodeElterngeldantragTypeAdapter();
			}
			@Override
			public Adapter caseCodeFehlerfallType(CodeFehlerfallType object) {
				return createCodeFehlerfallTypeAdapter();
			}
			@Override
			public Adapter caseCodeGesamteinkommenType(CodeGesamteinkommenType object) {
				return createCodeGesamteinkommenTypeAdapter();
			}
			@Override
			public Adapter caseCodeKindschaftsverhaeltnisType(CodeKindschaftsverhaeltnisType object) {
				return createCodeKindschaftsverhaeltnisTypeAdapter();
			}
			@Override
			public Adapter caseCodeLeistungshoeheType(CodeLeistungshoeheType object) {
				return createCodeLeistungshoeheTypeAdapter();
			}
			@Override
			public Adapter caseCodeVersandwegType(CodeVersandwegType object) {
				return createCodeVersandwegTypeAdapter();
			}
			@Override
			public Adapter caseCodeVersicherungsartType(CodeVersicherungsartType object) {
				return createCodeVersicherungsartTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEGAelteresKindType(EGAelteresKindType object) {
				return createEGAelteresKindTypeAdapter();
			}
			@Override
			public Adapter caseEinkommensersatzleistungenBezugszeitraumType(EinkommensersatzleistungenBezugszeitraumType object) {
				return createEinkommensersatzleistungenBezugszeitraumTypeAdapter();
			}
			@Override
			public Adapter caseEinkommensersatzleistungenVorGeburtType(EinkommensersatzleistungenVorGeburtType object) {
				return createEinkommensersatzleistungenVorGeburtTypeAdapter();
			}
			@Override
			public Adapter caseEinkommenVorGeburtType(EinkommenVorGeburtType object) {
				return createEinkommenVorGeburtTypeAdapter();
			}
			@Override
			public Adapter caseEinkommenWaehrendBezugszeitraumType(EinkommenWaehrendBezugszeitraumType object) {
				return createEinkommenWaehrendBezugszeitraumTypeAdapter();
			}
			@Override
			public Adapter caseEinkuenfteBeantragterZeitraumType(EinkuenfteBeantragterZeitraumType object) {
				return createEinkuenfteBeantragterZeitraumTypeAdapter();
			}
			@Override
			public Adapter caseEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType(EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType object) {
				return createEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeAdapter();
			}
			@Override
			public Adapter caseElterngeldantragAbbruch0206Type(ElterngeldantragAbbruch0206Type object) {
				return createElterngeldantragAbbruch0206TypeAdapter();
			}
			@Override
			public Adapter caseElterngeldantragAnfrage0204Type(ElterngeldantragAnfrage0204Type object) {
				return createElterngeldantragAnfrage0204TypeAdapter();
			}
			@Override
			public Adapter caseElterngeldantragAnfrageabschluss0205Type(ElterngeldantragAnfrageabschluss0205Type object) {
				return createElterngeldantragAnfrageabschluss0205TypeAdapter();
			}
			@Override
			public Adapter caseElterngeldantragAntrag0201Type(ElterngeldantragAntrag0201Type object) {
				return createElterngeldantragAntrag0201TypeAdapter();
			}
			@Override
			public Adapter caseElterngeldantragStandesamtsmeldung0203Type(ElterngeldantragStandesamtsmeldung0203Type object) {
				return createElterngeldantragStandesamtsmeldung0203TypeAdapter();
			}
			@Override
			public Adapter caseElterngeldantragVorabmeldung0202Type(ElterngeldantragVorabmeldung0202Type object) {
				return createElterngeldantragVorabmeldung0202TypeAdapter();
			}
			@Override
			public Adapter caseElternteilEinsElterngeldantragType(ElternteilEinsElterngeldantragType object) {
				return createElternteilEinsElterngeldantragTypeAdapter();
			}
			@Override
			public Adapter caseElternteilZweiElterngeldantragType(ElternteilZweiElterngeldantragType object) {
				return createElternteilZweiElterngeldantragTypeAdapter();
			}
			@Override
			public Adapter caseElternzeitType(ElternzeitType object) {
				return createElternzeitTypeAdapter();
			}
			@Override
			public Adapter caseErwerbstaetigkeitBezugszeitraumType(ErwerbstaetigkeitBezugszeitraumType object) {
				return createErwerbstaetigkeitBezugszeitraumTypeAdapter();
			}
			@Override
			public Adapter caseFreiwilligendienstType(FreiwilligendienstType object) {
				return createFreiwilligendienstTypeAdapter();
			}
			@Override
			public Adapter caseGeringesEinkommenCovid19Type(GeringesEinkommenCovid19Type object) {
				return createGeringesEinkommenCovid19TypeAdapter();
			}
			@Override
			public Adapter caseGesamteinkommenType(GesamteinkommenType object) {
				return createGesamteinkommenTypeAdapter();
			}
			@Override
			public Adapter caseGesetzlicheVertretungType(GesetzlicheVertretungType object) {
				return createGesetzlicheVertretungTypeAdapter();
			}
			@Override
			public Adapter caseGewoehnlicherAufenthaltType(GewoehnlicherAufenthaltType object) {
				return createGewoehnlicherAufenthaltTypeAdapter();
			}
			@Override
			public Adapter caseHaushaltszugehoerigkeitDesKindesType(HaushaltszugehoerigkeitDesKindesType object) {
				return createHaushaltszugehoerigkeitDesKindesTypeAdapter();
			}
			@Override
			public Adapter caseKindElterngeldType(KindElterngeldType object) {
				return createKindElterngeldTypeAdapter();
			}
			@Override
			public Adapter caseKindschaftsverhaeltnisType(KindschaftsverhaeltnisType object) {
				return createKindschaftsverhaeltnisTypeAdapter();
			}
			@Override
			public Adapter caseKindVorabmeldungType(KindVorabmeldungType object) {
				return createKindVorabmeldungTypeAdapter();
			}
			@Override
			public Adapter caseKrankengeldType(KrankengeldType object) {
				return createKrankengeldTypeAdapter();
			}
			@Override
			public Adapter caseKrankentagegeldType(KrankentagegeldType object) {
				return createKrankentagegeldTypeAdapter();
			}
			@Override
			public Adapter caseKrankenversicherungType(KrankenversicherungType object) {
				return createKrankenversicherungTypeAdapter();
			}
			@Override
			public Adapter caseLebenssituationType(LebenssituationType object) {
				return createLebenssituationTypeAdapter();
			}
			@Override
			public Adapter caseMehrlingsgeburtType(MehrlingsgeburtType object) {
				return createMehrlingsgeburtTypeAdapter();
			}
			@Override
			public Adapter caseMidijobType(MidijobType object) {
				return createMidijobTypeAdapter();
			}
			@Override
			public Adapter caseMinijobType(MinijobType object) {
				return createMinijobTypeAdapter();
			}
			@Override
			public Adapter caseMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType(MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType object) {
				return createMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeAdapter();
			}
			@Override
			public Adapter caseNichtselbststaendigeBeschaeftigungVorGeburtType(NichtselbststaendigeBeschaeftigungVorGeburtType object) {
				return createNichtselbststaendigeBeschaeftigungVorGeburtTypeAdapter();
			}
			@Override
			public Adapter caseNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType(NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType object) {
				return createNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeAdapter();
			}
			@Override
			public Adapter caseNichtselbststaendigkeitAusklammerungstatbestaendeType(NichtselbststaendigkeitAusklammerungstatbestaendeType object) {
				return createNichtselbststaendigkeitAusklammerungstatbestaendeTypeAdapter();
			}
			@Override
			public Adapter casePersoenlicheAngabenETType(PersoenlicheAngabenETType object) {
				return createPersoenlicheAngabenETTypeAdapter();
			}
			@Override
			public Adapter caseRentenType(RentenType object) {
				return createRentenTypeAdapter();
			}
			@Override
			public Adapter caseResturlaubType(ResturlaubType object) {
				return createResturlaubTypeAdapter();
			}
			@Override
			public Adapter caseSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType(SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType object) {
				return createSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeAdapter();
			}
			@Override
			public Adapter caseSelbststaendigkeitVerschiebetatbestaendeType(SelbststaendigkeitVerschiebetatbestaendeType object) {
				return createSelbststaendigkeitVerschiebetatbestaendeTypeAdapter();
			}
			@Override
			public Adapter caseSonstigeLeistungenBezugszeitraumType(SonstigeLeistungenBezugszeitraumType object) {
				return createSonstigeLeistungenBezugszeitraumTypeAdapter();
			}
			@Override
			public Adapter caseStaatsangehoerigkeitType(StaatsangehoerigkeitType object) {
				return createStaatsangehoerigkeitTypeAdapter();
			}
			@Override
			public Adapter caseTagespflegeType(TagespflegeType object) {
				return createTagespflegeTypeAdapter();
			}
			@Override
			public Adapter caseTeilzeittaetigkeitType(TeilzeittaetigkeitType object) {
				return createTeilzeittaetigkeitTypeAdapter();
			}
			@Override
			public Adapter caseWeitereKinderType(WeitereKinderType object) {
				return createWeitereKinderTypeAdapter();
			}
			@Override
			public Adapter caseZustimmungDatenabrufeType(ZustimmungDatenabrufeType object) {
				return createZustimmungDatenabrufeTypeAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseNachrichtType(NachrichtType object) {
				return createNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseAntragsnachrichtType(AntragsnachrichtType object) {
				return createAntragsnachrichtTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType <em>Adoption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AdoptionType
	 * @generated
	 */
	public Adapter createAdoptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType <em>ALGI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType
	 * @generated
	 */
	public Adapter createALGITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType <em>Alleinerziehendenanspruch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType
	 * @generated
	 */
	public Adapter createAlleinerziehendenanspruchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType <em>Andere Leistungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType
	 * @generated
	 */
	public Adapter createAndereLeistungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType <em>Angaben Sozialversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType
	 * @generated
	 */
	public Adapter createAngabenSozialversicherungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType <em>Angaben Weiteres Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType
	 * @generated
	 */
	public Adapter createAngabenWeiteresKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType <em>Anschrift Kind Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType
	 * @generated
	 */
	public Adapter createAnschriftKindOptionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType <em>Anschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType
	 * @generated
	 */
	public Adapter createAnschriftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType <em>Antragstellender Elternteil Vorabmeldung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType
	 * @generated
	 */
	public Adapter createAntragstellenderElternteilVorabmeldungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType <em>Arbeitszeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType
	 * @generated
	 */
	public Adapter createArbeitszeitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType <em>Auslaendisches Arbeitsverhaeltnis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType
	 * @generated
	 */
	public Adapter createAuslaendischesArbeitsverhaeltnisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType <em>Auslandsaufenthalt Befr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType
	 * @generated
	 */
	public Adapter createAuslandsaufenthaltBefrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType <em>Auslandsaufenthalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType
	 * @generated
	 */
	public Adapter createAuslandsaufenthaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType <em>Beantragung Elterngeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType
	 * @generated
	 */
	public Adapter createBeantragungElterngeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType <em>Behinderung Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BehinderungKindType
	 * @generated
	 */
	public Adapter createBehinderungKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType <em>Berufsausbildung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType
	 * @generated
	 */
	public Adapter createBerufsausbildungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType <em>Berufsbildung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType
	 * @generated
	 */
	public Adapter createBerufsbildungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType <em>Besonders Frueh Geborenes Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType
	 * @generated
	 */
	public Adapter createBesondersFruehGeborenesKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType <em>Buergergeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType
	 * @generated
	 */
	public Adapter createBuergergeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAbbruchgrundType <em>Code Abbruchgrund Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAbbruchgrundType
	 * @generated
	 */
	public Adapter createCodeAbbruchgrundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAnfragegrundType <em>Code Anfragegrund Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeAnfragegrundType
	 * @generated
	 */
	public Adapter createCodeAnfragegrundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeElterngeldantragType <em>Code Elterngeldantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeElterngeldantragType
	 * @generated
	 */
	public Adapter createCodeElterngeldantragTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeFehlerfallType <em>Code Fehlerfall Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeFehlerfallType
	 * @generated
	 */
	public Adapter createCodeFehlerfallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeGesamteinkommenType <em>Code Gesamteinkommen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeGesamteinkommenType
	 * @generated
	 */
	public Adapter createCodeGesamteinkommenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeKindschaftsverhaeltnisType <em>Code Kindschaftsverhaeltnis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeKindschaftsverhaeltnisType
	 * @generated
	 */
	public Adapter createCodeKindschaftsverhaeltnisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeLeistungshoeheType <em>Code Leistungshoehe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeLeistungshoeheType
	 * @generated
	 */
	public Adapter createCodeLeistungshoeheTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersandwegType <em>Code Versandweg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersandwegType
	 * @generated
	 */
	public Adapter createCodeVersandwegTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersicherungsartType <em>Code Versicherungsart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersicherungsartType
	 * @generated
	 */
	public Adapter createCodeVersicherungsartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType <em>EG Aelteres Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType
	 * @generated
	 */
	public Adapter createEGAelteresKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType <em>Einkommensersatzleistungen Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType
	 * @generated
	 */
	public Adapter createEinkommensersatzleistungenBezugszeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType <em>Einkommensersatzleistungen Vor Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType
	 * @generated
	 */
	public Adapter createEinkommensersatzleistungenVorGeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType <em>Einkommen Vor Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType
	 * @generated
	 */
	public Adapter createEinkommenVorGeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType <em>Einkommen Waehrend Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType
	 * @generated
	 */
	public Adapter createEinkommenWaehrendBezugszeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType <em>Einkuenfte Beantragter Zeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType
	 * @generated
	 */
	public Adapter createEinkuenfteBeantragterZeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType <em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType
	 * @generated
	 */
	public Adapter createEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type <em>Elterngeldantrag Abbruch0206 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type
	 * @generated
	 */
	public Adapter createElterngeldantragAbbruch0206TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type <em>Elterngeldantrag Anfrage0204 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type
	 * @generated
	 */
	public Adapter createElterngeldantragAnfrage0204TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type <em>Elterngeldantrag Anfrageabschluss0205 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type
	 * @generated
	 */
	public Adapter createElterngeldantragAnfrageabschluss0205TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type <em>Elterngeldantrag Antrag0201 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type
	 * @generated
	 */
	public Adapter createElterngeldantragAntrag0201TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type <em>Elterngeldantrag Standesamtsmeldung0203 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type
	 * @generated
	 */
	public Adapter createElterngeldantragStandesamtsmeldung0203TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type <em>Elterngeldantrag Vorabmeldung0202 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type
	 * @generated
	 */
	public Adapter createElterngeldantragVorabmeldung0202TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType <em>Elternteil Eins Elterngeldantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType
	 * @generated
	 */
	public Adapter createElternteilEinsElterngeldantragTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType <em>Elternteil Zwei Elterngeldantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType
	 * @generated
	 */
	public Adapter createElternteilZweiElterngeldantragTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType <em>Elternzeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType
	 * @generated
	 */
	public Adapter createElternzeitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType <em>Erwerbstaetigkeit Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType
	 * @generated
	 */
	public Adapter createErwerbstaetigkeitBezugszeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType <em>Freiwilligendienst Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType
	 * @generated
	 */
	public Adapter createFreiwilligendienstTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type <em>Geringes Einkommen Covid19 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type
	 * @generated
	 */
	public Adapter createGeringesEinkommenCovid19TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType <em>Gesamteinkommen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesamteinkommenType
	 * @generated
	 */
	public Adapter createGesamteinkommenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType <em>Gesetzliche Vertretung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType
	 * @generated
	 */
	public Adapter createGesetzlicheVertretungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType <em>Gewoehnlicher Aufenthalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType
	 * @generated
	 */
	public Adapter createGewoehnlicherAufenthaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType <em>Haushaltszugehoerigkeit Des Kindes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType
	 * @generated
	 */
	public Adapter createHaushaltszugehoerigkeitDesKindesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType <em>Kind Elterngeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType
	 * @generated
	 */
	public Adapter createKindElterngeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType <em>Kindschaftsverhaeltnis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType
	 * @generated
	 */
	public Adapter createKindschaftsverhaeltnisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType <em>Kind Vorabmeldung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType
	 * @generated
	 */
	public Adapter createKindVorabmeldungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType <em>Krankengeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType
	 * @generated
	 */
	public Adapter createKrankengeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType <em>Krankentagegeld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType
	 * @generated
	 */
	public Adapter createKrankentagegeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType <em>Krankenversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType
	 * @generated
	 */
	public Adapter createKrankenversicherungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType <em>Lebenssituation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType
	 * @generated
	 */
	public Adapter createLebenssituationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType <em>Mehrlingsgeburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType
	 * @generated
	 */
	public Adapter createMehrlingsgeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType <em>Midijob Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType
	 * @generated
	 */
	public Adapter createMidijobTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType <em>Minijob Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType
	 * @generated
	 */
	public Adapter createMinijobTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType <em>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType
	 * @generated
	 */
	public Adapter createMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType <em>Nichtselbststaendige Beschaeftigung Vor Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType
	 * @generated
	 */
	public Adapter createNichtselbststaendigeBeschaeftigungVorGeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType <em>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType
	 * @generated
	 */
	public Adapter createNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType <em>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType
	 * @generated
	 */
	public Adapter createNichtselbststaendigkeitAusklammerungstatbestaendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType <em>Persoenliche Angaben ET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType
	 * @generated
	 */
	public Adapter createPersoenlicheAngabenETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType <em>Renten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType
	 * @generated
	 */
	public Adapter createRentenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType <em>Resturlaub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType
	 * @generated
	 */
	public Adapter createResturlaubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType <em>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType
	 * @generated
	 */
	public Adapter createSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType <em>Selbststaendigkeit Verschiebetatbestaende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType
	 * @generated
	 */
	public Adapter createSelbststaendigkeitVerschiebetatbestaendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType <em>Sonstige Leistungen Bezugszeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType
	 * @generated
	 */
	public Adapter createSonstigeLeistungenBezugszeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType <em>Staatsangehoerigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType
	 * @generated
	 */
	public Adapter createStaatsangehoerigkeitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType <em>Tagespflege Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType
	 * @generated
	 */
	public Adapter createTagespflegeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType <em>Teilzeittaetigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType
	 * @generated
	 */
	public Adapter createTeilzeittaetigkeitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType <em>Weitere Kinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType
	 * @generated
	 */
	public Adapter createWeitereKinderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType <em>Zustimmung Datenabrufe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType
	 * @generated
	 */
	public Adapter createZustimmungDatenabrufeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.schemata.code.code.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.schemata.code.code.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType <em>Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType
	 * @generated
	 */
	public Adapter createNachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType <em>Antragsnachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType
	 * @generated
	 */
	public Adapter createAntragsnachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ElterngeldAdapterFactory
