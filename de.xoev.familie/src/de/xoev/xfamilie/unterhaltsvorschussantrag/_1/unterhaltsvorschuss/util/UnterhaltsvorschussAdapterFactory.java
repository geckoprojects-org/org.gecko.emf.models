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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage
 * @generated
 */
public class UnterhaltsvorschussAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnterhaltsvorschussPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnterhaltsvorschussAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UnterhaltsvorschussPackage.eINSTANCE;
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
	protected UnterhaltsvorschussSwitch<Adapter> modelSwitch =
		new UnterhaltsvorschussSwitch<Adapter>() {
			@Override
			public Adapter caseAmtspflegendeType(AmtspflegendeType object) {
				return createAmtspflegendeTypeAdapter();
			}
			@Override
			public Adapter caseAnderePersonType(AnderePersonType object) {
				return createAnderePersonTypeAdapter();
			}
			@Override
			public Adapter caseAndererElternteilBasisType(AndererElternteilBasisType object) {
				return createAndererElternteilBasisTypeAdapter();
			}
			@Override
			public Adapter caseAndererElternteilType(AndererElternteilType object) {
				return createAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseAndererElternteilUeberpruefungType(AndererElternteilUeberpruefungType object) {
				return createAndererElternteilUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseAngabenKindNachreichenType(AngabenKindNachreichenType object) {
				return createAngabenKindNachreichenTypeAdapter();
			}
			@Override
			public Adapter caseAnschriftOptionalType(AnschriftOptionalType object) {
				return createAnschriftOptionalTypeAdapter();
			}
			@Override
			public Adapter caseAntragskindBasisType(AntragskindBasisType object) {
				return createAntragskindBasisTypeAdapter();
			}
			@Override
			public Adapter caseAntragskindType(AntragskindType object) {
				return createAntragskindTypeAdapter();
			}
			@Override
			public Adapter caseAntragskindUeberpruefungType(AntragskindUeberpruefungType object) {
				return createAntragskindUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderElternteilBasisType(AntragstellenderElternteilBasisType object) {
				return createAntragstellenderElternteilBasisTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderElternteilType(AntragstellenderElternteilType object) {
				return createAntragstellenderElternteilTypeAdapter();
			}
			@Override
			public Adapter caseAntragstellenderElternteilUeberpruefungType(AntragstellenderElternteilUeberpruefungType object) {
				return createAntragstellenderElternteilUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseAufenthaltKindBasisType(AufenthaltKindBasisType object) {
				return createAufenthaltKindBasisTypeAdapter();
			}
			@Override
			public Adapter caseAufenthaltKindType(AufenthaltKindType object) {
				return createAufenthaltKindTypeAdapter();
			}
			@Override
			public Adapter caseAufenthaltKindUeberpruefungType(AufenthaltKindUeberpruefungType object) {
				return createAufenthaltKindUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseAusbildungAndererElternteilType(AusbildungAndererElternteilType object) {
				return createAusbildungAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseBeistandType(BeistandType object) {
				return createBeistandTypeAdapter();
			}
			@Override
			public Adapter caseBemuehungenUnterhaltType(BemuehungenUnterhaltType object) {
				return createBemuehungenUnterhaltTypeAdapter();
			}
			@Override
			public Adapter caseBestaetigungAngabenType(BestaetigungAngabenType object) {
				return createBestaetigungAngabenTypeAdapter();
			}
			@Override
			public Adapter caseBetreuerType(BetreuerType object) {
				return createBetreuerTypeAdapter();
			}
			@Override
			public Adapter caseBezugUvKindType(BezugUvKindType object) {
				return createBezugUvKindTypeAdapter();
			}
			@Override
			public Adapter caseCodeAusbildungType(CodeAusbildungType object) {
				return createCodeAusbildungTypeAdapter();
			}
			@Override
			public Adapter caseCodeEinkuenfteAndererElternteilType(CodeEinkuenfteAndererElternteilType object) {
				return createCodeEinkuenfteAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseCodeEinkuenfteKindType(CodeEinkuenfteKindType object) {
				return createCodeEinkuenfteKindTypeAdapter();
			}
			@Override
			public Adapter caseCodeSonstigeLeistungenUVType(CodeSonstigeLeistungenUVType object) {
				return createCodeSonstigeLeistungenUVTypeAdapter();
			}
			@Override
			public Adapter caseCodeStaatsangehoerigkeitUVType(CodeStaatsangehoerigkeitUVType object) {
				return createCodeStaatsangehoerigkeitUVTypeAdapter();
			}
			@Override
			public Adapter caseCodeSteuerklasseType(CodeSteuerklasseType object) {
				return createCodeSteuerklasseTypeAdapter();
			}
			@Override
			public Adapter caseCodeUnterhaltsbemuehungenType(CodeUnterhaltsbemuehungenType object) {
				return createCodeUnterhaltsbemuehungenTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEinkuenfteAndererElternteilType(EinkuenfteAndererElternteilType object) {
				return createEinkuenfteAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseEinkuenfteKindType(EinkuenfteKindType object) {
				return createEinkuenfteKindTypeAdapter();
			}
			@Override
			public Adapter caseElternschaftType(ElternschaftType object) {
				return createElternschaftTypeAdapter();
			}
			@Override
			public Adapter caseFamilienstandBasisType(FamilienstandBasisType object) {
				return createFamilienstandBasisTypeAdapter();
			}
			@Override
			public Adapter caseFamilienstandType(FamilienstandType object) {
				return createFamilienstandTypeAdapter();
			}
			@Override
			public Adapter caseFamilienstandUeberpruefungType(FamilienstandUeberpruefungType object) {
				return createFamilienstandUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseGeburtGeburtsortPflichtType(GeburtGeburtsortPflichtType object) {
				return createGeburtGeburtsortPflichtTypeAdapter();
			}
			@Override
			public Adapter caseGeburtNurGeburtsdatumType(GeburtNurGeburtsdatumType object) {
				return createGeburtNurGeburtsdatumTypeAdapter();
			}
			@Override
			public Adapter caseGeburtType(GeburtType object) {
				return createGeburtTypeAdapter();
			}
			@Override
			public Adapter caseGeschiedenAntragstellendeBasisType(GeschiedenAntragstellendeBasisType object) {
				return createGeschiedenAntragstellendeBasisTypeAdapter();
			}
			@Override
			public Adapter caseGeschiedenAntragstellendeType(GeschiedenAntragstellendeType object) {
				return createGeschiedenAntragstellendeTypeAdapter();
			}
			@Override
			public Adapter caseGeschiedenAntragstellendeUeberpruefungType(GeschiedenAntragstellendeUeberpruefungType object) {
				return createGeschiedenAntragstellendeUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseInstitutionUnterhaltstitelType(InstitutionUnterhaltstitelType object) {
				return createInstitutionUnterhaltstitelTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerschaftAntragstellendeBasisType(LebenspartnerschaftAntragstellendeBasisType object) {
				return createLebenspartnerschaftAntragstellendeBasisTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerschaftAntragstellendeType(LebenspartnerschaftAntragstellendeType object) {
				return createLebenspartnerschaftAntragstellendeTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerschaftAntragstellendeUeberpruefungType(LebenspartnerschaftAntragstellendeUeberpruefungType object) {
				return createLebenspartnerschaftAntragstellendeUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerschaftAufgehobenAntragstellendeBasisType(LebenspartnerschaftAufgehobenAntragstellendeBasisType object) {
				return createLebenspartnerschaftAufgehobenAntragstellendeBasisTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerschaftAufgehobenAntragstellendeType(LebenspartnerschaftAufgehobenAntragstellendeType object) {
				return createLebenspartnerschaftAufgehobenAntragstellendeTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType(LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType object) {
				return createLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerVerstorbenAntragstellendeBasisType(LebenspartnerVerstorbenAntragstellendeBasisType object) {
				return createLebenspartnerVerstorbenAntragstellendeBasisTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerVerstorbenAntragstellendeType(LebenspartnerVerstorbenAntragstellendeType object) {
				return createLebenspartnerVerstorbenAntragstellendeTypeAdapter();
			}
			@Override
			public Adapter caseLebenspartnerVerstorbenAntragstellendeUeberpruefungType(LebenspartnerVerstorbenAntragstellendeUeberpruefungType object) {
				return createLebenspartnerVerstorbenAntragstellendeUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseLebenssituationBasisType(LebenssituationBasisType object) {
				return createLebenssituationBasisTypeAdapter();
			}
			@Override
			public Adapter caseLebenssituationType(LebenssituationType object) {
				return createLebenssituationTypeAdapter();
			}
			@Override
			public Adapter caseLebenssituationUeberpruefungType(LebenssituationUeberpruefungType object) {
				return createLebenssituationUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseLedigAntragstellendeBasisType(LedigAntragstellendeBasisType object) {
				return createLedigAntragstellendeBasisTypeAdapter();
			}
			@Override
			public Adapter caseLedigAntragstellendeType(LedigAntragstellendeType object) {
				return createLedigAntragstellendeTypeAdapter();
			}
			@Override
			public Adapter caseLedigAntragstellendeUeberpruefungType(LedigAntragstellendeUeberpruefungType object) {
				return createLedigAntragstellendeUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseLeistungserhaltType(LeistungserhaltType object) {
				return createLeistungserhaltTypeAdapter();
			}
			@Override
			public Adapter caseLeistungsgewaehrungType(LeistungsgewaehrungType object) {
				return createLeistungsgewaehrungTypeAdapter();
			}
			@Override
			public Adapter caseLohnsteuerklasseType(LohnsteuerklasseType object) {
				return createLohnsteuerklasseTypeAdapter();
			}
			@Override
			public Adapter caseNameMitGeburtsnameType(NameMitGeburtsnameType object) {
				return createNameMitGeburtsnameTypeAdapter();
			}
			@Override
			public Adapter caseNameOhneGeburtsnameType(NameOhneGeburtsnameType object) {
				return createNameOhneGeburtsnameTypeAdapter();
			}
			@Override
			public Adapter caseNameOptionalType(NameOptionalType object) {
				return createNameOptionalTypeAdapter();
			}
			@Override
			public Adapter caseRechtsanwaltType(RechtsanwaltType object) {
				return createRechtsanwaltTypeAdapter();
			}
			@Override
			public Adapter caseSchuleType(SchuleType object) {
				return createSchuleTypeAdapter();
			}
			@Override
			public Adapter caseSonstigeLeistungAndererElternteilType(SonstigeLeistungAndererElternteilType object) {
				return createSonstigeLeistungAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseSonstigeLeistungKindType(SonstigeLeistungKindType object) {
				return createSonstigeLeistungKindTypeAdapter();
			}
			@Override
			public Adapter caseSonstigeLeistungKindUeberpruefungType(SonstigeLeistungKindUeberpruefungType object) {
				return createSonstigeLeistungKindUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseStaatsangehoerigkeitAndererElternteilType(StaatsangehoerigkeitAndererElternteilType object) {
				return createStaatsangehoerigkeitAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseStaatsangehoerigkeitType(StaatsangehoerigkeitType object) {
				return createStaatsangehoerigkeitTypeAdapter();
			}
			@Override
			public Adapter caseTraegerKrankenversicherungType(TraegerKrankenversicherungType object) {
				return createTraegerKrankenversicherungTypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltBasisType(UnterhaltBasisType object) {
				return createUnterhaltBasisTypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltstitelType(UnterhaltstitelType object) {
				return createUnterhaltstitelTypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltstitelUeberpruefungType(UnterhaltstitelUeberpruefungType object) {
				return createUnterhaltstitelUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltsvorauszahlungenType(UnterhaltsvorauszahlungenType object) {
				return createUnterhaltsvorauszahlungenTypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltsvorschussantragAntrag0301Type(UnterhaltsvorschussantragAntrag0301Type object) {
				return createUnterhaltsvorschussantragAntrag0301TypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type(UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type object) {
				return createUnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltsvorschussantragNachreichen0303Type(UnterhaltsvorschussantragNachreichen0303Type object) {
				return createUnterhaltsvorschussantragNachreichen0303TypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltsvorschussantragNachweisnachricht0311Type(UnterhaltsvorschussantragNachweisnachricht0311Type object) {
				return createUnterhaltsvorschussantragNachweisnachricht0311TypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltszahlungenType(UnterhaltszahlungenType object) {
				return createUnterhaltszahlungenTypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltType(UnterhaltType object) {
				return createUnterhaltTypeAdapter();
			}
			@Override
			public Adapter caseUnterhaltUeberpruefungType(UnterhaltUeberpruefungType object) {
				return createUnterhaltUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseVerheiratetAntragstellendeBasisType(VerheiratetAntragstellendeBasisType object) {
				return createVerheiratetAntragstellendeBasisTypeAdapter();
			}
			@Override
			public Adapter caseVerheiratetAntragstellendeType(VerheiratetAntragstellendeType object) {
				return createVerheiratetAntragstellendeTypeAdapter();
			}
			@Override
			public Adapter caseVerheiratetAntragstellendeUeberpruefungType(VerheiratetAntragstellendeUeberpruefungType object) {
				return createVerheiratetAntragstellendeUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseVermoegenAndererElternteilType(VermoegenAndererElternteilType object) {
				return createVermoegenAndererElternteilTypeAdapter();
			}
			@Override
			public Adapter caseVertretungType(VertretungType object) {
				return createVertretungTypeAdapter();
			}
			@Override
			public Adapter caseVertretungUeberpruefungType(VertretungUeberpruefungType object) {
				return createVertretungUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseVerwitwetAntragstellendeBasisType(VerwitwetAntragstellendeBasisType object) {
				return createVerwitwetAntragstellendeBasisTypeAdapter();
			}
			@Override
			public Adapter caseVerwitwetAntragstellendeType(VerwitwetAntragstellendeType object) {
				return createVerwitwetAntragstellendeTypeAdapter();
			}
			@Override
			public Adapter caseVerwitwetAntragstellendeUeberpruefungType(VerwitwetAntragstellendeUeberpruefungType object) {
				return createVerwitwetAntragstellendeUeberpruefungTypeAdapter();
			}
			@Override
			public Adapter caseVormundType(VormundType object) {
				return createVormundTypeAdapter();
			}
			@Override
			public Adapter caseWeitereGemeinsameKinderType(WeitereGemeinsameKinderType object) {
				return createWeitereGemeinsameKinderTypeAdapter();
			}
			@Override
			public Adapter caseWeitereKinderAndererElternteilType(WeitereKinderAndererElternteilType object) {
				return createWeitereKinderAndererElternteilTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType <em>Amtspflegende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType
	 * @generated
	 */
	public Adapter createAmtspflegendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType <em>Andere Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnderePersonType
	 * @generated
	 */
	public Adapter createAnderePersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType <em>Anderer Elternteil Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType
	 * @generated
	 */
	public Adapter createAndererElternteilBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilType <em>Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilType
	 * @generated
	 */
	public Adapter createAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilUeberpruefungType <em>Anderer Elternteil Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilUeberpruefungType
	 * @generated
	 */
	public Adapter createAndererElternteilUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType <em>Angaben Kind Nachreichen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AngabenKindNachreichenType
	 * @generated
	 */
	public Adapter createAngabenKindNachreichenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType <em>Anschrift Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType
	 * @generated
	 */
	public Adapter createAnschriftOptionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType <em>Antragskind Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindBasisType
	 * @generated
	 */
	public Adapter createAntragskindBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindType <em>Antragskind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindType
	 * @generated
	 */
	public Adapter createAntragskindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindUeberpruefungType <em>Antragskind Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindUeberpruefungType
	 * @generated
	 */
	public Adapter createAntragskindUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType <em>Antragstellender Elternteil Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType
	 * @generated
	 */
	public Adapter createAntragstellenderElternteilBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilType <em>Antragstellender Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilType
	 * @generated
	 */
	public Adapter createAntragstellenderElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilUeberpruefungType <em>Antragstellender Elternteil Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilUeberpruefungType
	 * @generated
	 */
	public Adapter createAntragstellenderElternteilUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType <em>Aufenthalt Kind Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType
	 * @generated
	 */
	public Adapter createAufenthaltKindBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindType <em>Aufenthalt Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindType
	 * @generated
	 */
	public Adapter createAufenthaltKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindUeberpruefungType <em>Aufenthalt Kind Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindUeberpruefungType
	 * @generated
	 */
	public Adapter createAufenthaltKindUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType <em>Ausbildung Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType
	 * @generated
	 */
	public Adapter createAusbildungAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType <em>Beistand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType
	 * @generated
	 */
	public Adapter createBeistandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType <em>Bemuehungen Unterhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType
	 * @generated
	 */
	public Adapter createBemuehungenUnterhaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType <em>Bestaetigung Angaben Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType
	 * @generated
	 */
	public Adapter createBestaetigungAngabenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType <em>Betreuer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType
	 * @generated
	 */
	public Adapter createBetreuerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType <em>Bezug Uv Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType
	 * @generated
	 */
	public Adapter createBezugUvKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeAusbildungType <em>Code Ausbildung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeAusbildungType
	 * @generated
	 */
	public Adapter createCodeAusbildungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteAndererElternteilType <em>Code Einkuenfte Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteAndererElternteilType
	 * @generated
	 */
	public Adapter createCodeEinkuenfteAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteKindType <em>Code Einkuenfte Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteKindType
	 * @generated
	 */
	public Adapter createCodeEinkuenfteKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSonstigeLeistungenUVType <em>Code Sonstige Leistungen UV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSonstigeLeistungenUVType
	 * @generated
	 */
	public Adapter createCodeSonstigeLeistungenUVTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeStaatsangehoerigkeitUVType <em>Code Staatsangehoerigkeit UV Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeStaatsangehoerigkeitUVType
	 * @generated
	 */
	public Adapter createCodeStaatsangehoerigkeitUVTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSteuerklasseType <em>Code Steuerklasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSteuerklasseType
	 * @generated
	 */
	public Adapter createCodeSteuerklasseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeUnterhaltsbemuehungenType <em>Code Unterhaltsbemuehungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeUnterhaltsbemuehungenType
	 * @generated
	 */
	public Adapter createCodeUnterhaltsbemuehungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType <em>Einkuenfte Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType
	 * @generated
	 */
	public Adapter createEinkuenfteAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType <em>Einkuenfte Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType
	 * @generated
	 */
	public Adapter createEinkuenfteKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType <em>Elternschaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType
	 * @generated
	 */
	public Adapter createElternschaftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType <em>Familienstand Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType
	 * @generated
	 */
	public Adapter createFamilienstandBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandType <em>Familienstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandType
	 * @generated
	 */
	public Adapter createFamilienstandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandUeberpruefungType <em>Familienstand Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandUeberpruefungType
	 * @generated
	 */
	public Adapter createFamilienstandUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtGeburtsortPflichtType <em>Geburt Geburtsort Pflicht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtGeburtsortPflichtType
	 * @generated
	 */
	public Adapter createGeburtGeburtsortPflichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtNurGeburtsdatumType <em>Geburt Nur Geburtsdatum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtNurGeburtsdatumType
	 * @generated
	 */
	public Adapter createGeburtNurGeburtsdatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType <em>Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeburtType
	 * @generated
	 */
	public Adapter createGeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType <em>Geschieden Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeBasisType
	 * @generated
	 */
	public Adapter createGeschiedenAntragstellendeBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeType <em>Geschieden Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeType
	 * @generated
	 */
	public Adapter createGeschiedenAntragstellendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeUeberpruefungType <em>Geschieden Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.GeschiedenAntragstellendeUeberpruefungType
	 * @generated
	 */
	public Adapter createGeschiedenAntragstellendeUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType <em>Institution Unterhaltstitel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType
	 * @generated
	 */
	public Adapter createInstitutionUnterhaltstitelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType <em>Lebenspartnerschaft Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType
	 * @generated
	 */
	public Adapter createLebenspartnerschaftAntragstellendeBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeType <em>Lebenspartnerschaft Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeType
	 * @generated
	 */
	public Adapter createLebenspartnerschaftAntragstellendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeUeberpruefungType <em>Lebenspartnerschaft Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeUeberpruefungType
	 * @generated
	 */
	public Adapter createLebenspartnerschaftAntragstellendeUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType <em>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType
	 * @generated
	 */
	public Adapter createLebenspartnerschaftAufgehobenAntragstellendeBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeType <em>Lebenspartnerschaft Aufgehoben Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeType
	 * @generated
	 */
	public Adapter createLebenspartnerschaftAufgehobenAntragstellendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType <em>Lebenspartnerschaft Aufgehoben Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType
	 * @generated
	 */
	public Adapter createLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType <em>Lebenspartner Verstorben Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeBasisType
	 * @generated
	 */
	public Adapter createLebenspartnerVerstorbenAntragstellendeBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeType <em>Lebenspartner Verstorben Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeType
	 * @generated
	 */
	public Adapter createLebenspartnerVerstorbenAntragstellendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeUeberpruefungType <em>Lebenspartner Verstorben Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerVerstorbenAntragstellendeUeberpruefungType
	 * @generated
	 */
	public Adapter createLebenspartnerVerstorbenAntragstellendeUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType <em>Lebenssituation Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType
	 * @generated
	 */
	public Adapter createLebenssituationBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationType <em>Lebenssituation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationType
	 * @generated
	 */
	public Adapter createLebenssituationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationUeberpruefungType <em>Lebenssituation Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationUeberpruefungType
	 * @generated
	 */
	public Adapter createLebenssituationUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType <em>Ledig Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType
	 * @generated
	 */
	public Adapter createLedigAntragstellendeBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeType <em>Ledig Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeType
	 * @generated
	 */
	public Adapter createLedigAntragstellendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeUeberpruefungType <em>Ledig Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeUeberpruefungType
	 * @generated
	 */
	public Adapter createLedigAntragstellendeUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType <em>Leistungserhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType
	 * @generated
	 */
	public Adapter createLeistungserhaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType <em>Leistungsgewaehrung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType
	 * @generated
	 */
	public Adapter createLeistungsgewaehrungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType <em>Lohnsteuerklasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType
	 * @generated
	 */
	public Adapter createLohnsteuerklasseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameMitGeburtsnameType <em>Name Mit Geburtsname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameMitGeburtsnameType
	 * @generated
	 */
	public Adapter createNameMitGeburtsnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOhneGeburtsnameType <em>Name Ohne Geburtsname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOhneGeburtsnameType
	 * @generated
	 */
	public Adapter createNameOhneGeburtsnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType <em>Name Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType
	 * @generated
	 */
	public Adapter createNameOptionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType <em>Rechtsanwalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType
	 * @generated
	 */
	public Adapter createRechtsanwaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType <em>Schule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType
	 * @generated
	 */
	public Adapter createSchuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType <em>Sonstige Leistung Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType
	 * @generated
	 */
	public Adapter createSonstigeLeistungAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType <em>Sonstige Leistung Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType
	 * @generated
	 */
	public Adapter createSonstigeLeistungKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindUeberpruefungType <em>Sonstige Leistung Kind Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindUeberpruefungType
	 * @generated
	 */
	public Adapter createSonstigeLeistungKindUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType <em>Staatsangehoerigkeit Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType
	 * @generated
	 */
	public Adapter createStaatsangehoerigkeitAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType <em>Staatsangehoerigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType
	 * @generated
	 */
	public Adapter createStaatsangehoerigkeitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType <em>Traeger Krankenversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType
	 * @generated
	 */
	public Adapter createTraegerKrankenversicherungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType <em>Unterhalt Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType
	 * @generated
	 */
	public Adapter createUnterhaltBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType <em>Unterhaltstitel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType
	 * @generated
	 */
	public Adapter createUnterhaltstitelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelUeberpruefungType <em>Unterhaltstitel Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelUeberpruefungType
	 * @generated
	 */
	public Adapter createUnterhaltstitelUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType <em>Unterhaltsvorauszahlungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType
	 * @generated
	 */
	public Adapter createUnterhaltsvorauszahlungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type <em>Unterhaltsvorschussantrag Antrag0301 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type
	 * @generated
	 */
	public Adapter createUnterhaltsvorschussantragAntrag0301TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type <em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type
	 * @generated
	 */
	public Adapter createUnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type <em>Unterhaltsvorschussantrag Nachreichen0303 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type
	 * @generated
	 */
	public Adapter createUnterhaltsvorschussantragNachreichen0303TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type <em>Unterhaltsvorschussantrag Nachweisnachricht0311 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type
	 * @generated
	 */
	public Adapter createUnterhaltsvorschussantragNachweisnachricht0311TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType <em>Unterhaltszahlungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType
	 * @generated
	 */
	public Adapter createUnterhaltszahlungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltType <em>Unterhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltType
	 * @generated
	 */
	public Adapter createUnterhaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltUeberpruefungType <em>Unterhalt Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltUeberpruefungType
	 * @generated
	 */
	public Adapter createUnterhaltUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType <em>Verheiratet Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType
	 * @generated
	 */
	public Adapter createVerheiratetAntragstellendeBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeType <em>Verheiratet Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeType
	 * @generated
	 */
	public Adapter createVerheiratetAntragstellendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeUeberpruefungType <em>Verheiratet Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeUeberpruefungType
	 * @generated
	 */
	public Adapter createVerheiratetAntragstellendeUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType <em>Vermoegen Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType
	 * @generated
	 */
	public Adapter createVermoegenAndererElternteilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType <em>Vertretung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType
	 * @generated
	 */
	public Adapter createVertretungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungUeberpruefungType <em>Vertretung Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungUeberpruefungType
	 * @generated
	 */
	public Adapter createVertretungUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType <em>Verwitwet Antragstellende Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeBasisType
	 * @generated
	 */
	public Adapter createVerwitwetAntragstellendeBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeType <em>Verwitwet Antragstellende Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeType
	 * @generated
	 */
	public Adapter createVerwitwetAntragstellendeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeUeberpruefungType <em>Verwitwet Antragstellende Ueberpruefung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerwitwetAntragstellendeUeberpruefungType
	 * @generated
	 */
	public Adapter createVerwitwetAntragstellendeUeberpruefungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType <em>Vormund Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType
	 * @generated
	 */
	public Adapter createVormundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType <em>Weitere Gemeinsame Kinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType
	 * @generated
	 */
	public Adapter createWeitereGemeinsameKinderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType <em>Weitere Kinder Anderer Elternteil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType
	 * @generated
	 */
	public Adapter createWeitereKinderAndererElternteilTypeAdapter() {
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

} //UnterhaltsvorschussAdapterFactory
