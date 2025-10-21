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
package de.xoev.domea.domea.util;

import de.xoev.domea.domea.*;

import de.xoev.schemata.code.code.Code;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.domea.domea.DomeaPackage
 * @generated
 */
public class DomeaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomeaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomeaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DomeaPackage.eINSTANCE;
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
	protected DomeaSwitch<Adapter> modelSwitch =
		new DomeaSwitch<Adapter>() {
			@Override
			public Adapter caseAkteninhaltType(AkteninhaltType object) {
				return createAkteninhaltTypeAdapter();
			}
			@Override
			public Adapter caseAktenplaneinheitAktenplanType(AktenplaneinheitAktenplanType object) {
				return createAktenplaneinheitAktenplanTypeAdapter();
			}
			@Override
			public Adapter caseAktenplaneinheitType(AktenplaneinheitType object) {
				return createAktenplaneinheitTypeAdapter();
			}
			@Override
			public Adapter caseAktenplanType(AktenplanType object) {
				return createAktenplanTypeAdapter();
			}
			@Override
			public Adapter caseAkteType(AkteType object) {
				return createAkteTypeAdapter();
			}
			@Override
			public Adapter caseAllgemeineMetadatenType(AllgemeineMetadatenType object) {
				return createAllgemeineMetadatenTypeAdapter();
			}
			@Override
			public Adapter caseAllgemeinerNameType(AllgemeinerNameType object) {
				return createAllgemeinerNameTypeAdapter();
			}
			@Override
			public Adapter caseAllgemeineRueckmeldungCodeType(AllgemeineRueckmeldungCodeType object) {
				return createAllgemeineRueckmeldungCodeTypeAdapter();
			}
			@Override
			public Adapter caseAnlageDokumentType(AnlageDokumentType object) {
				return createAnlageDokumentTypeAdapter();
			}
			@Override
			public Adapter caseAnschriftstypCodeType(AnschriftstypCodeType object) {
				return createAnschriftstypCodeTypeAdapter();
			}
			@Override
			public Adapter caseAnschriftType(AnschriftType object) {
				return createAnschriftTypeAdapter();
			}
			@Override
			public Adapter caseAnwendungsspezifischeErweiterungType(AnwendungsspezifischeErweiterungType object) {
				return createAnwendungsspezifischeErweiterungTypeAdapter();
			}
			@Override
			public Adapter caseAnwendungsspezifischeErweiterungXMLType(AnwendungsspezifischeErweiterungXMLType object) {
				return createAnwendungsspezifischeErweiterungXMLTypeAdapter();
			}
			@Override
			public Adapter caseAufbewahrungsdauerType(AufbewahrungsdauerType object) {
				return createAufbewahrungsdauerTypeAdapter();
			}
			@Override
			public Adapter caseAussonderungsartCodeType(AussonderungsartCodeType object) {
				return createAussonderungsartCodeTypeAdapter();
			}
			@Override
			public Adapter caseAussonderungsartType(AussonderungsartType object) {
				return createAussonderungsartTypeAdapter();
			}
			@Override
			public Adapter caseAussonderungsmetadatenType(AussonderungsmetadatenType object) {
				return createAussonderungsmetadatenTypeAdapter();
			}
			@Override
			public Adapter caseBearbeitungType(BearbeitungType object) {
				return createBearbeitungTypeAdapter();
			}
			@Override
			public Adapter caseBehoerdeType(BehoerdeType object) {
				return createBehoerdeTypeAdapter();
			}
			@Override
			public Adapter caseBeteiligungsschrittType(BeteiligungsschrittType object) {
				return createBeteiligungsschrittTypeAdapter();
			}
			@Override
			public Adapter caseBeteiligungsstatusCodeType(BeteiligungsstatusCodeType object) {
				return createBeteiligungsstatusCodeTypeAdapter();
			}
			@Override
			public Adapter caseBewertungsvorschlagCodeType(BewertungsvorschlagCodeType object) {
				return createBewertungsvorschlagCodeTypeAdapter();
			}
			@Override
			public Adapter caseDateiformatCodeType(DateiformatCodeType object) {
				return createDateiformatCodeTypeAdapter();
			}
			@Override
			public Adapter caseDatenaustauschartCodeType(DatenaustauschartCodeType object) {
				return createDatenaustauschartCodeTypeAdapter();
			}
			@Override
			public Adapter caseDatenschutzstufeCodeType(DatenschutzstufeCodeType object) {
				return createDatenschutzstufeCodeTypeAdapter();
			}
			@Override
			public Adapter caseDatentypCodeType(DatentypCodeType object) {
				return createDatentypCodeTypeAdapter();
			}
			@Override
			public Adapter caseDokumentMitSchriftstueckType(DokumentMitSchriftstueckType object) {
				return createDokumentMitSchriftstueckTypeAdapter();
			}
			@Override
			public Adapter caseDokumentOderDokumentMitSchriftstueckType(DokumentOderDokumentMitSchriftstueckType object) {
				return createDokumentOderDokumentMitSchriftstueckTypeAdapter();
			}
			@Override
			public Adapter caseDokumentSchriftstueckBasisType(DokumentSchriftstueckBasisType object) {
				return createDokumentSchriftstueckBasisTypeAdapter();
			}
			@Override
			public Adapter caseDokumentType(DokumentType object) {
				return createDokumentTypeAdapter();
			}
			@Override
			public Adapter caseErfolgOderMisserfolgImportType(ErfolgOderMisserfolgImportType object) {
				return createErfolgOderMisserfolgImportTypeAdapter();
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
			public Adapter caseFormatType(FormatType object) {
				return createFormatTypeAdapter();
			}
			@Override
			public Adapter caseGeburtType(GeburtType object) {
				return createGeburtTypeAdapter();
			}
			@Override
			public Adapter caseGeheimhaltungsgradCodeType(GeheimhaltungsgradCodeType object) {
				return createGeheimhaltungsgradCodeTypeAdapter();
			}
			@Override
			public Adapter caseGeheimhaltungType(GeheimhaltungType object) {
				return createGeheimhaltungTypeAdapter();
			}
			@Override
			public Adapter caseGeschaeftsgangType(GeschaeftsgangType object) {
				return createGeschaeftsgangTypeAdapter();
			}
			@Override
			public Adapter caseHashType(HashType object) {
				return createHashTypeAdapter();
			}
			@Override
			public Adapter caseHistorienProtokollInformationType(HistorienProtokollInformationType object) {
				return createHistorienProtokollInformationTypeAdapter();
			}
			@Override
			public Adapter caseIdentifikationNachrichtType(IdentifikationNachrichtType object) {
				return createIdentifikationNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseIdentifikationObjektType(IdentifikationObjektType object) {
				return createIdentifikationObjektTypeAdapter();
			}
			@Override
			public Adapter caseKommunikationType(KommunikationType object) {
				return createKommunikationTypeAdapter();
			}
			@Override
			public Adapter caseKompressionsverfahrenCodeType(KompressionsverfahrenCodeType object) {
				return createKompressionsverfahrenCodeTypeAdapter();
			}
			@Override
			public Adapter caseKonfigurationsparameterCodeType(KonfigurationsparameterCodeType object) {
				return createKonfigurationsparameterCodeTypeAdapter();
			}
			@Override
			public Adapter caseKonfigurationsparameterGruppeCodeType(KonfigurationsparameterGruppeCodeType object) {
				return createKonfigurationsparameterGruppeCodeTypeAdapter();
			}
			@Override
			public Adapter caseKontaktType(KontaktType object) {
				return createKontaktTypeAdapter();
			}
			@Override
			public Adapter caseKryptographischeAlgorithmenCodeType(KryptographischeAlgorithmenCodeType object) {
				return createKryptographischeAlgorithmenCodeTypeAdapter();
			}
			@Override
			public Adapter caseMediumCodeType(MediumCodeType object) {
				return createMediumCodeTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtenkopfType(NachrichtenkopfType object) {
				return createNachrichtenkopfTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtentypCodeType(NachrichtentypCodeType object) {
				return createNachrichtentypCodeTypeAdapter();
			}
			@Override
			public Adapter caseNachrichtType(NachrichtType object) {
				return createNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseNameNatuerlichePersonType(NameNatuerlichePersonType object) {
				return createNameNatuerlichePersonTypeAdapter();
			}
			@Override
			public Adapter caseNameOrganisationType(NameOrganisationType object) {
				return createNameOrganisationTypeAdapter();
			}
			@Override
			public Adapter caseNkFVDatenType(NkFVDatenType object) {
				return createNkFVDatenTypeAdapter();
			}
			@Override
			public Adapter caseNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType(NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType object) {
				return createNkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeAdapter();
			}
			@Override
			public Adapter caseNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType(NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType object) {
				return createNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeAdapter();
			}
			@Override
			public Adapter caseNkNichtFVDatenWeitereLeserType(NkNichtFVDatenWeitereLeserType object) {
				return createNkNichtFVDatenWeitereLeserTypeAdapter();
			}
			@Override
			public Adapter caseOrganisationseinheitType(OrganisationseinheitType object) {
				return createOrganisationseinheitTypeAdapter();
			}
			@Override
			public Adapter casePfadelementType(PfadelementType object) {
				return createPfadelementTypeAdapter();
			}
			@Override
			public Adapter casePrimaerdokumentType(PrimaerdokumentType object) {
				return createPrimaerdokumentTypeAdapter();
			}
			@Override
			public Adapter caseRolleCodeType(RolleCodeType object) {
				return createRolleCodeTypeAdapter();
			}
			@Override
			public Adapter caseSchriftgutobjekttypCodeType(SchriftgutobjekttypCodeType object) {
				return createSchriftgutobjekttypCodeTypeAdapter();
			}
			@Override
			public Adapter caseSignaturSiegelType(SignaturSiegelType object) {
				return createSignaturSiegelTypeAdapter();
			}
			@Override
			public Adapter caseSonstigeFehlermeldungCodeType(SonstigeFehlermeldungCodeType object) {
				return createSonstigeFehlermeldungCodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0601CodeType(SpezifischeFehlermeldung0601CodeType object) {
				return createSpezifischeFehlermeldung0601CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0602CodeType(SpezifischeFehlermeldung0602CodeType object) {
				return createSpezifischeFehlermeldung0602CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0603CodeType(SpezifischeFehlermeldung0603CodeType object) {
				return createSpezifischeFehlermeldung0603CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0604CodeType(SpezifischeFehlermeldung0604CodeType object) {
				return createSpezifischeFehlermeldung0604CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0605CodeType(SpezifischeFehlermeldung0605CodeType object) {
				return createSpezifischeFehlermeldung0605CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0606CodeType(SpezifischeFehlermeldung0606CodeType object) {
				return createSpezifischeFehlermeldung0606CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0607CodeType(SpezifischeFehlermeldung0607CodeType object) {
				return createSpezifischeFehlermeldung0607CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0608CodeType(SpezifischeFehlermeldung0608CodeType object) {
				return createSpezifischeFehlermeldung0608CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0609CodeType(SpezifischeFehlermeldung0609CodeType object) {
				return createSpezifischeFehlermeldung0609CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0610CodeType(SpezifischeFehlermeldung0610CodeType object) {
				return createSpezifischeFehlermeldung0610CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0611CodeType(SpezifischeFehlermeldung0611CodeType object) {
				return createSpezifischeFehlermeldung0611CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0612CodeType(SpezifischeFehlermeldung0612CodeType object) {
				return createSpezifischeFehlermeldung0612CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0613CodeType(SpezifischeFehlermeldung0613CodeType object) {
				return createSpezifischeFehlermeldung0613CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0614CodeType(SpezifischeFehlermeldung0614CodeType object) {
				return createSpezifischeFehlermeldung0614CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0615CodeType(SpezifischeFehlermeldung0615CodeType object) {
				return createSpezifischeFehlermeldung0615CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0616CodeType(SpezifischeFehlermeldung0616CodeType object) {
				return createSpezifischeFehlermeldung0616CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0617CodeType(SpezifischeFehlermeldung0617CodeType object) {
				return createSpezifischeFehlermeldung0617CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0618CodeType(SpezifischeFehlermeldung0618CodeType object) {
				return createSpezifischeFehlermeldung0618CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0619CodeType(SpezifischeFehlermeldung0619CodeType object) {
				return createSpezifischeFehlermeldung0619CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0620CodeType(SpezifischeFehlermeldung0620CodeType object) {
				return createSpezifischeFehlermeldung0620CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0621CodeType(SpezifischeFehlermeldung0621CodeType object) {
				return createSpezifischeFehlermeldung0621CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0622CodeType(SpezifischeFehlermeldung0622CodeType object) {
				return createSpezifischeFehlermeldung0622CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0623CodeType(SpezifischeFehlermeldung0623CodeType object) {
				return createSpezifischeFehlermeldung0623CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0624CodeType(SpezifischeFehlermeldung0624CodeType object) {
				return createSpezifischeFehlermeldung0624CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0625CodeType(SpezifischeFehlermeldung0625CodeType object) {
				return createSpezifischeFehlermeldung0625CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0626CodeType(SpezifischeFehlermeldung0626CodeType object) {
				return createSpezifischeFehlermeldung0626CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0627CodeType(SpezifischeFehlermeldung0627CodeType object) {
				return createSpezifischeFehlermeldung0627CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0628CodeType(SpezifischeFehlermeldung0628CodeType object) {
				return createSpezifischeFehlermeldung0628CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0631CodeType(SpezifischeFehlermeldung0631CodeType object) {
				return createSpezifischeFehlermeldung0631CodeTypeAdapter();
			}
			@Override
			public Adapter caseSpezifischeFehlermeldung0632CodeType(SpezifischeFehlermeldung0632CodeType object) {
				return createSpezifischeFehlermeldung0632CodeTypeAdapter();
			}
			@Override
			public Adapter caseStaatCodeType(StaatCodeType object) {
				return createStaatCodeTypeAdapter();
			}
			@Override
			public Adapter caseStaatType(StaatType object) {
				return createStaatTypeAdapter();
			}
			@Override
			public Adapter caseStrukturelementTypCodeType(StrukturelementTypCodeType object) {
				return createStrukturelementTypCodeTypeAdapter();
			}
			@Override
			public Adapter caseStrukturpfadType(StrukturpfadType object) {
				return createStrukturpfadTypeAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseTransportwegCodeType(TransportwegCodeType object) {
				return createTransportwegCodeTypeAdapter();
			}
			@Override
			public Adapter caseUnstrukturierteAnschriftType(UnstrukturierteAnschriftType object) {
				return createUnstrukturierteAnschriftTypeAdapter();
			}
			@Override
			public Adapter caseVerfuegungType(VerfuegungType object) {
				return createVerfuegungTypeAdapter();
			}
			@Override
			public Adapter caseVersionType(VersionType object) {
				return createVersionTypeAdapter();
			}
			@Override
			public Adapter caseVerweisType(VerweisType object) {
				return createVerweisTypeAdapter();
			}
			@Override
			public Adapter caseVorgangType(VorgangType object) {
				return createVorgangTypeAdapter();
			}
			@Override
			public Adapter caseZeitraumType(ZeitraumType object) {
				return createZeitraumTypeAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseBasisnachricht_IdentifikationNachrichtType(basisnachricht.IdentifikationNachrichtType object) {
				return createBasisnachricht_IdentifikationNachrichtTypeAdapter();
			}
			@Override
			public Adapter caseBasisnachricht_KommunikationType(basisnachricht.KommunikationType object) {
				return createBasisnachricht_KommunikationTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AkteninhaltType <em>Akteninhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AkteninhaltType
	 * @generated
	 */
	public Adapter createAkteninhaltTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType <em>Aktenplaneinheit Aktenplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType
	 * @generated
	 */
	public Adapter createAktenplaneinheitAktenplanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AktenplaneinheitType <em>Aktenplaneinheit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AktenplaneinheitType
	 * @generated
	 */
	public Adapter createAktenplaneinheitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AktenplanType <em>Aktenplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AktenplanType
	 * @generated
	 */
	public Adapter createAktenplanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AkteType <em>Akte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AkteType
	 * @generated
	 */
	public Adapter createAkteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AllgemeineMetadatenType <em>Allgemeine Metadaten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType
	 * @generated
	 */
	public Adapter createAllgemeineMetadatenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AllgemeinerNameType <em>Allgemeiner Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AllgemeinerNameType
	 * @generated
	 */
	public Adapter createAllgemeinerNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AllgemeineRueckmeldungCodeType <em>Allgemeine Rueckmeldung Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AllgemeineRueckmeldungCodeType
	 * @generated
	 */
	public Adapter createAllgemeineRueckmeldungCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AnlageDokumentType <em>Anlage Dokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AnlageDokumentType
	 * @generated
	 */
	public Adapter createAnlageDokumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AnschriftstypCodeType <em>Anschriftstyp Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AnschriftstypCodeType
	 * @generated
	 */
	public Adapter createAnschriftstypCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AnschriftType <em>Anschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AnschriftType
	 * @generated
	 */
	public Adapter createAnschriftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType <em>Anwendungsspezifische Erweiterung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType
	 * @generated
	 */
	public Adapter createAnwendungsspezifischeErweiterungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType <em>Anwendungsspezifische Erweiterung XML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType
	 * @generated
	 */
	public Adapter createAnwendungsspezifischeErweiterungXMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AufbewahrungsdauerType <em>Aufbewahrungsdauer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AufbewahrungsdauerType
	 * @generated
	 */
	public Adapter createAufbewahrungsdauerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AussonderungsartCodeType <em>Aussonderungsart Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AussonderungsartCodeType
	 * @generated
	 */
	public Adapter createAussonderungsartCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AussonderungsartType <em>Aussonderungsart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AussonderungsartType
	 * @generated
	 */
	public Adapter createAussonderungsartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.AussonderungsmetadatenType <em>Aussonderungsmetadaten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType
	 * @generated
	 */
	public Adapter createAussonderungsmetadatenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.BearbeitungType <em>Bearbeitung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.BearbeitungType
	 * @generated
	 */
	public Adapter createBearbeitungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.BehoerdeType <em>Behoerde Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.BehoerdeType
	 * @generated
	 */
	public Adapter createBehoerdeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.BeteiligungsschrittType <em>Beteiligungsschritt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.BeteiligungsschrittType
	 * @generated
	 */
	public Adapter createBeteiligungsschrittTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.BeteiligungsstatusCodeType <em>Beteiligungsstatus Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.BeteiligungsstatusCodeType
	 * @generated
	 */
	public Adapter createBeteiligungsstatusCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.BewertungsvorschlagCodeType <em>Bewertungsvorschlag Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.BewertungsvorschlagCodeType
	 * @generated
	 */
	public Adapter createBewertungsvorschlagCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.DateiformatCodeType <em>Dateiformat Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.DateiformatCodeType
	 * @generated
	 */
	public Adapter createDateiformatCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.DatenaustauschartCodeType <em>Datenaustauschart Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.DatenaustauschartCodeType
	 * @generated
	 */
	public Adapter createDatenaustauschartCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.DatenschutzstufeCodeType <em>Datenschutzstufe Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.DatenschutzstufeCodeType
	 * @generated
	 */
	public Adapter createDatenschutzstufeCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.DatentypCodeType <em>Datentyp Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.DatentypCodeType
	 * @generated
	 */
	public Adapter createDatentypCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.DokumentMitSchriftstueckType <em>Dokument Mit Schriftstueck Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.DokumentMitSchriftstueckType
	 * @generated
	 */
	public Adapter createDokumentMitSchriftstueckTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType <em>Dokument Oder Dokument Mit Schriftstueck Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType
	 * @generated
	 */
	public Adapter createDokumentOderDokumentMitSchriftstueckTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType <em>Dokument Schriftstueck Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType
	 * @generated
	 */
	public Adapter createDokumentSchriftstueckBasisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.DokumentType <em>Dokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.DokumentType
	 * @generated
	 */
	public Adapter createDokumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType <em>Erfolg Oder Misserfolg Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.ErfolgOderMisserfolgImportType
	 * @generated
	 */
	public Adapter createErfolgOderMisserfolgImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.FeldgruppeType <em>Feldgruppe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.FeldgruppeType
	 * @generated
	 */
	public Adapter createFeldgruppeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.FeldType <em>Feld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.FeldType
	 * @generated
	 */
	public Adapter createFeldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.FormatType
	 * @generated
	 */
	public Adapter createFormatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.GeburtType <em>Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.GeburtType
	 * @generated
	 */
	public Adapter createGeburtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.GeheimhaltungsgradCodeType <em>Geheimhaltungsgrad Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.GeheimhaltungsgradCodeType
	 * @generated
	 */
	public Adapter createGeheimhaltungsgradCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.GeheimhaltungType <em>Geheimhaltung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.GeheimhaltungType
	 * @generated
	 */
	public Adapter createGeheimhaltungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.GeschaeftsgangType <em>Geschaeftsgang Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.GeschaeftsgangType
	 * @generated
	 */
	public Adapter createGeschaeftsgangTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.HashType <em>Hash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.HashType
	 * @generated
	 */
	public Adapter createHashTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.HistorienProtokollInformationType <em>Historien Protokoll Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType
	 * @generated
	 */
	public Adapter createHistorienProtokollInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.IdentifikationNachrichtType <em>Identifikation Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.IdentifikationNachrichtType
	 * @generated
	 */
	public Adapter createIdentifikationNachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.IdentifikationObjektType <em>Identifikation Objekt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.IdentifikationObjektType
	 * @generated
	 */
	public Adapter createIdentifikationObjektTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.KommunikationType <em>Kommunikation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.KommunikationType
	 * @generated
	 */
	public Adapter createKommunikationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.KompressionsverfahrenCodeType <em>Kompressionsverfahren Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.KompressionsverfahrenCodeType
	 * @generated
	 */
	public Adapter createKompressionsverfahrenCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.KonfigurationsparameterCodeType <em>Konfigurationsparameter Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.KonfigurationsparameterCodeType
	 * @generated
	 */
	public Adapter createKonfigurationsparameterCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.KonfigurationsparameterGruppeCodeType <em>Konfigurationsparameter Gruppe Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.KonfigurationsparameterGruppeCodeType
	 * @generated
	 */
	public Adapter createKonfigurationsparameterGruppeCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.KontaktType <em>Kontakt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.KontaktType
	 * @generated
	 */
	public Adapter createKontaktTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.KryptographischeAlgorithmenCodeType <em>Kryptographische Algorithmen Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.KryptographischeAlgorithmenCodeType
	 * @generated
	 */
	public Adapter createKryptographischeAlgorithmenCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.MediumCodeType <em>Medium Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.MediumCodeType
	 * @generated
	 */
	public Adapter createMediumCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NachrichtenkopfType <em>Nachrichtenkopf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NachrichtenkopfType
	 * @generated
	 */
	public Adapter createNachrichtenkopfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NachrichtentypCodeType <em>Nachrichtentyp Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NachrichtentypCodeType
	 * @generated
	 */
	public Adapter createNachrichtentypCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NachrichtType <em>Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NachrichtType
	 * @generated
	 */
	public Adapter createNachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NameNatuerlichePersonType <em>Name Natuerliche Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NameNatuerlichePersonType
	 * @generated
	 */
	public Adapter createNameNatuerlichePersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NameOrganisationType <em>Name Organisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NameOrganisationType
	 * @generated
	 */
	public Adapter createNameOrganisationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NkFVDatenType <em>Nk FV Daten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NkFVDatenType
	 * @generated
	 */
	public Adapter createNkFVDatenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType <em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType
	 * @generated
	 */
	public Adapter createNkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType <em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType
	 * @generated
	 */
	public Adapter createNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType <em>Nk Nicht FV Daten Weitere Leser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType
	 * @generated
	 */
	public Adapter createNkNichtFVDatenWeitereLeserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.OrganisationseinheitType <em>Organisationseinheit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.OrganisationseinheitType
	 * @generated
	 */
	public Adapter createOrganisationseinheitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.PfadelementType <em>Pfadelement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.PfadelementType
	 * @generated
	 */
	public Adapter createPfadelementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.PrimaerdokumentType <em>Primaerdokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.PrimaerdokumentType
	 * @generated
	 */
	public Adapter createPrimaerdokumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.RolleCodeType <em>Rolle Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.RolleCodeType
	 * @generated
	 */
	public Adapter createRolleCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SchriftgutobjekttypCodeType <em>Schriftgutobjekttyp Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SchriftgutobjekttypCodeType
	 * @generated
	 */
	public Adapter createSchriftgutobjekttypCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SignaturSiegelType <em>Signatur Siegel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SignaturSiegelType
	 * @generated
	 */
	public Adapter createSignaturSiegelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SonstigeFehlermeldungCodeType <em>Sonstige Fehlermeldung Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SonstigeFehlermeldungCodeType
	 * @generated
	 */
	public Adapter createSonstigeFehlermeldungCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0601CodeType <em>Spezifische Fehlermeldung0601 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0601CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0601CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0602CodeType <em>Spezifische Fehlermeldung0602 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0602CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0602CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0603CodeType <em>Spezifische Fehlermeldung0603 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0603CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0603CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0604CodeType <em>Spezifische Fehlermeldung0604 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0604CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0604CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0605CodeType <em>Spezifische Fehlermeldung0605 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0605CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0605CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0606CodeType <em>Spezifische Fehlermeldung0606 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0606CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0606CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0607CodeType <em>Spezifische Fehlermeldung0607 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0607CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0607CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0608CodeType <em>Spezifische Fehlermeldung0608 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0608CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0608CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0609CodeType <em>Spezifische Fehlermeldung0609 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0609CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0609CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0610CodeType <em>Spezifische Fehlermeldung0610 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0610CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0610CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0611CodeType <em>Spezifische Fehlermeldung0611 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0611CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0611CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0612CodeType <em>Spezifische Fehlermeldung0612 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0612CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0612CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0613CodeType <em>Spezifische Fehlermeldung0613 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0613CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0613CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0614CodeType <em>Spezifische Fehlermeldung0614 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0614CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0614CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0615CodeType <em>Spezifische Fehlermeldung0615 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0615CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0615CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0616CodeType <em>Spezifische Fehlermeldung0616 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0616CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0616CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0617CodeType <em>Spezifische Fehlermeldung0617 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0617CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0617CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0618CodeType <em>Spezifische Fehlermeldung0618 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0618CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0618CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0619CodeType <em>Spezifische Fehlermeldung0619 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0619CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0619CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0620CodeType <em>Spezifische Fehlermeldung0620 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0620CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0620CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0621CodeType <em>Spezifische Fehlermeldung0621 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0621CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0621CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0622CodeType <em>Spezifische Fehlermeldung0622 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0622CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0622CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0623CodeType <em>Spezifische Fehlermeldung0623 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0623CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0623CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0624CodeType <em>Spezifische Fehlermeldung0624 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0624CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0624CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0625CodeType <em>Spezifische Fehlermeldung0625 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0625CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0625CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0626CodeType <em>Spezifische Fehlermeldung0626 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0626CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0626CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0627CodeType <em>Spezifische Fehlermeldung0627 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0627CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0627CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0628CodeType <em>Spezifische Fehlermeldung0628 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0628CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0628CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0631CodeType <em>Spezifische Fehlermeldung0631 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0631CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0631CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0632CodeType <em>Spezifische Fehlermeldung0632 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0632CodeType
	 * @generated
	 */
	public Adapter createSpezifischeFehlermeldung0632CodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.StaatCodeType <em>Staat Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.StaatCodeType
	 * @generated
	 */
	public Adapter createStaatCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.StaatType <em>Staat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.StaatType
	 * @generated
	 */
	public Adapter createStaatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.StrukturelementTypCodeType <em>Strukturelement Typ Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.StrukturelementTypCodeType
	 * @generated
	 */
	public Adapter createStrukturelementTypCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.StrukturpfadType <em>Strukturpfad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.StrukturpfadType
	 * @generated
	 */
	public Adapter createStrukturpfadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.TransportwegCodeType <em>Transportweg Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.TransportwegCodeType
	 * @generated
	 */
	public Adapter createTransportwegCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType <em>Unstrukturierte Anschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType
	 * @generated
	 */
	public Adapter createUnstrukturierteAnschriftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.VerfuegungType <em>Verfuegung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.VerfuegungType
	 * @generated
	 */
	public Adapter createVerfuegungTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.VersionType
	 * @generated
	 */
	public Adapter createVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.VerweisType <em>Verweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.VerweisType
	 * @generated
	 */
	public Adapter createVerweisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.VorgangType <em>Vorgang Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.VorgangType
	 * @generated
	 */
	public Adapter createVorgangTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.xoev.domea.domea.ZeitraumType <em>Zeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.xoev.domea.domea.ZeitraumType
	 * @generated
	 */
	public Adapter createZeitraumTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link basisnachricht.IdentifikationNachrichtType <em>Identifikation Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.IdentifikationNachrichtType
	 * @generated
	 */
	public Adapter createBasisnachricht_IdentifikationNachrichtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link basisnachricht.KommunikationType <em>Kommunikation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see basisnachricht.KommunikationType
	 * @generated
	 */
	public Adapter createBasisnachricht_KommunikationTypeAdapter() {
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

} //DomeaAdapterFactory
