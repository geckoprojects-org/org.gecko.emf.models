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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package;

import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionPackageImpl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeineNachrichtenPackageImpl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftPackageImpl;

import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;

import de.xoev.xfamilie.dsrv._1.dsrv.impl.DSRVPackageImpl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldFactory;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;

import de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElterngeldPackageImpl extends EPackageImpl implements ElterngeldPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "elterngeld.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adoptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algiTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alleinerziehendenanspruchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andereLeistungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenSozialversicherungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenWeiteresKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anschriftKindOptionalTypeEClass = null;

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
	private EClass antragstellenderElternteilVorabmeldungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbeitszeitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auslaendischesArbeitsverhaeltnisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auslandsaufenthaltBefrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auslandsaufenthaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beantragungElterngeldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behinderungKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass berufsausbildungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass berufsbildungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass besondersFruehGeborenesKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buergergeldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAbbruchgrundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAnfragegrundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeElterngeldantragTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeFehlerfallTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeGesamteinkommenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeKindschaftsverhaeltnisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeLeistungshoeheTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeVersandwegTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeVersicherungsartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egAelteresKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einkommensersatzleistungenBezugszeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einkommensersatzleistungenVorGeburtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einkommenVorGeburtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einkommenWaehrendBezugszeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einkuenfteBeantragterZeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elterngeldantragAbbruch0206TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elterngeldantragAnfrage0204TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elterngeldantragAnfrageabschluss0205TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elterngeldantragAntrag0201TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elterngeldantragStandesamtsmeldung0203TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elterngeldantragVorabmeldung0202TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elternteilEinsElterngeldantragTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elternteilZweiElterngeldantragTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elternzeitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erwerbstaetigkeitBezugszeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freiwilligendienstTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geringesEinkommenCovid19TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gesamteinkommenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gesetzlicheVertretungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gewoehnlicherAufenthaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haushaltszugehoerigkeitDesKindesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindElterngeldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindschaftsverhaeltnisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindVorabmeldungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass krankengeldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass krankentagegeldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass krankenversicherungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenssituationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mehrlingsgeburtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midijobTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minijobTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nichtselbststaendigeBeschaeftigungVorGeburtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nichtselbststaendigkeitAusklammerungstatbestaendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persoenlicheAngabenETTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rentenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resturlaubTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selbststaendigkeitVerschiebetatbestaendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstigeLeistungenBezugszeitraumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staatsangehoerigkeitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagespflegeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teilzeittaetigkeitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weitereKinderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zustimmungDatenabrufeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abbruchgrundEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anfragegrundEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elterngeldantragEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fehlerfallEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gesamteinkommenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindschaftsverhaeltnisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum leistungshoeheEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versandwegEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versicherungsartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abbruchgrundObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anfragegrundObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elterngeldantragObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fehlerfallObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gesamteinkommenObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindschaftsverhaeltnisObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leistungshoeheObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versandwegObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versicherungsartObjectEDataType = null;

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
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElterngeldPackageImpl() {
		super(eNS_URI, ElterngeldFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ElterngeldPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ElterngeldPackage init() {
		if (isInited) return (ElterngeldPackage)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredElterngeldPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ElterngeldPackageImpl theElterngeldPackage = registeredElterngeldPackage instanceof ElterngeldPackageImpl ? (ElterngeldPackageImpl)registeredElterngeldPackage : new ElterngeldPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913792204Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdoptionPackage.eNS_URI);
		AdoptionPackageImpl theAdoptionPackage = (AdoptionPackageImpl)(registeredPackage instanceof AdoptionPackageImpl ? registeredPackage : AdoptionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BaukastenPackage.eNS_URI);
		BaukastenPackageImpl theBaukastenPackage = (BaukastenPackageImpl)(registeredPackage instanceof BaukastenPackageImpl ? registeredPackage : BaukastenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllgemeineNachrichtenPackage.eNS_URI);
		AllgemeineNachrichtenPackageImpl theAllgemeineNachrichtenPackage = (AllgemeineNachrichtenPackageImpl)(registeredPackage instanceof AllgemeineNachrichtenPackageImpl ? registeredPackage : AllgemeineNachrichtenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BeistandschaftPackage.eNS_URI);
		BeistandschaftPackageImpl theBeistandschaftPackage = (BeistandschaftPackageImpl)(registeredPackage instanceof BeistandschaftPackageImpl ? registeredPackage : BeistandschaftPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DSRVPackage.eNS_URI);
		DSRVPackageImpl theDSRVPackage = (DSRVPackageImpl)(registeredPackage instanceof DSRVPackageImpl ? registeredPackage : DSRVPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeburtPackage.eNS_URI);
		GeburtPackageImpl theGeburtPackage = (GeburtPackageImpl)(registeredPackage instanceof GeburtPackageImpl ? registeredPackage : GeburtPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ErziehungshilfePackage.eNS_URI);
		ErziehungshilfePackageImpl theErziehungshilfePackage = (ErziehungshilfePackageImpl)(registeredPackage instanceof ErziehungshilfePackageImpl ? registeredPackage : ErziehungshilfePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KinderwunschPackage.eNS_URI);
		KinderwunschPackageImpl theKinderwunschPackage = (KinderwunschPackageImpl)(registeredPackage instanceof KinderwunschPackageImpl ? registeredPackage : KinderwunschPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MutterschaftsgeldPackage.eNS_URI);
		MutterschaftsgeldPackageImpl theMutterschaftsgeldPackage = (MutterschaftsgeldPackageImpl)(registeredPackage instanceof MutterschaftsgeldPackageImpl ? registeredPackage : MutterschaftsgeldPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI);
		UnterhaltsvorschussPackageImpl theUnterhaltsvorschussPackage = (UnterhaltsvorschussPackageImpl)(registeredPackage instanceof UnterhaltsvorschussPackageImpl ? registeredPackage : UnterhaltsvorschussPackage.eINSTANCE);

		// Load packages
		theElterngeldPackage.loadPackage();
		theUnterhaltsvorschussPackage.loadPackage();

		// Create package meta-data objects
		theAdoptionPackage.createPackageContents();
		theBaukastenPackage.createPackageContents();
		theAllgemeineNachrichtenPackage.createPackageContents();
		theBeistandschaftPackage.createPackageContents();
		theDSRVPackage.createPackageContents();
		theGeburtPackage.createPackageContents();
		theErziehungshilfePackage.createPackageContents();
		theKinderwunschPackage.createPackageContents();
		theMutterschaftsgeldPackage.createPackageContents();

		// Initialize created meta-data
		theAdoptionPackage.initializePackageContents();
		theBaukastenPackage.initializePackageContents();
		theAllgemeineNachrichtenPackage.initializePackageContents();
		theBeistandschaftPackage.initializePackageContents();
		theDSRVPackage.initializePackageContents();
		theGeburtPackage.initializePackageContents();
		theErziehungshilfePackage.initializePackageContents();
		theKinderwunschPackage.initializePackageContents();
		theMutterschaftsgeldPackage.initializePackageContents();

		// Fix loaded packages
		theElterngeldPackage.fixPackageContents();
		theUnterhaltsvorschussPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theElterngeldPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElterngeldPackage.eNS_URI, theElterngeldPackage);
		return theElterngeldPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdoptionType() {
		if (adoptionTypeEClass == null) {
			adoptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(2);
		}
		return adoptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdoptionType_Adoption() {
        return (EAttribute)getAdoptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdoptionType_AdoptionHaushaltsaufnahme() {
        return (EAttribute)getAdoptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdoptionType_NachweisAdoption() {
        return (EReference)getAdoptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getALGIType() {
		if (algiTypeEClass == null) {
			algiTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(3);
		}
		return algiTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getALGIType_BezugALGI() {
        return (EAttribute)getALGIType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getALGIType_ZeitraumALGI() {
        return (EReference)getALGIType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getALGIType_NachweisALGI() {
        return (EReference)getALGIType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlleinerziehendenanspruchType() {
		if (alleinerziehendenanspruchTypeEClass == null) {
			alleinerziehendenanspruchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(4);
		}
		return alleinerziehendenanspruchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlleinerziehendenanspruchType_EntlastungsbetragAlleinerziehende() {
        return (EAttribute)getAlleinerziehendenanspruchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlleinerziehendenanspruchType_NachweisEntlastungsbetrag() {
        return (EReference)getAlleinerziehendenanspruchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlleinerziehendenanspruchType_BetreuungDurchAnderenETUnmoeglich() {
        return (EAttribute)getAlleinerziehendenanspruchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlleinerziehendenanspruchType_NachweisBetreuung() {
        return (EReference)getAlleinerziehendenanspruchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlleinerziehendenanspruchType_KindeswohlgefaehrdungDurchAnderenET() {
        return (EAttribute)getAlleinerziehendenanspruchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlleinerziehendenanspruchType_NachweisKindeswohlgefaehrdung() {
        return (EReference)getAlleinerziehendenanspruchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndereLeistungenType() {
		if (andereLeistungenTypeEClass == null) {
			andereLeistungenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(5);
		}
		return andereLeistungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAndereLeistungenType_BezugAndereLeistungen() {
        return (EAttribute)getAndereLeistungenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndereLeistungenType_ZeitraumAndereLeistungen() {
        return (EReference)getAndereLeistungenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndereLeistungenType_NachweisAndereLeistungen() {
        return (EReference)getAndereLeistungenType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAndereLeistungenType_ArtAndereLeistungen() {
        return (EAttribute)getAndereLeistungenType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenSozialversicherungType() {
		if (angabenSozialversicherungTypeEClass == null) {
			angabenSozialversicherungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(8);
		}
		return angabenSozialversicherungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenSozialversicherungType_PflichtbeitraegeKrankenkasse() {
        return (EAttribute)getAngabenSozialversicherungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenSozialversicherungType_PflichtbeitraegeRentenversicherung() {
        return (EAttribute)getAngabenSozialversicherungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenSozialversicherungType_PflichtbeitraegeArbeitslosenversicherung() {
        return (EAttribute)getAngabenSozialversicherungType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenSozialversicherungType_NachweisPflichtbetrag() {
        return (EReference)getAngabenSozialversicherungType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenWeiteresKindType() {
		if (angabenWeiteresKindTypeEClass == null) {
			angabenWeiteresKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(9);
		}
		return angabenWeiteresKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenWeiteresKindType_NameWeiteresKind() {
        return (EReference)getAngabenWeiteresKindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenWeiteresKindType_Geburtsdatum() {
        return (EAttribute)getAngabenWeiteresKindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenWeiteresKindType_GeburtsdatumNachweis() {
        return (EReference)getAngabenWeiteresKindType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenWeiteresKindType_Haushaltsaufnahme() {
        return (EAttribute)getAngabenWeiteresKindType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenWeiteresKindType_HaushaltsaufnahmeNachweis() {
        return (EReference)getAngabenWeiteresKindType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAngabenWeiteresKindType_Behinderungsgrad() {
        return (EAttribute)getAngabenWeiteresKindType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenWeiteresKindType_BehinderungsgradNachweis() {
        return (EReference)getAngabenWeiteresKindType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenWeiteresKindType_VerhaeltnisET1() {
        return (EReference)getAngabenWeiteresKindType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenWeiteresKindType_VerhaeltnisET2() {
        return (EReference)getAngabenWeiteresKindType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnschriftKindOptionalType() {
		if (anschriftKindOptionalTypeEClass == null) {
			anschriftKindOptionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(10);
		}
		return anschriftKindOptionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftKindOptionalType_Hausnummer() {
        return (EAttribute)getAnschriftKindOptionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftKindOptionalType_Postleitzahl() {
        return (EAttribute)getAnschriftKindOptionalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftKindOptionalType_Strasse() {
        return (EAttribute)getAnschriftKindOptionalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftKindOptionalType_Wohnort() {
        return (EAttribute)getAnschriftKindOptionalType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnschriftType() {
		if (anschriftTypeEClass == null) {
			anschriftTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(11);
		}
		return anschriftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftType_AnschriftInlandOderAusland() {
        return (EAttribute)getAnschriftType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnschriftType_AnschriftInland() {
        return (EReference)getAnschriftType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnschriftType_AnschriftAusland() {
        return (EReference)getAnschriftType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderElternteilVorabmeldungType() {
		if (antragstellenderElternteilVorabmeldungTypeEClass == null) {
			antragstellenderElternteilVorabmeldungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(12);
		}
		return antragstellenderElternteilVorabmeldungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilVorabmeldungType_Name() {
        return (EReference)getAntragstellenderElternteilVorabmeldungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilVorabmeldungType_Geburtsdatum() {
        return (EReference)getAntragstellenderElternteilVorabmeldungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilVorabmeldungType_Anschrift() {
        return (EReference)getAntragstellenderElternteilVorabmeldungType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArbeitszeitType() {
		if (arbeitszeitTypeEClass == null) {
			arbeitszeitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(13);
		}
		return arbeitszeitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArbeitszeitType_ArbeitszeitWochenstunden() {
        return (EAttribute)getArbeitszeitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArbeitszeitType_AbweichendeBezugsgroesse() {
        return (EAttribute)getArbeitszeitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuslaendischesArbeitsverhaeltnisType() {
		if (auslaendischesArbeitsverhaeltnisTypeEClass == null) {
			auslaendischesArbeitsverhaeltnisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(14);
		}
		return auslaendischesArbeitsverhaeltnisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslaendischesArbeitsverhaeltnisType_AuslaendischesArbeitsverhaeltnis() {
        return (EAttribute)getAuslaendischesArbeitsverhaeltnisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuslaendischesArbeitsverhaeltnisType_Beschaeftigungsland() {
        return (EReference)getAuslaendischesArbeitsverhaeltnisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslaendischesArbeitsverhaeltnisType_AuslaendischesArbeitsverhaeltnisAndererET() {
        return (EAttribute)getAuslaendischesArbeitsverhaeltnisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuslandsaufenthaltBefrType() {
		if (auslandsaufenthaltBefrTypeEClass == null) {
			auslandsaufenthaltBefrTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(15);
		}
		return auslandsaufenthaltBefrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuslandsaufenthaltBefrType_BefristeterAufenthalt() {
        return (EReference)getAuslandsaufenthaltBefrType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslandsaufenthaltBefrType_EndeAufenthalt() {
        return (EAttribute)getAuslandsaufenthaltBefrType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuslandsaufenthaltType() {
		if (auslandsaufenthaltTypeEClass == null) {
			auslandsaufenthaltTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(16);
		}
		return auslandsaufenthaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslandsaufenthaltType_GrundDesAufenthalts() {
        return (EAttribute)getAuslandsaufenthaltType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuslandsaufenthaltType_Aufenthaltsland() {
        return (EReference)getAuslandsaufenthaltType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuslandsaufenthaltType_NachweisAuslandsaufenthalt() {
        return (EReference)getAuslandsaufenthaltType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslandsaufenthaltType_InlaendischesArbeitsverhaeltnis() {
        return (EAttribute)getAuslandsaufenthaltType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslandsaufenthaltType_PlzArbeitgeber() {
        return (EAttribute)getAuslandsaufenthaltType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslandsaufenthaltType_OrtArbeitgeber() {
        return (EAttribute)getAuslandsaufenthaltType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuslandsaufenthaltType_BeginnAufenthalt() {
        return (EAttribute)getAuslandsaufenthaltType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeantragungElterngeldType() {
		if (beantragungElterngeldTypeEClass == null) {
			beantragungElterngeldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(17);
		}
		return beantragungElterngeldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeantragungElterngeldType_Leistungshoehe() {
        return (EReference)getBeantragungElterngeldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeantragungElterngeldType_BasisElterngeld() {
        return (EAttribute)getBeantragungElterngeldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeantragungElterngeldType_ZeitraumBasisElterngeld() {
        return (EAttribute)getBeantragungElterngeldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeantragungElterngeldType_ElterngeldPlus() {
        return (EAttribute)getBeantragungElterngeldType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeantragungElterngeldType_ZeitraumElterngeldPlus() {
        return (EAttribute)getBeantragungElterngeldType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeantragungElterngeldType_PartnerschaftsBonusMonate() {
        return (EAttribute)getBeantragungElterngeldType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeantragungElterngeldType_ZeitraumPartnerschaftsBonusMonate() {
        return (EAttribute)getBeantragungElterngeldType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehinderungKindType() {
		if (behinderungKindTypeEClass == null) {
			behinderungKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(18);
		}
		return behinderungKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehinderungKindType_BehinderungKind() {
        return (EAttribute)getBehinderungKindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehinderungKindType_NachweisBehinderungKind() {
        return (EReference)getBehinderungKindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBerufsausbildungType() {
		if (berufsausbildungTypeEClass == null) {
			berufsausbildungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(19);
		}
		return berufsausbildungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBerufsausbildungType_Berufsbildung() {
        return (EAttribute)getBerufsausbildungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBerufsausbildungType_Zeitraum() {
        return (EAttribute)getBerufsausbildungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBerufsausbildungType_WochenstundenJeTaetigkeit() {
        return (EAttribute)getBerufsausbildungType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBerufsbildungType() {
		if (berufsbildungTypeEClass == null) {
			berufsbildungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(20);
		}
		return berufsbildungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBerufsbildungType_Berufsbildung() {
        return (EAttribute)getBerufsbildungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBerufsbildungType_AusbildungEndeVoraussichtlich() {
        return (EAttribute)getBerufsbildungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBerufsbildungType_Nachweis() {
        return (EReference)getBerufsbildungType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBesondersFruehGeborenesKindType() {
		if (besondersFruehGeborenesKindTypeEClass == null) {
			besondersFruehGeborenesKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(21);
		}
		return besondersFruehGeborenesKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBesondersFruehGeborenesKindType_BesondersFruehGeborenesKind() {
        return (EAttribute)getBesondersFruehGeborenesKindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBesondersFruehGeborenesKindType_ErrechneterGeburtstermin() {
        return (EAttribute)getBesondersFruehGeborenesKindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBesondersFruehGeborenesKindType_NachweisBesondersFruehGeboren() {
        return (EReference)getBesondersFruehGeborenesKindType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuergergeldType() {
		if (buergergeldTypeEClass == null) {
			buergergeldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(22);
		}
		return buergergeldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuergergeldType_BezugBuergergeld() {
        return (EAttribute)getBuergergeldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuergergeldType_BeginnZeitraumBuergergeld() {
        return (EAttribute)getBuergergeldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuergergeldType_EndeZeitraumBuergergeld() {
        return (EAttribute)getBuergergeldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAbbruchgrundType() {
		if (codeAbbruchgrundTypeEClass == null) {
			codeAbbruchgrundTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(23);
		}
		return codeAbbruchgrundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAnfragegrundType() {
		if (codeAnfragegrundTypeEClass == null) {
			codeAnfragegrundTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(24);
		}
		return codeAnfragegrundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeElterngeldantragType() {
		if (codeElterngeldantragTypeEClass == null) {
			codeElterngeldantragTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(25);
		}
		return codeElterngeldantragTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeFehlerfallType() {
		if (codeFehlerfallTypeEClass == null) {
			codeFehlerfallTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(26);
		}
		return codeFehlerfallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeGesamteinkommenType() {
		if (codeGesamteinkommenTypeEClass == null) {
			codeGesamteinkommenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(27);
		}
		return codeGesamteinkommenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeKindschaftsverhaeltnisType() {
		if (codeKindschaftsverhaeltnisTypeEClass == null) {
			codeKindschaftsverhaeltnisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(28);
		}
		return codeKindschaftsverhaeltnisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeLeistungshoeheType() {
		if (codeLeistungshoeheTypeEClass == null) {
			codeLeistungshoeheTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(29);
		}
		return codeLeistungshoeheTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeVersandwegType() {
		if (codeVersandwegTypeEClass == null) {
			codeVersandwegTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(30);
		}
		return codeVersandwegTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeVersicherungsartType() {
		if (codeVersicherungsartTypeEClass == null) {
			codeVersicherungsartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(31);
		}
		return codeVersicherungsartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(32);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ElterngeldantragAbbruch0206() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ElterngeldantragAnfrage0204() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ElterngeldantragAnfrageabschluss0205() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ElterngeldantragAntrag0201() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ElterngeldantragStandesamtsmeldung0203() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ElterngeldantragVorabmeldung0202() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEGAelteresKindType() {
		if (egAelteresKindTypeEClass == null) {
			egAelteresKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(33);
		}
		return egAelteresKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEGAelteresKindType_BezugEGAelteresKind() {
        return (EAttribute)getEGAelteresKindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGAelteresKindType_ZeitraumEGAelteresKind() {
        return (EReference)getEGAelteresKindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEGAelteresKindType_NachweisEGAelteresKind() {
        return (EReference)getEGAelteresKindType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkommensersatzleistungenBezugszeitraumType() {
		if (einkommensersatzleistungenBezugszeitraumTypeEClass == null) {
			einkommensersatzleistungenBezugszeitraumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(34);
		}
		return einkommensersatzleistungenBezugszeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommensersatzleistungenBezugszeitraumType_BezugEinkommensersatzleistungen() {
        return (EAttribute)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenBezugszeitraumType_BezugALGI() {
        return (EReference)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenBezugszeitraumType_BezugKrankentagegeld() {
        return (EReference)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenBezugszeitraumType_BezugKrankengeld() {
        return (EReference)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenBezugszeitraumType_BezugEGAelteresKind() {
        return (EReference)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenBezugszeitraumType_BezugRenten() {
        return (EReference)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenBezugszeitraumType_BezugSonstigeLeistungen() {
        return (EReference)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenBezugszeitraumType_AndereLeistungen() {
        return (EReference)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommensersatzleistungenBezugszeitraumType_BezugAuslLeistungenKind() {
        return (EAttribute)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommensersatzleistungenBezugszeitraumType_BezugZwischenstaatlLeistungen() {
        return (EAttribute)getEinkommensersatzleistungenBezugszeitraumType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkommensersatzleistungenVorGeburtType() {
		if (einkommensersatzleistungenVorGeburtTypeEClass == null) {
			einkommensersatzleistungenVorGeburtTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(35);
		}
		return einkommensersatzleistungenVorGeburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommensersatzleistungenVorGeburtType_BezugEinkommensersatzleistungen() {
        return (EAttribute)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenVorGeburtType_BezugALGI() {
        return (EReference)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenVorGeburtType_BezugKrankentagegeld() {
        return (EReference)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenVorGeburtType_BezugKrankengeldSchwangerschaft() {
        return (EReference)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenVorGeburtType_BezugEGAelteresKind() {
        return (EReference)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenVorGeburtType_BezugRenten() {
        return (EReference)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenVorGeburtType_BezugAndereLeistungen() {
        return (EReference)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommensersatzleistungenVorGeburtType_BezugAuslLeistungenKind() {
        return (EAttribute)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommensersatzleistungenVorGeburtType_BezugZwischenstaatlLeistungen() {
        return (EAttribute)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommensersatzleistungenVorGeburtType_Buergergeld() {
        return (EReference)getEinkommensersatzleistungenVorGeburtType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkommenVorGeburtType() {
		if (einkommenVorGeburtTypeEClass == null) {
			einkommenVorGeburtTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(36);
		}
		return einkommenVorGeburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenVorGeburtType_NichtselbststaendigeBeschaeftigung() {
        return (EReference)getEinkommenVorGeburtType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenVorGeburtType_BeruecksichtigungAusschliesslichEinkommenNichtselbststaendig() {
        return (EAttribute)getEinkommenVorGeburtType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenVorGeburtType_EinkommenAusNichtselbststaendigerTaetigkeit() {
        return (EAttribute)getEinkommenVorGeburtType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenVorGeburtType_SelbstaendigeBeschaeftigung() {
        return (EAttribute)getEinkommenVorGeburtType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenVorGeburtType_GeringesEinkommenCovid19() {
        return (EReference)getEinkommenVorGeburtType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenVorGeburtType_EntgeltdatenDsrv() {
        return (EReference)getEinkommenVorGeburtType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenVorGeburtType_Gewerbebetrieb() {
        return (EAttribute)getEinkommenVorGeburtType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenVorGeburtType_LandUndForstwirtschaft() {
        return (EAttribute)getEinkommenVorGeburtType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenVorGeburtType_Freiwilligendienst() {
        return (EAttribute)getEinkommenVorGeburtType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenVorGeburtType_NachweisMutter() {
        return (EReference)getEinkommenVorGeburtType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenVorGeburtType_SelbststaendigkeitGewerbeLandForstwirtschaft() {
        return (EReference)getEinkommenVorGeburtType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenVorGeburtType_Einkommensersatzleistungen() {
        return (EReference)getEinkommenVorGeburtType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkommenWaehrendBezugszeitraumType() {
		if (einkommenWaehrendBezugszeitraumTypeEClass == null) {
			einkommenWaehrendBezugszeitraumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(37);
		}
		return einkommenWaehrendBezugszeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenWaehrendBezugszeitraumType_NichtselbststaendigeBeschaeftigung() {
        return (EReference)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenWaehrendBezugszeitraumType_SelbstaendigeBeschaeftigung() {
        return (EAttribute)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenWaehrendBezugszeitraumType_LandUndForstwirtschaft() {
        return (EAttribute)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenWaehrendBezugszeitraumType_Gewerbebetrieb() {
        return (EAttribute)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenWaehrendBezugszeitraumType_EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft() {
        return (EReference)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenWaehrendBezugszeitraumType_BeruecksichtigungBetriebsausgaben() {
        return (EAttribute)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenWaehrendBezugszeitraumType_NachweisBetriebsausgaben() {
        return (EReference)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenWaehrendBezugszeitraumType_EinkommensersatzleistungenBezugszeitraum() {
        return (EReference)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenWaehrendBezugszeitraumType_EinkommenAusNichtselbststaendigerTaetigkeit() {
        return (EAttribute)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkommenWaehrendBezugszeitraumType_Arbeitgeberformblatt() {
        return (EReference)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkommenWaehrendBezugszeitraumType_Freiwilligendienst() {
        return (EAttribute)getEinkommenWaehrendBezugszeitraumType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkuenfteBeantragterZeitraumType() {
		if (einkuenfteBeantragterZeitraumTypeEClass == null) {
			einkuenfteBeantragterZeitraumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(38);
		}
		return einkuenfteBeantragterZeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkuenfteBeantragterZeitraumType_Zeitraum() {
        return (EReference)getEinkuenfteBeantragterZeitraumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkuenfteBeantragterZeitraumType_DurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit() {
        return (EAttribute)getEinkuenfteBeantragterZeitraumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkuenfteBeantragterZeitraumType_WochenstundenJeTaetigkeitSelbststaendigkeit() {
        return (EAttribute)getEinkuenfteBeantragterZeitraumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkuenfteBeantragterZeitraumType_NachweisEinkommenssteuerbescheid() {
        return (EReference)getEinkuenfteBeantragterZeitraumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType() {
		if (einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeEClass == null) {
			einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(39);
		}
		return einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType_SteuerfreibetragSelbstaendigkeit() {
        return (EAttribute)getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType_EinkuenfteBeantragterZeitraum() {
        return (EReference)getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElterngeldantragAbbruch0206Type() {
		if (elterngeldantragAbbruch0206TypeEClass == null) {
			elterngeldantragAbbruch0206TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(41);
		}
		return elterngeldantragAbbruch0206TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAbbruch0206Type_AnfrageID() {
        return (EAttribute)getElterngeldantragAbbruch0206Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAbbruch0206Type_GrundAbbruch() {
        return (EReference)getElterngeldantragAbbruch0206Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElterngeldantragAnfrage0204Type() {
		if (elterngeldantragAnfrage0204TypeEClass == null) {
			elterngeldantragAnfrage0204TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(42);
		}
		return elterngeldantragAnfrage0204TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAnfrage0204Type_AnfrageID() {
        return (EAttribute)getElterngeldantragAnfrage0204Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAnfrage0204Type_AntragsReferenz() {
        return (EAttribute)getElterngeldantragAnfrage0204Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAnfrage0204Type_Anfragegrund() {
        return (EReference)getElterngeldantragAnfrage0204Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAnfrage0204Type_Anfrageparameter() {
        return (EReference)getElterngeldantragAnfrage0204Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAnfrage0204Type_AnfragendesSystem() {
        return (EAttribute)getElterngeldantragAnfrage0204Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAnfrage0204Type_AnfragerOrganisationsID() {
        return (EAttribute)getElterngeldantragAnfrage0204Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAnfrage0204Type_AntwortAbweichenderEmpfaenger() {
        return (EReference)getElterngeldantragAnfrage0204Type().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElterngeldantragAnfrageabschluss0205Type() {
		if (elterngeldantragAnfrageabschluss0205TypeEClass == null) {
			elterngeldantragAnfrageabschluss0205TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(43);
		}
		return elterngeldantragAnfrageabschluss0205TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAnfrageabschluss0205Type_AnfrageID() {
        return (EAttribute)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAnfrageabschluss0205Type_AntragsReferenz() {
        return (EAttribute)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAnfrageabschluss0205Type_Anfragegrund() {
        return (EReference)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAnfrageabschluss0205Type_Anfrageparameter() {
        return (EReference)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAnfrageabschluss0205Type_AnfragendesSystem() {
        return (EAttribute)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragAnfrageabschluss0205Type_AnfragerOrganisationsID() {
        return (EAttribute)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAnfrageabschluss0205Type_AntwortAbweichenderEmpfaenger() {
        return (EReference)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAnfrageabschluss0205Type_Anfrageergebnis() {
        return (EReference)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAnfrageabschluss0205Type_Fehlerfall() {
        return (EReference)getElterngeldantragAnfrageabschluss0205Type().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElterngeldantragAntrag0201Type() {
		if (elterngeldantragAntrag0201TypeEClass == null) {
			elterngeldantragAntrag0201TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(44);
		}
		return elterngeldantragAntrag0201TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_Kind() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_Elterngeldantrag() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_Gesamteinkommen() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_ElternteilEins() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_ElternteilZwei() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_MutterschaftsgeldArbeitgeberzuschussVglLeistungen() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_WeitereKinderImHaushalt() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_NachweisdokumentAntragsservice() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_PdfAntrag() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_NachweisdokumentAntragsteller() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragAntrag0201Type_Datenabruf() {
        return (EReference)getElterngeldantragAntrag0201Type().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElterngeldantragStandesamtsmeldung0203Type() {
		if (elterngeldantragStandesamtsmeldung0203TypeEClass == null) {
			elterngeldantragStandesamtsmeldung0203TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(46);
		}
		return elterngeldantragStandesamtsmeldung0203TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElterngeldantragStandesamtsmeldung0203Type_AnforderungErfolgt() {
        return (EAttribute)getElterngeldantragStandesamtsmeldung0203Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElterngeldantragVorabmeldung0202Type() {
		if (elterngeldantragVorabmeldung0202TypeEClass == null) {
			elterngeldantragVorabmeldung0202TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(47);
		}
		return elterngeldantragVorabmeldung0202TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragVorabmeldung0202Type_AntragstellenerElternteilVorabmeldung() {
        return (EReference)getElterngeldantragVorabmeldung0202Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragVorabmeldung0202Type_AngabenKindVorabmeldung() {
        return (EReference)getElterngeldantragVorabmeldung0202Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElterngeldantragVorabmeldung0202Type_Antragsdokumente() {
        return (EReference)getElterngeldantragVorabmeldung0202Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElternteilEinsElterngeldantragType() {
		if (elternteilEinsElterngeldantragTypeEClass == null) {
			elternteilEinsElterngeldantragTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(48);
		}
		return elternteilEinsElterngeldantragTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_PersoenlicheAngaben() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_Anschrift() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_GewoehnlicherAufenthalt() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_Kindschaftsverhaeltnis() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_HaushaltszugehoerigkeitDesKindes() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_Alleinerziehendenanspruch() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_BeantragungElterngeld() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_Krankenversicherung() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_EinkommenVorGeburt() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_EinkommenWaehrendBezugszeitraum() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_Bankverbindung() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_ZustimmungDatenabrufe() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternteilEinsElterngeldantragType_ZustimmungAuskunftseinholungJobcenterArbeitsamt() {
        return (EAttribute)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_Kontaktmoeglichkeit() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternteilEinsElterngeldantragType_SteuerlicheIdentifikationsnummer() {
        return (EAttribute)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_Nutzerkonto() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_ErwerbstaetigkeitBezugszeitraum() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_BescheidzustellungVersandweg() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_GesetzlicheVertretung() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilEinsElterngeldantragType_Elternzeit() {
        return (EReference)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternteilEinsElterngeldantragType_ZusammenveranlagungLiegtVor() {
        return (EAttribute)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternteilEinsElterngeldantragType_MitteilungAnBehoerde() {
        return (EAttribute)getElternteilEinsElterngeldantragType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElternteilZweiElterngeldantragType() {
		if (elternteilZweiElterngeldantragTypeEClass == null) {
			elternteilZweiElterngeldantragTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(49);
		}
		return elternteilZweiElterngeldantragTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_PersoenlicheAngaben() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_Anschrift() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_GewoehnlicherAufenthalt() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_Kindschaftsverhaeltnis() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_HaushaltszugehoerigkeitDesKindes() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_BeantragungElterngeld() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_Krankenversicherung() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_EinkommenVorGeburt() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_EinkommenWaehrendBezugszeitraum() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_Bankverbindung() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_ZustimmungDatenabrufe() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternteilZweiElterngeldantragType_ZustimmungAuskunftseinholungJobcenterArbeitsamt() {
        return (EAttribute)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_Kontaktmoeglichkeit() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternteilZweiElterngeldantragType_SteuerlicheIdentifikationsnummer() {
        return (EAttribute)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_Nutzerkonto() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_ErwerbstaetigkeitBezugszeitraum() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_BescheidzustellungVersandweg() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_GesetzlicheVertretung() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternteilZweiElterngeldantragType_Elternzeit() {
        return (EReference)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternteilZweiElterngeldantragType_ZusammenveranlagungLiegtVor() {
        return (EAttribute)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternteilZweiElterngeldantragType_MitteilungAnBehoerde() {
        return (EAttribute)getElternteilZweiElterngeldantragType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElternzeitType() {
		if (elternzeitTypeEClass == null) {
			elternzeitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(50);
		}
		return elternzeitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternzeitType_ZeitraumVon() {
        return (EAttribute)getElternzeitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternzeitType_ZeitraumBis() {
        return (EAttribute)getElternzeitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErwerbstaetigkeitBezugszeitraumType() {
		if (erwerbstaetigkeitBezugszeitraumTypeEClass == null) {
			erwerbstaetigkeitBezugszeitraumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(51);
		}
		return erwerbstaetigkeitBezugszeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErwerbstaetigkeitBezugszeitraumType_EinkuenfteErwerbstaetigkeitBezugszeitraum() {
        return (EAttribute)getErwerbstaetigkeitBezugszeitraumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErwerbstaetigkeitBezugszeitraumType_Resturlaub() {
        return (EReference)getErwerbstaetigkeitBezugszeitraumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErwerbstaetigkeitBezugszeitraumType_Berufsbildung() {
        return (EReference)getErwerbstaetigkeitBezugszeitraumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErwerbstaetigkeitBezugszeitraumType_Tagespflege() {
        return (EReference)getErwerbstaetigkeitBezugszeitraumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFreiwilligendienstType() {
		if (freiwilligendienstTypeEClass == null) {
			freiwilligendienstTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(54);
		}
		return freiwilligendienstTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreiwilligendienstType_Freiwilligendienst() {
        return (EAttribute)getFreiwilligendienstType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreiwilligendienstType_Zeitraum() {
        return (EAttribute)getFreiwilligendienstType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreiwilligendienstType_WochenstundenJeTaetigkeit() {
        return (EAttribute)getFreiwilligendienstType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeringesEinkommenCovid19Type() {
		if (geringesEinkommenCovid19TypeEClass == null) {
			geringesEinkommenCovid19TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(55);
		}
		return geringesEinkommenCovid19TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeringesEinkommenCovid19Type_GeringesEinkommenCovid19() {
        return (EAttribute)getGeringesEinkommenCovid19Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeringesEinkommenCovid19Type_AntragAusklammerungMonateNichtselbststaendige() {
        return (EAttribute)getGeringesEinkommenCovid19Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeringesEinkommenCovid19Type_Zeitraum() {
        return (EReference)getGeringesEinkommenCovid19Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeringesEinkommenCovid19Type_AntragVerschiebungBemessungszeitraumesSelbststaendige() {
        return (EAttribute)getGeringesEinkommenCovid19Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeringesEinkommenCovid19Type_VerschiebungBemessungszeitraumesSelbststaendige() {
        return (EAttribute)getGeringesEinkommenCovid19Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeringesEinkommenCovid19Type_NachweisGeringesEinkommenCovid19() {
        return (EReference)getGeringesEinkommenCovid19Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGesamteinkommenType() {
		if (gesamteinkommenTypeEClass == null) {
			gesamteinkommenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(58);
		}
		return gesamteinkommenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGesamteinkommenType_Gesamteinkommen() {
        return (EReference)getGesamteinkommenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGesamteinkommenType_NachweisGesamteinkommen() {
        return (EReference)getGesamteinkommenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGesetzlicheVertretungType() {
		if (gesetzlicheVertretungTypeEClass == null) {
			gesetzlicheVertretungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(59);
		}
		return gesetzlicheVertretungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGesetzlicheVertretungType_AnredeGesetzlicheVertretung() {
        return (EReference)getGesetzlicheVertretungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGesetzlicheVertretungType_NameGesetzlicheVertretung() {
        return (EReference)getGesetzlicheVertretungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGesetzlicheVertretungType_AnschriftGesetzlicheVertretung() {
        return (EReference)getGesetzlicheVertretungType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGesetzlicheVertretungType_NutzerkontoGesetzlicheVertretung() {
        return (EReference)getGesetzlicheVertretungType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGesetzlicheVertretungType_NachweisGesetzlicheVertretung() {
        return (EReference)getGesetzlicheVertretungType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGewoehnlicherAufenthaltType() {
		if (gewoehnlicherAufenthaltTypeEClass == null) {
			gewoehnlicherAufenthaltTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(60);
		}
		return gewoehnlicherAufenthaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGewoehnlicherAufenthaltType_Wohnsitz() {
        return (EReference)getGewoehnlicherAufenthaltType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGewoehnlicherAufenthaltType_BeginnAufenthaltD() {
        return (EAttribute)getGewoehnlicherAufenthaltType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGewoehnlicherAufenthaltType_BefristeterAuslandsaufenthalt() {
        return (EReference)getGewoehnlicherAufenthaltType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGewoehnlicherAufenthaltType_UnbefristeterAuslandsaufenthalt() {
        return (EReference)getGewoehnlicherAufenthaltType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGewoehnlicherAufenthaltType_AuslaendischesArbeitsverhaeltnis() {
        return (EReference)getGewoehnlicherAufenthaltType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGewoehnlicherAufenthaltType_MitgliedNatoZivilesGefolge() {
        return (EAttribute)getGewoehnlicherAufenthaltType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGewoehnlicherAufenthaltType_MitgliedDiplomatischeMissionOderKonsularischeVertretung() {
        return (EAttribute)getGewoehnlicherAufenthaltType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHaushaltszugehoerigkeitDesKindesType() {
		if (haushaltszugehoerigkeitDesKindesTypeEClass == null) {
			haushaltszugehoerigkeitDesKindesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(61);
		}
		return haushaltszugehoerigkeitDesKindesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHaushaltszugehoerigkeitDesKindesType_BetreuungUndErziehungImEigenenHaushalt() {
        return (EReference)getHaushaltszugehoerigkeitDesKindesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKindElterngeldType() {
		if (kindElterngeldTypeEClass == null) {
			kindElterngeldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(62);
		}
		return kindElterngeldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_NameKind() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_Geburtsdatum() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_Geburtsurkunde() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_AnschriftBeiAntragstellung() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_BesondersFruehGeborenesKind() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_Adoption() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_Mehrlingsgeburt() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_BehinderungKind() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindElterngeldType_NummerGeburtsstandesamt() {
        return (EReference)getKindElterngeldType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKindschaftsverhaeltnisType() {
		if (kindschaftsverhaeltnisTypeEClass == null) {
			kindschaftsverhaeltnisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(65);
		}
		return kindschaftsverhaeltnisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindschaftsverhaeltnisType_Kindschaftsverhaeltnis() {
        return (EReference)getKindschaftsverhaeltnisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindschaftsverhaeltnisType_Nachweis() {
        return (EReference)getKindschaftsverhaeltnisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKindVorabmeldungType() {
		if (kindVorabmeldungTypeEClass == null) {
			kindVorabmeldungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(66);
		}
		return kindVorabmeldungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindVorabmeldungType_NameKind() {
        return (EReference)getKindVorabmeldungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKindVorabmeldungType_Geburtsdatum() {
        return (EReference)getKindVorabmeldungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKrankengeldType() {
		if (krankengeldTypeEClass == null) {
			krankengeldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(67);
		}
		return krankengeldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKrankengeldType_BezugKrankengeldSchwangerschaft() {
        return (EAttribute)getKrankengeldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankengeldType_ZeitraumKrankengeldSchwangerschaft() {
        return (EReference)getKrankengeldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankengeldType_NachweisKrankengeldSchwangerschaft() {
        return (EReference)getKrankengeldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKrankentagegeldType() {
		if (krankentagegeldTypeEClass == null) {
			krankentagegeldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(68);
		}
		return krankentagegeldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKrankentagegeldType_BezugKrankentagegeld() {
        return (EAttribute)getKrankentagegeldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankentagegeldType_ZeitraumKrankentagegeld() {
        return (EReference)getKrankentagegeldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankentagegeldType_NachweisKrankentagegeld() {
        return (EReference)getKrankentagegeldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKrankenversicherungType() {
		if (krankenversicherungTypeEClass == null) {
			krankenversicherungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(69);
		}
		return krankenversicherungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankenversicherungType_Versicherungsart() {
        return (EReference)getKrankenversicherungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKrankenversicherungType_BezeichnungKrankenkasse() {
        return (EAttribute)getKrankenversicherungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankenversicherungType_AnschriftKrankenkasse() {
        return (EReference)getKrankenversicherungType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKrankenversicherungType_Versichertennummer() {
        return (EAttribute)getKrankenversicherungType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankenversicherungType_AnschriftPostfachKrankenkasse() {
        return (EReference)getKrankenversicherungType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKrankenversicherungType_NachweisKrankenversicherung() {
        return (EReference)getKrankenversicherungType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenssituationType() {
		if (lebenssituationTypeEClass == null) {
			lebenssituationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(70);
		}
		return lebenssituationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenssituationType_UnverheiratetesZusammenleben() {
        return (EAttribute)getLebenssituationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationType_UnverheiratetesZusammenlebenSeit() {
        return (EReference)getLebenssituationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenssituationType_DauerndesGetrenntLeben() {
        return (EAttribute)getLebenssituationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationType_DauerndesGetrenntLebenSeit() {
        return (EReference)getLebenssituationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMehrlingsgeburtType() {
		if (mehrlingsgeburtTypeEClass == null) {
			mehrlingsgeburtTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(73);
		}
		return mehrlingsgeburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMehrlingsgeburtType_Mehrlingsgeburt() {
        return (EAttribute)getMehrlingsgeburtType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMehrlingsgeburtType_AnzahlMehrlinge() {
        return (EAttribute)getMehrlingsgeburtType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMehrlingsgeburtType_VornamenMehrlingskind() {
        return (EAttribute)getMehrlingsgeburtType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMehrlingsgeburtType_NachweisMehrlingsgeburt() {
        return (EReference)getMehrlingsgeburtType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMidijobType() {
		if (midijobTypeEClass == null) {
			midijobTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(74);
		}
		return midijobTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMidijobType_Zeitraum() {
        return (EReference)getMidijobType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMidijobType_WochenstundenJeTaetigkeitMidijob() {
        return (EAttribute)getMidijobType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMidijobType_NachweisMidijob() {
        return (EReference)getMidijobType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinijobType() {
		if (minijobTypeEClass == null) {
			minijobTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(75);
		}
		return minijobTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMinijobType_Zeitraum() {
        return (EReference)getMinijobType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinijobType_WochenstundenJeTaetigkeitMinijob() {
        return (EAttribute)getMinijobType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMinijobType_NachweisMinijob() {
        return (EReference)getMinijobType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType() {
		if (mutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeEClass == null) {
			mutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(76);
		}
		return mutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Mutterschaftsgeld() {
        return (EAttribute)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_MutterschaftsgeldZeitraum() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_MutterschaftsgeldNachweis() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Arbeitgeberzuschuss() {
        return (EAttribute)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_ArbeitgeberzuschussZeitraum() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_ArbeitgeberzuschussNachweis() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_Krankentagegeld() {
        return (EAttribute)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_KrankentagegeldZeitraum() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_KrankentagegeldNachweis() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezug() {
        return (EAttribute)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezugZeitraum() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_DienstAnwaerterbezugNachweis() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSoldatenrecht() {
        return (EAttribute)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSoldatenrechtZeitraum() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_BeamtenSodatenrechtNachweis() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungen() {
        return (EAttribute)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungenZeitraum() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType_AuslFamilienleistungenNachweis() {
        return (EReference)getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNichtselbststaendigeBeschaeftigungVorGeburtType() {
		if (nichtselbststaendigeBeschaeftigungVorGeburtTypeEClass == null) {
			nichtselbststaendigeBeschaeftigungVorGeburtTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(77);
		}
		return nichtselbststaendigeBeschaeftigungVorGeburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigeBeschaeftigungVorGeburtType_NichtselbststaendigkeitAusklammerungstatbestaende() {
        return (EReference)getNichtselbststaendigeBeschaeftigungVorGeburtType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Berufsbildung() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungVorGeburtType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Midijob() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungVorGeburtType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Steuerfreibetrag() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungVorGeburtType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Minijob() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungVorGeburtType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungVorGeburtType_Freiwilligendienst() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungVorGeburtType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType() {
		if (nichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeEClass == null) {
			nichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(78);
		}
		return nichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Teilzeittaetigkeit() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenTeilzeittaetigkeit() {
        return (EReference)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Midijob() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenMidijob() {
        return (EReference)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Minijob() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_AngabenMinijob() {
        return (EReference)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Steuerfreibetrag() {
        return (EAttribute)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Berufsausbildung() {
        return (EReference)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType_Freiwilligendienst() {
        return (EReference)getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNichtselbststaendigkeitAusklammerungstatbestaendeType() {
		if (nichtselbststaendigkeitAusklammerungstatbestaendeTypeEClass == null) {
			nichtselbststaendigkeitAusklammerungstatbestaendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(79);
		}
		return nichtselbststaendigkeitAusklammerungstatbestaendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_MutterschaftsgeldbezugVorGeburtAntragskind() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMutterschaftsgeldbezugAntragskind() {
        return (EReference)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_MutterschaftsgeldbezugVorGeburtaelteresKind() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMutterschaftsgeldbezugAelteresKind() {
        return (EReference)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_ElterngeldbezugAelteresKind() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisElterngeldbezugAelteresKind() {
        return (EReference)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_MoeglicheEinkommensverluste() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisMoeglicheEinkommensverluste() {
        return (EReference)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustWehrUndZivildienst() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisEinkommensverlustWehrUndZivildienst() {
        return (EReference)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_AntragAusklammerungsverzicht() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_ZeitraumAntragAusklammerungsverzicht() {
        return (EReference)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_ElterngeldbezugFuerBesondersFruehGeborenesAelteresKind() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNichtselbststaendigkeitAusklammerungstatbestaendeType_NachweisAelteresBesondersFruehGeborenesKind() {
        return (EReference)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankung() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNichtselbststaendigkeitAusklammerungstatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis() {
        return (EAttribute)getNichtselbststaendigkeitAusklammerungstatbestaendeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersoenlicheAngabenETType() {
		if (persoenlicheAngabenETTypeEClass == null) {
			persoenlicheAngabenETTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(80);
		}
		return persoenlicheAngabenETTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenETType_Name() {
        return (EReference)getPersoenlicheAngabenETType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenETType_Geburtsdatum() {
        return (EAttribute)getPersoenlicheAngabenETType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenETType_Geburtsort() {
        return (EAttribute)getPersoenlicheAngabenETType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenETType_Geschlecht() {
        return (EReference)getPersoenlicheAngabenETType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenETType_Familienstand() {
        return (EReference)getPersoenlicheAngabenETType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenETType_VerheiratetVerpartnertMitET() {
        return (EAttribute)getPersoenlicheAngabenETType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenETType_UnverheiratetesZusammenleben() {
        return (EAttribute)getPersoenlicheAngabenETType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersoenlicheAngabenETType_Alleinerziehend() {
        return (EAttribute)getPersoenlicheAngabenETType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenETType_Staatsangehoerigkeit() {
        return (EReference)getPersoenlicheAngabenETType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenETType_NachweisPersonalausweisPass() {
        return (EReference)getPersoenlicheAngabenETType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersoenlicheAngabenETType_Meldedatenabgleich() {
        return (EReference)getPersoenlicheAngabenETType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRentenType() {
		if (rentenTypeEClass == null) {
			rentenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(81);
		}
		return rentenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRentenType_BezugRente() {
        return (EAttribute)getRentenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRentenType_ZeitraumRente() {
        return (EReference)getRentenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRentenType_NachweisRente() {
        return (EReference)getRentenType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRentenType_ArtRente() {
        return (EAttribute)getRentenType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResturlaubType() {
		if (resturlaubTypeEClass == null) {
			resturlaubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(82);
		}
		return resturlaubTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResturlaubType_AnzahlTage() {
        return (EAttribute)getResturlaubType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResturlaubType_Zeitraum() {
        return (EReference)getResturlaubType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResturlaubType_AnzahlDerWochenstunden() {
        return (EAttribute)getResturlaubType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType() {
		if (selbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeEClass == null) {
			selbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(83);
		}
		return selbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_AngabenSozialversicherung() {
        return (EReference)getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Kirchensteuerpflicht() {
        return (EAttribute)getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Verschiebetatbestaende() {
        return (EReference)getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Steuerfreibetrag() {
        return (EAttribute)getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_NachweisEinkommenssteuerbescheid() {
        return (EReference)getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelbststaendigkeitVerschiebetatbestaendeType() {
		if (selbststaendigkeitVerschiebetatbestaendeTypeEClass == null) {
			selbststaendigkeitVerschiebetatbestaendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(84);
		}
		return selbststaendigkeitVerschiebetatbestaendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_MutterschaftsgeldbezugVorGeburtAntragskind() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisMutterschaftsgeldbezugAntragskind() {
        return (EReference)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_MutterschaftsgeldbezugVorGeburtaelteresKind() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisMutterschaftsgeldbezugAelteresKind() {
        return (EReference)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_ElterngeldbezugAelteresKind() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisElterngeldbezugAelteresKind() {
        return (EReference)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_MoeglicheEinkommensverluste() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisMoeglicheEinkommensverluste() {
        return (EReference)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_EinkommensverlustWehrUndZivildienst() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisEinkommensverlustWehrUndZivildienst() {
        return (EReference)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_AntragVerschiebungBemessungszeitraum() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_AngabeKalenderjahrZurBerechnung() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_ElterngeldbezugFuerBesondersFruehGeborenesAelteresKind() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelbststaendigkeitVerschiebetatbestaendeType_NachweisAelteresBesondersFruehGeborenesKind() {
        return (EReference)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankung() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelbststaendigkeitVerschiebetatbestaendeType_EinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis() {
        return (EAttribute)getSelbststaendigkeitVerschiebetatbestaendeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstigeLeistungenBezugszeitraumType() {
		if (sonstigeLeistungenBezugszeitraumTypeEClass == null) {
			sonstigeLeistungenBezugszeitraumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(85);
		}
		return sonstigeLeistungenBezugszeitraumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungenBezugszeitraumType_BezugElterngeldAusland() {
        return (EAttribute)getSonstigeLeistungenBezugszeitraumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungenBezugszeitraumType_NachweisElterngeldAusland() {
        return (EReference)getSonstigeLeistungenBezugszeitraumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungenBezugszeitraumType_BezugALGII() {
        return (EAttribute)getSonstigeLeistungenBezugszeitraumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungenBezugszeitraumType_NachweisALGII() {
        return (EReference)getSonstigeLeistungenBezugszeitraumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungenBezugszeitraumType_NameSozialleistungstraeger() {
        return (EAttribute)getSonstigeLeistungenBezugszeitraumType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungenBezugszeitraumType_AnschriftSozialleistungstraeger() {
        return (EReference)getSonstigeLeistungenBezugszeitraumType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaatsangehoerigkeitType() {
		if (staatsangehoerigkeitTypeEClass == null) {
			staatsangehoerigkeitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(86);
		}
		return staatsangehoerigkeitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaatsangehoerigkeitType_Staatsangehoerigkeiten() {
        return (EReference)getStaatsangehoerigkeitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaatsangehoerigkeitType_VerlustFreizuegigkeit() {
        return (EAttribute)getStaatsangehoerigkeitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaatsangehoerigkeitType_Aufenthaltstitel() {
        return (EReference)getStaatsangehoerigkeitType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagespflegeType() {
		if (tagespflegeTypeEClass == null) {
			tagespflegeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(87);
		}
		return tagespflegeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagespflegeType_Tagespflege() {
        return (EAttribute)getTagespflegeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagespflegeType_AnzahlDerKinderOhneEigeneKinder() {
        return (EAttribute)getTagespflegeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagespflegeType_Nachweis() {
        return (EReference)getTagespflegeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeilzeittaetigkeitType() {
		if (teilzeittaetigkeitTypeEClass == null) {
			teilzeittaetigkeitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(88);
		}
		return teilzeittaetigkeitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeilzeittaetigkeitType_Zeitraum() {
        return (EReference)getTeilzeittaetigkeitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeilzeittaetigkeitType_WochenstundenJeTaetigkeitTeilzeit() {
        return (EAttribute)getTeilzeittaetigkeitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeilzeittaetigkeitType_NachweisTeilzeit() {
        return (EReference)getTeilzeittaetigkeitType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeitereKinderType() {
		if (weitereKinderTypeEClass == null) {
			weitereKinderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(93);
		}
		return weitereKinderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeitereKinderType_AnzahlAllerImHaushaltLebendenKinder() {
        return (EAttribute)getWeitereKinderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereKinderType_AngabenWeiteresKind() {
        return (EReference)getWeitereKinderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZustimmungDatenabrufeType() {
		if (zustimmungDatenabrufeTypeEClass == null) {
			zustimmungDatenabrufeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(94);
		}
		return zustimmungDatenabrufeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufDSRV() {
        return (EAttribute)getZustimmungDatenabrufeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufStandesamt() {
        return (EAttribute)getZustimmungDatenabrufeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufKrankenkasse() {
        return (EAttribute)getZustimmungDatenabrufeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufFinanzamt() {
        return (EAttribute)getZustimmungDatenabrufeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZustimmungDatenabrufeType_ZustimmungDatenabrufBeamte() {
        return (EAttribute)getZustimmungDatenabrufeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAbbruchgrund() {
		if (abbruchgrundEEnum == null) {
			abbruchgrundEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(0);
		}
		return abbruchgrundEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAnfragegrund() {
		if (anfragegrundEEnum == null) {
			anfragegrundEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(6);
		}
		return anfragegrundEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getElterngeldantrag() {
		if (elterngeldantragEEnum == null) {
			elterngeldantragEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(40);
		}
		return elterngeldantragEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFehlerfall() {
		if (fehlerfallEEnum == null) {
			fehlerfallEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(52);
		}
		return fehlerfallEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGesamteinkommen() {
		if (gesamteinkommenEEnum == null) {
			gesamteinkommenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(56);
		}
		return gesamteinkommenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKindschaftsverhaeltnis() {
		if (kindschaftsverhaeltnisEEnum == null) {
			kindschaftsverhaeltnisEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(63);
		}
		return kindschaftsverhaeltnisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLeistungshoehe() {
		if (leistungshoeheEEnum == null) {
			leistungshoeheEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(71);
		}
		return leistungshoeheEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVersandweg() {
		if (versandwegEEnum == null) {
			versandwegEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(89);
		}
		return versandwegEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVersicherungsart() {
		if (versicherungsartEEnum == null) {
			versicherungsartEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(91);
		}
		return versicherungsartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAbbruchgrundObject() {
		if (abbruchgrundObjectEDataType == null) {
			abbruchgrundObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(1);
		}
		return abbruchgrundObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnfragegrundObject() {
		if (anfragegrundObjectEDataType == null) {
			anfragegrundObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(7);
		}
		return anfragegrundObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getElterngeldantragObject() {
		if (elterngeldantragObjectEDataType == null) {
			elterngeldantragObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(45);
		}
		return elterngeldantragObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFehlerfallObject() {
		if (fehlerfallObjectEDataType == null) {
			fehlerfallObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(53);
		}
		return fehlerfallObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGesamteinkommenObject() {
		if (gesamteinkommenObjectEDataType == null) {
			gesamteinkommenObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(57);
		}
		return gesamteinkommenObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKindschaftsverhaeltnisObject() {
		if (kindschaftsverhaeltnisObjectEDataType == null) {
			kindschaftsverhaeltnisObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(64);
		}
		return kindschaftsverhaeltnisObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLeistungshoeheObject() {
		if (leistungshoeheObjectEDataType == null) {
			leistungshoeheObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(72);
		}
		return leistungshoeheObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersandwegObject() {
		if (versandwegObjectEDataType == null) {
			versandwegObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(90);
		}
		return versandwegObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersicherungsartObject() {
		if (versicherungsartObjectEDataType == null) {
			versicherungsartObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI).getEClassifiers().get(92);
		}
		return versicherungsartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldFactory getElterngeldFactory() {
		return (ElterngeldFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.xoev.xfamilie.elterngeldantrag._1.elterngeld." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ElterngeldPackageImpl
