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
package de.xoev.domea.domea.impl;

import basisnachricht.BasisnachrichtPackage;

import basisnachricht.impl.BasisnachrichtPackageImpl;

import de.xoev.domea.domea.AkteType;
import de.xoev.domea.domea.AkteninhaltType;
import de.xoev.domea.domea.AktenplanType;
import de.xoev.domea.domea.AktenplaneinheitAktenplanType;
import de.xoev.domea.domea.AktenplaneinheitType;
import de.xoev.domea.domea.AllgemeineMetadatenType;
import de.xoev.domea.domea.AllgemeineRueckmeldungCodeType;
import de.xoev.domea.domea.AllgemeinerNameType;
import de.xoev.domea.domea.AnlageDokumentType;
import de.xoev.domea.domea.AnschriftType;
import de.xoev.domea.domea.AnschriftstypCodeType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType;
import de.xoev.domea.domea.AufbewahrungsdauerType;
import de.xoev.domea.domea.AussonderungsartCodeType;
import de.xoev.domea.domea.AussonderungsartType;
import de.xoev.domea.domea.AussonderungsmetadatenType;
import de.xoev.domea.domea.BearbeitungType;
import de.xoev.domea.domea.BehoerdeType;
import de.xoev.domea.domea.BeteiligungsschrittType;
import de.xoev.domea.domea.BeteiligungsstatusCodeType;
import de.xoev.domea.domea.BewertungsvorschlagCodeType;
import de.xoev.domea.domea.DateiformatCodeType;
import de.xoev.domea.domea.DatenaustauschartCodeType;
import de.xoev.domea.domea.DatenschutzstufeCodeType;
import de.xoev.domea.domea.DatentypCodeType;
import de.xoev.domea.domea.DokumentMitSchriftstueckType;
import de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType;
import de.xoev.domea.domea.DokumentSchriftstueckBasisType;
import de.xoev.domea.domea.DokumentType;
import de.xoev.domea.domea.DomeaFactory;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.ErfolgOderMisserfolgImportType;
import de.xoev.domea.domea.FeldType;
import de.xoev.domea.domea.FeldgruppeType;
import de.xoev.domea.domea.FormatType;
import de.xoev.domea.domea.GeburtType;
import de.xoev.domea.domea.GeheimhaltungType;
import de.xoev.domea.domea.GeheimhaltungsgradCodeType;
import de.xoev.domea.domea.GeschaeftsgangType;
import de.xoev.domea.domea.HashType;
import de.xoev.domea.domea.HistorienProtokollInformationType;
import de.xoev.domea.domea.IdentifikationNachrichtType;
import de.xoev.domea.domea.IdentifikationObjektType;
import de.xoev.domea.domea.KommunikationType;
import de.xoev.domea.domea.KompressionsverfahrenCodeType;
import de.xoev.domea.domea.KonfigurationsparameterCodeType;
import de.xoev.domea.domea.KonfigurationsparameterGruppeCodeType;
import de.xoev.domea.domea.KontaktType;
import de.xoev.domea.domea.KryptographischeAlgorithmenCodeType;
import de.xoev.domea.domea.MediumCodeType;
import de.xoev.domea.domea.NachrichtType;
import de.xoev.domea.domea.NachrichtenkopfType;
import de.xoev.domea.domea.NachrichtentypCodeType;
import de.xoev.domea.domea.NameNatuerlichePersonType;
import de.xoev.domea.domea.NameOrganisationType;
import de.xoev.domea.domea.NkFVDatenType;
import de.xoev.domea.domea.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType;
import de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType;
import de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType;
import de.xoev.domea.domea.OrganisationseinheitType;
import de.xoev.domea.domea.PfadelementType;
import de.xoev.domea.domea.PrimaerdokumentType;
import de.xoev.domea.domea.RolleCodeType;
import de.xoev.domea.domea.SchriftgutobjekttypCodeType;
import de.xoev.domea.domea.SignaturSiegelType;
import de.xoev.domea.domea.SonstigeFehlermeldungCodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0601CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0602CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0603CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0604CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0605CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0606CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0607CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0608CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0609CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0610CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0611CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0612CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0613CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0614CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0615CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0616CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0617CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0618CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0619CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0620CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0621CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0622CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0623CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0624CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0625CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0626CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0627CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0628CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0631CodeType;
import de.xoev.domea.domea.SpezifischeFehlermeldung0632CodeType;
import de.xoev.domea.domea.StaatCodeType;
import de.xoev.domea.domea.StaatType;
import de.xoev.domea.domea.StrukturelementTypCodeType;
import de.xoev.domea.domea.StrukturpfadType;
import de.xoev.domea.domea.SystemType;
import de.xoev.domea.domea.TransportwegCodeType;
import de.xoev.domea.domea.UnstrukturierteAnschriftType;
import de.xoev.domea.domea.VerfuegungType;
import de.xoev.domea.domea.VersionType;
import de.xoev.domea.domea.VerweisType;
import de.xoev.domea.domea.VorgangType;
import de.xoev.domea.domea.ZeitraumType;

import de.xoev.domea.domea.util.DomeaValidator;

import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package;

import de.xoev.schemata.code.code.Code10Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomeaPackageImpl extends EPackageImpl implements DomeaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akteninhaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aktenplaneinheitAktenplanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aktenplaneinheitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aktenplanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass akteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeineMetadatenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeinerNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allgemeineRueckmeldungCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anlageDokumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anschriftstypCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anschriftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anwendungsspezifischeErweiterungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anwendungsspezifischeErweiterungXMLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aufbewahrungsdauerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aussonderungsartCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aussonderungsartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aussonderungsmetadatenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bearbeitungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behoerdeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beteiligungsschrittTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beteiligungsstatusCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bewertungsvorschlagCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateiformatCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenaustauschartCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datenschutzstufeCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datentypCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dokumentMitSchriftstueckTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dokumentOderDokumentMitSchriftstueckTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dokumentSchriftstueckBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dokumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erfolgOderMisserfolgImportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feldgruppeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geburtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geheimhaltungsgradCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geheimhaltungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschaeftsgangTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historienProtokollInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifikationNachrichtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifikationObjektTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kommunikationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kompressionsverfahrenCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass konfigurationsparameterCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass konfigurationsparameterGruppeCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kontaktTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kryptographischeAlgorithmenCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediumCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtenkopfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtentypCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameNatuerlichePersonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameOrganisationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nkFVDatenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nkNichtFVDatenWeitereLeserTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationseinheitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pfadelementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaerdokumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolleCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schriftgutobjekttypCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturSiegelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstigeFehlermeldungCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0601CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0602CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0603CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0604CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0605CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0606CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0607CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0608CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0609CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0610CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0611CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0612CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0613CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0614CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0615CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0616CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0617CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0618CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0619CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0620CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0621CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0622CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0623CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0624CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0625CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0626CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0627CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0628CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0631CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spezifischeFehlermeldung0632CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staatCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strukturelementTypCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strukturpfadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportwegCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstrukturierteAnschriftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verfuegungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verweisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vorgangTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringDateinameTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.xoev.domea.domea.DomeaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomeaPackageImpl() {
		super(eNS_URI, DomeaFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DomeaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomeaPackage init() {
		if (isInited) return (DomeaPackage)EPackage.Registry.INSTANCE.getEPackage(DomeaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDomeaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DomeaPackageImpl theDomeaPackage = registeredDomeaPackage instanceof DomeaPackageImpl ? (DomeaPackageImpl)registeredDomeaPackage : new DomeaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913792204Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisnachrichtPackage.eNS_URI);
		BasisnachrichtPackageImpl theBasisnachrichtPackage = (BasisnachrichtPackageImpl)(registeredPackage instanceof BasisnachrichtPackageImpl ? registeredPackage : BasisnachrichtPackage.eINSTANCE);

		// Create package meta-data objects
		theDomeaPackage.createPackageContents();
		theBasisnachrichtPackage.createPackageContents();

		// Initialize created meta-data
		theDomeaPackage.initializePackageContents();
		theBasisnachrichtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDomeaPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DomeaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDomeaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomeaPackage.eNS_URI, theDomeaPackage);
		return theDomeaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkteninhaltType() {
		return akteninhaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteninhaltType_DokumentOderDokumentMitSchriftstueck() {
		return (EReference)akteninhaltTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteninhaltType_Vorgang() {
		return (EReference)akteninhaltTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteninhaltType_Teilakte() {
		return (EReference)akteninhaltTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAktenplaneinheitAktenplanType() {
		return aktenplaneinheitAktenplanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplaneinheitAktenplanType_Aussonderungsart() {
		return (EReference)aktenplaneinheitAktenplanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplaneinheitAktenplanType_Gueltigkeit() {
		return (EReference)aktenplaneinheitAktenplanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAktenplaneinheitAktenplanType_Stillgelegt() {
		return (EAttribute)aktenplaneinheitAktenplanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplaneinheitAktenplanType_Aufbewahrungsdauer() {
		return (EReference)aktenplaneinheitAktenplanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplaneinheitAktenplanType_Einheit() {
		return (EReference)aktenplaneinheitAktenplanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAktenplaneinheitAktenplanType_VerweisAktenplaneinheit() {
		return (EAttribute)aktenplaneinheitAktenplanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterung() {
		return (EReference)aktenplaneinheitAktenplanTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterungXML() {
		return (EReference)aktenplaneinheitAktenplanTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAktenplaneinheitType() {
		return aktenplaneinheitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAktenplaneinheitType_Kennzeichen() {
		return (EAttribute)aktenplaneinheitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAktenplaneinheitType_Inhaltsangabe() {
		return (EAttribute)aktenplaneinheitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAktenplaneinheitType_BetreffKurz() {
		return (EAttribute)aktenplaneinheitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAktenplanType() {
		return aktenplanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAktenplanType_Bezeichnung() {
		return (EAttribute)aktenplanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAktenplanType_Typ() {
		return (EAttribute)aktenplanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAktenplanType_Version() {
		return (EAttribute)aktenplanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplanType_Einheit() {
		return (EReference)aktenplanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplanType_Gueltigkeit() {
		return (EReference)aktenplanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAktenplanType_Aktenplandatei() {
		return (EReference)aktenplanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAkteType() {
		return akteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_Identifikation() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_AllgemeineMetadaten() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_Aussonderungsmetadaten() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAkteType_Standort() {
		return (EAttribute)akteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAkteType_Typ() {
		return (EAttribute)akteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_Laufzeit() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_HistorienProtokollInformation() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_InternerGeschaeftsgang() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_Akteninhalt() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_Verweis() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_Kontakt() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAkteType_ZdA() {
		return (EAttribute)akteTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAkteType_ZdADatum() {
		return (EAttribute)akteTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_AnwendungsspezifischeErweiterung() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAkteType_AnwendungsspezifischeErweiterungXML() {
		return (EReference)akteTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeineMetadatenType() {
		return allgemeineMetadatenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineMetadatenType_Betreff() {
		return (EAttribute)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineMetadatenType_Kennzeichen() {
		return (EAttribute)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineMetadatenType_Federfuehrung() {
		return (EAttribute)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineMetadatenType_Aktenfuehrung() {
		return (EAttribute)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineMetadatenType_Geheimhaltung() {
		return (EReference)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineMetadatenType_Bemerkung() {
		return (EAttribute)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineMetadatenType_Medium() {
		return (EReference)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineMetadatenType_Aktenplaneinheit() {
		return (EReference)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineMetadatenType_ZeitpunktLetzteAenderung() {
		return (EAttribute)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineMetadatenType_Strukturpfad() {
		return (EReference)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeineMetadatenType_Datenschutzstufe() {
		return (EAttribute)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllgemeineMetadatenType_DatenschutzstufeCode() {
		return (EReference)allgemeineMetadatenTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeinerNameType() {
		return allgemeinerNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllgemeinerNameType_Name() {
		return (EAttribute)allgemeinerNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllgemeineRueckmeldungCodeType() {
		return allgemeineRueckmeldungCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnlageDokumentType() {
		return anlageDokumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageDokumentType_Nummer() {
		return (EAttribute)anlageDokumentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnschriftstypCodeType() {
		return anschriftstypCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnschriftType() {
		return anschriftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnschriftType_Staat() {
		return (EReference)anschriftTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftType_Strasse() {
		return (EAttribute)anschriftTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftType_Hausnummer() {
		return (EAttribute)anschriftTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftType_Postfach() {
		return (EAttribute)anschriftTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftType_Postleitzahl() {
		return (EAttribute)anschriftTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftType_Ort() {
		return (EAttribute)anschriftTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftType_Zusatz() {
		return (EAttribute)anschriftTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnschriftType_Typ() {
		return (EReference)anschriftTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnwendungsspezifischeErweiterungType() {
		return anwendungsspezifischeErweiterungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnwendungsspezifischeErweiterungType_Kennung() {
		return (EAttribute)anwendungsspezifischeErweiterungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnwendungsspezifischeErweiterungType_Name() {
		return (EAttribute)anwendungsspezifischeErweiterungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnwendungsspezifischeErweiterungType_Beschreibung() {
		return (EAttribute)anwendungsspezifischeErweiterungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnwendungsspezifischeErweiterungType_Versionsnummer() {
		return (EAttribute)anwendungsspezifischeErweiterungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnwendungsspezifischeErweiterungType_Versionsdatum() {
		return (EAttribute)anwendungsspezifischeErweiterungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnwendungsspezifischeErweiterungType_Feldgruppe() {
		return (EReference)anwendungsspezifischeErweiterungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnwendungsspezifischeErweiterungType_Feld() {
		return (EReference)anwendungsspezifischeErweiterungTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnwendungsspezifischeErweiterungXMLType() {
		return anwendungsspezifischeErweiterungXMLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnwendungsspezifischeErweiterungXMLType_Any() {
		return (EAttribute)anwendungsspezifischeErweiterungXMLTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAufbewahrungsdauerType() {
		return aufbewahrungsdauerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufbewahrungsdauerType_AnzahlJahre() {
		return (EAttribute)aufbewahrungsdauerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufbewahrungsdauerType_Unbefristet() {
		return (EAttribute)aufbewahrungsdauerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAussonderungsartCodeType() {
		return aussonderungsartCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAussonderungsartType() {
		return aussonderungsartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussonderungsartType_Aussonderungsart() {
		return (EReference)aussonderungsartTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAussonderungsartType_AussonderungsartKonfigurierbar() {
		return (EAttribute)aussonderungsartTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAussonderungsmetadatenType() {
		return aussonderungsmetadatenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussonderungsmetadatenType_Aufbewahrungsdauer() {
		return (EReference)aussonderungsmetadatenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussonderungsmetadatenType_Aussonderungsart() {
		return (EReference)aussonderungsmetadatenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAussonderungsmetadatenType_Kennung() {
		return (EAttribute)aussonderungsmetadatenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAussonderungsmetadatenType_Bewertungsvorschlag() {
		return (EReference)aussonderungsmetadatenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAussonderungsmetadatenType_BewertungsvorschlagBegruendung() {
		return (EAttribute)aussonderungsmetadatenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAussonderungsmetadatenType_Aufbewahrungsende() {
		return (EAttribute)aussonderungsmetadatenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAussonderungsmetadatenType_Transferfristende() {
		return (EAttribute)aussonderungsmetadatenTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBearbeitungType() {
		return bearbeitungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungType_Bearbeiter() {
		return (EReference)bearbeitungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearbeitungType_Datum() {
		return (EAttribute)bearbeitungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearbeitungType_Uhrzeit() {
		return (EAttribute)bearbeitungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearbeitungType_Vermerk() {
		return (EAttribute)bearbeitungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearbeitungType_Notiz() {
		return (EAttribute)bearbeitungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBearbeitungType_Anlage() {
		return (EReference)bearbeitungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehoerdeType() {
		return behoerdeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehoerdeType_Verzeichnisdienst() {
		return (EReference)behoerdeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehoerdeType_Kennung() {
		return (EAttribute)behoerdeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeteiligungsschrittType() {
		return beteiligungsschrittTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeteiligungsschrittType_Nummer() {
		return (EAttribute)beteiligungsschrittTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeteiligungsschrittType_Status() {
		return (EReference)beteiligungsschrittTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeteiligungsschrittType_Verfuegung() {
		return (EReference)beteiligungsschrittTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeteiligungsschrittType_Bearbeitung() {
		return (EReference)beteiligungsschrittTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeteiligungsschrittType_ParallelZuBeteiligungsschritt() {
		return (EAttribute)beteiligungsschrittTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeteiligungsschrittType_VersionNummer() {
		return (EAttribute)beteiligungsschrittTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeteiligungsstatusCodeType() {
		return beteiligungsstatusCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBewertungsvorschlagCodeType() {
		return bewertungsvorschlagCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateiformatCodeType() {
		return dateiformatCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenaustauschartCodeType() {
		return datenaustauschartCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatenschutzstufeCodeType() {
		return datenschutzstufeCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatentypCodeType() {
		return datentypCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDokumentMitSchriftstueckType() {
		return dokumentMitSchriftstueckTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentMitSchriftstueckType_Schriftstueck() {
		return (EReference)dokumentMitSchriftstueckTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDokumentOderDokumentMitSchriftstueckType() {
		return dokumentOderDokumentMitSchriftstueckTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentOderDokumentMitSchriftstueckType_Dokument() {
		return (EReference)dokumentOderDokumentMitSchriftstueckTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentOderDokumentMitSchriftstueckType_DokumentMitSchriftstueck() {
		return (EReference)dokumentOderDokumentMitSchriftstueckTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDokumentSchriftstueckBasisType() {
		return dokumentSchriftstueckBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_Identifikation() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_AllgemeineMetadaten() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDokumentSchriftstueckBasisType_FremdesGeschaeftszeichen() {
		return (EAttribute)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDokumentSchriftstueckBasisType_Posteingangsdatum() {
		return (EAttribute)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDokumentSchriftstueckBasisType_Postausgangsdatum() {
		return (EAttribute)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDokumentSchriftstueckBasisType_DatumDesSchreibens() {
		return (EAttribute)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDokumentSchriftstueckBasisType_Bezug() {
		return (EAttribute)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDokumentSchriftstueckBasisType_Hier() {
		return (EAttribute)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDokumentSchriftstueckBasisType_Bearbeiter() {
		return (EAttribute)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDokumentSchriftstueckBasisType_Typ() {
		return (EAttribute)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_HistorienProtokollInformation() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_InternerGeschaeftsgang() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_Verweis() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_Anlage() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_Autor() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_Leser() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_WeitererKontakt() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterung() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterungXML() {
		return (EReference)dokumentSchriftstueckBasisTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDokumentType() {
		return dokumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDokumentType_Version() {
		return (EReference)dokumentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErfolgOderMisserfolgImportType() {
		return erfolgOderMisserfolgImportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErfolgOderMisserfolgImportType_Erfolgreich() {
		return (EAttribute)erfolgOderMisserfolgImportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErfolgOderMisserfolgImportType_Fehlermeldung() {
		return (EAttribute)erfolgOderMisserfolgImportTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErfolgOderMisserfolgImportType_FehlermeldungCode() {
		return (EReference)erfolgOderMisserfolgImportTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeldgruppeType() {
		return feldgruppeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldgruppeType_Name() {
		return (EAttribute)feldgruppeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldgruppeType_Beschreibung() {
		return (EAttribute)feldgruppeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeldgruppeType_Unterfeldgruppe() {
		return (EReference)feldgruppeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeldgruppeType_Feld() {
		return (EReference)feldgruppeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeldType() {
		return feldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldType_Name() {
		return (EAttribute)feldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldType_Beschreibung() {
		return (EAttribute)feldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeldType_Datentyp() {
		return (EReference)feldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeldType_Wert() {
		return (EAttribute)feldTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormatType() {
		return formatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormatType_Name() {
		return (EReference)formatTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormatType_SonstigerName() {
		return (EAttribute)formatTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormatType_Version() {
		return (EAttribute)formatTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormatType_Primaerdokument() {
		return (EReference)formatTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtType() {
		return geburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeburtType_Datum() {
		return (EAttribute)geburtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeheimhaltungsgradCodeType() {
		return geheimhaltungsgradCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeheimhaltungType() {
		return geheimhaltungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeheimhaltungType_Geheimhaltungsgrad() {
		return (EReference)geheimhaltungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeheimhaltungType_Einstufungsfrist() {
		return (EAttribute)geheimhaltungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeheimhaltungType_EingestuftAm() {
		return (EAttribute)geheimhaltungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeheimhaltungType_Herausgeber() {
		return (EAttribute)geheimhaltungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeheimhaltungType_EinstufungEndetAm() {
		return (EAttribute)geheimhaltungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeheimhaltungType_Bemerkung() {
		return (EAttribute)geheimhaltungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschaeftsgangType() {
		return geschaeftsgangTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeschaeftsgangType_Identifikation() {
		return (EReference)geschaeftsgangTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeschaeftsgangType_Beteiligungsschritt() {
		return (EReference)geschaeftsgangTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashType() {
		return hashTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashType_Wert() {
		return (EAttribute)hashTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHashType_Algorithmus() {
		return (EReference)hashTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashType_SonstigerAlgorithmus() {
		return (EAttribute)hashTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistorienProtokollInformationType() {
		return historienProtokollInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistorienProtokollInformationType_MetadatumName() {
		return (EAttribute)historienProtokollInformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistorienProtokollInformationType_MetadatumAlterWert() {
		return (EAttribute)historienProtokollInformationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistorienProtokollInformationType_MetadatumNeuerWert() {
		return (EAttribute)historienProtokollInformationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistorienProtokollInformationType_Akteur() {
		return (EAttribute)historienProtokollInformationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistorienProtokollInformationType_DatumUhrzeit() {
		return (EAttribute)historienProtokollInformationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistorienProtokollInformationType_Bemerkung() {
		return (EAttribute)historienProtokollInformationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistorienProtokollInformationType_Aktion() {
		return (EAttribute)historienProtokollInformationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifikationNachrichtType() {
		return identifikationNachrichtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifikationObjektType() {
		return identifikationObjektTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifikationObjektType_XdomeaUUID() {
		return (EAttribute)identifikationObjektTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifikationObjektType_NummerImUebergeordnetenContainer() {
		return (EAttribute)identifikationObjektTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKommunikationType() {
		return kommunikationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKommunikationType_IstDienstlich() {
		return (EAttribute)kommunikationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKommunikationType_IstInstitution() {
		return (EAttribute)kommunikationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKompressionsverfahrenCodeType() {
		return kompressionsverfahrenCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKonfigurationsparameterCodeType() {
		return konfigurationsparameterCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKonfigurationsparameterGruppeCodeType() {
		return konfigurationsparameterGruppeCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKontaktType() {
		return kontaktTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_Behoerdenkennung() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_NameInstitution() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_NameOrganisationseinheit() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_NameAnsprechpartner() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKontaktType_Taetigkeit() {
		return (EAttribute)kontaktTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKontaktType_Zustaendigkeit() {
		return (EAttribute)kontaktTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_Anschrift() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_Erreichbarkeit() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKontaktType_Rolle() {
		return (EAttribute)kontaktTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_RolleCode() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_UnstrukturierteAnschrift() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_Geburt() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_AnwendungsspezifischeErweiterung() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKontaktType_AnwendungsspezifischeErweiterungXML() {
		return (EReference)kontaktTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKryptographischeAlgorithmenCodeType() {
		return kryptographischeAlgorithmenCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMediumCodeType() {
		return mediumCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtenkopfType() {
		return nachrichtenkopfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_IdentifikationNachricht() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_Leser() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_Autor() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtenkopfType_ProzessID() {
		return (EAttribute)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtenkopfType_InstanzID() {
		return (EAttribute)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtenkopfType_Hinweis() {
		return (EAttribute)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_AnwendungsspezifischeErweiterung() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfType_AnwendungsspezifischeErweiterungXML() {
		return (EReference)nachrichtenkopfTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtentypCodeType() {
		return nachrichtentypCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtType() {
		return nachrichtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtType_Nachrichtenkopf() {
		return (EReference)nachrichtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Produkt() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Produkthersteller() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Produktversion() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Standard() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Test() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtType_Version() {
		return (EAttribute)nachrichtTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameNatuerlichePersonType() {
		return nameNatuerlichePersonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameNatuerlichePersonType_Anrede() {
		return (EAttribute)nameNatuerlichePersonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameNatuerlichePersonType_Titel() {
		return (EAttribute)nameNatuerlichePersonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonType_Familienname() {
		return (EReference)nameNatuerlichePersonTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameNatuerlichePersonType_Vorname() {
		return (EReference)nameNatuerlichePersonTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameOrganisationType() {
		return nameOrganisationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameOrganisationType_Name() {
		return (EAttribute)nameOrganisationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameOrganisationType_Kurzbezeichnung() {
		return (EAttribute)nameOrganisationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNkFVDatenType() {
		return nkFVDatenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNkFVDatenType_EmpfangendesSystem() {
		return (EReference)nkFVDatenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType() {
		return nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung() {
		return (EAttribute)nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType() {
		return nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung() {
		return (EAttribute)nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNkNichtFVDatenWeitereLeserType() {
		return nkNichtFVDatenWeitereLeserTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNkNichtFVDatenWeitereLeserType_WeitererLeser() {
		return (EReference)nkNichtFVDatenWeitereLeserTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganisationseinheitType() {
		return organisationseinheitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganisationseinheitType_Name() {
		return (EAttribute)organisationseinheitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPfadelementType() {
		return pfadelementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPfadelementType_Name() {
		return (EAttribute)pfadelementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPfadelementType_Typ() {
		return (EReference)pfadelementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPfadelementType_Pfadelement() {
		return (EReference)pfadelementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimaerdokumentType() {
		return primaerdokumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaerdokumentType_Dateiname() {
		return (EAttribute)primaerdokumentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaerdokumentType_DateinameOriginal() {
		return (EAttribute)primaerdokumentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaerdokumentType_Ersteller() {
		return (EAttribute)primaerdokumentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaerdokumentType_DatumUhrzeit() {
		return (EAttribute)primaerdokumentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimaerdokumentType_SignaturSiegel() {
		return (EReference)primaerdokumentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaerdokumentType_ZeitpunktLetzteAenderung() {
		return (EAttribute)primaerdokumentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimaerdokumentType_Hash() {
		return (EReference)primaerdokumentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRolleCodeType() {
		return rolleCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchriftgutobjekttypCodeType() {
		return schriftgutobjekttypCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignaturSiegelType() {
		return signaturSiegelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignaturSiegelType_SignaturSiegelEingebettet() {
		return (EAttribute)signaturSiegelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignaturSiegelType_SignaturSiegelDatei() {
		return (EAttribute)signaturSiegelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstigeFehlermeldungCodeType() {
		return sonstigeFehlermeldungCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0601CodeType() {
		return spezifischeFehlermeldung0601CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0602CodeType() {
		return spezifischeFehlermeldung0602CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0603CodeType() {
		return spezifischeFehlermeldung0603CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0604CodeType() {
		return spezifischeFehlermeldung0604CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0605CodeType() {
		return spezifischeFehlermeldung0605CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0606CodeType() {
		return spezifischeFehlermeldung0606CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0607CodeType() {
		return spezifischeFehlermeldung0607CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0608CodeType() {
		return spezifischeFehlermeldung0608CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0609CodeType() {
		return spezifischeFehlermeldung0609CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0610CodeType() {
		return spezifischeFehlermeldung0610CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0611CodeType() {
		return spezifischeFehlermeldung0611CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0612CodeType() {
		return spezifischeFehlermeldung0612CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0613CodeType() {
		return spezifischeFehlermeldung0613CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0614CodeType() {
		return spezifischeFehlermeldung0614CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0615CodeType() {
		return spezifischeFehlermeldung0615CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0616CodeType() {
		return spezifischeFehlermeldung0616CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0617CodeType() {
		return spezifischeFehlermeldung0617CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0618CodeType() {
		return spezifischeFehlermeldung0618CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0619CodeType() {
		return spezifischeFehlermeldung0619CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0620CodeType() {
		return spezifischeFehlermeldung0620CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0621CodeType() {
		return spezifischeFehlermeldung0621CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0622CodeType() {
		return spezifischeFehlermeldung0622CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0623CodeType() {
		return spezifischeFehlermeldung0623CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0624CodeType() {
		return spezifischeFehlermeldung0624CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0625CodeType() {
		return spezifischeFehlermeldung0625CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0626CodeType() {
		return spezifischeFehlermeldung0626CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0627CodeType() {
		return spezifischeFehlermeldung0627CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0628CodeType() {
		return spezifischeFehlermeldung0628CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0631CodeType() {
		return spezifischeFehlermeldung0631CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpezifischeFehlermeldung0632CodeType() {
		return spezifischeFehlermeldung0632CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaatCodeType() {
		return staatCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaatType() {
		return staatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaatType_Staat() {
		return (EReference)staatTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrukturelementTypCodeType() {
		return strukturelementTypCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrukturpfadType() {
		return strukturpfadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrukturpfadType_Pfadelement() {
		return (EReference)strukturpfadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemType() {
		return systemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemType_InstanzID() {
		return (EAttribute)systemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemType_Produktname() {
		return (EAttribute)systemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemType_Produktversion() {
		return (EAttribute)systemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemType_Produkthersteller() {
		return (EAttribute)systemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportwegCodeType() {
		return transportwegCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnstrukturierteAnschriftType() {
		return unstrukturierteAnschriftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnstrukturierteAnschriftType_Typ() {
		return (EReference)unstrukturierteAnschriftTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstrukturierteAnschriftType_Zeile1() {
		return (EAttribute)unstrukturierteAnschriftTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstrukturierteAnschriftType_Zeile2() {
		return (EAttribute)unstrukturierteAnschriftTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstrukturierteAnschriftType_Zeile3() {
		return (EAttribute)unstrukturierteAnschriftTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstrukturierteAnschriftType_Zeile4() {
		return (EAttribute)unstrukturierteAnschriftTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstrukturierteAnschriftType_Zeile5() {
		return (EAttribute)unstrukturierteAnschriftTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstrukturierteAnschriftType_Zeile6() {
		return (EAttribute)unstrukturierteAnschriftTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnstrukturierteAnschriftType_Zusatz() {
		return (EAttribute)unstrukturierteAnschriftTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerfuegungType() {
		return verfuegungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerfuegungType_Ersteller() {
		return (EReference)verfuegungTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerfuegungType_Adressat() {
		return (EReference)verfuegungTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerfuegungType_Erstellungsdatum() {
		return (EAttribute)verfuegungTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerfuegungType_Erstellungsuhrzeit() {
		return (EAttribute)verfuegungTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerfuegungType_Verfuegung() {
		return (EAttribute)verfuegungTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerfuegungType_TerminDatum() {
		return (EAttribute)verfuegungTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerfuegungType_TerminUhrzeit() {
		return (EAttribute)verfuegungTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerfuegungType_Notiz() {
		return (EAttribute)verfuegungTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionType() {
		return versionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionType_Nummer() {
		return (EAttribute)versionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersionType_Format() {
		return (EReference)versionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerweisType() {
		return verweisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerweisType_XdomeaUUID() {
		return (EAttribute)verweisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerweisType_SGOTyp() {
		return (EReference)verweisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerweisType_SGOKennzeichen() {
		return (EAttribute)verweisTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerweisType_Bemerkung() {
		return (EAttribute)verweisTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVorgangType() {
		return vorgangTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_Identifikation() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_AllgemeineMetadaten() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_Aussonderungsmetadaten() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorgangType_Aktenbetreff() {
		return (EAttribute)vorgangTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorgangType_Typ() {
		return (EAttribute)vorgangTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorgangType_ZdA() {
		return (EAttribute)vorgangTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorgangType_ZdADatum() {
		return (EAttribute)vorgangTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_Laufzeit() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_HistorienProtokollInformation() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_InternerGeschaeftsgang() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_DokumentOderDokumentMitSchriftstueck() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_Verweis() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_Kontakt() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_Teilvorgang() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_AnwendungsspezifischeErweiterung() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVorgangType_AnwendungsspezifischeErweiterungXML() {
		return (EReference)vorgangTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZeitraumType() {
		return zeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZeitraumType_Beginn() {
		return (EAttribute)zeitraumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZeitraumType_Ende() {
		return (EAttribute)zeitraumTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStringDateinameType() {
		return stringDateinameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomeaFactory getDomeaFactory() {
		return (DomeaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		akteninhaltTypeEClass = createEClass(AKTENINHALT_TYPE);
		createEReference(akteninhaltTypeEClass, AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK);
		createEReference(akteninhaltTypeEClass, AKTENINHALT_TYPE__VORGANG);
		createEReference(akteninhaltTypeEClass, AKTENINHALT_TYPE__TEILAKTE);

		aktenplaneinheitAktenplanTypeEClass = createEClass(AKTENPLANEINHEIT_AKTENPLAN_TYPE);
		createEReference(aktenplaneinheitAktenplanTypeEClass, AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART);
		createEReference(aktenplaneinheitAktenplanTypeEClass, AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT);
		createEAttribute(aktenplaneinheitAktenplanTypeEClass, AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT);
		createEReference(aktenplaneinheitAktenplanTypeEClass, AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER);
		createEReference(aktenplaneinheitAktenplanTypeEClass, AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT);
		createEAttribute(aktenplaneinheitAktenplanTypeEClass, AKTENPLANEINHEIT_AKTENPLAN_TYPE__VERWEIS_AKTENPLANEINHEIT);
		createEReference(aktenplaneinheitAktenplanTypeEClass, AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		createEReference(aktenplaneinheitAktenplanTypeEClass, AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML);

		aktenplaneinheitTypeEClass = createEClass(AKTENPLANEINHEIT_TYPE);
		createEAttribute(aktenplaneinheitTypeEClass, AKTENPLANEINHEIT_TYPE__KENNZEICHEN);
		createEAttribute(aktenplaneinheitTypeEClass, AKTENPLANEINHEIT_TYPE__INHALTSANGABE);
		createEAttribute(aktenplaneinheitTypeEClass, AKTENPLANEINHEIT_TYPE__BETREFF_KURZ);

		aktenplanTypeEClass = createEClass(AKTENPLAN_TYPE);
		createEAttribute(aktenplanTypeEClass, AKTENPLAN_TYPE__BEZEICHNUNG);
		createEAttribute(aktenplanTypeEClass, AKTENPLAN_TYPE__TYP);
		createEAttribute(aktenplanTypeEClass, AKTENPLAN_TYPE__VERSION);
		createEReference(aktenplanTypeEClass, AKTENPLAN_TYPE__EINHEIT);
		createEReference(aktenplanTypeEClass, AKTENPLAN_TYPE__GUELTIGKEIT);
		createEReference(aktenplanTypeEClass, AKTENPLAN_TYPE__AKTENPLANDATEI);

		akteTypeEClass = createEClass(AKTE_TYPE);
		createEReference(akteTypeEClass, AKTE_TYPE__IDENTIFIKATION);
		createEReference(akteTypeEClass, AKTE_TYPE__ALLGEMEINE_METADATEN);
		createEReference(akteTypeEClass, AKTE_TYPE__AUSSONDERUNGSMETADATEN);
		createEAttribute(akteTypeEClass, AKTE_TYPE__STANDORT);
		createEAttribute(akteTypeEClass, AKTE_TYPE__TYP);
		createEReference(akteTypeEClass, AKTE_TYPE__LAUFZEIT);
		createEReference(akteTypeEClass, AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION);
		createEReference(akteTypeEClass, AKTE_TYPE__INTERNER_GESCHAEFTSGANG);
		createEReference(akteTypeEClass, AKTE_TYPE__AKTENINHALT);
		createEReference(akteTypeEClass, AKTE_TYPE__VERWEIS);
		createEReference(akteTypeEClass, AKTE_TYPE__KONTAKT);
		createEAttribute(akteTypeEClass, AKTE_TYPE__ZD_A);
		createEAttribute(akteTypeEClass, AKTE_TYPE__ZD_ADATUM);
		createEReference(akteTypeEClass, AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		createEReference(akteTypeEClass, AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML);

		allgemeineMetadatenTypeEClass = createEClass(ALLGEMEINE_METADATEN_TYPE);
		createEAttribute(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__BETREFF);
		createEAttribute(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__KENNZEICHEN);
		createEAttribute(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__FEDERFUEHRUNG);
		createEAttribute(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__AKTENFUEHRUNG);
		createEReference(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG);
		createEAttribute(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__BEMERKUNG);
		createEReference(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__MEDIUM);
		createEReference(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT);
		createEAttribute(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__ZEITPUNKT_LETZTE_AENDERUNG);
		createEReference(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD);
		createEAttribute(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE);
		createEReference(allgemeineMetadatenTypeEClass, ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE);

		allgemeinerNameTypeEClass = createEClass(ALLGEMEINER_NAME_TYPE);
		createEAttribute(allgemeinerNameTypeEClass, ALLGEMEINER_NAME_TYPE__NAME);

		allgemeineRueckmeldungCodeTypeEClass = createEClass(ALLGEMEINE_RUECKMELDUNG_CODE_TYPE);

		anlageDokumentTypeEClass = createEClass(ANLAGE_DOKUMENT_TYPE);
		createEAttribute(anlageDokumentTypeEClass, ANLAGE_DOKUMENT_TYPE__NUMMER);

		anschriftstypCodeTypeEClass = createEClass(ANSCHRIFTSTYP_CODE_TYPE);

		anschriftTypeEClass = createEClass(ANSCHRIFT_TYPE);
		createEReference(anschriftTypeEClass, ANSCHRIFT_TYPE__STAAT);
		createEAttribute(anschriftTypeEClass, ANSCHRIFT_TYPE__STRASSE);
		createEAttribute(anschriftTypeEClass, ANSCHRIFT_TYPE__HAUSNUMMER);
		createEAttribute(anschriftTypeEClass, ANSCHRIFT_TYPE__POSTFACH);
		createEAttribute(anschriftTypeEClass, ANSCHRIFT_TYPE__POSTLEITZAHL);
		createEAttribute(anschriftTypeEClass, ANSCHRIFT_TYPE__ORT);
		createEAttribute(anschriftTypeEClass, ANSCHRIFT_TYPE__ZUSATZ);
		createEReference(anschriftTypeEClass, ANSCHRIFT_TYPE__TYP);

		anwendungsspezifischeErweiterungTypeEClass = createEClass(ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE);
		createEAttribute(anwendungsspezifischeErweiterungTypeEClass, ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__KENNUNG);
		createEAttribute(anwendungsspezifischeErweiterungTypeEClass, ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__NAME);
		createEAttribute(anwendungsspezifischeErweiterungTypeEClass, ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__BESCHREIBUNG);
		createEAttribute(anwendungsspezifischeErweiterungTypeEClass, ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSNUMMER);
		createEAttribute(anwendungsspezifischeErweiterungTypeEClass, ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSDATUM);
		createEReference(anwendungsspezifischeErweiterungTypeEClass, ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE);
		createEReference(anwendungsspezifischeErweiterungTypeEClass, ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD);

		anwendungsspezifischeErweiterungXMLTypeEClass = createEClass(ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE);
		createEAttribute(anwendungsspezifischeErweiterungXMLTypeEClass, ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE__ANY);

		aufbewahrungsdauerTypeEClass = createEClass(AUFBEWAHRUNGSDAUER_TYPE);
		createEAttribute(aufbewahrungsdauerTypeEClass, AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE);
		createEAttribute(aufbewahrungsdauerTypeEClass, AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET);

		aussonderungsartCodeTypeEClass = createEClass(AUSSONDERUNGSART_CODE_TYPE);

		aussonderungsartTypeEClass = createEClass(AUSSONDERUNGSART_TYPE);
		createEReference(aussonderungsartTypeEClass, AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART);
		createEAttribute(aussonderungsartTypeEClass, AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART_KONFIGURIERBAR);

		aussonderungsmetadatenTypeEClass = createEClass(AUSSONDERUNGSMETADATEN_TYPE);
		createEReference(aussonderungsmetadatenTypeEClass, AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER);
		createEReference(aussonderungsmetadatenTypeEClass, AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART);
		createEAttribute(aussonderungsmetadatenTypeEClass, AUSSONDERUNGSMETADATEN_TYPE__KENNUNG);
		createEReference(aussonderungsmetadatenTypeEClass, AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG);
		createEAttribute(aussonderungsmetadatenTypeEClass, AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG_BEGRUENDUNG);
		createEAttribute(aussonderungsmetadatenTypeEClass, AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSENDE);
		createEAttribute(aussonderungsmetadatenTypeEClass, AUSSONDERUNGSMETADATEN_TYPE__TRANSFERFRISTENDE);

		bearbeitungTypeEClass = createEClass(BEARBEITUNG_TYPE);
		createEReference(bearbeitungTypeEClass, BEARBEITUNG_TYPE__BEARBEITER);
		createEAttribute(bearbeitungTypeEClass, BEARBEITUNG_TYPE__DATUM);
		createEAttribute(bearbeitungTypeEClass, BEARBEITUNG_TYPE__UHRZEIT);
		createEAttribute(bearbeitungTypeEClass, BEARBEITUNG_TYPE__VERMERK);
		createEAttribute(bearbeitungTypeEClass, BEARBEITUNG_TYPE__NOTIZ);
		createEReference(bearbeitungTypeEClass, BEARBEITUNG_TYPE__ANLAGE);

		behoerdeTypeEClass = createEClass(BEHOERDE_TYPE);
		createEReference(behoerdeTypeEClass, BEHOERDE_TYPE__VERZEICHNISDIENST);
		createEAttribute(behoerdeTypeEClass, BEHOERDE_TYPE__KENNUNG);

		beteiligungsschrittTypeEClass = createEClass(BETEILIGUNGSSCHRITT_TYPE);
		createEAttribute(beteiligungsschrittTypeEClass, BETEILIGUNGSSCHRITT_TYPE__NUMMER);
		createEReference(beteiligungsschrittTypeEClass, BETEILIGUNGSSCHRITT_TYPE__STATUS);
		createEReference(beteiligungsschrittTypeEClass, BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG);
		createEReference(beteiligungsschrittTypeEClass, BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG);
		createEAttribute(beteiligungsschrittTypeEClass, BETEILIGUNGSSCHRITT_TYPE__PARALLEL_ZU_BETEILIGUNGSSCHRITT);
		createEAttribute(beteiligungsschrittTypeEClass, BETEILIGUNGSSCHRITT_TYPE__VERSION_NUMMER);

		beteiligungsstatusCodeTypeEClass = createEClass(BETEILIGUNGSSTATUS_CODE_TYPE);

		bewertungsvorschlagCodeTypeEClass = createEClass(BEWERTUNGSVORSCHLAG_CODE_TYPE);

		dateiformatCodeTypeEClass = createEClass(DATEIFORMAT_CODE_TYPE);

		datenaustauschartCodeTypeEClass = createEClass(DATENAUSTAUSCHART_CODE_TYPE);

		datenschutzstufeCodeTypeEClass = createEClass(DATENSCHUTZSTUFE_CODE_TYPE);

		datentypCodeTypeEClass = createEClass(DATENTYP_CODE_TYPE);

		dokumentMitSchriftstueckTypeEClass = createEClass(DOKUMENT_MIT_SCHRIFTSTUECK_TYPE);
		createEReference(dokumentMitSchriftstueckTypeEClass, DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK);

		dokumentOderDokumentMitSchriftstueckTypeEClass = createEClass(DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE);
		createEReference(dokumentOderDokumentMitSchriftstueckTypeEClass, DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT);
		createEReference(dokumentOderDokumentMitSchriftstueckTypeEClass, DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK);

		dokumentSchriftstueckBasisTypeEClass = createEClass(DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN);
		createEAttribute(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN);
		createEAttribute(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM);
		createEAttribute(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM);
		createEAttribute(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS);
		createEAttribute(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG);
		createEAttribute(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER);
		createEAttribute(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER);
		createEAttribute(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		createEReference(dokumentSchriftstueckBasisTypeEClass, DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML);

		dokumentTypeEClass = createEClass(DOKUMENT_TYPE);
		createEReference(dokumentTypeEClass, DOKUMENT_TYPE__VERSION);

		erfolgOderMisserfolgImportTypeEClass = createEClass(ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE);
		createEAttribute(erfolgOderMisserfolgImportTypeEClass, ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH);
		createEAttribute(erfolgOderMisserfolgImportTypeEClass, ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG);
		createEReference(erfolgOderMisserfolgImportTypeEClass, ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE);

		feldgruppeTypeEClass = createEClass(FELDGRUPPE_TYPE);
		createEAttribute(feldgruppeTypeEClass, FELDGRUPPE_TYPE__NAME);
		createEAttribute(feldgruppeTypeEClass, FELDGRUPPE_TYPE__BESCHREIBUNG);
		createEReference(feldgruppeTypeEClass, FELDGRUPPE_TYPE__UNTERFELDGRUPPE);
		createEReference(feldgruppeTypeEClass, FELDGRUPPE_TYPE__FELD);

		feldTypeEClass = createEClass(FELD_TYPE);
		createEAttribute(feldTypeEClass, FELD_TYPE__NAME);
		createEAttribute(feldTypeEClass, FELD_TYPE__BESCHREIBUNG);
		createEReference(feldTypeEClass, FELD_TYPE__DATENTYP);
		createEAttribute(feldTypeEClass, FELD_TYPE__WERT);

		formatTypeEClass = createEClass(FORMAT_TYPE);
		createEReference(formatTypeEClass, FORMAT_TYPE__NAME);
		createEAttribute(formatTypeEClass, FORMAT_TYPE__SONSTIGER_NAME);
		createEAttribute(formatTypeEClass, FORMAT_TYPE__VERSION);
		createEReference(formatTypeEClass, FORMAT_TYPE__PRIMAERDOKUMENT);

		geburtTypeEClass = createEClass(GEBURT_TYPE);
		createEAttribute(geburtTypeEClass, GEBURT_TYPE__DATUM);

		geheimhaltungsgradCodeTypeEClass = createEClass(GEHEIMHALTUNGSGRAD_CODE_TYPE);

		geheimhaltungTypeEClass = createEClass(GEHEIMHALTUNG_TYPE);
		createEReference(geheimhaltungTypeEClass, GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD);
		createEAttribute(geheimhaltungTypeEClass, GEHEIMHALTUNG_TYPE__EINSTUFUNGSFRIST);
		createEAttribute(geheimhaltungTypeEClass, GEHEIMHALTUNG_TYPE__EINGESTUFT_AM);
		createEAttribute(geheimhaltungTypeEClass, GEHEIMHALTUNG_TYPE__HERAUSGEBER);
		createEAttribute(geheimhaltungTypeEClass, GEHEIMHALTUNG_TYPE__EINSTUFUNG_ENDET_AM);
		createEAttribute(geheimhaltungTypeEClass, GEHEIMHALTUNG_TYPE__BEMERKUNG);

		geschaeftsgangTypeEClass = createEClass(GESCHAEFTSGANG_TYPE);
		createEReference(geschaeftsgangTypeEClass, GESCHAEFTSGANG_TYPE__IDENTIFIKATION);
		createEReference(geschaeftsgangTypeEClass, GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT);

		hashTypeEClass = createEClass(HASH_TYPE);
		createEAttribute(hashTypeEClass, HASH_TYPE__WERT);
		createEReference(hashTypeEClass, HASH_TYPE__ALGORITHMUS);
		createEAttribute(hashTypeEClass, HASH_TYPE__SONSTIGER_ALGORITHMUS);

		historienProtokollInformationTypeEClass = createEClass(HISTORIEN_PROTOKOLL_INFORMATION_TYPE);
		createEAttribute(historienProtokollInformationTypeEClass, HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NAME);
		createEAttribute(historienProtokollInformationTypeEClass, HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_ALTER_WERT);
		createEAttribute(historienProtokollInformationTypeEClass, HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NEUER_WERT);
		createEAttribute(historienProtokollInformationTypeEClass, HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTEUR);
		createEAttribute(historienProtokollInformationTypeEClass, HISTORIEN_PROTOKOLL_INFORMATION_TYPE__DATUM_UHRZEIT);
		createEAttribute(historienProtokollInformationTypeEClass, HISTORIEN_PROTOKOLL_INFORMATION_TYPE__BEMERKUNG);
		createEAttribute(historienProtokollInformationTypeEClass, HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTION);

		identifikationNachrichtTypeEClass = createEClass(IDENTIFIKATION_NACHRICHT_TYPE);

		identifikationObjektTypeEClass = createEClass(IDENTIFIKATION_OBJEKT_TYPE);
		createEAttribute(identifikationObjektTypeEClass, IDENTIFIKATION_OBJEKT_TYPE__XDOMEA_UUID);
		createEAttribute(identifikationObjektTypeEClass, IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER);

		kommunikationTypeEClass = createEClass(KOMMUNIKATION_TYPE);
		createEAttribute(kommunikationTypeEClass, KOMMUNIKATION_TYPE__IST_DIENSTLICH);
		createEAttribute(kommunikationTypeEClass, KOMMUNIKATION_TYPE__IST_INSTITUTION);

		kompressionsverfahrenCodeTypeEClass = createEClass(KOMPRESSIONSVERFAHREN_CODE_TYPE);

		konfigurationsparameterCodeTypeEClass = createEClass(KONFIGURATIONSPARAMETER_CODE_TYPE);

		konfigurationsparameterGruppeCodeTypeEClass = createEClass(KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE);

		kontaktTypeEClass = createEClass(KONTAKT_TYPE);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__BEHOERDENKENNUNG);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__NAME_INSTITUTION);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__NAME_ANSPRECHPARTNER);
		createEAttribute(kontaktTypeEClass, KONTAKT_TYPE__TAETIGKEIT);
		createEAttribute(kontaktTypeEClass, KONTAKT_TYPE__ZUSTAENDIGKEIT);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__ANSCHRIFT);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__ERREICHBARKEIT);
		createEAttribute(kontaktTypeEClass, KONTAKT_TYPE__ROLLE);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__ROLLE_CODE);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__GEBURT);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		createEReference(kontaktTypeEClass, KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML);

		kryptographischeAlgorithmenCodeTypeEClass = createEClass(KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE);

		mediumCodeTypeEClass = createEClass(MEDIUM_CODE_TYPE);

		nachrichtenkopfTypeEClass = createEClass(NACHRICHTENKOPF_TYPE);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__LESER);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__AUTOR);
		createEAttribute(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__PROZESS_ID);
		createEAttribute(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__INSTANZ_ID);
		createEAttribute(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__HINWEIS);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		createEReference(nachrichtenkopfTypeEClass, NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML);

		nachrichtentypCodeTypeEClass = createEClass(NACHRICHTENTYP_CODE_TYPE);

		nachrichtTypeEClass = createEClass(NACHRICHT_TYPE);
		createEReference(nachrichtTypeEClass, NACHRICHT_TYPE__NACHRICHTENKOPF);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__PRODUKT);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__PRODUKTHERSTELLER);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__PRODUKTVERSION);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__STANDARD);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__TEST);
		createEAttribute(nachrichtTypeEClass, NACHRICHT_TYPE__VERSION);

		nameNatuerlichePersonTypeEClass = createEClass(NAME_NATUERLICHE_PERSON_TYPE);
		createEAttribute(nameNatuerlichePersonTypeEClass, NAME_NATUERLICHE_PERSON_TYPE__ANREDE);
		createEAttribute(nameNatuerlichePersonTypeEClass, NAME_NATUERLICHE_PERSON_TYPE__TITEL);
		createEReference(nameNatuerlichePersonTypeEClass, NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME);
		createEReference(nameNatuerlichePersonTypeEClass, NAME_NATUERLICHE_PERSON_TYPE__VORNAME);

		nameOrganisationTypeEClass = createEClass(NAME_ORGANISATION_TYPE);
		createEAttribute(nameOrganisationTypeEClass, NAME_ORGANISATION_TYPE__NAME);
		createEAttribute(nameOrganisationTypeEClass, NAME_ORGANISATION_TYPE__KURZBEZEICHNUNG);

		nkFVDatenTypeEClass = createEClass(NK_FV_DATEN_TYPE);
		createEReference(nkFVDatenTypeEClass, NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM);

		nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass = createEClass(NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE);
		createEAttribute(nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass, NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG);

		nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass = createEClass(NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE);
		createEAttribute(nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass, NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG);

		nkNichtFVDatenWeitereLeserTypeEClass = createEClass(NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE);
		createEReference(nkNichtFVDatenWeitereLeserTypeEClass, NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER);

		organisationseinheitTypeEClass = createEClass(ORGANISATIONSEINHEIT_TYPE);
		createEAttribute(organisationseinheitTypeEClass, ORGANISATIONSEINHEIT_TYPE__NAME);

		pfadelementTypeEClass = createEClass(PFADELEMENT_TYPE);
		createEAttribute(pfadelementTypeEClass, PFADELEMENT_TYPE__NAME);
		createEReference(pfadelementTypeEClass, PFADELEMENT_TYPE__TYP);
		createEReference(pfadelementTypeEClass, PFADELEMENT_TYPE__PFADELEMENT);

		primaerdokumentTypeEClass = createEClass(PRIMAERDOKUMENT_TYPE);
		createEAttribute(primaerdokumentTypeEClass, PRIMAERDOKUMENT_TYPE__DATEINAME);
		createEAttribute(primaerdokumentTypeEClass, PRIMAERDOKUMENT_TYPE__DATEINAME_ORIGINAL);
		createEAttribute(primaerdokumentTypeEClass, PRIMAERDOKUMENT_TYPE__ERSTELLER);
		createEAttribute(primaerdokumentTypeEClass, PRIMAERDOKUMENT_TYPE__DATUM_UHRZEIT);
		createEReference(primaerdokumentTypeEClass, PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL);
		createEAttribute(primaerdokumentTypeEClass, PRIMAERDOKUMENT_TYPE__ZEITPUNKT_LETZTE_AENDERUNG);
		createEReference(primaerdokumentTypeEClass, PRIMAERDOKUMENT_TYPE__HASH);

		rolleCodeTypeEClass = createEClass(ROLLE_CODE_TYPE);

		schriftgutobjekttypCodeTypeEClass = createEClass(SCHRIFTGUTOBJEKTTYP_CODE_TYPE);

		signaturSiegelTypeEClass = createEClass(SIGNATUR_SIEGEL_TYPE);
		createEAttribute(signaturSiegelTypeEClass, SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET);
		createEAttribute(signaturSiegelTypeEClass, SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_DATEI);

		sonstigeFehlermeldungCodeTypeEClass = createEClass(SONSTIGE_FEHLERMELDUNG_CODE_TYPE);

		spezifischeFehlermeldung0601CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE);

		spezifischeFehlermeldung0602CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE);

		spezifischeFehlermeldung0603CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE);

		spezifischeFehlermeldung0604CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE);

		spezifischeFehlermeldung0605CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE);

		spezifischeFehlermeldung0606CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE);

		spezifischeFehlermeldung0607CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE);

		spezifischeFehlermeldung0608CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE);

		spezifischeFehlermeldung0609CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE);

		spezifischeFehlermeldung0610CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE);

		spezifischeFehlermeldung0611CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE);

		spezifischeFehlermeldung0612CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE);

		spezifischeFehlermeldung0613CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE);

		spezifischeFehlermeldung0614CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE);

		spezifischeFehlermeldung0615CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE);

		spezifischeFehlermeldung0616CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE);

		spezifischeFehlermeldung0617CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE);

		spezifischeFehlermeldung0618CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE);

		spezifischeFehlermeldung0619CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE);

		spezifischeFehlermeldung0620CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE);

		spezifischeFehlermeldung0621CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE);

		spezifischeFehlermeldung0622CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE);

		spezifischeFehlermeldung0623CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE);

		spezifischeFehlermeldung0624CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE);

		spezifischeFehlermeldung0625CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE);

		spezifischeFehlermeldung0626CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE);

		spezifischeFehlermeldung0627CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE);

		spezifischeFehlermeldung0628CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE);

		spezifischeFehlermeldung0631CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE);

		spezifischeFehlermeldung0632CodeTypeEClass = createEClass(SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE);

		staatCodeTypeEClass = createEClass(STAAT_CODE_TYPE);

		staatTypeEClass = createEClass(STAAT_TYPE);
		createEReference(staatTypeEClass, STAAT_TYPE__STAAT);

		strukturelementTypCodeTypeEClass = createEClass(STRUKTURELEMENT_TYP_CODE_TYPE);

		strukturpfadTypeEClass = createEClass(STRUKTURPFAD_TYPE);
		createEReference(strukturpfadTypeEClass, STRUKTURPFAD_TYPE__PFADELEMENT);

		systemTypeEClass = createEClass(SYSTEM_TYPE);
		createEAttribute(systemTypeEClass, SYSTEM_TYPE__INSTANZ_ID);
		createEAttribute(systemTypeEClass, SYSTEM_TYPE__PRODUKTNAME);
		createEAttribute(systemTypeEClass, SYSTEM_TYPE__PRODUKTVERSION);
		createEAttribute(systemTypeEClass, SYSTEM_TYPE__PRODUKTHERSTELLER);

		transportwegCodeTypeEClass = createEClass(TRANSPORTWEG_CODE_TYPE);

		unstrukturierteAnschriftTypeEClass = createEClass(UNSTRUKTURIERTE_ANSCHRIFT_TYPE);
		createEReference(unstrukturierteAnschriftTypeEClass, UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP);
		createEAttribute(unstrukturierteAnschriftTypeEClass, UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE1);
		createEAttribute(unstrukturierteAnschriftTypeEClass, UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE2);
		createEAttribute(unstrukturierteAnschriftTypeEClass, UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE3);
		createEAttribute(unstrukturierteAnschriftTypeEClass, UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE4);
		createEAttribute(unstrukturierteAnschriftTypeEClass, UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE5);
		createEAttribute(unstrukturierteAnschriftTypeEClass, UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE6);
		createEAttribute(unstrukturierteAnschriftTypeEClass, UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZUSATZ);

		verfuegungTypeEClass = createEClass(VERFUEGUNG_TYPE);
		createEReference(verfuegungTypeEClass, VERFUEGUNG_TYPE__ERSTELLER);
		createEReference(verfuegungTypeEClass, VERFUEGUNG_TYPE__ADRESSAT);
		createEAttribute(verfuegungTypeEClass, VERFUEGUNG_TYPE__ERSTELLUNGSDATUM);
		createEAttribute(verfuegungTypeEClass, VERFUEGUNG_TYPE__ERSTELLUNGSUHRZEIT);
		createEAttribute(verfuegungTypeEClass, VERFUEGUNG_TYPE__VERFUEGUNG);
		createEAttribute(verfuegungTypeEClass, VERFUEGUNG_TYPE__TERMIN_DATUM);
		createEAttribute(verfuegungTypeEClass, VERFUEGUNG_TYPE__TERMIN_UHRZEIT);
		createEAttribute(verfuegungTypeEClass, VERFUEGUNG_TYPE__NOTIZ);

		versionTypeEClass = createEClass(VERSION_TYPE);
		createEAttribute(versionTypeEClass, VERSION_TYPE__NUMMER);
		createEReference(versionTypeEClass, VERSION_TYPE__FORMAT);

		verweisTypeEClass = createEClass(VERWEIS_TYPE);
		createEAttribute(verweisTypeEClass, VERWEIS_TYPE__XDOMEA_UUID);
		createEReference(verweisTypeEClass, VERWEIS_TYPE__SGO_TYP);
		createEAttribute(verweisTypeEClass, VERWEIS_TYPE__SGO_KENNZEICHEN);
		createEAttribute(verweisTypeEClass, VERWEIS_TYPE__BEMERKUNG);

		vorgangTypeEClass = createEClass(VORGANG_TYPE);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__IDENTIFIKATION);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__ALLGEMEINE_METADATEN);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__AUSSONDERUNGSMETADATEN);
		createEAttribute(vorgangTypeEClass, VORGANG_TYPE__AKTENBETREFF);
		createEAttribute(vorgangTypeEClass, VORGANG_TYPE__TYP);
		createEAttribute(vorgangTypeEClass, VORGANG_TYPE__ZD_A);
		createEAttribute(vorgangTypeEClass, VORGANG_TYPE__ZD_ADATUM);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__LAUFZEIT);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__HISTORIEN_PROTOKOLL_INFORMATION);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__INTERNER_GESCHAEFTSGANG);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__VERWEIS);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__KONTAKT);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__TEILVORGANG);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		createEReference(vorgangTypeEClass, VORGANG_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML);

		zeitraumTypeEClass = createEClass(ZEITRAUM_TYPE);
		createEAttribute(zeitraumTypeEClass, ZEITRAUM_TYPE__BEGINN);
		createEAttribute(zeitraumTypeEClass, ZEITRAUM_TYPE__ENDE);

		// Create data types
		stringDateinameTypeEDataType = createEDataType(STRING_DATEINAME_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);
		BasisnachrichtPackage theBasisnachrichtPackage = (BasisnachrichtPackage)EPackage.Registry.INSTANCE.getEPackage(BasisnachrichtPackage.eNS_URI);
		DIN913792204Package theDIN913792204Package = (DIN913792204Package)EPackage.Registry.INSTANCE.getEPackage(DIN913792204Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aktenplaneinheitAktenplanTypeEClass.getESuperTypes().add(this.getAktenplaneinheitType());
		allgemeineRueckmeldungCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		anlageDokumentTypeEClass.getESuperTypes().add(this.getDokumentOderDokumentMitSchriftstueckType());
		anschriftstypCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		aussonderungsartCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		beteiligungsstatusCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		bewertungsvorschlagCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		dateiformatCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		datenaustauschartCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		datenschutzstufeCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		datentypCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		dokumentMitSchriftstueckTypeEClass.getESuperTypes().add(this.getDokumentSchriftstueckBasisType());
		dokumentTypeEClass.getESuperTypes().add(this.getDokumentSchriftstueckBasisType());
		geheimhaltungsgradCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		identifikationNachrichtTypeEClass.getESuperTypes().add(theBasisnachrichtPackage.getIdentifikationNachrichtType());
		kommunikationTypeEClass.getESuperTypes().add(theBasisnachrichtPackage.getKommunikationType());
		kompressionsverfahrenCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		konfigurationsparameterCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		konfigurationsparameterGruppeCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		kryptographischeAlgorithmenCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		mediumCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		nachrichtentypCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		nkFVDatenTypeEClass.getESuperTypes().add(this.getNachrichtType());
		nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass.getESuperTypes().add(this.getNachrichtType());
		nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass.getESuperTypes().add(this.getNkNichtFVDatenWeitereLeserType());
		nkNichtFVDatenWeitereLeserTypeEClass.getESuperTypes().add(this.getNachrichtType());
		rolleCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		schriftgutobjekttypCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		sonstigeFehlermeldungCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0601CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0602CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0603CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0604CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0605CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0606CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0607CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0608CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0609CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0610CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0611CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0612CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0613CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0614CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0615CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0616CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0617CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0618CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0619CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0620CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0621CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0622CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0623CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0624CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0625CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0626CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0627CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0628CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0631CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		spezifischeFehlermeldung0632CodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		staatCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		strukturelementTypCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());
		transportwegCodeTypeEClass.getESuperTypes().add(theCode10Package.getCode());

		// Initialize classes, features, and operations; add parameters
		initEClass(akteninhaltTypeEClass, AkteninhaltType.class, "AkteninhaltType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAkteninhaltType_DokumentOderDokumentMitSchriftstueck(), this.getDokumentOderDokumentMitSchriftstueckType(), null, "dokumentOderDokumentMitSchriftstueck", null, 0, -1, AkteninhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteninhaltType_Vorgang(), this.getVorgangType(), null, "vorgang", null, 0, -1, AkteninhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteninhaltType_Teilakte(), this.getAkteType(), null, "teilakte", null, 0, -1, AkteninhaltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aktenplaneinheitAktenplanTypeEClass, AktenplaneinheitAktenplanType.class, "AktenplaneinheitAktenplanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAktenplaneinheitAktenplanType_Aussonderungsart(), this.getAussonderungsartType(), null, "aussonderungsart", null, 1, 1, AktenplaneinheitAktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAktenplaneinheitAktenplanType_Gueltigkeit(), this.getZeitraumType(), null, "gueltigkeit", null, 0, 1, AktenplaneinheitAktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAktenplaneinheitAktenplanType_Stillgelegt(), theXMLTypePackage.getBoolean(), "stillgelegt", null, 1, 1, AktenplaneinheitAktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAktenplaneinheitAktenplanType_Aufbewahrungsdauer(), this.getAufbewahrungsdauerType(), null, "aufbewahrungsdauer", null, 1, 1, AktenplaneinheitAktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAktenplaneinheitAktenplanType_Einheit(), this.getAktenplaneinheitAktenplanType(), null, "einheit", null, 0, -1, AktenplaneinheitAktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAktenplaneinheitAktenplanType_VerweisAktenplaneinheit(), theXMLTypePackage.getString(), "verweisAktenplaneinheit", null, 0, -1, AktenplaneinheitAktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterung(), this.getAnwendungsspezifischeErweiterungType(), null, "anwendungsspezifischeErweiterung", null, 0, -1, AktenplaneinheitAktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterungXML(), this.getAnwendungsspezifischeErweiterungXMLType(), null, "anwendungsspezifischeErweiterungXML", null, 0, 1, AktenplaneinheitAktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aktenplaneinheitTypeEClass, AktenplaneinheitType.class, "AktenplaneinheitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAktenplaneinheitType_Kennzeichen(), theXMLTypePackage.getString(), "kennzeichen", null, 0, 1, AktenplaneinheitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAktenplaneinheitType_Inhaltsangabe(), theXMLTypePackage.getString(), "inhaltsangabe", null, 0, 1, AktenplaneinheitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAktenplaneinheitType_BetreffKurz(), theXMLTypePackage.getString(), "betreffKurz", null, 0, 1, AktenplaneinheitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aktenplanTypeEClass, AktenplanType.class, "AktenplanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAktenplanType_Bezeichnung(), theXMLTypePackage.getString(), "bezeichnung", null, 1, 1, AktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAktenplanType_Typ(), theXMLTypePackage.getString(), "typ", null, 0, 1, AktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAktenplanType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, AktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAktenplanType_Einheit(), this.getAktenplaneinheitAktenplanType(), null, "einheit", null, 0, -1, AktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAktenplanType_Gueltigkeit(), this.getZeitraumType(), null, "gueltigkeit", null, 0, 1, AktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAktenplanType_Aktenplandatei(), this.getFormatType(), null, "aktenplandatei", null, 0, -1, AktenplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(akteTypeEClass, AkteType.class, "AkteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAkteType_Identifikation(), this.getIdentifikationObjektType(), null, "identifikation", null, 1, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_AllgemeineMetadaten(), this.getAllgemeineMetadatenType(), null, "allgemeineMetadaten", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_Aussonderungsmetadaten(), this.getAussonderungsmetadatenType(), null, "aussonderungsmetadaten", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAkteType_Standort(), theXMLTypePackage.getString(), "standort", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAkteType_Typ(), theXMLTypePackage.getString(), "typ", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_Laufzeit(), this.getZeitraumType(), null, "laufzeit", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_HistorienProtokollInformation(), this.getHistorienProtokollInformationType(), null, "historienProtokollInformation", null, 0, -1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_InternerGeschaeftsgang(), this.getGeschaeftsgangType(), null, "internerGeschaeftsgang", null, 0, -1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_Akteninhalt(), this.getAkteninhaltType(), null, "akteninhalt", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_Verweis(), this.getVerweisType(), null, "verweis", null, 0, -1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_Kontakt(), this.getKontaktType(), null, "kontakt", null, 0, -1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAkteType_ZdA(), theXMLTypePackage.getBoolean(), "zdA", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAkteType_ZdADatum(), theXMLTypePackage.getDate(), "zdADatum", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_AnwendungsspezifischeErweiterung(), this.getAnwendungsspezifischeErweiterungType(), null, "anwendungsspezifischeErweiterung", null, 0, -1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAkteType_AnwendungsspezifischeErweiterungXML(), this.getAnwendungsspezifischeErweiterungXMLType(), null, "anwendungsspezifischeErweiterungXML", null, 0, 1, AkteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeineMetadatenTypeEClass, AllgemeineMetadatenType.class, "AllgemeineMetadatenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllgemeineMetadatenType_Betreff(), theXMLTypePackage.getString(), "betreff", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineMetadatenType_Kennzeichen(), theXMLTypePackage.getString(), "kennzeichen", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineMetadatenType_Federfuehrung(), theXMLTypePackage.getString(), "federfuehrung", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineMetadatenType_Aktenfuehrung(), theXMLTypePackage.getString(), "aktenfuehrung", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineMetadatenType_Geheimhaltung(), this.getGeheimhaltungType(), null, "geheimhaltung", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineMetadatenType_Bemerkung(), theXMLTypePackage.getString(), "bemerkung", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineMetadatenType_Medium(), this.getMediumCodeType(), null, "medium", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineMetadatenType_Aktenplaneinheit(), this.getAktenplaneinheitType(), null, "aktenplaneinheit", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineMetadatenType_ZeitpunktLetzteAenderung(), theXMLTypePackage.getDateTime(), "zeitpunktLetzteAenderung", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineMetadatenType_Strukturpfad(), this.getStrukturpfadType(), null, "strukturpfad", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllgemeineMetadatenType_Datenschutzstufe(), theXMLTypePackage.getString(), "datenschutzstufe", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllgemeineMetadatenType_DatenschutzstufeCode(), this.getDatenschutzstufeCodeType(), null, "datenschutzstufeCode", null, 0, 1, AllgemeineMetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeinerNameTypeEClass, AllgemeinerNameType.class, "AllgemeinerNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllgemeinerNameType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, AllgemeinerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allgemeineRueckmeldungCodeTypeEClass, AllgemeineRueckmeldungCodeType.class, "AllgemeineRueckmeldungCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anlageDokumentTypeEClass, AnlageDokumentType.class, "AnlageDokumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnlageDokumentType_Nummer(), theXMLTypePackage.getString(), "nummer", null, 0, 1, AnlageDokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anschriftstypCodeTypeEClass, AnschriftstypCodeType.class, "AnschriftstypCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anschriftTypeEClass, AnschriftType.class, "AnschriftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnschriftType_Staat(), this.getStaatType(), null, "staat", null, 0, 1, AnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnschriftType_Strasse(), theXMLTypePackage.getString(), "strasse", null, 0, 1, AnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnschriftType_Hausnummer(), theXMLTypePackage.getString(), "hausnummer", null, 0, 1, AnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnschriftType_Postfach(), theXMLTypePackage.getString(), "postfach", null, 0, 1, AnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnschriftType_Postleitzahl(), theXMLTypePackage.getString(), "postleitzahl", null, 0, 1, AnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnschriftType_Ort(), theXMLTypePackage.getString(), "ort", null, 0, 1, AnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnschriftType_Zusatz(), theXMLTypePackage.getString(), "zusatz", null, 0, 1, AnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnschriftType_Typ(), this.getAnschriftstypCodeType(), null, "typ", null, 0, 1, AnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anwendungsspezifischeErweiterungTypeEClass, AnwendungsspezifischeErweiterungType.class, "AnwendungsspezifischeErweiterungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnwendungsspezifischeErweiterungType_Kennung(), theXMLTypePackage.getString(), "kennung", null, 1, 1, AnwendungsspezifischeErweiterungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnwendungsspezifischeErweiterungType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AnwendungsspezifischeErweiterungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnwendungsspezifischeErweiterungType_Beschreibung(), theXMLTypePackage.getString(), "beschreibung", null, 0, 1, AnwendungsspezifischeErweiterungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnwendungsspezifischeErweiterungType_Versionsnummer(), theXMLTypePackage.getString(), "versionsnummer", null, 0, 1, AnwendungsspezifischeErweiterungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnwendungsspezifischeErweiterungType_Versionsdatum(), theXMLTypePackage.getDate(), "versionsdatum", null, 0, 1, AnwendungsspezifischeErweiterungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnwendungsspezifischeErweiterungType_Feldgruppe(), this.getFeldgruppeType(), null, "feldgruppe", null, 0, -1, AnwendungsspezifischeErweiterungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnwendungsspezifischeErweiterungType_Feld(), this.getFeldType(), null, "feld", null, 0, -1, AnwendungsspezifischeErweiterungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anwendungsspezifischeErweiterungXMLTypeEClass, AnwendungsspezifischeErweiterungXMLType.class, "AnwendungsspezifischeErweiterungXMLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnwendungsspezifischeErweiterungXMLType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AnwendungsspezifischeErweiterungXMLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aufbewahrungsdauerTypeEClass, AufbewahrungsdauerType.class, "AufbewahrungsdauerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAufbewahrungsdauerType_AnzahlJahre(), theXMLTypePackage.getUnsignedShort(), "anzahlJahre", null, 0, 1, AufbewahrungsdauerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAufbewahrungsdauerType_Unbefristet(), theXMLTypePackage.getBoolean(), "unbefristet", "1", 0, 1, AufbewahrungsdauerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aussonderungsartCodeTypeEClass, AussonderungsartCodeType.class, "AussonderungsartCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aussonderungsartTypeEClass, AussonderungsartType.class, "AussonderungsartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAussonderungsartType_Aussonderungsart(), this.getAussonderungsartCodeType(), null, "aussonderungsart", null, 0, 1, AussonderungsartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussonderungsartType_AussonderungsartKonfigurierbar(), theXMLTypePackage.getString(), "aussonderungsartKonfigurierbar", null, 0, 1, AussonderungsartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aussonderungsmetadatenTypeEClass, AussonderungsmetadatenType.class, "AussonderungsmetadatenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAussonderungsmetadatenType_Aufbewahrungsdauer(), this.getAufbewahrungsdauerType(), null, "aufbewahrungsdauer", null, 0, 1, AussonderungsmetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussonderungsmetadatenType_Aussonderungsart(), this.getAussonderungsartType(), null, "aussonderungsart", null, 0, 1, AussonderungsmetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussonderungsmetadatenType_Kennung(), theXMLTypePackage.getString(), "kennung", null, 0, 1, AussonderungsmetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAussonderungsmetadatenType_Bewertungsvorschlag(), this.getBewertungsvorschlagCodeType(), null, "bewertungsvorschlag", null, 0, 1, AussonderungsmetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussonderungsmetadatenType_BewertungsvorschlagBegruendung(), theXMLTypePackage.getString(), "bewertungsvorschlagBegruendung", null, 0, 1, AussonderungsmetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussonderungsmetadatenType_Aufbewahrungsende(), theXMLTypePackage.getDate(), "aufbewahrungsende", null, 0, 1, AussonderungsmetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussonderungsmetadatenType_Transferfristende(), theXMLTypePackage.getDate(), "transferfristende", null, 0, 1, AussonderungsmetadatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bearbeitungTypeEClass, BearbeitungType.class, "BearbeitungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBearbeitungType_Bearbeiter(), this.getKontaktType(), null, "bearbeiter", null, 1, 1, BearbeitungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearbeitungType_Datum(), theXMLTypePackage.getDate(), "datum", null, 1, 1, BearbeitungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearbeitungType_Uhrzeit(), theXMLTypePackage.getTime(), "uhrzeit", null, 0, 1, BearbeitungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearbeitungType_Vermerk(), theXMLTypePackage.getString(), "vermerk", null, 0, 1, BearbeitungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearbeitungType_Notiz(), theXMLTypePackage.getString(), "notiz", null, 0, 1, BearbeitungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBearbeitungType_Anlage(), this.getDokumentOderDokumentMitSchriftstueckType(), null, "anlage", null, 0, -1, BearbeitungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behoerdeTypeEClass, BehoerdeType.class, "BehoerdeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehoerdeType_Verzeichnisdienst(), theBasisnachrichtPackage.getCodeVerzeichnisdienstType(), null, "verzeichnisdienst", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehoerdeType_Kennung(), theDIN913792204Package.getDatatypeC(), "kennung", null, 1, 1, BehoerdeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beteiligungsschrittTypeEClass, BeteiligungsschrittType.class, "BeteiligungsschrittType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeteiligungsschrittType_Nummer(), theXMLTypePackage.getString(), "nummer", null, 1, 1, BeteiligungsschrittType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeteiligungsschrittType_Status(), this.getBeteiligungsstatusCodeType(), null, "status", null, 1, 1, BeteiligungsschrittType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeteiligungsschrittType_Verfuegung(), this.getVerfuegungType(), null, "verfuegung", null, 1, 1, BeteiligungsschrittType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeteiligungsschrittType_Bearbeitung(), this.getBearbeitungType(), null, "bearbeitung", null, 0, 1, BeteiligungsschrittType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeteiligungsschrittType_ParallelZuBeteiligungsschritt(), theXMLTypePackage.getString(), "parallelZuBeteiligungsschritt", null, 0, -1, BeteiligungsschrittType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBeteiligungsschrittType_VersionNummer(), theXMLTypePackage.getString(), "versionNummer", null, 0, 1, BeteiligungsschrittType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beteiligungsstatusCodeTypeEClass, BeteiligungsstatusCodeType.class, "BeteiligungsstatusCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bewertungsvorschlagCodeTypeEClass, BewertungsvorschlagCodeType.class, "BewertungsvorschlagCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateiformatCodeTypeEClass, DateiformatCodeType.class, "DateiformatCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datenaustauschartCodeTypeEClass, DatenaustauschartCodeType.class, "DatenaustauschartCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datenschutzstufeCodeTypeEClass, DatenschutzstufeCodeType.class, "DatenschutzstufeCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datentypCodeTypeEClass, DatentypCodeType.class, "DatentypCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dokumentMitSchriftstueckTypeEClass, DokumentMitSchriftstueckType.class, "DokumentMitSchriftstueckType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDokumentMitSchriftstueckType_Schriftstueck(), this.getDokumentType(), null, "schriftstueck", null, 0, -1, DokumentMitSchriftstueckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dokumentOderDokumentMitSchriftstueckTypeEClass, DokumentOderDokumentMitSchriftstueckType.class, "DokumentOderDokumentMitSchriftstueckType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDokumentOderDokumentMitSchriftstueckType_Dokument(), this.getDokumentType(), null, "dokument", null, 0, 1, DokumentOderDokumentMitSchriftstueckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentOderDokumentMitSchriftstueckType_DokumentMitSchriftstueck(), this.getDokumentMitSchriftstueckType(), null, "dokumentMitSchriftstueck", null, 0, 1, DokumentOderDokumentMitSchriftstueckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dokumentSchriftstueckBasisTypeEClass, DokumentSchriftstueckBasisType.class, "DokumentSchriftstueckBasisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDokumentSchriftstueckBasisType_Identifikation(), this.getIdentifikationObjektType(), null, "identifikation", null, 1, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_AllgemeineMetadaten(), this.getAllgemeineMetadatenType(), null, "allgemeineMetadaten", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDokumentSchriftstueckBasisType_FremdesGeschaeftszeichen(), theXMLTypePackage.getString(), "fremdesGeschaeftszeichen", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDokumentSchriftstueckBasisType_Posteingangsdatum(), theXMLTypePackage.getDate(), "posteingangsdatum", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDokumentSchriftstueckBasisType_Postausgangsdatum(), theXMLTypePackage.getDate(), "postausgangsdatum", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDokumentSchriftstueckBasisType_DatumDesSchreibens(), theXMLTypePackage.getDate(), "datumDesSchreibens", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDokumentSchriftstueckBasisType_Bezug(), theXMLTypePackage.getString(), "bezug", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDokumentSchriftstueckBasisType_Hier(), theXMLTypePackage.getString(), "hier", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDokumentSchriftstueckBasisType_Bearbeiter(), theXMLTypePackage.getString(), "bearbeiter", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDokumentSchriftstueckBasisType_Typ(), theXMLTypePackage.getString(), "typ", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_HistorienProtokollInformation(), this.getHistorienProtokollInformationType(), null, "historienProtokollInformation", null, 0, -1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_InternerGeschaeftsgang(), this.getGeschaeftsgangType(), null, "internerGeschaeftsgang", null, 0, -1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_Verweis(), this.getVerweisType(), null, "verweis", null, 0, -1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_Anlage(), this.getAnlageDokumentType(), null, "anlage", null, 0, -1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_Autor(), this.getKontaktType(), null, "autor", null, 0, -1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_Leser(), this.getKontaktType(), null, "leser", null, 0, -1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_WeitererKontakt(), this.getKontaktType(), null, "weitererKontakt", null, 0, -1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterung(), this.getAnwendungsspezifischeErweiterungType(), null, "anwendungsspezifischeErweiterung", null, 0, -1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterungXML(), this.getAnwendungsspezifischeErweiterungXMLType(), null, "anwendungsspezifischeErweiterungXML", null, 0, 1, DokumentSchriftstueckBasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dokumentTypeEClass, DokumentType.class, "DokumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDokumentType_Version(), this.getVersionType(), null, "version", null, 0, -1, DokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erfolgOderMisserfolgImportTypeEClass, ErfolgOderMisserfolgImportType.class, "ErfolgOderMisserfolgImportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErfolgOderMisserfolgImportType_Erfolgreich(), theXMLTypePackage.getBoolean(), "erfolgreich", null, 1, 1, ErfolgOderMisserfolgImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErfolgOderMisserfolgImportType_Fehlermeldung(), theXMLTypePackage.getString(), "fehlermeldung", null, 0, -1, ErfolgOderMisserfolgImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErfolgOderMisserfolgImportType_FehlermeldungCode(), this.getSonstigeFehlermeldungCodeType(), null, "fehlermeldungCode", null, 0, -1, ErfolgOderMisserfolgImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feldgruppeTypeEClass, FeldgruppeType.class, "FeldgruppeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeldgruppeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FeldgruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeldgruppeType_Beschreibung(), theXMLTypePackage.getString(), "beschreibung", null, 1, 1, FeldgruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeldgruppeType_Unterfeldgruppe(), this.getFeldgruppeType(), null, "unterfeldgruppe", null, 0, -1, FeldgruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeldgruppeType_Feld(), this.getFeldType(), null, "feld", null, 0, -1, FeldgruppeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feldTypeEClass, FeldType.class, "FeldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeldType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeldType_Beschreibung(), theXMLTypePackage.getString(), "beschreibung", null, 0, 1, FeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeldType_Datentyp(), this.getDatentypCodeType(), null, "datentyp", null, 0, 1, FeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeldType_Wert(), theXMLTypePackage.getString(), "wert", null, 0, 1, FeldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatTypeEClass, FormatType.class, "FormatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormatType_Name(), this.getDateiformatCodeType(), null, "name", null, 1, 1, FormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormatType_SonstigerName(), theXMLTypePackage.getString(), "sonstigerName", null, 0, 1, FormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormatType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, FormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormatType_Primaerdokument(), this.getPrimaerdokumentType(), null, "primaerdokument", null, 1, 1, FormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geburtTypeEClass, GeburtType.class, "GeburtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeburtType_Datum(), theXMLTypePackage.getDate(), "datum", null, 1, 1, GeburtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geheimhaltungsgradCodeTypeEClass, GeheimhaltungsgradCodeType.class, "GeheimhaltungsgradCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geheimhaltungTypeEClass, GeheimhaltungType.class, "GeheimhaltungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeheimhaltungType_Geheimhaltungsgrad(), this.getGeheimhaltungsgradCodeType(), null, "geheimhaltungsgrad", null, 1, 1, GeheimhaltungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeheimhaltungType_Einstufungsfrist(), theXMLTypePackage.getGYear(), "einstufungsfrist", null, 0, 1, GeheimhaltungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeheimhaltungType_EingestuftAm(), theXMLTypePackage.getDate(), "eingestuftAm", null, 0, 1, GeheimhaltungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeheimhaltungType_Herausgeber(), theXMLTypePackage.getString(), "herausgeber", null, 0, 1, GeheimhaltungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeheimhaltungType_EinstufungEndetAm(), theXMLTypePackage.getDate(), "einstufungEndetAm", null, 0, 1, GeheimhaltungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeheimhaltungType_Bemerkung(), theXMLTypePackage.getString(), "bemerkung", null, 0, 1, GeheimhaltungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geschaeftsgangTypeEClass, GeschaeftsgangType.class, "GeschaeftsgangType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeschaeftsgangType_Identifikation(), this.getIdentifikationObjektType(), null, "identifikation", null, 1, 1, GeschaeftsgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeschaeftsgangType_Beteiligungsschritt(), this.getBeteiligungsschrittType(), null, "beteiligungsschritt", null, 1, -1, GeschaeftsgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashTypeEClass, HashType.class, "HashType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHashType_Wert(), theXMLTypePackage.getString(), "wert", null, 1, 1, HashType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHashType_Algorithmus(), this.getKryptographischeAlgorithmenCodeType(), null, "algorithmus", null, 0, 1, HashType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHashType_SonstigerAlgorithmus(), theXMLTypePackage.getString(), "sonstigerAlgorithmus", null, 0, 1, HashType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historienProtokollInformationTypeEClass, HistorienProtokollInformationType.class, "HistorienProtokollInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistorienProtokollInformationType_MetadatumName(), theXMLTypePackage.getString(), "metadatumName", null, 0, 1, HistorienProtokollInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistorienProtokollInformationType_MetadatumAlterWert(), theXMLTypePackage.getString(), "metadatumAlterWert", null, 0, 1, HistorienProtokollInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistorienProtokollInformationType_MetadatumNeuerWert(), theXMLTypePackage.getString(), "metadatumNeuerWert", null, 0, 1, HistorienProtokollInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistorienProtokollInformationType_Akteur(), theXMLTypePackage.getString(), "akteur", null, 1, 1, HistorienProtokollInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistorienProtokollInformationType_DatumUhrzeit(), theXMLTypePackage.getDateTime(), "datumUhrzeit", null, 1, 1, HistorienProtokollInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistorienProtokollInformationType_Bemerkung(), theXMLTypePackage.getString(), "bemerkung", null, 0, 1, HistorienProtokollInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistorienProtokollInformationType_Aktion(), theXMLTypePackage.getString(), "aktion", null, 1, 1, HistorienProtokollInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifikationNachrichtTypeEClass, IdentifikationNachrichtType.class, "IdentifikationNachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifikationObjektTypeEClass, IdentifikationObjektType.class, "IdentifikationObjektType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifikationObjektType_XdomeaUUID(), theBasisnachrichtPackage.getUUID(), "xdomeaUUID", null, 1, 1, IdentifikationObjektType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifikationObjektType_NummerImUebergeordnetenContainer(), theXMLTypePackage.getUnsignedInt(), "nummerImUebergeordnetenContainer", null, 0, 1, IdentifikationObjektType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kommunikationTypeEClass, KommunikationType.class, "KommunikationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKommunikationType_IstDienstlich(), theXMLTypePackage.getBoolean(), "istDienstlich", null, 0, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommunikationType_IstInstitution(), theXMLTypePackage.getBoolean(), "istInstitution", null, 0, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kompressionsverfahrenCodeTypeEClass, KompressionsverfahrenCodeType.class, "KompressionsverfahrenCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(konfigurationsparameterCodeTypeEClass, KonfigurationsparameterCodeType.class, "KonfigurationsparameterCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(konfigurationsparameterGruppeCodeTypeEClass, KonfigurationsparameterGruppeCodeType.class, "KonfigurationsparameterGruppeCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kontaktTypeEClass, KontaktType.class, "KontaktType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKontaktType_Behoerdenkennung(), this.getBehoerdeType(), null, "behoerdenkennung", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_NameInstitution(), this.getNameOrganisationType(), null, "nameInstitution", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_NameOrganisationseinheit(), this.getOrganisationseinheitType(), null, "nameOrganisationseinheit", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_NameAnsprechpartner(), this.getNameNatuerlichePersonType(), null, "nameAnsprechpartner", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktType_Taetigkeit(), theXMLTypePackage.getString(), "taetigkeit", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktType_Zustaendigkeit(), theXMLTypePackage.getString(), "zustaendigkeit", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_Anschrift(), this.getAnschriftType(), null, "anschrift", null, 0, -1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_Erreichbarkeit(), this.getKommunikationType(), null, "erreichbarkeit", null, 0, -1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKontaktType_Rolle(), theXMLTypePackage.getString(), "rolle", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_RolleCode(), this.getRolleCodeType(), null, "rolleCode", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_UnstrukturierteAnschrift(), this.getUnstrukturierteAnschriftType(), null, "unstrukturierteAnschrift", null, 0, -1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_Geburt(), this.getGeburtType(), null, "geburt", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_AnwendungsspezifischeErweiterung(), this.getAnwendungsspezifischeErweiterungType(), null, "anwendungsspezifischeErweiterung", null, 0, -1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontaktType_AnwendungsspezifischeErweiterungXML(), this.getAnwendungsspezifischeErweiterungXMLType(), null, "anwendungsspezifischeErweiterungXML", null, 0, 1, KontaktType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kryptographischeAlgorithmenCodeTypeEClass, KryptographischeAlgorithmenCodeType.class, "KryptographischeAlgorithmenCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mediumCodeTypeEClass, MediumCodeType.class, "MediumCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nachrichtenkopfTypeEClass, NachrichtenkopfType.class, "NachrichtenkopfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtenkopfType_IdentifikationNachricht(), this.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 1, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfType_Leser(), this.getKontaktType(), null, "leser", null, 1, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfType_Autor(), this.getKontaktType(), null, "autor", null, 1, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtenkopfType_ProzessID(), theBasisnachrichtPackage.getUUID(), "prozessID", null, 1, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtenkopfType_InstanzID(), theXMLTypePackage.getString(), "instanzID", null, 0, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtenkopfType_Hinweis(), theXMLTypePackage.getString(), "hinweis", null, 0, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfType_AnwendungsspezifischeErweiterung(), this.getAnwendungsspezifischeErweiterungType(), null, "anwendungsspezifischeErweiterung", null, 0, -1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfType_AnwendungsspezifischeErweiterungXML(), this.getAnwendungsspezifischeErweiterungXMLType(), null, "anwendungsspezifischeErweiterungXML", null, 0, 1, NachrichtenkopfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtentypCodeTypeEClass, NachrichtentypCodeType.class, "NachrichtentypCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nachrichtTypeEClass, NachrichtType.class, "NachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtType_Nachrichtenkopf(), this.getNachrichtenkopfType(), null, "nachrichtenkopf", null, 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Produkt(), theDIN913792204Package.getDatatypeC(), "produkt", null, 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Produkthersteller(), theDIN913792204Package.getDatatypeC(), "produkthersteller", null, 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Produktversion(), theDIN913792204Package.getDatatypeC(), "produktversion", null, 0, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Standard(), theDIN913792204Package.getDatatypeC(), "standard", "xdomea", 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Test(), theDIN913792204Package.getDatatypeC(), "test", null, 0, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtType_Version(), theDIN913792204Package.getDatatypeC(), "version", "4.0.0", 1, 1, NachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameNatuerlichePersonTypeEClass, NameNatuerlichePersonType.class, "NameNatuerlichePersonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameNatuerlichePersonType_Anrede(), theXMLTypePackage.getString(), "anrede", null, 0, 1, NameNatuerlichePersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameNatuerlichePersonType_Titel(), theXMLTypePackage.getString(), "titel", null, 0, 1, NameNatuerlichePersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameNatuerlichePersonType_Familienname(), this.getAllgemeinerNameType(), null, "familienname", null, 0, 1, NameNatuerlichePersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameNatuerlichePersonType_Vorname(), this.getAllgemeinerNameType(), null, "vorname", null, 0, 1, NameNatuerlichePersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameOrganisationTypeEClass, NameOrganisationType.class, "NameOrganisationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameOrganisationType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, NameOrganisationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameOrganisationType_Kurzbezeichnung(), theXMLTypePackage.getString(), "kurzbezeichnung", null, 0, 1, NameOrganisationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nkFVDatenTypeEClass, NkFVDatenType.class, "NkFVDatenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNkFVDatenType_EmpfangendesSystem(), this.getSystemType(), null, "empfangendesSystem", null, 0, -1, NkFVDatenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass, NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType.class, "NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung(), theXMLTypePackage.getBoolean(), "empfangsbestaetigung", null, 1, 1, NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass, NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType.class, "NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung(), theXMLTypePackage.getBoolean(), "empfangsbestaetigung", null, 1, 1, NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nkNichtFVDatenWeitereLeserTypeEClass, NkNichtFVDatenWeitereLeserType.class, "NkNichtFVDatenWeitereLeserType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNkNichtFVDatenWeitereLeserType_WeitererLeser(), this.getKontaktType(), null, "weitererLeser", null, 0, -1, NkNichtFVDatenWeitereLeserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationseinheitTypeEClass, OrganisationseinheitType.class, "OrganisationseinheitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisationseinheitType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OrganisationseinheitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pfadelementTypeEClass, PfadelementType.class, "PfadelementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPfadelementType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PfadelementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPfadelementType_Typ(), this.getStrukturelementTypCodeType(), null, "typ", null, 1, 1, PfadelementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPfadelementType_Pfadelement(), this.getPfadelementType(), null, "pfadelement", null, 0, 1, PfadelementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaerdokumentTypeEClass, PrimaerdokumentType.class, "PrimaerdokumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimaerdokumentType_Dateiname(), this.getStringDateinameType(), "dateiname", null, 1, 1, PrimaerdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaerdokumentType_DateinameOriginal(), theXMLTypePackage.getString(), "dateinameOriginal", null, 0, 1, PrimaerdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaerdokumentType_Ersteller(), theXMLTypePackage.getString(), "ersteller", null, 0, 1, PrimaerdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaerdokumentType_DatumUhrzeit(), theXMLTypePackage.getDateTime(), "datumUhrzeit", null, 0, 1, PrimaerdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaerdokumentType_SignaturSiegel(), this.getSignaturSiegelType(), null, "signaturSiegel", null, 0, 1, PrimaerdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaerdokumentType_ZeitpunktLetzteAenderung(), theXMLTypePackage.getDateTime(), "zeitpunktLetzteAenderung", null, 0, 1, PrimaerdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaerdokumentType_Hash(), this.getHashType(), null, "hash", null, 0, 1, PrimaerdokumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolleCodeTypeEClass, RolleCodeType.class, "RolleCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schriftgutobjekttypCodeTypeEClass, SchriftgutobjekttypCodeType.class, "SchriftgutobjekttypCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signaturSiegelTypeEClass, SignaturSiegelType.class, "SignaturSiegelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignaturSiegelType_SignaturSiegelEingebettet(), theXMLTypePackage.getBoolean(), "signaturSiegelEingebettet", "1", 0, 1, SignaturSiegelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturSiegelType_SignaturSiegelDatei(), this.getStringDateinameType(), "signaturSiegelDatei", null, 0, -1, SignaturSiegelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sonstigeFehlermeldungCodeTypeEClass, SonstigeFehlermeldungCodeType.class, "SonstigeFehlermeldungCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0601CodeTypeEClass, SpezifischeFehlermeldung0601CodeType.class, "SpezifischeFehlermeldung0601CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0602CodeTypeEClass, SpezifischeFehlermeldung0602CodeType.class, "SpezifischeFehlermeldung0602CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0603CodeTypeEClass, SpezifischeFehlermeldung0603CodeType.class, "SpezifischeFehlermeldung0603CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0604CodeTypeEClass, SpezifischeFehlermeldung0604CodeType.class, "SpezifischeFehlermeldung0604CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0605CodeTypeEClass, SpezifischeFehlermeldung0605CodeType.class, "SpezifischeFehlermeldung0605CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0606CodeTypeEClass, SpezifischeFehlermeldung0606CodeType.class, "SpezifischeFehlermeldung0606CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0607CodeTypeEClass, SpezifischeFehlermeldung0607CodeType.class, "SpezifischeFehlermeldung0607CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0608CodeTypeEClass, SpezifischeFehlermeldung0608CodeType.class, "SpezifischeFehlermeldung0608CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0609CodeTypeEClass, SpezifischeFehlermeldung0609CodeType.class, "SpezifischeFehlermeldung0609CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0610CodeTypeEClass, SpezifischeFehlermeldung0610CodeType.class, "SpezifischeFehlermeldung0610CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0611CodeTypeEClass, SpezifischeFehlermeldung0611CodeType.class, "SpezifischeFehlermeldung0611CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0612CodeTypeEClass, SpezifischeFehlermeldung0612CodeType.class, "SpezifischeFehlermeldung0612CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0613CodeTypeEClass, SpezifischeFehlermeldung0613CodeType.class, "SpezifischeFehlermeldung0613CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0614CodeTypeEClass, SpezifischeFehlermeldung0614CodeType.class, "SpezifischeFehlermeldung0614CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0615CodeTypeEClass, SpezifischeFehlermeldung0615CodeType.class, "SpezifischeFehlermeldung0615CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0616CodeTypeEClass, SpezifischeFehlermeldung0616CodeType.class, "SpezifischeFehlermeldung0616CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0617CodeTypeEClass, SpezifischeFehlermeldung0617CodeType.class, "SpezifischeFehlermeldung0617CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0618CodeTypeEClass, SpezifischeFehlermeldung0618CodeType.class, "SpezifischeFehlermeldung0618CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0619CodeTypeEClass, SpezifischeFehlermeldung0619CodeType.class, "SpezifischeFehlermeldung0619CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0620CodeTypeEClass, SpezifischeFehlermeldung0620CodeType.class, "SpezifischeFehlermeldung0620CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0621CodeTypeEClass, SpezifischeFehlermeldung0621CodeType.class, "SpezifischeFehlermeldung0621CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0622CodeTypeEClass, SpezifischeFehlermeldung0622CodeType.class, "SpezifischeFehlermeldung0622CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0623CodeTypeEClass, SpezifischeFehlermeldung0623CodeType.class, "SpezifischeFehlermeldung0623CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0624CodeTypeEClass, SpezifischeFehlermeldung0624CodeType.class, "SpezifischeFehlermeldung0624CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0625CodeTypeEClass, SpezifischeFehlermeldung0625CodeType.class, "SpezifischeFehlermeldung0625CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0626CodeTypeEClass, SpezifischeFehlermeldung0626CodeType.class, "SpezifischeFehlermeldung0626CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0627CodeTypeEClass, SpezifischeFehlermeldung0627CodeType.class, "SpezifischeFehlermeldung0627CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0628CodeTypeEClass, SpezifischeFehlermeldung0628CodeType.class, "SpezifischeFehlermeldung0628CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0631CodeTypeEClass, SpezifischeFehlermeldung0631CodeType.class, "SpezifischeFehlermeldung0631CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spezifischeFehlermeldung0632CodeTypeEClass, SpezifischeFehlermeldung0632CodeType.class, "SpezifischeFehlermeldung0632CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staatCodeTypeEClass, StaatCodeType.class, "StaatCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staatTypeEClass, StaatType.class, "StaatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaatType_Staat(), this.getStaatCodeType(), null, "staat", null, 1, 1, StaatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strukturelementTypCodeTypeEClass, StrukturelementTypCodeType.class, "StrukturelementTypCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strukturpfadTypeEClass, StrukturpfadType.class, "StrukturpfadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrukturpfadType_Pfadelement(), this.getPfadelementType(), null, "pfadelement", null, 1, 1, StrukturpfadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTypeEClass, SystemType.class, "SystemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemType_InstanzID(), theXMLTypePackage.getString(), "instanzID", null, 0, 1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemType_Produktname(), theXMLTypePackage.getString(), "produktname", null, 1, 1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemType_Produktversion(), theXMLTypePackage.getString(), "produktversion", null, 0, 1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemType_Produkthersteller(), theXMLTypePackage.getString(), "produkthersteller", null, 1, 1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportwegCodeTypeEClass, TransportwegCodeType.class, "TransportwegCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unstrukturierteAnschriftTypeEClass, UnstrukturierteAnschriftType.class, "UnstrukturierteAnschriftType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnstrukturierteAnschriftType_Typ(), this.getAnschriftstypCodeType(), null, "typ", null, 0, 1, UnstrukturierteAnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnstrukturierteAnschriftType_Zeile1(), theXMLTypePackage.getString(), "zeile1", null, 0, 1, UnstrukturierteAnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnstrukturierteAnschriftType_Zeile2(), theXMLTypePackage.getString(), "zeile2", null, 0, 1, UnstrukturierteAnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnstrukturierteAnschriftType_Zeile3(), theXMLTypePackage.getString(), "zeile3", null, 0, 1, UnstrukturierteAnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnstrukturierteAnschriftType_Zeile4(), theXMLTypePackage.getString(), "zeile4", null, 0, 1, UnstrukturierteAnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnstrukturierteAnschriftType_Zeile5(), theXMLTypePackage.getString(), "zeile5", null, 0, 1, UnstrukturierteAnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnstrukturierteAnschriftType_Zeile6(), theXMLTypePackage.getString(), "zeile6", null, 0, 1, UnstrukturierteAnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnstrukturierteAnschriftType_Zusatz(), theXMLTypePackage.getString(), "zusatz", null, 0, 1, UnstrukturierteAnschriftType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verfuegungTypeEClass, VerfuegungType.class, "VerfuegungType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerfuegungType_Ersteller(), this.getKontaktType(), null, "ersteller", null, 1, 1, VerfuegungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerfuegungType_Adressat(), this.getKontaktType(), null, "adressat", null, 1, 1, VerfuegungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerfuegungType_Erstellungsdatum(), theXMLTypePackage.getDate(), "erstellungsdatum", null, 1, 1, VerfuegungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerfuegungType_Erstellungsuhrzeit(), theXMLTypePackage.getTime(), "erstellungsuhrzeit", null, 0, 1, VerfuegungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerfuegungType_Verfuegung(), theXMLTypePackage.getString(), "verfuegung", null, 0, 1, VerfuegungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerfuegungType_TerminDatum(), theXMLTypePackage.getDate(), "terminDatum", null, 0, 1, VerfuegungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerfuegungType_TerminUhrzeit(), theXMLTypePackage.getTime(), "terminUhrzeit", null, 0, 1, VerfuegungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerfuegungType_Notiz(), theXMLTypePackage.getString(), "notiz", null, 0, 1, VerfuegungType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionTypeEClass, VersionType.class, "VersionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionType_Nummer(), theXMLTypePackage.getString(), "nummer", null, 1, 1, VersionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionType_Format(), this.getFormatType(), null, "format", null, 1, -1, VersionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verweisTypeEClass, VerweisType.class, "VerweisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerweisType_XdomeaUUID(), theBasisnachrichtPackage.getUUID(), "xdomeaUUID", null, 0, 1, VerweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerweisType_SGOTyp(), this.getSchriftgutobjekttypCodeType(), null, "sGOTyp", null, 0, 1, VerweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerweisType_SGOKennzeichen(), theXMLTypePackage.getString(), "sGOKennzeichen", null, 0, 1, VerweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerweisType_Bemerkung(), theXMLTypePackage.getString(), "bemerkung", null, 0, 1, VerweisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vorgangTypeEClass, VorgangType.class, "VorgangType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVorgangType_Identifikation(), this.getIdentifikationObjektType(), null, "identifikation", null, 1, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_AllgemeineMetadaten(), this.getAllgemeineMetadatenType(), null, "allgemeineMetadaten", null, 0, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_Aussonderungsmetadaten(), this.getAussonderungsmetadatenType(), null, "aussonderungsmetadaten", null, 0, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorgangType_Aktenbetreff(), theXMLTypePackage.getString(), "aktenbetreff", null, 0, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorgangType_Typ(), theXMLTypePackage.getString(), "typ", null, 0, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorgangType_ZdA(), theXMLTypePackage.getBoolean(), "zdA", null, 0, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorgangType_ZdADatum(), theXMLTypePackage.getDate(), "zdADatum", null, 0, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_Laufzeit(), this.getZeitraumType(), null, "laufzeit", null, 0, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_HistorienProtokollInformation(), this.getHistorienProtokollInformationType(), null, "historienProtokollInformation", null, 0, -1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_InternerGeschaeftsgang(), this.getGeschaeftsgangType(), null, "internerGeschaeftsgang", null, 0, -1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_DokumentOderDokumentMitSchriftstueck(), this.getDokumentOderDokumentMitSchriftstueckType(), null, "dokumentOderDokumentMitSchriftstueck", null, 0, -1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_Verweis(), this.getVerweisType(), null, "verweis", null, 0, -1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_Kontakt(), this.getKontaktType(), null, "kontakt", null, 0, -1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_Teilvorgang(), this.getVorgangType(), null, "teilvorgang", null, 0, -1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_AnwendungsspezifischeErweiterung(), this.getAnwendungsspezifischeErweiterungType(), null, "anwendungsspezifischeErweiterung", null, 0, -1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorgangType_AnwendungsspezifischeErweiterungXML(), this.getAnwendungsspezifischeErweiterungXMLType(), null, "anwendungsspezifischeErweiterungXML", null, 0, 1, VorgangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zeitraumTypeEClass, ZeitraumType.class, "ZeitraumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZeitraumType_Beginn(), theXMLTypePackage.getDate(), "beginn", null, 0, 1, ZeitraumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZeitraumType_Ende(), theXMLTypePackage.getDate(), "ende", null, 0, 1, ZeitraumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringDateinameTypeEDataType, String.class, "StringDateinameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n           \n  <standard>\n                \n    <nameLang>xdomea - X\u00d6V-Standard f\u00fcr den IT-gest\u00fctzten Austausch und die IT-gest\u00fctzte Aussonderung beh\u00f6rdlichen Schriftgutes</nameLang>\n                \n    <nameKurz>xdomea</nameKurz>\n                \n    <nameTechnisch>xdomea</nameTechnisch>\n                \n    <kennung>urn:xoev-de:xdomea:kosit:standard:xdomea</kennung>\n                \n    <beschreibung>xdomea ist der vom IT-Planungsrat verabschiedete verbindliche Standard f\u00fcr den Austausch von Akten, Vorg\u00e4ngen und Dokumenten im Kontext der \u00dcbermittlung, der Abgabe sowie der Aussonderung von Schriftgutobjekten (www.it-planungsrat.de, Beschluss 2017/39). Weiterhin kann xdomea f\u00fcr den Austausch zwischen Fachverfahren und DMS / VBS sowie f\u00fcr die Zwischenarchivierung genutzt werden. \n\nUm diese Anwendungsszenarien bestm\u00f6glich zu unterst\u00fctzen, ist xdomea gem\u00e4\u00df des X\u00d6V-Rahmenwerkes nach dem Baukastenprinzip aufgebaut und bietet einzelne Nachrichten(gruppen) f\u00fcr die jeweiligen Prozesse an. \n\nDer Standard xdomea wird von der gleichnamigen Arbeitsgruppe des IT-Planungsrates weiterentwickelt und gepflegt. Der Betrieb des Standards erfolgt durch die Koordinierungsstelle f\u00fcr IT-Standards (KoSIT).\n</beschreibung>\n             \n  </standard>\n           \n  <versionStandard>\n                \n    <version>4.0.0</version>\n                \n    <beschreibung>Die Version 4.0.0 ist durch den IT-Planungsrat beschlossen. Details zum Beschluss sowie zu den Fristen der Umsetzung sind der Ver\u00f6ffentlichung im Bundesanzeiger unter www.bundesanzeiger.de zu entnehmen.</beschreibung>\n                \n    <versionXOEVProfil>3.0.0</versionXOEVProfil>\n                \n    <versionXOEVHandbuch>3.0.0</versionXOEVHandbuch>\n                \n    <versionXGenerator>3.1.1</versionXGenerator>\n                \n    <versionModellierungswerkzeug>19.0</versionModellierungswerkzeug>\n                \n    <nameModellierungswerkzeug>MagicDraw</nameModellierungswerkzeug>\n             \n  </versionStandard>\n        \n\n\n           \n  <standard>\n                \n    <nameLang>xdomea - X\u00d6V-Standard f\u00fcr den IT-gest\u00fctzten Austausch und die IT-gest\u00fctzte Aussonderung beh\u00f6rdlichen Schriftgutes</nameLang>\n                \n    <nameKurz>xdomea</nameKurz>\n                \n    <nameTechnisch>xdomea</nameTechnisch>\n                \n    <kennung>urn:xoev-de:xdomea:kosit:standard:xdomea</kennung>\n                \n    <beschreibung>xdomea ist der vom IT-Planungsrat verabschiedete verbindliche Standard f\u00fcr den Austausch von Akten, Vorg\u00e4ngen und Dokumenten im Kontext der \u00dcbermittlung, der Abgabe sowie der Aussonderung von Schriftgutobjekten (www.it-planungsrat.de, Beschluss 2017/39). Weiterhin kann xdomea f\u00fcr den Austausch zwischen Fachverfahren und DMS / VBS sowie f\u00fcr die Zwischenarchivierung genutzt werden. \n\nUm diese Anwendungsszenarien bestm\u00f6glich zu unterst\u00fctzen, ist xdomea gem\u00e4\u00df des X\u00d6V-Rahmenwerkes nach dem Baukastenprinzip aufgebaut und bietet einzelne Nachrichten(gruppen) f\u00fcr die jeweiligen Prozesse an. \n\nDer Standard xdomea wird von der gleichnamigen Arbeitsgruppe des IT-Planungsrates weiterentwickelt und gepflegt. Der Betrieb des Standards erfolgt durch die Koordinierungsstelle f\u00fcr IT-Standards (KoSIT).\n</beschreibung>\n             \n  </standard>\n           \n  <versionStandard>\n                \n    <version>4.0.0</version>\n                \n    <beschreibung>Die Version 4.0.0 ist durch den IT-Planungsrat beschlossen. Details zum Beschluss sowie zu den Fristen der Umsetzung sind der Ver\u00f6ffentlichung im Bundesanzeiger unter www.bundesanzeiger.de zu entnehmen.</beschreibung>\n                \n    <versionXOEVProfil>3.0.0</versionXOEVProfil>\n                \n    <versionXOEVHandbuch>3.0.0</versionXOEVHandbuch>\n                \n    <versionXGenerator>3.1.1</versionXGenerator>\n                \n    <versionModellierungswerkzeug>19.0</versionModellierungswerkzeug>\n                \n    <nameModellierungswerkzeug>MagicDraw</nameModellierungswerkzeug>\n             \n  </versionStandard>\n        \n\n\n           \n  <XOEVBibliothek>\n                \n    <nameLang>X\u00d6V-Bibliothek: Spezifikation der X\u00d6V-Datentypen und X\u00d6V-Kernkomponenten</nameLang>\n                \n    <nameKurz>X\u00d6V-Bibliothek</nameKurz>\n                \n    <nameTechnisch>XOEV-Bibliothek</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:xoev:bibliothek:xoevbibliothek</kennung>\n                \n    <beschreibung>Die X\u00d6V-Bibliothek ist der zentrale Ort zur Verwaltung und Bereitstellung aller X\u00d6V-spezifischer, zur Wiederverwendung vorgesehener X\u00d6V-Bausteine.\n\nAusnahme bilden die Bausteine der Art \"Codeliste\", die ausschlie\u00dflich \u00fcber das XRepository bereitgestellt werden.</beschreibung>\n                \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n    <externeWebsite>http://www.xoev.de/de/bibliothek</externeWebsite>\n             \n  </XOEVBibliothek>\n           \n  <versionXOEVBibliothek>\n                \n    <version>2022-10-14</version>\n                \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n    <aenderungZurVorversion>Die X\u00d6V-Bibliothek wurde um Inhalte zur Norm DIN 91379 erg\u00e4nzt. Die Version 1.1 der Datentypen zur X\u00d6V-Basisnachricht (qualified und unqualified) wurde erstellt, in der von dem Datentyp C der DIN SPEC 91379 auf den Datentyp C der Norm DIN 91379 umgestellt wurde.</aenderungZurVorversion>\n             \n  </versionXOEVBibliothek>\n        \n\n\n           \n  <XOEVBibliothek>\n                \n    <nameLang>X\u00d6V-Bibliothek: Spezifikation der X\u00d6V-Datentypen und X\u00d6V-Kernkomponenten</nameLang>\n                \n    <nameKurz>X\u00d6V-Bibliothek</nameKurz>\n                \n    <nameTechnisch>XOEV-Bibliothek</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:xoev:bibliothek:xoevbibliothek</kennung>\n                \n    <beschreibung>Die X\u00d6V-Bibliothek ist der zentrale Ort zur Verwaltung und Bereitstellung aller X\u00d6V-spezifischer, zur Wiederverwendung vorgesehener X\u00d6V-Bausteine.\n\nAusnahme bilden die Bausteine der Art \"Codeliste\", die ausschlie\u00dflich \u00fcber das XRepository bereitgestellt werden.</beschreibung>\n                \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n    <externeWebsite>http://www.xoev.de/de/bibliothek</externeWebsite>\n             \n  </XOEVBibliothek>\n           \n  <versionXOEVBibliothek>\n                \n    <version>2022-10-14</version>\n                \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n    <aenderungZurVorversion>Die X\u00d6V-Bibliothek wurde um Inhalte zur Norm DIN 91379 erg\u00e4nzt. Die Version 1.1 der Datentypen zur X\u00d6V-Basisnachricht (qualified und unqualified) wurde erstellt, in der von dem Datentyp C der DIN SPEC 91379 auf den Datentyp C der Norm DIN 91379 umgestellt wurde.</aenderungZurVorversion>\n             \n  </versionXOEVBibliothek>\n        \n"
		   });
		addAnnotation
		  (aktenplaneinheitAktenplanTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>AktenplaneinheitAktenplan</title>\n           \n"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_Aussonderungsart(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <implementationHint>Die Aussonderungsart vererbt sich auf alle unter einer Hierarchiestufe angelegten Schriftgutobjekte.</implementationHint>\n                       \n"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_Stillgelegt(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <implementationHint>F\u00fcr die Umsetzung in den Systemen wird empfohlen, sofern kein anderer Wert hinterlegt wurde, als Standardwert den Wert \"0\" f\u00fcr \"nicht stillgelegt\" anzugeben.</implementationHint>\n                       \n"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                       \n"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                       \n"
		   });
		addAnnotation
		  (aktenplaneinheitTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Aktenplaneinheit</title>\n           \n"
		   });
		addAnnotation
		  (aktenplanTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Aktenplan</title>\n           \n"
		   });
		addAnnotation
		  (akteTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Akte</title>\n           \n"
		   });
		addAnnotation
		  (getAkteType_InternerGeschaeftsgang(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Der interne Gesch\u00e4ftsgang kann nach organisatorischer Absprache zwischen den austauschenden Systemen genutzt werden, ist aber nicht verpflichtender Bestandteil von xdomea.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getAkteType_ZdA(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>ZdA (zu den Akten) steht f\u00fcr das Schlie\u00dfen eines Schriftgutobjekts (Teilvorgang, Vorgang, Teilakte oder Akte). Die hierf\u00fcr in den Verwaltungen genutzten Bezeichnungen k\u00f6nnen anders lauten (z.\u202fB. \u201eSchlie\u00dfen der Akte oder des Vorgangs\u201c).</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getAkteType_ZdADatum(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>ZdA (zu den Akten) steht f\u00fcr das Schlie\u00dfen eines Schriftgutobjekts (Teilvorgang, Vorgang, Teilakte oder Akte). Die hierf\u00fcr in den Verwaltungen genutzten Bezeichnungen k\u00f6nnen anders lauten (z.\u202fB. \u201eSchlie\u00dfen der Akte oder des Vorgangs\u201c).</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getAkteType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getAkteType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (allgemeineMetadatenTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>AllgemeineMetadaten</title>\n           \n"
		   });
		addAnnotation
		  (allgemeinerNameTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>AllgemeinerName</title>\n           \n"
		   });
		addAnnotation
		  (allgemeineRueckmeldungCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>AllgemeineRueckmeldung</nameLang>\n                   \n    <nameKurz>AllgemeineRueckmeldung</nameKurz>\n                   \n    <nameTechnisch>allgemeinerueckmeldung</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:allgemeinerueckmeldung</kennung>\n                   \n    <beschreibung>Die Werteliste der allgemeinen R\u00fcckmeldungen.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (anlageDokumentTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>AnlageDokument</title>\n           \n"
		   });
		addAnnotation
		  (anschriftstypCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Anschriftstyp</nameLang>\n                   \n    <nameKurz>Anschriftstyp</nameKurz>\n                   \n    <nameTechnisch>anschriftstyp</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:anschriftstyp</kennung>\n                   \n    <beschreibung>Die Werteliste der Anschriftentypen.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (anschriftTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Anschrift</title>\n           \n"
		   });
		addAnnotation
		  (anwendungsspezifischeErweiterungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>AnwendungsspezifischeErweiterung</title>\n           \n"
		   });
		addAnnotation
		  (anwendungsspezifischeErweiterungXMLTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>AnwendungsspezifischeErweiterungXML</title>\n           \n"
		   });
		addAnnotation
		  (aufbewahrungsdauerTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Aufbewahrungsdauer</title>\n           \n"
		   });
		addAnnotation
		  (aussonderungsartCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Aussonderungsart</nameLang>\n                   \n    <nameKurz>Aussonderungsart</nameKurz>\n                   \n    <nameTechnisch>aussonderungsart</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:aussonderungsart</kennung>\n                   \n    <beschreibung>Die Werteliste der Aussonderungsarten.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <datumGueltigkeitAb>2016-01-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <spaltennameLang>Beschreibung</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (aussonderungsartTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Aussonderungsart</title>\n           \n"
		   });
		addAnnotation
		  (getAussonderungsartType_AussonderungsartKonfigurierbar(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die m\u00f6glichen Werte f\u00fcr AussonderungsartKonfigurierbar m\u00fcssen zwischen den beteiligten Kommunikationspartnern (abgebende Stelle und Archiv) vereinbart werden.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (aussonderungsmetadatenTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Aussonderungsmetadaten</title>\n           \n"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_Aufbewahrungsende(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>\u00dcber die Belegung dieses Feldes mit 31.12.JJJJ kann auch nur ein Endjahr angegeben werden. Der Zeitpunkt der Aussonderung (beispielsweise taggenau, quartalsweise, halbj\u00e4hrlich, j\u00e4hrlich) ist mit dem zust\u00e4ndigen Archiv abzustimmen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_Transferfristende(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>\u00dcber die Belegung dieses Feldes mit 31.12.JJJJ kann auch nur ein Endjahr angegeben werden.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (bearbeitungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Bearbeitung</title>\n           \n"
		   });
		addAnnotation
		  (getBearbeitungType_Bearbeiter(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Wird ein Schritt durch den Bearbeiter eines vorhergehenden Schrittes als \"\u00fcbersprungen\" markiert, so wird derjenige in dem \u00fcbersprungenen Schritt auch als Bearbeiter gef\u00fchrt. An dieser Stelle wird f\u00fcr den Bearbeiter der Datentyp \"KontaktType\" verwendet, da damit der Gesch\u00e4ftsgang (auch organisations\u00fcbergreifend) gesteuert werden kann.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (behoerdeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Behoerde</title>\n           \n"
		   });
		addAnnotation
		  (beteiligungsschrittTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Beteiligungsschritt</title>\n           \n"
		   });
		addAnnotation
		  (beteiligungsstatusCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Beteiligungsstatus</nameLang>\n                   \n    <nameKurz>Beteiligungsstatus</nameKurz>\n                   \n    <nameTechnisch>beteiligungsstatus</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:beteiligungsstatus</kennung>\n                   \n    <beschreibung>Die Liste der Statuswerte eines Beteiligungsschrittes im Gesch\u00e4ftsgang.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (bewertungsvorschlagCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Bewertungsvorschlag</nameLang>\n                   \n    <nameKurz>Bewertungsvorschlag</nameKurz>\n                   \n    <nameTechnisch>bewertungsvorschlag</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:bewertungsvorschlag</kennung>\n                   \n    <beschreibung>Die Werteliste der Bewertungsvorschl\u00e4ge.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (dateiformatCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Dateiformat</nameLang>\n                   \n    <nameKurz>Dateiformat</nameKurz>\n                   \n    <nameTechnisch>dateiformat</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:dateiformat</kennung>\n                   \n    <beschreibung>Die Werteliste der g\u00e4ngigen Dateiformate. F\u00fcr sonstige Formate existiert der Wert \"Sonstiges\". Die Angaben stammen gr\u00f6\u00dftenteils aus der internationalen Formatdatenbank PRONOM (http://www.nationalarchives.gov.uk/pronom/).</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (datenaustauschartCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Datenaustauschart</nameLang>\n                   \n    <nameKurz>Datenaustauschart</nameKurz>\n                   \n    <nameTechnisch>datenaustauschart</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:datenaustauschart</kennung>\n                   \n    <beschreibung>Die Werteliste der Datenaustauscharten.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.1</version>\n                   \n    <datumGueltigkeitAb>2021-10-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <spaltennameLang>Beschreibung</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (datentypCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Datentyp</nameLang>\n                   \n    <nameKurz>Datentyp</nameKurz>\n                   \n    <nameTechnisch>datentyp</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:datentyp</kennung>\n                   \n    <beschreibung>Die Werteliste der W3C-Datentypen (http://www.w3.org/TR/xmlschema-2, W3C Recommendation 28 October 2004) erg\u00e4nzt um anySimpleType als Metadatentyp.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.1</version>\n                   \n    <datumGueltigkeitAb>2021-10-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <spaltennameLang>Beschreibung</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (dokumentMitSchriftstueckTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>DokumentMitSchriftstueck</title>\n           \n"
		   });
		addAnnotation
		  (dokumentOderDokumentMitSchriftstueckTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>DokumentOderDokumentMitSchriftstueck</title>\n           \n"
		   });
		addAnnotation
		  (dokumentSchriftstueckBasisTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>DokumentSchriftstueckBasis</title>\n           \n"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Bearbeiter(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>An dieser Stelle wird f\u00fcr den Bearbeiter der Datentyp \"String\" verwendet, da es sich hierbei lediglich um den Namen des Bearbeiters handelt und keine weiteren Steuerungsinformationen damit verbunden sind.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_InternerGeschaeftsgang(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Der interne Gesch\u00e4ftsgang kann nach organisatorischer Absprache zwischen den austauschenden Systemen genutzt werden, ist aber nicht verpflichtender Bestandteil von xdomea.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (dokumentTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Dokument</title>\n           \n"
		   });
		addAnnotation
		  (erfolgOderMisserfolgImportTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>ErfolgOderMisserfolgImport</title>\n           \n"
		   });
		addAnnotation
		  (feldgruppeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Feldgruppe</title>\n           \n"
		   });
		addAnnotation
		  (feldTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Feld</title>\n           \n"
		   });
		addAnnotation
		  (formatTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Format</title>\n           \n"
		   });
		addAnnotation
		  (getFormatType_Name(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>F\u00fcr zus\u00e4tzliche Formatnamen enth\u00e4lt die Codeliste den Wert \"100\" f\u00fcr \"Sonstiges\" - ist dieser Wert gesetzt, so muss unter SonstigerName der Name des Formats angegeben werden.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getFormatType_SonstigerName(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Voraussetzung f\u00fcr die Nutzung von SonstigerName ist die Angabe von \"Sonstiges\" als Namenswert.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (geburtTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Geburt</title>\n           \n"
		   });
		addAnnotation
		  (geheimhaltungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Geheimhaltung</title>\n           \n"
		   });
		addAnnotation
		  (geschaeftsgangTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Geschaeftsgang</title>\n           \n"
		   });
		addAnnotation
		  (getGeschaeftsgangType_Beteiligungsschritt(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Es m\u00fcssen immer alle Beteiligungsschritte eines Gesch\u00e4ftsgangs geliefert werden - unabh\u00e4ngig davon, welchen Status sie besitzen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (hashTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Hash</title>\n           \n"
		   });
		addAnnotation
		  (historienProtokollInformationTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>HistorienProtokollInformation</title>\n           \n"
		   });
		addAnnotation
		  (identifikationNachrichtTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>IdentifikationNachricht</title>\n           \n"
		   });
		addAnnotation
		  (identifikationObjektTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>IdentifikationObjekt</title>\n           \n"
		   });
		addAnnotation
		  (getIdentifikationObjektType_NummerImUebergeordnetenContainer(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Nummer dient nicht zur Identifizierung von Schriftgutobjekten - hierzu sollte die ID verwendet werden. Es darf keine doppelte Nummernvergabe erfolgen, aber L\u00fccken z.\u202fB. durch gel\u00f6schte oder verschobene Schriftgutobjekte sind m\u00f6glich. Innerhalb eines Schriftgutobjekts ist keine Mischform zul\u00e4ssig (d.h. einige Schriftgutobjekte mit Nummer und andere ohne).</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (kommunikationTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Kommunikation</title>\n           \n"
		   });
		addAnnotation
		  (kompressionsverfahrenCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Kompressionsverfahren</nameLang>\n                   \n    <nameKurz>Kompressionsverfahren</nameKurz>\n                   \n    <nameTechnisch>kompressionsverfahren</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:kompressionsverfahren</kennung>\n                   \n    <beschreibung>Die Werteliste der Kompressionsverfahren.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (konfigurationsparameterCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Konfigurationsparameter</nameLang>\n                   \n    <nameKurz>Konfigurationsparameter</nameKurz>\n                   \n    <nameTechnisch>konfigurationsparameter</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:konfigurationsparameter</kennung>\n                   \n    <beschreibung>Die Werteliste der Konfigurationsparameter.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (konfigurationsparameterGruppeCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>KonfigurationsparameterGruppe</nameLang>\n                   \n    <nameKurz>KonfigurationsparameterGruppe</nameKurz>\n                   \n    <nameTechnisch>konfigurationsparametergruppe</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:konfigurationsparametergruppe</kennung>\n                   \n    <beschreibung>Die Werteliste der Konfigurationsparametergruppen.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (kontaktTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Kontakt</title>\n              \n  <implementationHint>Je nach Anwendungsfall ist mindestens eines der enthaltenen Elemente mit Daten zu bef\u00fcllen.</implementationHint>\n           \n"
		   });
		addAnnotation
		  (getKontaktType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getKontaktType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (kryptographischeAlgorithmenCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>XTA-SP Bezeichner f\u00fcr kryptographische Verfahren</nameLang>\n                   \n    <nameKurz>XTA-SP Bezeichner f\u00fcr kryptographische Verfahren</nameKurz>\n                   \n    <nameTechnisch>xta.serviceprofile.kryptographische-algorithmen</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:codeliste:xta.serviceprofile.kryptographische-algorithmen</kennung>\n                   \n    <beschreibung>Diese Codeliste definiert die in den Service Profilen zu verwendenden eindeutigen Bezeichner kryptographischer Verfahren. Es handelt sich um Bezeichner nach \"XML Security Algorithm Cross-Reference\" der W3 Gruppe, verf\u00fcgbar unter http://www.w3.org/TR/xmlsec-algorithms/. In diesem Dokument der W3 Gruppe ist jedem Verfahren eine eindeutige URI zugeordnet, diese URI wird in XTA als Bezeichner f\u00fcr kryptographische Verfahren verwendet und ist in der Spalte \u201eWert\u201c aufgef\u00fchrt. Die Spalte \u201eSchl\u00fcssel\u201c enth\u00e4lt den Namen des Verfahrens, wie er im Dokument der W3 verwendet wird.</beschreibung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (mediumCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Medium</nameLang>\n                   \n    <nameKurz>Medium</nameKurz>\n                   \n    <nameTechnisch>medium</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:medium</kennung>\n                   \n    <beschreibung>Die Werteliste der Medienarten.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <datumGueltigkeitAb>2016-01-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <spaltennameLang>Beschreibung</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (nachrichtenkopfTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Nachrichtenkopf</title>\n           \n"
		   });
		addAnnotation
		  (getNachrichtenkopfType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (nachrichtentypCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Nachrichtentyp</nameLang>\n                   \n    <nameKurz>Nachrichtentyp</nameKurz>\n                   \n    <nameTechnisch>nachrichtentyp</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:nachrichtentyp</kennung>\n                   \n    <beschreibung>Die Werteliste der Nachrichtentypen, die den Namen der jeweiligen Nachricht angeben. Der Schl\u00fcssel wird entsprechend folgender Regel gebildet: Die ersten zwei Zeichen geben die Nachrichtengruppe an, zu der der Nachrichtentyp geh\u00f6rt, z.\u202fB. \"01\" f\u00fcr \"Information\". Die letzten zwei Zeichen ergeben die fortlaufende Nummerierung der Nachrichtentypen in einer Nachrichtengruppe.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>3.0</version>\n                   \n    <datumGueltigkeitAb>2024-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <spaltennameLang>Beschreibung</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (nachrichtTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Nachricht</title>\n           \n"
		   });
		addAnnotation
		  (nameNatuerlichePersonTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>NameNatuerlichePerson</title>\n           \n"
		   });
		addAnnotation
		  (nameOrganisationTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>NameOrganisation</title>\n           \n"
		   });
		addAnnotation
		  (nkFVDatenTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>NkFVDaten</title>\n           \n"
		   });
		addAnnotation
		  (nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>NkNichtFVDatenEinLeserMitEmpfangsbestaetigung</title>\n           \n"
		   });
		addAnnotation
		  (getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <implementationHint>F\u00fcr die Umsetzung in den Systemen wird empfohlen, sofern kein anderer Wert hinterlegt wurde, als Standardwert den Wert \"0\" f\u00fcr \"keine Empfangsbest\u00e4tigung senden\" anzugeben.</implementationHint>\n                       \n"
		   });
		addAnnotation
		  (nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigung</title>\n           \n"
		   });
		addAnnotation
		  (getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <implementationHint>F\u00fcr die Umsetzung in den Systemen wird empfohlen, sofern kein anderer Wert hinterlegt wurde, als Standardwert den Wert \"0\" f\u00fcr \"keine Empfangsbest\u00e4tigung senden\" anzugeben.</implementationHint>\n                       \n"
		   });
		addAnnotation
		  (nkNichtFVDatenWeitereLeserTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>NkNichtFVDatenWeitereLeser</title>\n           \n"
		   });
		addAnnotation
		  (organisationseinheitTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Organisationseinheit</title>\n           \n"
		   });
		addAnnotation
		  (pfadelementTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Pfadelement</title>\n           \n"
		   });
		addAnnotation
		  (primaerdokumentTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Primaerdokument</title>\n           \n"
		   });
		addAnnotation
		  (getPrimaerdokumentType_Ersteller(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>An dieser Stelle wird f\u00fcr den Ersteller der Datentyp \"String\" verwendet, da es sich hierbei lediglich um den Namen des Erstellers handelt und keine weiteren Steuerungsinformationen damit verbunden sind.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (schriftgutobjekttypCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Schriftgutobjekttyp</nameLang>\n                   \n    <nameKurz>Schriftgutobjekttyp</nameKurz>\n                   \n    <nameTechnisch>schriftgutobjekttyp</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:schriftgutobjekttyp</kennung>\n                   \n    <beschreibung>Die Werteliste der Typen von Schriftgutobjekten.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <datumGueltigkeitAb>2016-01-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <spaltennameLang>Beschreibung</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (signaturSiegelTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Signatur und Siegel</title>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0601CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0601.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0601.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0601</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0601</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0601.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0602CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0602.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0602.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0602</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0602</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0602.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0603CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0603.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0603.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0603</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0603</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0603.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0604CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0604.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0604.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0604</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0604</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0604.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0605CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0605.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0605.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0605</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0605</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0605.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0606CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0606.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0606.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0606</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0606</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0606.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0607CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0607.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0607.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0607</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0607</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0607.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0608CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0608.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0608.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0608</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0608</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0608.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0609CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0609.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0609.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0609</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0609</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0609.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0610CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0610.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0610.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0610</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0610</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0610.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0611CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0611.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0611.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0611</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0611</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0611.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0612CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0612.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0612.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0612</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0612</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0612.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0613CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0613.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0613.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0613</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0613</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0613.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0614CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0614.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0614.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0614</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0614</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0614.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0615CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0615.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0615.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0615</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0615</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0615.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0616CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0616.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0616.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0616</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0616</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0616.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0617CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0617.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0617.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0617</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0617</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0617.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0618CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0618.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0618.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0618</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0618</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0618.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0619CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0619.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0619.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0619</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0619</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0619.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0620CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0620.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0620.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0620</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0620</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0620.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0621CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0621.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0621.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0621</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0621</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0621.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0622CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0622.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0622.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0622</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0622</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0622.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0623CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0623.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0623.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0623</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0623</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0623.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0624CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0624.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0624.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0624</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0624</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0624.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0625CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0625.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0625.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0625</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0625</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0625.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0626CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0626.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0626.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0626</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0626</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0626.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0627CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0627.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0627.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0627</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0627</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0627.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0628CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0628.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0628.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0628</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0628</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0628.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0631CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0631.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0631.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0631</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0631</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0631.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0632CodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>0632.SpezifischeFehlermeldung</nameLang>\n                   \n    <nameKurz>0632.SpezifischeFehlermeldung</nameKurz>\n                   \n    <nameTechnisch>spezifischefehlermeldung0632</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:spezifischefehlermeldung0632</kennung>\n                   \n    <beschreibung>Die Werteliste der spezifischen R\u00fcckmeldungen zur Nachricht 0632.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (staatCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Country Codes</nameLang>\n                   \n    <nameKurz>Country Codes</nameKurz>\n                   \n    <nameTechnisch>Country-Codes</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:codeliste:country-codes</kennung>\n                   \n    <beschreibung>Die Codeliste basiert auf der Staats- und Gebietssystematik des Statistischen Bundesamtes (DESTATIS) und dem Standard \"Country codes\" der International Organization for Standardization (ISO). Die vorliegende Liste enth\u00e4lt alle \"officially assigned codes\" (Alpha-2 und Numerisch) der ISO-Liste. Kurz- und Langnamen der aufgef\u00fchrten Eintr\u00e4ge wurden, sofern vorhanden, der DESTATIS-Liste entnommen. Zu den nicht in der DESTATIS-Liste gef\u00fchrten Codeeintr\u00e4gen wurden die zugeh\u00f6rigen Namen der Deutschen Fassung der Norm entnommen.</beschreibung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>ISO Alpha-2 code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (staatTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Staat</title>\n           \n"
		   });
		addAnnotation
		  (strukturelementTypCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Strukturelementtyp</nameLang>\n                   \n    <nameKurz>Strukturelementtyp</nameKurz>\n                   \n    <nameTechnisch>strukturelementtyp</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:strukturelementtyp</kennung>\n                   \n    <beschreibung>Die Werteliste der Typen von Strukturelementen.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <versionCodeliste>\n                   \n    <version>1.0</version>\n                   \n    <datumGueltigkeitAb>2024-11-01</datumGueltigkeitAb>\n                   \n    <versionCodelistenHandbuch>1.2</versionCodelistenHandbuch>\n                \n  </versionCodeliste>\n              \n  <codelistenspalten>\n                   \n    <code>\n                        \n      <spaltennameLang>Code</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>true</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>true</empfohleneCodeSpalte>\n                     \n    </code>\n                   \n    <beschreibung>\n                        \n      <spaltennameLang>Beschreibung</spaltennameLang>\n                        \n      <datentyp>string</datentyp>\n                        \n      <codeSpalte>false</codeSpalte>\n                        \n      <verwendung>required</verwendung>\n                        \n      <empfohleneCodeSpalte>false</empfohleneCodeSpalte>\n                     \n    </beschreibung>\n                \n  </codelistenspalten>\n              \n  <genutzteCodeSpalte>code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (strukturpfadTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Strukturpfad</title>\n           \n"
		   });
		addAnnotation
		  (systemTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>System</title>\n              \n  <implementationHint>Je nach Anwendungsfall ist mindestens eines der enthaltenen Elemente mit Daten zu bef\u00fcllen.</implementationHint>\n           \n"
		   });
		addAnnotation
		  (transportwegCodeTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Transportweg</nameLang>\n                   \n    <nameKurz>Transportweg</nameKurz>\n                   \n    <nameTechnisch>transportweg</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:xdomea:codeliste:transportweg</kennung>\n                   \n    <beschreibung>Die Werteliste der Transportwege.</beschreibung>\n                   \n    <herausgebernameLang>AG xdomea des IT-Planungsrates</herausgebernameLang>\n                   \n    <herausgebernameKurz>ag-xdomea</herausgebernameKurz>\n                \n  </codeliste>\n              \n  <genutzteCodeSpalte>Code</genutzteCodeSpalte>\n           \n"
		   });
		addAnnotation
		  (unstrukturierteAnschriftTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>UnstrukturierteAnschrift</title>\n           \n"
		   });
		addAnnotation
		  (verfuegungTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Verfuegung</title>\n           \n"
		   });
		addAnnotation
		  (getVerfuegungType_Ersteller(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>An dieser Stelle wird f\u00fcr den Ersteller der Datentyp \"KontaktType\" verwendet, da damit der Gesch\u00e4ftsgang (auch organisations\u00fcbergreifend) gesteuert werden kann.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (versionTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Version</title>\n           \n"
		   });
		addAnnotation
		  (verweisTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Verweis</title>\n              \n  <implementationHint>Mindestens eines der Elemente xdomeaUUID bzw. SGOKennzeichen muss gef\u00fcllt sein.</implementationHint>\n           \n"
		   });
		addAnnotation
		  (vorgangTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Vorgang</title>\n           \n"
		   });
		addAnnotation
		  (getVorgangType_ZdA(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>ZdA (zu den Akten) steht f\u00fcr das Schlie\u00dfen eines Schriftgutobjekts (Teilvorgang, Vorgang, Teilakte oder Akte). Die hierf\u00fcr in den Verwaltungen genutzten Bezeichnungen k\u00f6nnen anders lauten (z.\u202fB. \u201eSchlie\u00dfen der Akte oder des Vorgangs\u201c).</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getVorgangType_ZdADatum(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>ZdA (zu den Akten) steht f\u00fcr das Schlie\u00dfen eines Schriftgutobjekts (Teilvorgang, Vorgang, Teilakte oder Akte). Die hierf\u00fcr in den Verwaltungen genutzten Bezeichnungen k\u00f6nnen anders lauten (z.\u202fB. \u201eSchlie\u00dfen der Akte oder des Vorgangs\u201c).</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getVorgangType_InternerGeschaeftsgang(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Der interne Gesch\u00e4ftsgang kann nach organisatorischer Absprache zwischen den austauschenden Systemen genutzt werden, ist aber nicht verpflichtender Bestandteil von xdomea.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getVorgangType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (getVorgangType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <implementationHint>Die Speicherung der nicht-aufl\u00f6sbaren Daten beim Empfang erfolgt in einer XML-Datei zum Schriftgutobjekt im empfangenden System. Die Umsetzung muss systemspezifisch gel\u00f6st werden - hierbei muss durch das System sichergestellt sein, dass die empfangenen Informationen nicht verloren gehen.</implementationHint>\n                 \n"
		   });
		addAnnotation
		  (zeitraumTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <title>Zeitraum</title>\n           \n"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (akteninhaltTypeEClass,
		   source,
		   new String[] {
			   "name", "Akteninhalt_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAkteninhaltType_DokumentOderDokumentMitSchriftstueck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DokumentOderDokumentMitSchriftstueck",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteninhaltType_Vorgang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vorgang",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteninhaltType_Teilakte(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Teilakte",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (aktenplaneinheitAktenplanTypeEClass,
		   source,
		   new String[] {
			   "name", "AktenplaneinheitAktenplanType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_Aussonderungsart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aussonderungsart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_Gueltigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gueltigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_Stillgelegt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Stillgelegt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_Aufbewahrungsdauer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aufbewahrungsdauer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_Einheit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Einheit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_VerweisAktenplaneinheit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VerweisAktenplaneinheit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterungXML",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (aktenplaneinheitTypeEClass,
		   source,
		   new String[] {
			   "name", "AktenplaneinheitType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAktenplaneinheitType_Kennzeichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kennzeichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitType_Inhaltsangabe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inhaltsangabe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplaneinheitType_BetreffKurz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BetreffKurz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (aktenplanTypeEClass,
		   source,
		   new String[] {
			   "name", "AktenplanType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAktenplanType_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplanType_Typ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Typ",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplanType_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplanType_Einheit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Einheit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplanType_Gueltigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gueltigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAktenplanType_Aktenplandatei(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aktenplandatei",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (akteTypeEClass,
		   source,
		   new String[] {
			   "name", "AkteType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAkteType_Identifikation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Identifikation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_AllgemeineMetadaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AllgemeineMetadaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_Aussonderungsmetadaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aussonderungsmetadaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_Standort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Standort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_Typ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Typ",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_Laufzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Laufzeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_HistorienProtokollInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HistorienProtokollInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_InternerGeschaeftsgang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InternerGeschaeftsgang",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_Akteninhalt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Akteninhalt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_Verweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Verweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_Kontakt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kontakt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_ZdA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZdA",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_ZdADatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZdADatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAkteType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterungXML",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allgemeineMetadatenTypeEClass,
		   source,
		   new String[] {
			   "name", "AllgemeineMetadatenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Betreff(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Betreff",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Kennzeichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kennzeichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Federfuehrung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Federfuehrung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Aktenfuehrung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aktenfuehrung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Geheimhaltung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geheimhaltung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Bemerkung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bemerkung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Medium(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Medium",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Aktenplaneinheit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aktenplaneinheit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_ZeitpunktLetzteAenderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZeitpunktLetzteAenderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Strukturpfad(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Strukturpfad",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_Datenschutzstufe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Datenschutzstufe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllgemeineMetadatenType_DatenschutzstufeCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DatenschutzstufeCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allgemeinerNameTypeEClass,
		   source,
		   new String[] {
			   "name", "AllgemeinerNameType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllgemeinerNameType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (allgemeineRueckmeldungCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "AllgemeineRueckmeldungCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (anlageDokumentTypeEClass,
		   source,
		   new String[] {
			   "name", "AnlageDokumentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnlageDokumentType_Nummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Nummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (anschriftstypCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "AnschriftstypCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (anschriftTypeEClass,
		   source,
		   new String[] {
			   "name", "AnschriftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnschriftType_Staat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Staat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnschriftType_Strasse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Strasse",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnschriftType_Hausnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hausnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnschriftType_Postfach(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Postfach",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnschriftType_Postleitzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Postleitzahl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnschriftType_Ort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnschriftType_Zusatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zusatz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnschriftType_Typ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Typ",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (anwendungsspezifischeErweiterungTypeEClass,
		   source,
		   new String[] {
			   "name", "AnwendungsspezifischeErweiterungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnwendungsspezifischeErweiterungType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnwendungsspezifischeErweiterungType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnwendungsspezifischeErweiterungType_Beschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beschreibung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnwendungsspezifischeErweiterungType_Versionsnummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Versionsnummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnwendungsspezifischeErweiterungType_Versionsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Versionsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnwendungsspezifischeErweiterungType_Feldgruppe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Feldgruppe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAnwendungsspezifischeErweiterungType_Feld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Feld",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (anwendungsspezifischeErweiterungXMLTypeEClass,
		   source,
		   new String[] {
			   "name", "AnwendungsspezifischeErweiterungXMLType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnwendungsspezifischeErweiterungXMLType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (aufbewahrungsdauerTypeEClass,
		   source,
		   new String[] {
			   "name", "AufbewahrungsdauerType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAufbewahrungsdauerType_AnzahlJahre(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnzahlJahre",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAufbewahrungsdauerType_Unbefristet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Unbefristet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (aussonderungsartCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "AussonderungsartCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (aussonderungsartTypeEClass,
		   source,
		   new String[] {
			   "name", "AussonderungsartType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAussonderungsartType_Aussonderungsart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aussonderungsart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAussonderungsartType_AussonderungsartKonfigurierbar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AussonderungsartKonfigurierbar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (aussonderungsmetadatenTypeEClass,
		   source,
		   new String[] {
			   "name", "AussonderungsmetadatenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_Aufbewahrungsdauer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aufbewahrungsdauer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_Aussonderungsart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aussonderungsart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_Bewertungsvorschlag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bewertungsvorschlag",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_BewertungsvorschlagBegruendung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BewertungsvorschlagBegruendung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_Aufbewahrungsende(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aufbewahrungsende",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAussonderungsmetadatenType_Transferfristende(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Transferfristende",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bearbeitungTypeEClass,
		   source,
		   new String[] {
			   "name", "BearbeitungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBearbeitungType_Bearbeiter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bearbeiter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBearbeitungType_Datum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Datum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBearbeitungType_Uhrzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Uhrzeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBearbeitungType_Vermerk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vermerk",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBearbeitungType_Notiz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Notiz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBearbeitungType_Anlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anlage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (behoerdeTypeEClass,
		   source,
		   new String[] {
			   "name", "BehoerdeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBehoerdeType_Verzeichnisdienst(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verzeichnisdienst",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehoerdeType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (beteiligungsschrittTypeEClass,
		   source,
		   new String[] {
			   "name", "BeteiligungsschrittType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeteiligungsschrittType_Nummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Nummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeteiligungsschrittType_Status(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeteiligungsschrittType_Verfuegung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Verfuegung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeteiligungsschrittType_Bearbeitung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bearbeitung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeteiligungsschrittType_ParallelZuBeteiligungsschritt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ParallelZuBeteiligungsschritt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBeteiligungsschrittType_VersionNummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VersionNummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (beteiligungsstatusCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "BeteiligungsstatusCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (bewertungsvorschlagCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "BewertungsvorschlagCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (dateiformatCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "DateiformatCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (datenaustauschartCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "DatenaustauschartCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (datenschutzstufeCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "DatenschutzstufeCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (datentypCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "DatentypCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (dokumentMitSchriftstueckTypeEClass,
		   source,
		   new String[] {
			   "name", "DokumentMitSchriftstueckType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDokumentMitSchriftstueckType_Schriftstueck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schriftstueck",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dokumentOderDokumentMitSchriftstueckTypeEClass,
		   source,
		   new String[] {
			   "name", "DokumentOderDokumentMitSchriftstueckType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDokumentOderDokumentMitSchriftstueckType_Dokument(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dokument",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentOderDokumentMitSchriftstueckType_DokumentMitSchriftstueck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DokumentMitSchriftstueck",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dokumentSchriftstueckBasisTypeEClass,
		   source,
		   new String[] {
			   "name", "DokumentSchriftstueckBasisType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Identifikation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Identifikation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_AllgemeineMetadaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AllgemeineMetadaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_FremdesGeschaeftszeichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FremdesGeschaeftszeichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Posteingangsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Posteingangsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Postausgangsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Postausgangsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_DatumDesSchreibens(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DatumDesSchreibens",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Bezug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezug",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Hier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hier",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Bearbeiter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bearbeiter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Typ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Typ",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_HistorienProtokollInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HistorienProtokollInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_InternerGeschaeftsgang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InternerGeschaeftsgang",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Verweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Verweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Anlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anlage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Autor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Autor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_Leser(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Leser",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_WeitererKontakt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WeitererKontakt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterungXML",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dokumentTypeEClass,
		   source,
		   new String[] {
			   "name", "DokumentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDokumentType_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (erfolgOderMisserfolgImportTypeEClass,
		   source,
		   new String[] {
			   "name", "ErfolgOderMisserfolgImportType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErfolgOderMisserfolgImportType_Erfolgreich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Erfolgreich",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErfolgOderMisserfolgImportType_Fehlermeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fehlermeldung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErfolgOderMisserfolgImportType_FehlermeldungCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FehlermeldungCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (feldgruppeTypeEClass,
		   source,
		   new String[] {
			   "name", "FeldgruppeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeldgruppeType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldgruppeType_Beschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beschreibung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldgruppeType_Unterfeldgruppe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Unterfeldgruppe",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldgruppeType_Feld(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Feld",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (feldTypeEClass,
		   source,
		   new String[] {
			   "name", "FeldType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeldType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldType_Beschreibung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beschreibung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldType_Datentyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Datentyp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeldType_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (formatTypeEClass,
		   source,
		   new String[] {
			   "name", "FormatType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFormatType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFormatType_SonstigerName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SonstigerName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFormatType_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFormatType_Primaerdokument(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Primaerdokument",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geburtTypeEClass,
		   source,
		   new String[] {
			   "name", "GeburtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeburtType_Datum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Datum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geheimhaltungsgradCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "GeheimhaltungsgradCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (geheimhaltungTypeEClass,
		   source,
		   new String[] {
			   "name", "GeheimhaltungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeheimhaltungType_Geheimhaltungsgrad(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geheimhaltungsgrad",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeheimhaltungType_Einstufungsfrist(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Einstufungsfrist",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeheimhaltungType_EingestuftAm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EingestuftAm",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeheimhaltungType_Herausgeber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Herausgeber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeheimhaltungType_EinstufungEndetAm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EinstufungEndetAm",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeheimhaltungType_Bemerkung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bemerkung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (geschaeftsgangTypeEClass,
		   source,
		   new String[] {
			   "name", "GeschaeftsgangType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeschaeftsgangType_Identifikation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Identifikation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeschaeftsgangType_Beteiligungsschritt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beteiligungsschritt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hashTypeEClass,
		   source,
		   new String[] {
			   "name", "HashType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHashType_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHashType_Algorithmus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Algorithmus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHashType_SonstigerAlgorithmus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SonstigerAlgorithmus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (historienProtokollInformationTypeEClass,
		   source,
		   new String[] {
			   "name", "HistorienProtokollInformationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHistorienProtokollInformationType_MetadatumName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetadatumName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHistorienProtokollInformationType_MetadatumAlterWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetadatumAlterWert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHistorienProtokollInformationType_MetadatumNeuerWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetadatumNeuerWert",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHistorienProtokollInformationType_Akteur(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Akteur",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHistorienProtokollInformationType_DatumUhrzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DatumUhrzeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHistorienProtokollInformationType_Bemerkung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bemerkung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHistorienProtokollInformationType_Aktion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aktion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifikationNachrichtTypeEClass,
		   source,
		   new String[] {
			   "name", "Identifikation.NachrichtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (identifikationObjektTypeEClass,
		   source,
		   new String[] {
			   "name", "IdentifikationObjektType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifikationObjektType_XdomeaUUID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "xdomeaUUID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifikationObjektType_NummerImUebergeordnetenContainer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NummerImUebergeordnetenContainer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kommunikationTypeEClass,
		   source,
		   new String[] {
			   "name", "KommunikationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKommunikationType_IstDienstlich(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IstDienstlich",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKommunikationType_IstInstitution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IstInstitution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kompressionsverfahrenCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "KompressionsverfahrenCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (konfigurationsparameterCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "KonfigurationsparameterCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (konfigurationsparameterGruppeCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "KonfigurationsparameterGruppeCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (kontaktTypeEClass,
		   source,
		   new String[] {
			   "name", "KontaktType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKontaktType_Behoerdenkennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Behoerdenkennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_NameInstitution(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NameInstitution",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_NameOrganisationseinheit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NameOrganisationseinheit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_NameAnsprechpartner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NameAnsprechpartner",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_Taetigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Taetigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_Zustaendigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zustaendigkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_Anschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_Rolle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Rolle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_RolleCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RolleCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_UnstrukturierteAnschrift(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnstrukturierteAnschrift",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_Geburt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geburt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKontaktType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterungXML",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kryptographischeAlgorithmenCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "KryptographischeAlgorithmenCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (mediumCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "MediumCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (nachrichtenkopfTypeEClass,
		   source,
		   new String[] {
			   "name", "NachrichtenkopfType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachrichtenkopfType_IdentifikationNachricht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifikation.nachricht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_Leser(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "leser",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_Autor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "autor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_ProzessID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProzessID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_InstanzID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InstanzID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_Hinweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hinweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterungXML",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachrichtentypCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "NachrichtentypCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (nachrichtTypeEClass,
		   source,
		   new String[] {
			   "name", "NachrichtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachrichtType_Nachrichtenkopf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenkopf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtType_Produkt(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produkt"
		   });
		addAnnotation
		  (getNachrichtType_Produkthersteller(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produkthersteller"
		   });
		addAnnotation
		  (getNachrichtType_Produktversion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produktversion"
		   });
		addAnnotation
		  (getNachrichtType_Standard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "standard"
		   });
		addAnnotation
		  (getNachrichtType_Test(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "test"
		   });
		addAnnotation
		  (getNachrichtType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (nameNatuerlichePersonTypeEClass,
		   source,
		   new String[] {
			   "name", "NameNatuerlichePersonType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNameNatuerlichePersonType_Anrede(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anrede",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameNatuerlichePersonType_Titel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Titel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameNatuerlichePersonType_Familienname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Familienname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameNatuerlichePersonType_Vorname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vorname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nameOrganisationTypeEClass,
		   source,
		   new String[] {
			   "name", "NameOrganisationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNameOrganisationType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameOrganisationType_Kurzbezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kurzbezeichnung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nkFVDatenTypeEClass,
		   source,
		   new String[] {
			   "name", "NkFVDatenType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNkFVDatenType_EmpfangendesSystem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EmpfangendesSystem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeEClass,
		   source,
		   new String[] {
			   "name", "NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Empfangsbestaetigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeEClass,
		   source,
		   new String[] {
			   "name", "NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Empfangsbestaetigung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nkNichtFVDatenWeitereLeserTypeEClass,
		   source,
		   new String[] {
			   "name", "NkNichtFVDatenWeitereLeserType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNkNichtFVDatenWeitereLeserType_WeitererLeser(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WeitererLeser",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (organisationseinheitTypeEClass,
		   source,
		   new String[] {
			   "name", "OrganisationseinheitType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOrganisationseinheitType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pfadelementTypeEClass,
		   source,
		   new String[] {
			   "name", "PfadelementType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPfadelementType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPfadelementType_Typ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Typ",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPfadelementType_Pfadelement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pfadelement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (primaerdokumentTypeEClass,
		   source,
		   new String[] {
			   "name", "PrimaerdokumentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPrimaerdokumentType_Dateiname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Dateiname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPrimaerdokumentType_DateinameOriginal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DateinameOriginal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPrimaerdokumentType_Ersteller(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ersteller",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPrimaerdokumentType_DatumUhrzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DatumUhrzeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPrimaerdokumentType_SignaturSiegel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignaturSiegel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPrimaerdokumentType_ZeitpunktLetzteAenderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZeitpunktLetzteAenderung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPrimaerdokumentType_Hash(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hash",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (rolleCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "RolleCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (schriftgutobjekttypCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SchriftgutobjekttypCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (signaturSiegelTypeEClass,
		   source,
		   new String[] {
			   "name", "SignaturSiegelType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignaturSiegelType_SignaturSiegelEingebettet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignaturSiegelEingebettet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSignaturSiegelType_SignaturSiegelDatei(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SignaturSiegelDatei",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sonstigeFehlermeldungCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SonstigeFehlermeldungCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0601CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0601CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0602CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0602CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0603CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0603CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0604CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0604CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0605CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0605CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0606CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0606CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0607CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0607CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0608CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0608CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0609CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0609CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0610CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0610CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0611CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0611CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0612CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0612CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0613CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0613CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0614CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0614CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0615CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0615CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0616CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0616CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0617CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0617CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0618CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0618CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0619CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0619CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0620CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0620CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0621CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0621CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0622CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0622CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0623CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0623CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0624CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0624CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0625CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0625CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0626CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0626CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0627CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0627CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0628CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0628CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0631CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0631CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (spezifischeFehlermeldung0632CodeTypeEClass,
		   source,
		   new String[] {
			   "name", "SpezifischeFehlermeldung0632CodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (staatCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "StaatCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (staatTypeEClass,
		   source,
		   new String[] {
			   "name", "StaatType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStaatType_Staat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Staat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (stringDateinameTypeEDataType,
		   source,
		   new String[] {
			   "name", "stringDateinameType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[0-9|A-F|a-f]{8}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{12}[_]?.*[\\.]?.*"
		   });
		addAnnotation
		  (strukturelementTypCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "StrukturelementTypCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (strukturpfadTypeEClass,
		   source,
		   new String[] {
			   "name", "StrukturpfadType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrukturpfadType_Pfadelement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pfadelement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (systemTypeEClass,
		   source,
		   new String[] {
			   "name", "SystemType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSystemType_InstanzID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InstanzID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemType_Produktname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Produktname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemType_Produktversion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Produktversion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemType_Produkthersteller(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Produkthersteller",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (transportwegCodeTypeEClass,
		   source,
		   new String[] {
			   "name", "TransportwegCodeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (unstrukturierteAnschriftTypeEClass,
		   source,
		   new String[] {
			   "name", "UnstrukturierteAnschriftType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnstrukturierteAnschriftType_Typ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Typ",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnstrukturierteAnschriftType_Zeile1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zeile1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnstrukturierteAnschriftType_Zeile2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zeile2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnstrukturierteAnschriftType_Zeile3(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zeile3",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnstrukturierteAnschriftType_Zeile4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zeile4",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnstrukturierteAnschriftType_Zeile5(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zeile5",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnstrukturierteAnschriftType_Zeile6(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zeile6",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUnstrukturierteAnschriftType_Zusatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zusatz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (verfuegungTypeEClass,
		   source,
		   new String[] {
			   "name", "VerfuegungType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVerfuegungType_Ersteller(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ersteller",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerfuegungType_Adressat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Adressat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerfuegungType_Erstellungsdatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Erstellungsdatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerfuegungType_Erstellungsuhrzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Erstellungsuhrzeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerfuegungType_Verfuegung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Verfuegung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerfuegungType_TerminDatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TerminDatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerfuegungType_TerminUhrzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TerminUhrzeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerfuegungType_Notiz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Notiz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (versionTypeEClass,
		   source,
		   new String[] {
			   "name", "VersionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVersionType_Nummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Nummer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVersionType_Format(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Format",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (verweisTypeEClass,
		   source,
		   new String[] {
			   "name", "VerweisType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVerweisType_XdomeaUUID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "xdomeaUUID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerweisType_SGOTyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SGOTyp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerweisType_SGOKennzeichen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SGOKennzeichen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVerweisType_Bemerkung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bemerkung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (vorgangTypeEClass,
		   source,
		   new String[] {
			   "name", "VorgangType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVorgangType_Identifikation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Identifikation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_AllgemeineMetadaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AllgemeineMetadaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_Aussonderungsmetadaten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aussonderungsmetadaten",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_Aktenbetreff(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Aktenbetreff",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_Typ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Typ",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_ZdA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZdA",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_ZdADatum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZdADatum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_Laufzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Laufzeit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_HistorienProtokollInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HistorienProtokollInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_InternerGeschaeftsgang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InternerGeschaeftsgang",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_DokumentOderDokumentMitSchriftstueck(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DokumentOderDokumentMitSchriftstueck",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_Verweis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Verweis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_Kontakt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kontakt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_Teilvorgang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Teilvorgang",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_AnwendungsspezifischeErweiterung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVorgangType_AnwendungsspezifischeErweiterungXML(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AnwendungsspezifischeErweiterungXML",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (zeitraumTypeEClass,
		   source,
		   new String[] {
			   "name", "ZeitraumType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZeitraumType_Beginn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beginn",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getZeitraumType_Ende(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ende",
			   "namespace", "##targetNamespace"
		   });
	}

} //DomeaPackageImpl
