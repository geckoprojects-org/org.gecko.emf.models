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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldPackageImpl;

import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;

import de.xoev.xfamilie.geburt._1.geburt.impl.GeburtPackageImpl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErziehungshilfePackageImpl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldPackageImpl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussFactory;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

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
public class UnterhaltsvorschussPackageImpl extends EPackageImpl implements UnterhaltsvorschussPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "unterhaltsvorschuss.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amtspflegendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anderePersonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andererElternteilBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andererElternteilUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angabenKindNachreichenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anschriftOptionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragskindBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragskindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragskindUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellenderElternteilBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellenderElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antragstellenderElternteilUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aufenthaltKindBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aufenthaltKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aufenthaltKindUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ausbildungAndererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beistandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bemuehungenUnterhaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bestaetigungAngabenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betreuerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezugUvKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAusbildungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEinkuenfteAndererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEinkuenfteKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSonstigeLeistungenUVTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeStaatsangehoerigkeitUVTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSteuerklasseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeUnterhaltsbemuehungenTypeEClass = null;

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
	private EClass einkuenfteAndererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einkuenfteKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elternschaftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familienstandBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familienstandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familienstandUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geburtGeburtsortPflichtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geburtNurGeburtsdatumTypeEClass = null;

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
	private EClass geschiedenAntragstellendeBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschiedenAntragstellendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschiedenAntragstellendeUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass institutionUnterhaltstitelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerschaftAntragstellendeBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerschaftAntragstellendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerschaftAntragstellendeUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerschaftAufgehobenAntragstellendeBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerschaftAufgehobenAntragstellendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerVerstorbenAntragstellendeBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerVerstorbenAntragstellendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenspartnerVerstorbenAntragstellendeUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lebenssituationBasisTypeEClass = null;

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
	private EClass lebenssituationUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledigAntragstellendeBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledigAntragstellendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledigAntragstellendeUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leistungserhaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leistungsgewaehrungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lohnsteuerklasseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameMitGeburtsnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameOhneGeburtsnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameOptionalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rechtsanwaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstigeLeistungAndererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstigeLeistungKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonstigeLeistungKindUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staatsangehoerigkeitAndererElternteilTypeEClass = null;

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
	private EClass traegerKrankenversicherungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltstitelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltstitelUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltsvorauszahlungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltsvorschussantragAntrag0301TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltsvorschussantragNachreichen0303TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltsvorschussantragNachweisnachricht0311TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltszahlungenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unterhaltUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verheiratetAntragstellendeBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verheiratetAntragstellendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verheiratetAntragstellendeUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vermoegenAndererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertretungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertretungUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verwitwetAntragstellendeBasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verwitwetAntragstellendeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verwitwetAntragstellendeUeberpruefungTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vormundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weitereGemeinsameKinderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weitereKinderAndererElternteilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ausbildungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum einkuenfteandererelternteilEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum einkuenftekinduvEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sonstigeleistungenuvEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum staatsangehoerigkeituvEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum steuerklasseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unterhaltsbemuehungenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ausbildungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType einkuenfteandererelternteilObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType einkuenftekinduvObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sonstigeleistungenuvObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType staatsangehoerigkeituvObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType steuerklasseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unterhaltsbemuehungenObjectEDataType = null;

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
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnterhaltsvorschussPackageImpl() {
		super(eNS_URI, UnterhaltsvorschussFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UnterhaltsvorschussPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static UnterhaltsvorschussPackage init() {
		if (isInited) return (UnterhaltsvorschussPackage)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUnterhaltsvorschussPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UnterhaltsvorschussPackageImpl theUnterhaltsvorschussPackage = registeredUnterhaltsvorschussPackage instanceof UnterhaltsvorschussPackageImpl ? (UnterhaltsvorschussPackageImpl)registeredUnterhaltsvorschussPackage : new UnterhaltsvorschussPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElterngeldPackage.eNS_URI);
		ElterngeldPackageImpl theElterngeldPackage = (ElterngeldPackageImpl)(registeredPackage instanceof ElterngeldPackageImpl ? registeredPackage : ElterngeldPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeburtPackage.eNS_URI);
		GeburtPackageImpl theGeburtPackage = (GeburtPackageImpl)(registeredPackage instanceof GeburtPackageImpl ? registeredPackage : GeburtPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ErziehungshilfePackage.eNS_URI);
		ErziehungshilfePackageImpl theErziehungshilfePackage = (ErziehungshilfePackageImpl)(registeredPackage instanceof ErziehungshilfePackageImpl ? registeredPackage : ErziehungshilfePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KinderwunschPackage.eNS_URI);
		KinderwunschPackageImpl theKinderwunschPackage = (KinderwunschPackageImpl)(registeredPackage instanceof KinderwunschPackageImpl ? registeredPackage : KinderwunschPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MutterschaftsgeldPackage.eNS_URI);
		MutterschaftsgeldPackageImpl theMutterschaftsgeldPackage = (MutterschaftsgeldPackageImpl)(registeredPackage instanceof MutterschaftsgeldPackageImpl ? registeredPackage : MutterschaftsgeldPackage.eINSTANCE);

		// Load packages
		theUnterhaltsvorschussPackage.loadPackage();
		theElterngeldPackage.loadPackage();

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
		theUnterhaltsvorschussPackage.fixPackageContents();
		theElterngeldPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnterhaltsvorschussPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnterhaltsvorschussPackage.eNS_URI, theUnterhaltsvorschussPackage);
		return theUnterhaltsvorschussPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmtspflegendeType() {
		if (amtspflegendeTypeEClass == null) {
			amtspflegendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(0);
		}
		return amtspflegendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmtspflegendeType_Name() {
        return (EReference)getAmtspflegendeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmtspflegendeType_AnschriftJugendamt() {
        return (EReference)getAmtspflegendeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmtspflegendeType_JugendamtEMail() {
        return (EAttribute)getAmtspflegendeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmtspflegendeType_Aktenzeichen() {
        return (EAttribute)getAmtspflegendeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmtspflegendeType_BeauftragtGeltungsmachungUVanspruch() {
        return (EAttribute)getAmtspflegendeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmtspflegendeType_Telefonnummer() {
        return (EAttribute)getAmtspflegendeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnderePersonType() {
		if (anderePersonTypeEClass == null) {
			anderePersonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(1);
		}
		return anderePersonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnderePersonType_Name() {
        return (EReference)getAnderePersonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnderePersonType_Anschrift() {
        return (EReference)getAnderePersonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnderePersonType_Bezeichnung() {
        return (EAttribute)getAnderePersonType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndererElternteilBasisType() {
		if (andererElternteilBasisTypeEClass == null) {
			andererElternteilBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(2);
		}
		return andererElternteilBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Name() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Geburt() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAndererElternteilBasisType_Anrede() {
        return (EAttribute)getAndererElternteilBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Kindschaftsbeziehung() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Anschrift() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_AndereRegelmaessigerAufenthaltort() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Staatsangehoerigkeit() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_ZusammenlebendMitNeuenPartner() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Erreichbarkeit() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Vertretung() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Vermoegen() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Einkuenfte() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_SonstigeLeistungen() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_TraegerKrankenversicherung() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_WeitereKinder() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Ausbildung() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAndererElternteilBasisType_Leistungsfaehig() {
        return (EAttribute)getAndererElternteilBasisType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_WeitereAngaben() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAndererElternteilBasisType_Geschlecht() {
        return (EReference)getAndererElternteilBasisType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndererElternteilType() {
		if (andererElternteilTypeEClass == null) {
			andererElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(3);
		}
		return andererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndererElternteilUeberpruefungType() {
		if (andererElternteilUeberpruefungTypeEClass == null) {
			andererElternteilUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(4);
		}
		return andererElternteilUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAngabenKindNachreichenType() {
		if (angabenKindNachreichenTypeEClass == null) {
			angabenKindNachreichenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(5);
		}
		return angabenKindNachreichenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindNachreichenType_Name() {
        return (EReference)getAngabenKindNachreichenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAngabenKindNachreichenType_Geburt() {
        return (EReference)getAngabenKindNachreichenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnschriftOptionalType() {
		if (anschriftOptionalTypeEClass == null) {
			anschriftOptionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(6);
		}
		return anschriftOptionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_Hausnummer() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_HausnummerBuchstabeZusatzziffer() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_Postleitzahl() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_Stockwerkswohnungsnummer() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_Strasse() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_TeilnummerDerHausnummer() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_Wohnort() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_WohnortFruehererGemeindename() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_Wohnungsinhaber() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnschriftOptionalType_Zusatzangaben() {
        return (EAttribute)getAnschriftOptionalType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnschriftOptionalType_Staat() {
        return (EReference)getAnschriftOptionalType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragskindBasisType() {
		if (antragskindBasisTypeEClass == null) {
			antragskindBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(7);
		}
		return antragskindBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Name() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Geburt() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragskindBasisType_Geburtsurkunde() {
        return (EAttribute)getAntragskindBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragskindBasisType_Aufenthaltstitel() {
        return (EAttribute)getAntragskindBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Staatsangehoerigkeit() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Aufenthalt() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Vertretung() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Einkuenfte() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_SonstigeLeistung() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_AnderePersonVerstorben() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_MitbetreuungDurchAnderenElternteil() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Schule() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Studium() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragskindBasisType_Geschlecht() {
        return (EReference)getAntragskindBasisType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragskindBasisType_Aktenzeichen() {
        return (EAttribute)getAntragskindBasisType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragskindType() {
		if (antragskindTypeEClass == null) {
			antragskindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(8);
		}
		return antragskindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragskindUeberpruefungType() {
		if (antragskindUeberpruefungTypeEClass == null) {
			antragskindUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(9);
		}
		return antragskindUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderElternteilBasisType() {
		if (antragstellenderElternteilBasisTypeEClass == null) {
			antragstellenderElternteilBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(10);
		}
		return antragstellenderElternteilBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Name() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Geburt() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilBasisType_Anrede() {
        return (EAttribute)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Kindschaftsbeziehung() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Anschrift() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_AufenthaltstitelEAT() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilBasisType_AufenthaltstitelUpload() {
        return (EAttribute)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Familienstand() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Erreichbarkeit() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Bankverbindung() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Staatsangehoerigkeit() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilBasisType_EinkommensgrenzeErfuellt() {
        return (EAttribute)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_PostAdresse() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Vertretung() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_ZukuenftigeAdresse() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilBasisType_ZukuenftigeAdresseAb() {
        return (EAttribute)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilBasisType_ZukuenftigeAdresseMitAnderemElternteil() {
        return (EAttribute)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAntragstellenderElternteilBasisType_ZukuenftigeAdresseMitAnderemElternteilAb() {
        return (EAttribute)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_NameNachweis() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Lohnsteuerklasse() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAntragstellenderElternteilBasisType_Geschlecht() {
        return (EReference)getAntragstellenderElternteilBasisType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderElternteilType() {
		if (antragstellenderElternteilTypeEClass == null) {
			antragstellenderElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(11);
		}
		return antragstellenderElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAntragstellenderElternteilUeberpruefungType() {
		if (antragstellenderElternteilUeberpruefungTypeEClass == null) {
			antragstellenderElternteilUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(12);
		}
		return antragstellenderElternteilUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAufenthaltKindBasisType() {
		if (aufenthaltKindBasisTypeEClass == null) {
			aufenthaltKindBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(13);
		}
		return aufenthaltKindBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAufenthaltKindBasisType_Art() {
        return (EReference)getAufenthaltKindBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufenthaltKindBasisType_AufenthaltsortGeheimHalten() {
        return (EAttribute)getAufenthaltKindBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAufenthaltKindBasisType_Auslandsschuljahr() {
        return (EReference)getAufenthaltKindBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufenthaltKindBasisType_SeitWann() {
        return (EAttribute)getAufenthaltKindBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufenthaltKindBasisType_AufenthaltHeim() {
        return (EAttribute)getAufenthaltKindBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAufenthaltKindType() {
		if (aufenthaltKindTypeEClass == null) {
			aufenthaltKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(14);
		}
		return aufenthaltKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAufenthaltKindUeberpruefungType() {
		if (aufenthaltKindUeberpruefungTypeEClass == null) {
			aufenthaltKindUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(15);
		}
		return aufenthaltKindUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAusbildungAndererElternteilType() {
		if (ausbildungAndererElternteilTypeEClass == null) {
			ausbildungAndererElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(17);
		}
		return ausbildungAndererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAusbildungAndererElternteilType_Art() {
        return (EReference)getAusbildungAndererElternteilType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAusbildungAndererElternteilType_ZusaetzlicheInformationen() {
        return (EAttribute)getAusbildungAndererElternteilType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeistandType() {
		if (beistandTypeEClass == null) {
			beistandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(19);
		}
		return beistandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandType_Name() {
        return (EReference)getBeistandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBeistandType_AnschriftJugendamt() {
        return (EReference)getBeistandType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandType_JugendamtEMail() {
        return (EAttribute)getBeistandType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandType_Aktenzeichen() {
        return (EAttribute)getBeistandType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandType_Telefonnummer() {
        return (EAttribute)getBeistandType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeistandType_BeauftragtGeltungsmachungUVanspruch() {
        return (EAttribute)getBeistandType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBemuehungenUnterhaltType() {
		if (bemuehungenUnterhaltTypeEClass == null) {
			bemuehungenUnterhaltTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(20);
		}
		return bemuehungenUnterhaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBemuehungenUnterhaltType_Art() {
        return (EReference)getBemuehungenUnterhaltType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBemuehungenUnterhaltType_Nachweis() {
        return (EAttribute)getBemuehungenUnterhaltType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBemuehungenUnterhaltType_GenauereAngaben() {
        return (EAttribute)getBemuehungenUnterhaltType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBemuehungenUnterhaltType_Gruende() {
        return (EAttribute)getBemuehungenUnterhaltType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBestaetigungAngabenType() {
		if (bestaetigungAngabenTypeEClass == null) {
			bestaetigungAngabenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(21);
		}
		return bestaetigungAngabenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBestaetigungAngabenType_WahrheitsgemaesseAngaben() {
        return (EAttribute)getBestaetigungAngabenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBestaetigungAngabenType_VerpflichtungAenderungsmitteilungen() {
        return (EAttribute)getBestaetigungAngabenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBetreuerType() {
		if (betreuerTypeEClass == null) {
			betreuerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(22);
		}
		return betreuerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBetreuerType_Name() {
        return (EReference)getBetreuerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBetreuerType_Anschrift() {
        return (EReference)getBetreuerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBetreuerType_EMailAdresse() {
        return (EAttribute)getBetreuerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBetreuerType_Aktenzeichen() {
        return (EAttribute)getBetreuerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBetreuerType_Telefonnummer() {
        return (EAttribute)getBetreuerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBetreuerType_Bestallungsurkunde() {
        return (EAttribute)getBetreuerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezugUvKindType() {
		if (bezugUvKindTypeEClass == null) {
			bezugUvKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(23);
		}
		return bezugUvKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezugUvKindType_BezugsJugendamt() {
        return (EAttribute)getBezugUvKindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBezugUvKindType_BisWann() {
        return (EReference)getBezugUvKindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeAusbildungType() {
		if (codeAusbildungTypeEClass == null) {
			codeAusbildungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(24);
		}
		return codeAusbildungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeEinkuenfteAndererElternteilType() {
		if (codeEinkuenfteAndererElternteilTypeEClass == null) {
			codeEinkuenfteAndererElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(25);
		}
		return codeEinkuenfteAndererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeEinkuenfteKindType() {
		if (codeEinkuenfteKindTypeEClass == null) {
			codeEinkuenfteKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(26);
		}
		return codeEinkuenfteKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeSonstigeLeistungenUVType() {
		if (codeSonstigeLeistungenUVTypeEClass == null) {
			codeSonstigeLeistungenUVTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(27);
		}
		return codeSonstigeLeistungenUVTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeStaatsangehoerigkeitUVType() {
		if (codeStaatsangehoerigkeitUVTypeEClass == null) {
			codeStaatsangehoerigkeitUVTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(28);
		}
		return codeStaatsangehoerigkeitUVTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeSteuerklasseType() {
		if (codeSteuerklasseTypeEClass == null) {
			codeSteuerklasseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(29);
		}
		return codeSteuerklasseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeUnterhaltsbemuehungenType() {
		if (codeUnterhaltsbemuehungenTypeEClass == null) {
			codeUnterhaltsbemuehungenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(30);
		}
		return codeUnterhaltsbemuehungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(31);
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
	public EReference getDocumentRoot_UnterhaltsvorschussantragAntrag0301() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnterhaltsvorschussantragJaehrlicheUeberpruefung0302() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnterhaltsvorschussantragNachreichen0303() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_UnterhaltsvorschussantragNachweisnachricht0311() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkuenfteAndererElternteilType() {
		if (einkuenfteAndererElternteilTypeEClass == null) {
			einkuenfteAndererElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(34);
		}
		return einkuenfteAndererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkuenfteAndererElternteilType_Art() {
        return (EReference)getEinkuenfteAndererElternteilType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkuenfteAndererElternteilType_WeitereInformationen() {
        return (EAttribute)getEinkuenfteAndererElternteilType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkuenfteAndererElternteilType_BetragDerEinkuenfte() {
        return (EAttribute)getEinkuenfteAndererElternteilType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinkuenfteKindType() {
		if (einkuenfteKindTypeEClass == null) {
			einkuenfteKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(35);
		}
		return einkuenfteKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkuenfteKindType_Art() {
        return (EReference)getEinkuenfteKindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkuenfteKindType_Nachweis() {
        return (EAttribute)getEinkuenfteKindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinkuenfteKindType_BetragDerEinkuenfte() {
        return (EAttribute)getEinkuenfteKindType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEinkuenfteKindType_Zeitraum() {
        return (EReference)getEinkuenfteKindType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElternschaftType() {
		if (elternschaftTypeEClass == null) {
			elternschaftTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(38);
		}
		return elternschaftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_EhelichesAntragskind() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_VaterschaftAnerkanntOderFestgestellt() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_EhemannIstLeiblicherVater() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_Nachweis() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElternschaftType_NameVater() {
        return (EReference)getElternschaftType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_AntragFeststellungGestellt() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_AntragAnfechtungAnhaengig() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_AngabedesGerichts() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_WeitereInformation() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElternschaftType_AngabeObBeiGeburtVerheiratet() {
        return (EAttribute)getElternschaftType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilienstandBasisType() {
		if (familienstandBasisTypeEClass == null) {
			familienstandBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(39);
		}
		return familienstandBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamilienstandBasisType_Art() {
        return (EReference)getFamilienstandBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamilienstandBasisType_Lebenssituation() {
        return (EReference)getFamilienstandBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilienstandType() {
		if (familienstandTypeEClass == null) {
			familienstandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(40);
		}
		return familienstandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilienstandUeberpruefungType() {
		if (familienstandUeberpruefungTypeEClass == null) {
			familienstandUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(41);
		}
		return familienstandUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtGeburtsortPflichtType() {
		if (geburtGeburtsortPflichtTypeEClass == null) {
			geburtGeburtsortPflichtTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(42);
		}
		return geburtGeburtsortPflichtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtNurGeburtsdatumType() {
		if (geburtNurGeburtsdatumTypeEClass == null) {
			geburtNurGeburtsdatumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(43);
		}
		return geburtNurGeburtsdatumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeburtType() {
		if (geburtTypeEClass == null) {
			geburtTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(44);
		}
		return geburtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeburtType_Geburtsort() {
        return (EAttribute)getGeburtType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtType_GeburtsortStaat() {
        return (EReference)getGeburtType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeburtType_Geburtsdatum() {
        return (EReference)getGeburtType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschiedenAntragstellendeBasisType() {
		if (geschiedenAntragstellendeBasisTypeEClass == null) {
			geschiedenAntragstellendeBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(45);
		}
		return geschiedenAntragstellendeBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeschiedenAntragstellendeBasisType_Nachweis() {
        return (EAttribute)getGeschiedenAntragstellendeBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeschiedenAntragstellendeBasisType_HochzeitGeplant() {
        return (EAttribute)getGeschiedenAntragstellendeBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeschiedenAntragstellendeBasisType_HochzeitsdatumVoraussichtlich() {
        return (EAttribute)getGeschiedenAntragstellendeBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschiedenAntragstellendeType() {
		if (geschiedenAntragstellendeTypeEClass == null) {
			geschiedenAntragstellendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(46);
		}
		return geschiedenAntragstellendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschiedenAntragstellendeUeberpruefungType() {
		if (geschiedenAntragstellendeUeberpruefungTypeEClass == null) {
			geschiedenAntragstellendeUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(47);
		}
		return geschiedenAntragstellendeUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstitutionUnterhaltstitelType() {
		if (institutionUnterhaltstitelTypeEClass == null) {
			institutionUnterhaltstitelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(48);
		}
		return institutionUnterhaltstitelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstitutionUnterhaltstitelType_Name() {
        return (EReference)getInstitutionUnterhaltstitelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstitutionUnterhaltstitelType_Anschrift() {
        return (EReference)getInstitutionUnterhaltstitelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstitutionUnterhaltstitelType_Bezeichnung() {
        return (EAttribute)getInstitutionUnterhaltstitelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerschaftAntragstellendeBasisType() {
		if (lebenspartnerschaftAntragstellendeBasisTypeEClass == null) {
			lebenspartnerschaftAntragstellendeBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(49);
		}
		return lebenspartnerschaftAntragstellendeBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenspartnerschaftAntragstellendeBasisType_GetrenntLebend() {
        return (EReference)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerschaftAntragstellendeBasisType_GetrenntLebendGrund() {
        return (EAttribute)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerSeitSechsMonatenInAnstalt() {
        return (EReference)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilName() {
        return (EReference)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilAnschrift() {
        return (EReference)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenspartnerschaftAntragstellendeBasisType_LebenspartnerIstNichtDerAndereElternteilGeburtsdatum() {
        return (EReference)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerschaftAntragstellendeBasisType_Steuerklasse() {
        return (EAttribute)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerschaftAntragstellendeBasisType_SteuerklasseNachweis() {
        return (EAttribute)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerschaftAntragstellendeBasisType_SeitWann() {
        return (EAttribute)getLebenspartnerschaftAntragstellendeBasisType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerschaftAntragstellendeType() {
		if (lebenspartnerschaftAntragstellendeTypeEClass == null) {
			lebenspartnerschaftAntragstellendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(50);
		}
		return lebenspartnerschaftAntragstellendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerschaftAntragstellendeUeberpruefungType() {
		if (lebenspartnerschaftAntragstellendeUeberpruefungTypeEClass == null) {
			lebenspartnerschaftAntragstellendeUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(51);
		}
		return lebenspartnerschaftAntragstellendeUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerschaftAufgehobenAntragstellendeBasisType() {
		if (lebenspartnerschaftAufgehobenAntragstellendeBasisTypeEClass == null) {
			lebenspartnerschaftAufgehobenAntragstellendeBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(52);
		}
		return lebenspartnerschaftAufgehobenAntragstellendeBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerschaftAufgehobenAntragstellendeBasisType_Nachweis() {
        return (EAttribute)getLebenspartnerschaftAufgehobenAntragstellendeBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenspartnerschaftAufgehobenAntragstellendeBasisType_SeitWann() {
        return (EReference)getLebenspartnerschaftAufgehobenAntragstellendeBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerschaftAufgehobenAntragstellendeBasisType_HochzeitGeplant() {
        return (EAttribute)getLebenspartnerschaftAufgehobenAntragstellendeBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerschaftAufgehobenAntragstellendeBasisType_HochzeitsdatumVoraussichtlich() {
        return (EAttribute)getLebenspartnerschaftAufgehobenAntragstellendeBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerschaftAufgehobenAntragstellendeType() {
		if (lebenspartnerschaftAufgehobenAntragstellendeTypeEClass == null) {
			lebenspartnerschaftAufgehobenAntragstellendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(53);
		}
		return lebenspartnerschaftAufgehobenAntragstellendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerschaftAufgehobenAntragstellendeUeberpruefungType() {
		if (lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeEClass == null) {
			lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(54);
		}
		return lebenspartnerschaftAufgehobenAntragstellendeUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerVerstorbenAntragstellendeBasisType() {
		if (lebenspartnerVerstorbenAntragstellendeBasisTypeEClass == null) {
			lebenspartnerVerstorbenAntragstellendeBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(55);
		}
		return lebenspartnerVerstorbenAntragstellendeBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerVerstorbenAntragstellendeBasisType_Nachweis() {
        return (EAttribute)getLebenspartnerVerstorbenAntragstellendeBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenspartnerVerstorbenAntragstellendeBasisType_SeitWann() {
        return (EReference)getLebenspartnerVerstorbenAntragstellendeBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerVerstorbenAntragstellendeBasisType_HochzeitGeplant() {
        return (EAttribute)getLebenspartnerVerstorbenAntragstellendeBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLebenspartnerVerstorbenAntragstellendeBasisType_HochzeitsdatumVoraussichtlich() {
        return (EAttribute)getLebenspartnerVerstorbenAntragstellendeBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerVerstorbenAntragstellendeType() {
		if (lebenspartnerVerstorbenAntragstellendeTypeEClass == null) {
			lebenspartnerVerstorbenAntragstellendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(56);
		}
		return lebenspartnerVerstorbenAntragstellendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenspartnerVerstorbenAntragstellendeUeberpruefungType() {
		if (lebenspartnerVerstorbenAntragstellendeUeberpruefungTypeEClass == null) {
			lebenspartnerVerstorbenAntragstellendeUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(57);
		}
		return lebenspartnerVerstorbenAntragstellendeUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenssituationBasisType() {
		if (lebenssituationBasisTypeEClass == null) {
			lebenssituationBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(58);
		}
		return lebenssituationBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationBasisType_Ledig() {
        return (EReference)getLebenssituationBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationBasisType_Verheiratet() {
        return (EReference)getLebenssituationBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationBasisType_Lebenspartnerschaft() {
        return (EReference)getLebenssituationBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationBasisType_Geschieden() {
        return (EReference)getLebenssituationBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationBasisType_Verwitwet() {
        return (EReference)getLebenssituationBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationBasisType_LebenspartnerschaftAufgehoben() {
        return (EReference)getLebenssituationBasisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLebenssituationBasisType_LebenspartnerVerstorben() {
        return (EReference)getLebenssituationBasisType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenssituationType() {
		if (lebenssituationTypeEClass == null) {
			lebenssituationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(59);
		}
		return lebenssituationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLebenssituationUeberpruefungType() {
		if (lebenssituationUeberpruefungTypeEClass == null) {
			lebenssituationUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(60);
		}
		return lebenssituationUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLedigAntragstellendeBasisType() {
		if (ledigAntragstellendeBasisTypeEClass == null) {
			ledigAntragstellendeBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(61);
		}
		return ledigAntragstellendeBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLedigAntragstellendeBasisType_AndererElternteilVerstorben() {
        return (EReference)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLedigAntragstellendeBasisType_LebtMitAnderemElternteilZusammen() {
        return (EAttribute)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLedigAntragstellendeBasisType_NieMitAnderemElternteilZusammengelebt() {
        return (EAttribute)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLedigAntragstellendeBasisType_VaterIstNamentlichBekannt() {
        return (EAttribute)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLedigAntragstellendeBasisType_VomAnderenElternteilGetrennt() {
        return (EReference)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLedigAntragstellendeBasisType_SeitWannGetrennt() {
        return (EReference)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLedigAntragstellendeBasisType_HochzeitGeplant() {
        return (EAttribute)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLedigAntragstellendeBasisType_HochzeitsdatumVoraussichtlich() {
        return (EAttribute)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLedigAntragstellendeBasisType_GetrenntLebendGrund() {
        return (EAttribute)getLedigAntragstellendeBasisType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLedigAntragstellendeType() {
		if (ledigAntragstellendeTypeEClass == null) {
			ledigAntragstellendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(62);
		}
		return ledigAntragstellendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLedigAntragstellendeUeberpruefungType() {
		if (ledigAntragstellendeUeberpruefungTypeEClass == null) {
			ledigAntragstellendeUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(63);
		}
		return ledigAntragstellendeUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeistungserhaltType() {
		if (leistungserhaltTypeEClass == null) {
			leistungserhaltTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(64);
		}
		return leistungserhaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeistungserhaltType_Art() {
        return (EReference)getLeistungserhaltType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeistungserhaltType_Nachweis() {
        return (EAttribute)getLeistungserhaltType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeistungsgewaehrungType() {
		if (leistungsgewaehrungTypeEClass == null) {
			leistungsgewaehrungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(65);
		}
		return leistungsgewaehrungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeistungsgewaehrungType_Art() {
        return (EReference)getLeistungsgewaehrungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeistungsgewaehrungType_Nachweis() {
        return (EAttribute)getLeistungsgewaehrungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLohnsteuerklasseType() {
		if (lohnsteuerklasseTypeEClass == null) {
			lohnsteuerklasseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(66);
		}
		return lohnsteuerklasseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLohnsteuerklasseType_LohnsteuerklasseVeranlagung() {
        return (EAttribute)getLohnsteuerklasseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLohnsteuerklasseType_Lohnsteuerklasse() {
        return (EReference)getLohnsteuerklasseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameMitGeburtsnameType() {
		if (nameMitGeburtsnameTypeEClass == null) {
			nameMitGeburtsnameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(67);
		}
		return nameMitGeburtsnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameOhneGeburtsnameType() {
		if (nameOhneGeburtsnameTypeEClass == null) {
			nameOhneGeburtsnameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(68);
		}
		return nameOhneGeburtsnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameOptionalType() {
		if (nameOptionalTypeEClass == null) {
			nameOptionalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(69);
		}
		return nameOptionalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameOptionalType_FamiliennameUnstrukturiert() {
        return (EReference)getNameOptionalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameOptionalType_GeburtsnameUnstrukturiert() {
        return (EReference)getNameOptionalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameOptionalType_Vornamen() {
        return (EReference)getNameOptionalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRechtsanwaltType() {
		if (rechtsanwaltTypeEClass == null) {
			rechtsanwaltTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(70);
		}
		return rechtsanwaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRechtsanwaltType_Name() {
        return (EReference)getRechtsanwaltType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRechtsanwaltType_Anschrift() {
        return (EReference)getRechtsanwaltType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRechtsanwaltType_Aktenzeichen() {
        return (EAttribute)getRechtsanwaltType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRechtsanwaltType_BeauftragtGeltungsmachungUVanspruch() {
        return (EAttribute)getRechtsanwaltType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchuleType() {
		if (schuleTypeEClass == null) {
			schuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(71);
		}
		return schuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchuleType_MonatVoraussichtlicherAbschlussSchule() {
        return (EAttribute)getSchuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchuleType_TatsacheMitNachweis() {
        return (EReference)getSchuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchuleType_Schulabschluss() {
        return (EAttribute)getSchuleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstigeLeistungAndererElternteilType() {
		if (sonstigeLeistungAndererElternteilTypeEClass == null) {
			sonstigeLeistungAndererElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(72);
		}
		return sonstigeLeistungAndererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungAndererElternteilType_Art() {
        return (EReference)getSonstigeLeistungAndererElternteilType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungAndererElternteilType_NameLeistungsstelle() {
        return (EAttribute)getSonstigeLeistungAndererElternteilType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungAndererElternteilType_Bedarfsgemeinschaftsnummer() {
        return (EAttribute)getSonstigeLeistungAndererElternteilType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungAndererElternteilType_Rentenversicherungsnummer() {
        return (EAttribute)getSonstigeLeistungAndererElternteilType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungAndererElternteilType_BetraegeZurLeistungshoehe() {
        return (EAttribute)getSonstigeLeistungAndererElternteilType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstigeLeistungKindType() {
		if (sonstigeLeistungKindTypeEClass == null) {
			sonstigeLeistungKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(75);
		}
		return sonstigeLeistungKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungKindType_Art() {
        return (EReference)getSonstigeLeistungKindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungKindType_Nachweis() {
        return (EAttribute)getSonstigeLeistungKindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungKindType_LeistungserhaltKindergeld() {
        return (EReference)getSonstigeLeistungKindType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungKindType_Leistungsgewaehrung() {
        return (EReference)getSonstigeLeistungKindType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungKindType_NameJobcenter() {
        return (EAttribute)getSonstigeLeistungKindType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungKindType_Bedarfsgemeinschaftsnummer() {
        return (EAttribute)getSonstigeLeistungKindType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungKindType_NameTraeger() {
        return (EAttribute)getSonstigeLeistungKindType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungKindType_Aktenzeichen() {
        return (EAttribute)getSonstigeLeistungKindType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonstigeLeistungKindType_BetraegeZurLeistungshoehe() {
        return (EAttribute)getSonstigeLeistungKindType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungKindType_BezugUV() {
        return (EReference)getSonstigeLeistungKindType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSonstigeLeistungKindType_Zeitraum() {
        return (EReference)getSonstigeLeistungKindType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonstigeLeistungKindUeberpruefungType() {
		if (sonstigeLeistungKindUeberpruefungTypeEClass == null) {
			sonstigeLeistungKindUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(76);
		}
		return sonstigeLeistungKindUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaatsangehoerigkeitAndererElternteilType() {
		if (staatsangehoerigkeitAndererElternteilTypeEClass == null) {
			staatsangehoerigkeitAndererElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(77);
		}
		return staatsangehoerigkeitAndererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaatsangehoerigkeitAndererElternteilType_Bekannt() {
        return (EAttribute)getStaatsangehoerigkeitAndererElternteilType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaatsangehoerigkeitAndererElternteilType_Staatsangehoerigkeit() {
        return (EReference)getStaatsangehoerigkeitAndererElternteilType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaatsangehoerigkeitType() {
		if (staatsangehoerigkeitTypeEClass == null) {
			staatsangehoerigkeitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(78);
		}
		return staatsangehoerigkeitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaatsangehoerigkeitType_Art() {
        return (EReference)getStaatsangehoerigkeitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaatsangehoerigkeitType_VerlustRechtAufEinreise() {
        return (EAttribute)getStaatsangehoerigkeitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraegerKrankenversicherungType() {
		if (traegerKrankenversicherungTypeEClass == null) {
			traegerKrankenversicherungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(83);
		}
		return traegerKrankenversicherungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTraegerKrankenversicherungType_Bekannt() {
        return (EReference)getTraegerKrankenversicherungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraegerKrankenversicherungType_KvNummer() {
        return (EAttribute)getTraegerKrankenversicherungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraegerKrankenversicherungType_Name() {
        return (EAttribute)getTraegerKrankenversicherungType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltBasisType() {
		if (unterhaltBasisTypeEClass == null) {
			unterhaltBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(84);
		}
		return unterhaltBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltBasisType_Unterhaltstitel() {
        return (EReference)getUnterhaltBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltBasisType_Unterhaltzahlungen() {
        return (EReference)getUnterhaltBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltBasisType_Unterhaltvorauszahlungen() {
        return (EReference)getUnterhaltBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltBasisType_Bemuehungen() {
        return (EReference)getUnterhaltBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltBasisType_WeitereAngaben() {
        return (EAttribute)getUnterhaltBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltstitelType() {
		if (unterhaltstitelTypeEClass == null) {
			unterhaltstitelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(87);
		}
		return unterhaltstitelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltstitelType_LiegtMirVor() {
        return (EReference)getUnterhaltstitelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltstitelType_TitelBeiAnderePerson() {
        return (EReference)getUnterhaltstitelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltstitelType_TitelBeiInstitution() {
        return (EReference)getUnterhaltstitelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltstitelType_AntragUnterhaltsfestsetzungGestellt() {
        return (EReference)getUnterhaltstitelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltstitelType_BefreiungUnterhaltDurchVergleichGerichtlich() {
        return (EReference)getUnterhaltstitelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltstitelType_BefreiungUnterhaltDurchVergleichAussergerichtlich() {
        return (EReference)getUnterhaltstitelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltstitelType_EsGibtEinenUnterhaltstitel() {
        return (EAttribute)getUnterhaltstitelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltstitelUeberpruefungType() {
		if (unterhaltstitelUeberpruefungTypeEClass == null) {
			unterhaltstitelUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(88);
		}
		return unterhaltstitelUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltsvorauszahlungenType() {
		if (unterhaltsvorauszahlungenTypeEClass == null) {
			unterhaltsvorauszahlungenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(89);
		}
		return unterhaltsvorauszahlungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorauszahlungenType_ZeitraumDerVorauszahlung() {
        return (EReference)getUnterhaltsvorauszahlungenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorauszahlungenType_BetragDerVorausZahlung() {
        return (EAttribute)getUnterhaltsvorauszahlungenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorauszahlungenType_DatumDerVorauszahlung() {
        return (EReference)getUnterhaltsvorauszahlungenType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorauszahlungenType_ZahlungenDritter() {
        return (EAttribute)getUnterhaltsvorauszahlungenType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorauszahlungenType_PersonZahlungenDritter() {
        return (EAttribute)getUnterhaltsvorauszahlungenType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorauszahlungenType_HoeheZahlungenDritter() {
        return (EAttribute)getUnterhaltsvorauszahlungenType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltsvorschussantragAntrag0301Type() {
		if (unterhaltsvorschussantragAntrag0301TypeEClass == null) {
			unterhaltsvorschussantragAntrag0301TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(90);
		}
		return unterhaltsvorschussantragAntrag0301TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragAntrag0301Type_GesamtZahlDerNachrichten() {
        return (EAttribute)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_Antragskind() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_AntragstellenderElternteil() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_AndererElternteil() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_WeitereGemeinsameKinder() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_Elternschaft() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_Unterhalt() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_Datenabruf() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_PdfAntrag() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragAntrag0301Type_WartenAufUnterschrift() {
        return (EAttribute)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_Dsgvo() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragAntrag0301Type_ArtSignaturDigital() {
        return (EAttribute)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragAntrag0301Type_BestaetigungAngaben() {
        return (EReference)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragAntrag0301Type_MerkblattUVG() {
        return (EAttribute)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragAntrag0301Type_WeitergabeBankverbindung() {
        return (EAttribute)getUnterhaltsvorschussantragAntrag0301Type().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type() {
		if (unterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeEClass == null) {
			unterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(91);
		}
		return unterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_GesamtZahlDerNachrichten() {
        return (EAttribute)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Antragskind() {
        return (EReference)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_AntragstellenderElternteil() {
        return (EReference)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_AndererElternteil() {
        return (EReference)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Unterhalt() {
        return (EReference)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Datenabruf() {
        return (EReference)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_PdfAntrag() {
        return (EReference)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_WartenAufUnterschrift() {
        return (EAttribute)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_Dsgvo() {
        return (EReference)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_ArtSignaturDigital() {
        return (EAttribute)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_BestaetigungAngaben() {
        return (EReference)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type_MerkblattUVG() {
        return (EAttribute)getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltsvorschussantragNachreichen0303Type() {
		if (unterhaltsvorschussantragNachreichen0303TypeEClass == null) {
			unterhaltsvorschussantragNachreichen0303TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(92);
		}
		return unterhaltsvorschussantragNachreichen0303TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragNachreichen0303Type_FallnummerUVO() {
        return (EAttribute)getUnterhaltsvorschussantragNachreichen0303Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragNachreichen0303Type_AngabenKindNachreichen() {
        return (EReference)getUnterhaltsvorschussantragNachreichen0303Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragNachreichen0303Type_Aenderungsmitteilung() {
        return (EAttribute)getUnterhaltsvorschussantragNachreichen0303Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragNachreichen0303Type_NachzureichendesDokument() {
        return (EReference)getUnterhaltsvorschussantragNachreichen0303Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragNachreichen0303Type_Dsgvo() {
        return (EReference)getUnterhaltsvorschussantragNachreichen0303Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragNachreichen0303Type_ArtSignaturDigital() {
        return (EAttribute)getUnterhaltsvorschussantragNachreichen0303Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragNachreichen0303Type_BestaetigungAngaben() {
        return (EReference)getUnterhaltsvorschussantragNachreichen0303Type().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragNachreichen0303Type_MerkblattUVG() {
        return (EAttribute)getUnterhaltsvorschussantragNachreichen0303Type().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltsvorschussantragNachweisnachricht0311Type() {
		if (unterhaltsvorschussantragNachweisnachricht0311TypeEClass == null) {
			unterhaltsvorschussantragNachweisnachricht0311TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(93);
		}
		return unterhaltsvorschussantragNachweisnachricht0311TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragNachweisnachricht0311Type_Nachweis() {
        return (EReference)getUnterhaltsvorschussantragNachweisnachricht0311Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragNachweisnachricht0311Type_ZugehoerigerAntrag() {
        return (EAttribute)getUnterhaltsvorschussantragNachweisnachricht0311Type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragNachweisnachricht0311Type_GesamtZahlDerNachrichten() {
        return (EAttribute)getUnterhaltsvorschussantragNachweisnachricht0311Type().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragNachweisnachricht0311Type_ArtSignaturDigital() {
        return (EAttribute)getUnterhaltsvorschussantragNachweisnachricht0311Type().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltsvorschussantragNachweisnachricht0311Type_BestaetigungAngaben() {
        return (EReference)getUnterhaltsvorschussantragNachweisnachricht0311Type().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltsvorschussantragNachweisnachricht0311Type_MerkblattUVG() {
        return (EAttribute)getUnterhaltsvorschussantragNachweisnachricht0311Type().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltszahlungenType() {
		if (unterhaltszahlungenTypeEClass == null) {
			unterhaltszahlungenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(94);
		}
		return unterhaltszahlungenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnterhaltszahlungenType_ZeitpunktDerZahlung() {
        return (EReference)getUnterhaltszahlungenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnterhaltszahlungenType_HoeheDerZahlung() {
        return (EAttribute)getUnterhaltszahlungenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltType() {
		if (unterhaltTypeEClass == null) {
			unterhaltTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(95);
		}
		return unterhaltTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnterhaltUeberpruefungType() {
		if (unterhaltUeberpruefungTypeEClass == null) {
			unterhaltUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(96);
		}
		return unterhaltUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerheiratetAntragstellendeBasisType() {
		if (verheiratetAntragstellendeBasisTypeEClass == null) {
			verheiratetAntragstellendeBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(97);
		}
		return verheiratetAntragstellendeBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerheiratetAntragstellendeBasisType_GetrenntLebend() {
        return (EReference)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerheiratetAntragstellendeBasisType_GetrenntLebendGrund() {
        return (EAttribute)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerheiratetAntragstellendeBasisType_EhepartnerSeitSechsMonatenInAnstalt() {
        return (EReference)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteillName() {
        return (EReference)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteilAnschrift() {
        return (EReference)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerheiratetAntragstellendeBasisType_EhegatteIstNichtDerAndereElternteilGeburtsdatum() {
        return (EReference)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerheiratetAntragstellendeBasisType_Steuerklasse() {
        return (EAttribute)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerheiratetAntragstellendeBasisType_SteuerklasseNachweis() {
        return (EAttribute)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerheiratetAntragstellendeBasisType_SeitWann() {
        return (EAttribute)getVerheiratetAntragstellendeBasisType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerheiratetAntragstellendeType() {
		if (verheiratetAntragstellendeTypeEClass == null) {
			verheiratetAntragstellendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(98);
		}
		return verheiratetAntragstellendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerheiratetAntragstellendeUeberpruefungType() {
		if (verheiratetAntragstellendeUeberpruefungTypeEClass == null) {
			verheiratetAntragstellendeUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(99);
		}
		return verheiratetAntragstellendeUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVermoegenAndererElternteilType() {
		if (vermoegenAndererElternteilTypeEClass == null) {
			vermoegenAndererElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(100);
		}
		return vermoegenAndererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVermoegenAndererElternteilType_Art() {
        return (EReference)getVermoegenAndererElternteilType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVermoegenAndererElternteilType_ZusaetzlicheInformationen() {
        return (EAttribute)getVermoegenAndererElternteilType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVertretungType() {
		if (vertretungTypeEClass == null) {
			vertretungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(101);
		}
		return vertretungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVertretungType_Art() {
        return (EReference)getVertretungType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVertretungType_Vormund() {
        return (EReference)getVertretungType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVertretungType_Beistand() {
        return (EReference)getVertretungType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVertretungType_Amtspflegschaft() {
        return (EReference)getVertretungType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVertretungType_Rechtsanwalt() {
        return (EReference)getVertretungType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVertretungType_Betreuer() {
        return (EReference)getVertretungType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVertretungType_Organisationsname() {
        return (EAttribute)getVertretungType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVertretungUeberpruefungType() {
		if (vertretungUeberpruefungTypeEClass == null) {
			vertretungUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(102);
		}
		return vertretungUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerwitwetAntragstellendeBasisType() {
		if (verwitwetAntragstellendeBasisTypeEClass == null) {
			verwitwetAntragstellendeBasisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(103);
		}
		return verwitwetAntragstellendeBasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerwitwetAntragstellendeBasisType_Nachweis() {
        return (EAttribute)getVerwitwetAntragstellendeBasisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerwitwetAntragstellendeBasisType_SeitWann() {
        return (EReference)getVerwitwetAntragstellendeBasisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerwitwetAntragstellendeBasisType_HochzeitGeplant() {
        return (EAttribute)getVerwitwetAntragstellendeBasisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerwitwetAntragstellendeBasisType_HochzeitsdatumVoraussichtlich() {
        return (EAttribute)getVerwitwetAntragstellendeBasisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerwitwetAntragstellendeType() {
		if (verwitwetAntragstellendeTypeEClass == null) {
			verwitwetAntragstellendeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(104);
		}
		return verwitwetAntragstellendeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerwitwetAntragstellendeUeberpruefungType() {
		if (verwitwetAntragstellendeUeberpruefungTypeEClass == null) {
			verwitwetAntragstellendeUeberpruefungTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(105);
		}
		return verwitwetAntragstellendeUeberpruefungTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVormundType() {
		if (vormundTypeEClass == null) {
			vormundTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(106);
		}
		return vormundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVormundType_Name() {
        return (EReference)getVormundType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVormundType_Anschrift() {
        return (EReference)getVormundType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVormundType_EMailAdresse() {
        return (EAttribute)getVormundType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVormundType_Aktenzeichen() {
        return (EAttribute)getVormundType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVormundType_Telefonnummer() {
        return (EAttribute)getVormundType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeitereGemeinsameKinderType() {
		if (weitereGemeinsameKinderTypeEClass == null) {
			weitereGemeinsameKinderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(107);
		}
		return weitereGemeinsameKinderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereGemeinsameKinderType_Name() {
        return (EReference)getWeitereGemeinsameKinderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereGemeinsameKinderType_Geburtsdatum() {
        return (EReference)getWeitereGemeinsameKinderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereGemeinsameKinderType_WohnhaftBei() {
        return (EReference)getWeitereGemeinsameKinderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeitereKinderAndererElternteilType() {
		if (weitereKinderAndererElternteilTypeEClass == null) {
			weitereKinderAndererElternteilTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(108);
		}
		return weitereKinderAndererElternteilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereKinderAndererElternteilType_Name() {
        return (EReference)getWeitereKinderAndererElternteilType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereKinderAndererElternteilType_Geburtsdatum() {
        return (EReference)getWeitereKinderAndererElternteilType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeitereKinderAndererElternteilType_WohnhaftBeimAnderenElternteil() {
        return (EReference)getWeitereKinderAndererElternteilType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAusbildung() {
		if (ausbildungEEnum == null) {
			ausbildungEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(16);
		}
		return ausbildungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEinkuenfteandererelternteil() {
		if (einkuenfteandererelternteilEEnum == null) {
			einkuenfteandererelternteilEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(32);
		}
		return einkuenfteandererelternteilEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEinkuenftekinduv() {
		if (einkuenftekinduvEEnum == null) {
			einkuenftekinduvEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(36);
		}
		return einkuenftekinduvEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSonstigeleistungenuv() {
		if (sonstigeleistungenuvEEnum == null) {
			sonstigeleistungenuvEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(73);
		}
		return sonstigeleistungenuvEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStaatsangehoerigkeituv() {
		if (staatsangehoerigkeituvEEnum == null) {
			staatsangehoerigkeituvEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(79);
		}
		return staatsangehoerigkeituvEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSteuerklasse() {
		if (steuerklasseEEnum == null) {
			steuerklasseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(81);
		}
		return steuerklasseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnterhaltsbemuehungen() {
		if (unterhaltsbemuehungenEEnum == null) {
			unterhaltsbemuehungenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(85);
		}
		return unterhaltsbemuehungenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAusbildungObject() {
		if (ausbildungObjectEDataType == null) {
			ausbildungObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(18);
		}
		return ausbildungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEinkuenfteandererelternteilObject() {
		if (einkuenfteandererelternteilObjectEDataType == null) {
			einkuenfteandererelternteilObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(33);
		}
		return einkuenfteandererelternteilObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEinkuenftekinduvObject() {
		if (einkuenftekinduvObjectEDataType == null) {
			einkuenftekinduvObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(37);
		}
		return einkuenftekinduvObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSonstigeleistungenuvObject() {
		if (sonstigeleistungenuvObjectEDataType == null) {
			sonstigeleistungenuvObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(74);
		}
		return sonstigeleistungenuvObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStaatsangehoerigkeituvObject() {
		if (staatsangehoerigkeituvObjectEDataType == null) {
			staatsangehoerigkeituvObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(80);
		}
		return staatsangehoerigkeituvObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSteuerklasseObject() {
		if (steuerklasseObjectEDataType == null) {
			steuerklasseObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(82);
		}
		return steuerklasseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnterhaltsbemuehungenObject() {
		if (unterhaltsbemuehungenObjectEDataType == null) {
			unterhaltsbemuehungenObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UnterhaltsvorschussPackage.eNS_URI).getEClassifiers().get(86);
		}
		return unterhaltsbemuehungenObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussFactory getUnterhaltsvorschussFactory() {
		return (UnterhaltsvorschussFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //UnterhaltsvorschussPackageImpl
