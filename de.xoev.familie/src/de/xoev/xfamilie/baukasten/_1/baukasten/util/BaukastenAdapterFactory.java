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
package de.xoev.xfamilie.baukasten._1.baukasten.util;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage
 * @generated
 */
public class BaukastenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BaukastenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaukastenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BaukastenPackage.eINSTANCE;
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
	protected BaukastenSwitch<Adapter> modelSwitch =
		new BaukastenSwitch<Adapter>() {
			@Override
			public Adapter caseAllgemeinerNameType(AllgemeinerNameType object) {
				return createAllgemeinerNameTypeAdapter();
			}
			@Override
			public Adapter caseAntragsnachrichtType(AntragsnachrichtType object) {
				return createAntragsnachrichtTypeAdapter();
			}
			@Override
			public Adapter caseAufenthaltstitelNachweisbezugType(AufenthaltstitelNachweisbezugType object) {
				return createAufenthaltstitelNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter caseAuslandsanschriftType(AuslandsanschriftType object) {
				return createAuslandsanschriftTypeAdapter();
			}
			@Override
			public Adapter caseBankverbindungIBANOptionalType(BankverbindungIBANOptionalType object) {
				return createBankverbindungIBANOptionalTypeAdapter();
			}
			@Override
			public Adapter caseBankverbindungInhaberOptionalType(BankverbindungInhaberOptionalType object) {
				return createBankverbindungInhaberOptionalTypeAdapter();
			}
			@Override
			public Adapter caseBankverbindungType(BankverbindungType object) {
				return createBankverbindungTypeAdapter();
			}
			@Override
			public Adapter caseBehoerdenkennungType(BehoerdenkennungType object) {
				return createBehoerdenkennungTypeAdapter();
			}
			@Override
			public Adapter caseCodeAnredeType(CodeAnredeType object) {
				return createCodeAnredeTypeAdapter();
			}
			@Override
			public Adapter caseCodeArtAbrufType(CodeArtAbrufType object) {
				return createCodeArtAbrufTypeAdapter();
			}
			@Override
			public Adapter caseCodeAufenthaltsstatusType(CodeAufenthaltsstatusType object) {
				return createCodeAufenthaltsstatusTypeAdapter();
			}
			@Override
			public Adapter caseCodeBundeslandType(CodeBundeslandType object) {
				return createCodeBundeslandTypeAdapter();
			}
			@Override
			public Adapter caseCodeEigenschaftType(CodeEigenschaftType object) {
				return createCodeEigenschaftTypeAdapter();
			}
			@Override
			public Adapter caseCodeEinkommensartenType(CodeEinkommensartenType object) {
				return createCodeEinkommensartenTypeAdapter();
			}
			@Override
			public Adapter caseCodeErreichbarkeitType(CodeErreichbarkeitType object) {
				return createCodeErreichbarkeitTypeAdapter();
			}
			@Override
			public Adapter caseCodeFamilienstandType(CodeFamilienstandType object) {
				return createCodeFamilienstandTypeAdapter();
			}
			@Override
			public Adapter caseCodeGemeindeVZAmtlicherGemeindeschluesselType(CodeGemeindeVZAmtlicherGemeindeschluesselType object) {
				return createCodeGemeindeVZAmtlicherGemeindeschluesselTypeAdapter();
			}
			@Override
			public Adapter caseCodeGemeindeVZRegionalschluesselType(CodeGemeindeVZRegionalschluesselType object) {
				return createCodeGemeindeVZRegionalschluesselTypeAdapter();
			}
			@Override
			public Adapter caseCodeGeschlechtType(CodeGeschlechtType object) {
				return createCodeGeschlechtTypeAdapter();
			}
			@Override
			public Adapter caseCodeKindschaftsbeziehungType(CodeKindschaftsbeziehungType object) {
				return createCodeKindschaftsbeziehungTypeAdapter();
			}
			@Override
			public Adapter caseCodeKindWohnhaftBeiType(CodeKindWohnhaftBeiType object) {
				return createCodeKindWohnhaftBeiTypeAdapter();
			}
			@Override
			public Adapter caseCodeLeistungserhaltType(CodeLeistungserhaltType object) {
				return createCodeLeistungserhaltTypeAdapter();
			}
			@Override
			public Adapter caseCodeLeistungsgewaehrungType(CodeLeistungsgewaehrungType object) {
				return createCodeLeistungsgewaehrungTypeAdapter();
			}
			@Override
			public Adapter caseCodeNachrichtentypType(CodeNachrichtentypType object) {
				return createCodeNachrichtentypTypeAdapter();
			}
			@Override
			public Adapter caseCodeNachweisbezugType(CodeNachweisbezugType object) {
				return createCodeNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter caseCodePersonensorgerechtType(CodePersonensorgerechtType object) {
				return createCodePersonensorgerechtTypeAdapter();
			}
			@Override
			public Adapter caseCodePraefixType(CodePraefixType object) {
				return createCodePraefixTypeAdapter();
			}
			@Override
			public Adapter caseCodeSonderstatusType(CodeSonderstatusType object) {
				return createCodeSonderstatusTypeAdapter();
			}
			@Override
			public Adapter caseCodeSonstigeLeistungenType(CodeSonstigeLeistungenType object) {
				return createCodeSonstigeLeistungenTypeAdapter();
			}
			@Override
			public Adapter caseCodeStaatsangehoerigkeitType(CodeStaatsangehoerigkeitType object) {
				return createCodeStaatsangehoerigkeitTypeAdapter();
			}
			@Override
			public Adapter caseCodeStaatType(CodeStaatType object) {
				return createCodeStaatTypeAdapter();
			}
			@Override
			public Adapter caseCodeStandesamtnummernType(CodeStandesamtnummernType object) {
				return createCodeStandesamtnummernTypeAdapter();
			}
			@Override
			public Adapter caseCodeStatusDatenabrufType(CodeStatusDatenabrufType object) {
				return createCodeStatusDatenabrufTypeAdapter();
			}
			@Override
			public Adapter caseCodeTatsachenbehauptungType(CodeTatsachenbehauptungType object) {
				return createCodeTatsachenbehauptungTypeAdapter();
			}
			@Override
			public Adapter caseCodeVermoegensartType(CodeVermoegensartType object) {
				return createCodeVermoegensartTypeAdapter();
			}
			@Override
			public Adapter caseCodeVertrauensniveauType(CodeVertrauensniveauType object) {
				return createCodeVertrauensniveauTypeAdapter();
			}
			@Override
			public Adapter caseCodeVertretungType(CodeVertretungType object) {
				return createCodeVertretungTypeAdapter();
			}
			@Override
			public Adapter caseCodeWohnsitzType(CodeWohnsitzType object) {
				return createCodeWohnsitzTypeAdapter();
			}
			@Override
			public Adapter caseCodeZuschuesseType(CodeZuschuesseType object) {
				return createCodeZuschuesseTypeAdapter();
			}
			@Override
			public Adapter caseDatenabrufType(DatenabrufType object) {
				return createDatenabrufTypeAdapter();
			}
			@Override
			public Adapter caseDatenschutzerklaerungenType(DatenschutzerklaerungenType object) {
				return createDatenschutzerklaerungenTypeAdapter();
			}
			@Override
			public Adapter caseEntgeltdatenArbeitgeberDsrvType(EntgeltdatenArbeitgeberDsrvType object) {
				return createEntgeltdatenArbeitgeberDsrvTypeAdapter();
			}
			@Override
			public Adapter caseEntgeltdatenDsrvNachweisbezugType(EntgeltdatenDsrvNachweisbezugType object) {
				return createEntgeltdatenDsrvNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter caseErreichbarkeitType(ErreichbarkeitType object) {
				return createErreichbarkeitTypeAdapter();
			}
			@Override
			public Adapter caseFamiliennameUnstrukturiertType(FamiliennameUnstrukturiertType object) {
				return createFamiliennameUnstrukturiertTypeAdapter();
			}
			@Override
			public Adapter caseFamilienstandNachweisbezugType(FamilienstandNachweisbezugType object) {
				return createFamilienstandNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter caseFamilienstandType(FamilienstandType object) {
				return createFamilienstandTypeAdapter();
			}
			@Override
			public Adapter caseFeldgruppeType(FeldgruppeType object) {
				return createFeldgruppeTypeAdapter();
			}
			@Override
			public Adapter caseFeldType(FeldType object) {
				return createFeldTypeAdapter();
			}
			@Override
			public Adapter caseGeburtGeburtsortOptionalType(GeburtGeburtsortOptionalType object) {
				return createGeburtGeburtsortOptionalTypeAdapter();
			}
			@Override
			public Adapter caseGeburtNachweisbezugType(GeburtNachweisbezugType object) {
				return createGeburtNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter caseGeburtOptionalType(GeburtOptionalType object) {
				return createGeburtOptionalTypeAdapter();
			}
			@Override
			public Adapter caseGeburtType(GeburtType object) {
				return createGeburtTypeAdapter();
			}
			@Override
			public Adapter caseHausnummernBisType(HausnummernBisType object) {
				return createHausnummernBisTypeAdapter();
			}
			@Override
			public Adapter caseIdentifikationNachrichtType(IdentifikationNachrichtType object) {
				return createIdentifikationNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseKommunikationspartnerErreichbarType(KommunikationspartnerErreichbarType object) {
				return createKommunikationspartnerErreichbarTypeAdapter();
			}
			@Override
			public Adapter caseKommunikationspartnerType(KommunikationspartnerType object) {
				return createKommunikationspartnerTypeAdapter();
			}
			@Override
			public Adapter caseMeldeanschriftType(MeldeanschriftType object) {
				return createMeldeanschriftTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtenkopfType(NachrichtenkopfType object) {
				return createNachrichtenkopfTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtType(NachrichtType object) {
				return createNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseNachweisbezugType(NachweisbezugType object) {
				return createNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter caseNachweisdokumentType(NachweisdokumentType object) {
				return createNachweisdokumentTypeAdapter();
			}
			@Override
			public Adapter caseNameNatuerlichePersonNachweisbezugType(NameNatuerlichePersonNachweisbezugType object) {
				return createNameNatuerlichePersonNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter caseNameNatuerlichePersonOhneGeburtsnameType(NameNatuerlichePersonOhneGeburtsnameType object) {
				return createNameNatuerlichePersonOhneGeburtsnameTypeAdapter();
			}
			@Override
			public Adapter caseNameNatuerlichePersonType(NameNatuerlichePersonType object) {
				return createNameNatuerlichePersonTypeAdapter();
			}
			@Override
			public Adapter caseNameNatuerlichePersonVornameVerpflichtendType(NameNatuerlichePersonVornameVerpflichtendType object) {
				return createNameNatuerlichePersonVornameVerpflichtendTypeAdapter();
			}
			@Override
			public Adapter caseNutzerkontoType(NutzerkontoType object) {
				return createNutzerkontoTypeAdapter();
			}
			@Override
			public Adapter casePostalischeInlandsanschriftBasisType(PostalischeInlandsanschriftBasisType object) {
				return createPostalischeInlandsanschriftBasisTypeAdapter();
			}
			@Override
			public Adapter casePostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType object) {
				return createPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter casePostalischeInlandsanschriftGebaeudeanschriftType(PostalischeInlandsanschriftGebaeudeanschriftType object) {
				return createPostalischeInlandsanschriftGebaeudeanschriftTypeAdapter();
			}
			@Override
			public Adapter casePostalischeInlandsanschriftPostfachanschriftType(PostalischeInlandsanschriftPostfachanschriftType object) {
				return createPostalischeInlandsanschriftPostfachanschriftTypeAdapter();
			}
			@Override
			public Adapter casePostalischeInlandsanschriftType(PostalischeInlandsanschriftType object) {
				return createPostalischeInlandsanschriftTypeAdapter();
			}
			@Override
			public Adapter casePostkorbHandleType(PostkorbHandleType object) {
				return createPostkorbHandleTypeAdapter();
			}
			@Override
			public Adapter caseStaatsangehoerigkeitenNachweisbezugType(StaatsangehoerigkeitenNachweisbezugType object) {
				return createStaatsangehoerigkeitenNachweisbezugTypeAdapter();
			}
			@Override
			public Adapter caseStatusDatenabrufType(StatusDatenabrufType object) {
				return createStatusDatenabrufTypeAdapter();
			}
			@Override
			public Adapter caseTatsacheMitFreitextType(TatsacheMitFreitextType object) {
				return createTatsacheMitFreitextTypeAdapter();
			}
			@Override
			public Adapter caseTatsacheMitNachweisType(TatsacheMitNachweisType object) {
				return createTatsacheMitNachweisTypeAdapter();
			}
			@Override
			public Adapter caseTatsacheMitZeitraumType(TatsacheMitZeitraumType object) {
				return createTatsacheMitZeitraumTypeAdapter();
			}
			@Override
			public Adapter caseTeilbekanntesDatumType(TeilbekanntesDatumType object) {
				return createTeilbekanntesDatumTypeAdapter();
			}
			@Override
			public Adapter caseTerminwunschType(TerminwunschType object) {
				return createTerminwunschTypeAdapter();
			}
			@Override
			public Adapter caseZeitraumType(ZeitraumType object) {
				return createZeitraumTypeAdapter();
			}
			@Override
			public Adapter caseZusatzparametergruppeType(ZusatzparametergruppeType object) {
				return createZusatzparametergruppeTypeAdapter();
			}
			@Override
			public Adapter caseZustimmungAbrufOderWeitergabeType(ZustimmungAbrufOderWeitergabeType object) {
				return createZustimmungAbrufOderWeitergabeTypeAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType <em>Allgemeiner Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType
	 * @generated
	 */
	public Adapter createAllgemeinerNameTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType <em>Aufenthaltstitel Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType
	 * @generated
	 */
	public Adapter createAufenthaltstitelNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType <em>Auslandsanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType
	 * @generated
	 */
	public Adapter createAuslandsanschriftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType <em>Bankverbindung IBAN Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType
	 * @generated
	 */
	public Adapter createBankverbindungIBANOptionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType <em>Bankverbindung Inhaber Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType
	 * @generated
	 */
	public Adapter createBankverbindungInhaberOptionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType <em>Bankverbindung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType
	 * @generated
	 */
	public Adapter createBankverbindungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType <em>Behoerdenkennung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType
	 * @generated
	 */
	public Adapter createBehoerdenkennungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeAnredeType <em>Code Anrede Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeAnredeType
	 * @generated
	 */
	public Adapter createCodeAnredeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeArtAbrufType <em>Code Art Abruf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeArtAbrufType
	 * @generated
	 */
	public Adapter createCodeArtAbrufTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType <em>Code Aufenthaltsstatus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType
	 * @generated
	 */
	public Adapter createCodeAufenthaltsstatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeBundeslandType <em>Code Bundesland Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeBundeslandType
	 * @generated
	 */
	public Adapter createCodeBundeslandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeEigenschaftType <em>Code Eigenschaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeEigenschaftType
	 * @generated
	 */
	public Adapter createCodeEigenschaftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeEinkommensartenType <em>Code Einkommensarten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeEinkommensartenType
	 * @generated
	 */
	public Adapter createCodeEinkommensartenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeErreichbarkeitType <em>Code Erreichbarkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeErreichbarkeitType
	 * @generated
	 */
	public Adapter createCodeErreichbarkeitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType <em>Code Familienstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType
	 * @generated
	 */
	public Adapter createCodeFamilienstandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZAmtlicherGemeindeschluesselType <em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZAmtlicherGemeindeschluesselType
	 * @generated
	 */
	public Adapter createCodeGemeindeVZAmtlicherGemeindeschluesselTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZRegionalschluesselType <em>Code Gemeinde VZ Regionalschluessel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZRegionalschluesselType
	 * @generated
	 */
	public Adapter createCodeGemeindeVZRegionalschluesselTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType <em>Code Geschlecht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType
	 * @generated
	 */
	public Adapter createCodeGeschlechtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType <em>Code Kindschaftsbeziehung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType
	 * @generated
	 */
	public Adapter createCodeKindschaftsbeziehungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType <em>Code Kind Wohnhaft Bei Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType
	 * @generated
	 */
	public Adapter createCodeKindWohnhaftBeiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungserhaltType <em>Code Leistungserhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungserhaltType
	 * @generated
	 */
	public Adapter createCodeLeistungserhaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungsgewaehrungType <em>Code Leistungsgewaehrung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungsgewaehrungType
	 * @generated
	 */
	public Adapter createCodeLeistungsgewaehrungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeNachrichtentypType <em>Code Nachrichtentyp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeNachrichtentypType
	 * @generated
	 */
	public Adapter createCodeNachrichtentypTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeNachweisbezugType <em>Code Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeNachweisbezugType
	 * @generated
	 */
	public Adapter createCodeNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodePersonensorgerechtType <em>Code Personensorgerecht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodePersonensorgerechtType
	 * @generated
	 */
	public Adapter createCodePersonensorgerechtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodePraefixType <em>Code Praefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodePraefixType
	 * @generated
	 */
	public Adapter createCodePraefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeSonderstatusType <em>Code Sonderstatus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeSonderstatusType
	 * @generated
	 */
	public Adapter createCodeSonderstatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeSonstigeLeistungenType <em>Code Sonstige Leistungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeSonstigeLeistungenType
	 * @generated
	 */
	public Adapter createCodeSonstigeLeistungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType <em>Code Staatsangehoerigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType
	 * @generated
	 */
	public Adapter createCodeStaatsangehoerigkeitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType <em>Code Staat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType
	 * @generated
	 */
	public Adapter createCodeStaatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStandesamtnummernType <em>Code Standesamtnummern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeStandesamtnummernType
	 * @generated
	 */
	public Adapter createCodeStandesamtnummernTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStatusDatenabrufType <em>Code Status Datenabruf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeStatusDatenabrufType
	 * @generated
	 */
	public Adapter createCodeStatusDatenabrufTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType <em>Code Tatsachenbehauptung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType
	 * @generated
	 */
	public Adapter createCodeTatsachenbehauptungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeVermoegensartType <em>Code Vermoegensart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeVermoegensartType
	 * @generated
	 */
	public Adapter createCodeVermoegensartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeVertrauensniveauType <em>Code Vertrauensniveau Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeVertrauensniveauType
	 * @generated
	 */
	public Adapter createCodeVertrauensniveauTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeVertretungType <em>Code Vertretung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeVertretungType
	 * @generated
	 */
	public Adapter createCodeVertretungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeWohnsitzType <em>Code Wohnsitz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeWohnsitzType
	 * @generated
	 */
	public Adapter createCodeWohnsitzTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType <em>Code Zuschuesse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType
	 * @generated
	 */
	public Adapter createCodeZuschuesseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType <em>Datenabruf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType
	 * @generated
	 */
	public Adapter createDatenabrufTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType <em>Datenschutzerklaerungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType
	 * @generated
	 */
	public Adapter createDatenschutzerklaerungenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType <em>Entgeltdaten Arbeitgeber Dsrv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType
	 * @generated
	 */
	public Adapter createEntgeltdatenArbeitgeberDsrvTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType <em>Entgeltdaten Dsrv Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType
	 * @generated
	 */
	public Adapter createEntgeltdatenDsrvNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType <em>Erreichbarkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType
	 * @generated
	 */
	public Adapter createErreichbarkeitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType <em>Familienname Unstrukturiert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType
	 * @generated
	 */
	public Adapter createFamiliennameUnstrukturiertTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType <em>Familienstand Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType
	 * @generated
	 */
	public Adapter createFamilienstandNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType <em>Familienstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType
	 * @generated
	 */
	public Adapter createFamilienstandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType <em>Feldgruppe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType
	 * @generated
	 */
	public Adapter createFeldgruppeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldType <em>Feld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldType
	 * @generated
	 */
	public Adapter createFeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType <em>Geburt Geburtsort Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType
	 * @generated
	 */
	public Adapter createGeburtGeburtsortOptionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType <em>Geburt Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType
	 * @generated
	 */
	public Adapter createGeburtNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType <em>Geburt Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType
	 * @generated
	 */
	public Adapter createGeburtOptionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtType <em>Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtType
	 * @generated
	 */
	public Adapter createGeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType <em>Hausnummern Bis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType
	 * @generated
	 */
	public Adapter createHausnummernBisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType <em>Identifikation Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType
	 * @generated
	 */
	public Adapter createIdentifikationNachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerErreichbarType <em>Kommunikationspartner Erreichbar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerErreichbarType
	 * @generated
	 */
	public Adapter createKommunikationspartnerErreichbarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType <em>Kommunikationspartner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType
	 * @generated
	 */
	public Adapter createKommunikationspartnerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType <em>Meldeanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType
	 * @generated
	 */
	public Adapter createMeldeanschriftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType <em>Nachrichtenkopf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType
	 * @generated
	 */
	public Adapter createNachrichtenkopfTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType <em>Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType
	 * @generated
	 */
	public Adapter createNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType <em>Nachweisdokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType
	 * @generated
	 */
	public Adapter createNachweisdokumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType <em>Name Natuerliche Person Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType
	 * @generated
	 */
	public Adapter createNameNatuerlichePersonNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType <em>Name Natuerliche Person Ohne Geburtsname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType
	 * @generated
	 */
	public Adapter createNameNatuerlichePersonOhneGeburtsnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType <em>Name Natuerliche Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType
	 * @generated
	 */
	public Adapter createNameNatuerlichePersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType <em>Name Natuerliche Person Vorname Verpflichtend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType
	 * @generated
	 */
	public Adapter createNameNatuerlichePersonVornameVerpflichtendTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType <em>Nutzerkonto Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType
	 * @generated
	 */
	public Adapter createNutzerkontoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType <em>Postalische Inlandsanschrift Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType
	 * @generated
	 */
	public Adapter createPostalischeInlandsanschriftBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType <em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType
	 * @generated
	 */
	public Adapter createPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType <em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType
	 * @generated
	 */
	public Adapter createPostalischeInlandsanschriftGebaeudeanschriftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType <em>Postalische Inlandsanschrift Postfachanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType
	 * @generated
	 */
	public Adapter createPostalischeInlandsanschriftPostfachanschriftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType <em>Postalische Inlandsanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType
	 * @generated
	 */
	public Adapter createPostalischeInlandsanschriftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType <em>Postkorb Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType
	 * @generated
	 */
	public Adapter createPostkorbHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType <em>Staatsangehoerigkeiten Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType
	 * @generated
	 */
	public Adapter createStaatsangehoerigkeitenNachweisbezugTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType <em>Status Datenabruf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType
	 * @generated
	 */
	public Adapter createStatusDatenabrufTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType <em>Tatsache Mit Freitext Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType
	 * @generated
	 */
	public Adapter createTatsacheMitFreitextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType <em>Tatsache Mit Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType
	 * @generated
	 */
	public Adapter createTatsacheMitNachweisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType <em>Tatsache Mit Zeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType
	 * @generated
	 */
	public Adapter createTatsacheMitZeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType <em>Teilbekanntes Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType
	 * @generated
	 */
	public Adapter createTeilbekanntesDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType <em>Terminwunsch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType
	 * @generated
	 */
	public Adapter createTerminwunschTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType <em>Zeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType
	 * @generated
	 */
	public Adapter createZeitraumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType <em>Zusatzparametergruppe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType
	 * @generated
	 */
	public Adapter createZusatzparametergruppeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType <em>Zustimmung Abruf Oder Weitergabe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType
	 * @generated
	 */
	public Adapter createZustimmungAbrufOderWeitergabeTypeAdapter() {
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

} //BaukastenAdapterFactory
