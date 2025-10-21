/*
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

import de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antragstellender Elternteil Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getAnrede <em>Anrede</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getKindschaftsbeziehung <em>Kindschaftsbeziehung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getAufenthaltstitelEAT <em>Aufenthaltstitel EAT</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getAufenthaltstitelUpload <em>Aufenthaltstitel Upload</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getBankverbindung <em>Bankverbindung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#isEinkommensgrenzeErfuellt <em>Einkommensgrenze Erfuellt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getPostAdresse <em>Post Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getVertretung <em>Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getZukuenftigeAdresse <em>Zukuenftige Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getZukuenftigeAdresseAb <em>Zukuenftige Adresse Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#isZukuenftigeAdresseMitAnderemElternteil <em>Zukuenftige Adresse Mit Anderem Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getZukuenftigeAdresseMitAnderemElternteilAb <em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getNameNachweis <em>Name Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getLohnsteuerklasse <em>Lohnsteuerklasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AntragstellenderElternteilBasisTypeImpl#getGeschlecht <em>Geschlecht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntragstellenderElternteilBasisTypeImpl extends MinimalEObjectImpl.Container implements AntragstellenderElternteilBasisType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameOptionalType name;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtNachweisbezugType geburt;

	/**
	 * The default value of the '{@link #getAnrede() <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnrede()
	 * @generated
	 * @ordered
	 */
	protected static final String ANREDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnrede() <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnrede()
	 * @generated
	 * @ordered
	 */
	protected String anrede = ANREDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKindschaftsbeziehung() <em>Kindschaftsbeziehung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindschaftsbeziehung()
	 * @generated
	 * @ordered
	 */
	protected CodeKindschaftsbeziehungType kindschaftsbeziehung;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType anschrift;

	/**
	 * The cached value of the '{@link #getAufenthaltstitelEAT() <em>Aufenthaltstitel EAT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltstitelEAT()
	 * @generated
	 * @ordered
	 */
	protected EList<AufenthaltstitelNachweisbezugType> aufenthaltstitelEAT;

	/**
	 * The cached value of the '{@link #getAufenthaltstitelUpload() <em>Aufenthaltstitel Upload</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltstitelUpload()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aufenthaltstitelUpload;

	/**
	 * The cached value of the '{@link #getFamilienstand() <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilienstand()
	 * @generated
	 * @ordered
	 */
	protected FamilienstandBasisType familienstand;

	/**
	 * The cached value of the '{@link #getErreichbarkeit() <em>Erreichbarkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichbarkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitType> erreichbarkeit;

	/**
	 * The cached value of the '{@link #getBankverbindung() <em>Bankverbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankverbindung()
	 * @generated
	 * @ordered
	 */
	protected BankverbindungType bankverbindung;

	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeit() <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected StaatsangehoerigkeitType staatsangehoerigkeit;

	/**
	 * The default value of the '{@link #isEinkommensgrenzeErfuellt() <em>Einkommensgrenze Erfuellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommensgrenzeErfuellt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINKOMMENSGRENZE_ERFUELLT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinkommensgrenzeErfuellt() <em>Einkommensgrenze Erfuellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommensgrenzeErfuellt()
	 * @generated
	 * @ordered
	 */
	protected boolean einkommensgrenzeErfuellt = EINKOMMENSGRENZE_ERFUELLT_EDEFAULT;

	/**
	 * This is true if the Einkommensgrenze Erfuellt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkommensgrenzeErfuelltESet;

	/**
	 * The cached value of the '{@link #getPostAdresse() <em>Post Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostAdresse()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType postAdresse;

	/**
	 * The cached value of the '{@link #getVertretung() <em>Vertretung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertretung()
	 * @generated
	 * @ordered
	 */
	protected EList<VertretungType> vertretung;

	/**
	 * The cached value of the '{@link #getZukuenftigeAdresse() <em>Zukuenftige Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZukuenftigeAdresse()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType zukuenftigeAdresse;

	/**
	 * The default value of the '{@link #getZukuenftigeAdresseAb() <em>Zukuenftige Adresse Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZukuenftigeAdresseAb()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZUKUENFTIGE_ADRESSE_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZukuenftigeAdresseAb() <em>Zukuenftige Adresse Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZukuenftigeAdresseAb()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zukuenftigeAdresseAb = ZUKUENFTIGE_ADRESSE_AB_EDEFAULT;

	/**
	 * The default value of the '{@link #isZukuenftigeAdresseMitAnderemElternteil() <em>Zukuenftige Adresse Mit Anderem Elternteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZukuenftigeAdresseMitAnderemElternteil()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZukuenftigeAdresseMitAnderemElternteil() <em>Zukuenftige Adresse Mit Anderem Elternteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZukuenftigeAdresseMitAnderemElternteil()
	 * @generated
	 * @ordered
	 */
	protected boolean zukuenftigeAdresseMitAnderemElternteil = ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_EDEFAULT;

	/**
	 * This is true if the Zukuenftige Adresse Mit Anderem Elternteil attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zukuenftigeAdresseMitAnderemElternteilESet;

	/**
	 * The default value of the '{@link #getZukuenftigeAdresseMitAnderemElternteilAb() <em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZukuenftigeAdresseMitAnderemElternteilAb()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZukuenftigeAdresseMitAnderemElternteilAb() <em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZukuenftigeAdresseMitAnderemElternteilAb()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zukuenftigeAdresseMitAnderemElternteilAb = ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNameNachweis() <em>Name Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameNachweis()
	 * @generated
	 * @ordered
	 */
	protected NachweisbezugType nameNachweis;

	/**
	 * The cached value of the '{@link #getLohnsteuerklasse() <em>Lohnsteuerklasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLohnsteuerklasse()
	 * @generated
	 * @ordered
	 */
	protected LohnsteuerklasseType lohnsteuerklasse;

	/**
	 * The cached value of the '{@link #getGeschlecht() <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschlecht()
	 * @generated
	 * @ordered
	 */
	protected CodeGeschlechtType geschlecht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntragstellenderElternteilBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getAntragstellenderElternteilBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameOptionalType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameOptionalType newName, NotificationChain msgs) {
		NameOptionalType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(NameOptionalType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtNachweisbezugType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtNachweisbezugType newGeburt, NotificationChain msgs) {
		GeburtNachweisbezugType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT, oldGeburt, newGeburt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburt(GeburtNachweisbezugType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnrede() {
		return anrede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnrede(String newAnrede) {
		String oldAnrede = anrede;
		anrede = newAnrede;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANREDE, oldAnrede, anrede));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindschaftsbeziehungType getKindschaftsbeziehung() {
		return kindschaftsbeziehung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKindschaftsbeziehung(CodeKindschaftsbeziehungType newKindschaftsbeziehung, NotificationChain msgs) {
		CodeKindschaftsbeziehungType oldKindschaftsbeziehung = kindschaftsbeziehung;
		kindschaftsbeziehung = newKindschaftsbeziehung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG, oldKindschaftsbeziehung, newKindschaftsbeziehung);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindschaftsbeziehung(CodeKindschaftsbeziehungType newKindschaftsbeziehung) {
		if (newKindschaftsbeziehung != kindschaftsbeziehung) {
			NotificationChain msgs = null;
			if (kindschaftsbeziehung != null)
				msgs = ((InternalEObject)kindschaftsbeziehung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG, null, msgs);
			if (newKindschaftsbeziehung != null)
				msgs = ((InternalEObject)newKindschaftsbeziehung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG, null, msgs);
			msgs = basicSetKindschaftsbeziehung(newKindschaftsbeziehung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG, newKindschaftsbeziehung, newKindschaftsbeziehung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType newAnschrift, NotificationChain msgs) {
		PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnschrift(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AufenthaltstitelNachweisbezugType> getAufenthaltstitelEAT() {
		if (aufenthaltstitelEAT == null) {
			aufenthaltstitelEAT = new EObjectContainmentEList<AufenthaltstitelNachweisbezugType>(AufenthaltstitelNachweisbezugType.class, this, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT);
		}
		return aufenthaltstitelEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAufenthaltstitelUpload() {
		if (aufenthaltstitelUpload == null) {
			aufenthaltstitelUpload = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_UPLOAD);
		}
		return aufenthaltstitelUpload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilienstandBasisType getFamilienstand() {
		return familienstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilienstand(FamilienstandBasisType newFamilienstand, NotificationChain msgs) {
		FamilienstandBasisType oldFamilienstand = familienstand;
		familienstand = newFamilienstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND, oldFamilienstand, newFamilienstand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamilienstand(FamilienstandBasisType newFamilienstand) {
		if (newFamilienstand != familienstand) {
			NotificationChain msgs = null;
			if (familienstand != null)
				msgs = ((InternalEObject)familienstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND, null, msgs);
			if (newFamilienstand != null)
				msgs = ((InternalEObject)newFamilienstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND, null, msgs);
			msgs = basicSetFamilienstand(newFamilienstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND, newFamilienstand, newFamilienstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitType> getErreichbarkeit() {
		if (erreichbarkeit == null) {
			erreichbarkeit = new EObjectContainmentEList<ErreichbarkeitType>(ErreichbarkeitType.class, this, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT);
		}
		return erreichbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungType getBankverbindung() {
		return bankverbindung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBankverbindung(BankverbindungType newBankverbindung, NotificationChain msgs) {
		BankverbindungType oldBankverbindung = bankverbindung;
		bankverbindung = newBankverbindung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG, oldBankverbindung, newBankverbindung);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBankverbindung(BankverbindungType newBankverbindung) {
		if (newBankverbindung != bankverbindung) {
			NotificationChain msgs = null;
			if (bankverbindung != null)
				msgs = ((InternalEObject)bankverbindung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG, null, msgs);
			if (newBankverbindung != null)
				msgs = ((InternalEObject)newBankverbindung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG, null, msgs);
			msgs = basicSetBankverbindung(newBankverbindung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG, newBankverbindung, newBankverbindung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitType getStaatsangehoerigkeit() {
		return staatsangehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaatsangehoerigkeit(StaatsangehoerigkeitType newStaatsangehoerigkeit, NotificationChain msgs) {
		StaatsangehoerigkeitType oldStaatsangehoerigkeit = staatsangehoerigkeit;
		staatsangehoerigkeit = newStaatsangehoerigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT, oldStaatsangehoerigkeit, newStaatsangehoerigkeit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaatsangehoerigkeit(StaatsangehoerigkeitType newStaatsangehoerigkeit) {
		if (newStaatsangehoerigkeit != staatsangehoerigkeit) {
			NotificationChain msgs = null;
			if (staatsangehoerigkeit != null)
				msgs = ((InternalEObject)staatsangehoerigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			if (newStaatsangehoerigkeit != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			msgs = basicSetStaatsangehoerigkeit(newStaatsangehoerigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT, newStaatsangehoerigkeit, newStaatsangehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinkommensgrenzeErfuellt() {
		return einkommensgrenzeErfuellt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommensgrenzeErfuellt(boolean newEinkommensgrenzeErfuellt) {
		boolean oldEinkommensgrenzeErfuellt = einkommensgrenzeErfuellt;
		einkommensgrenzeErfuellt = newEinkommensgrenzeErfuellt;
		boolean oldEinkommensgrenzeErfuelltESet = einkommensgrenzeErfuelltESet;
		einkommensgrenzeErfuelltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT, oldEinkommensgrenzeErfuellt, einkommensgrenzeErfuellt, !oldEinkommensgrenzeErfuelltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkommensgrenzeErfuellt() {
		boolean oldEinkommensgrenzeErfuellt = einkommensgrenzeErfuellt;
		boolean oldEinkommensgrenzeErfuelltESet = einkommensgrenzeErfuelltESet;
		einkommensgrenzeErfuellt = EINKOMMENSGRENZE_ERFUELLT_EDEFAULT;
		einkommensgrenzeErfuelltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT, oldEinkommensgrenzeErfuellt, EINKOMMENSGRENZE_ERFUELLT_EDEFAULT, oldEinkommensgrenzeErfuelltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkommensgrenzeErfuellt() {
		return einkommensgrenzeErfuelltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getPostAdresse() {
		return postAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostAdresse(PostalischeInlandsanschriftBasisType newPostAdresse, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldPostAdresse = postAdresse;
		postAdresse = newPostAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE, oldPostAdresse, newPostAdresse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostAdresse(PostalischeInlandsanschriftBasisType newPostAdresse) {
		if (newPostAdresse != postAdresse) {
			NotificationChain msgs = null;
			if (postAdresse != null)
				msgs = ((InternalEObject)postAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE, null, msgs);
			if (newPostAdresse != null)
				msgs = ((InternalEObject)newPostAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE, null, msgs);
			msgs = basicSetPostAdresse(newPostAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE, newPostAdresse, newPostAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VertretungType> getVertretung() {
		if (vertretung == null) {
			vertretung = new EObjectContainmentEList<VertretungType>(VertretungType.class, this, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG);
		}
		return vertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getZukuenftigeAdresse() {
		return zukuenftigeAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZukuenftigeAdresse(PostalischeInlandsanschriftBasisType newZukuenftigeAdresse, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldZukuenftigeAdresse = zukuenftigeAdresse;
		zukuenftigeAdresse = newZukuenftigeAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE, oldZukuenftigeAdresse, newZukuenftigeAdresse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZukuenftigeAdresse(PostalischeInlandsanschriftBasisType newZukuenftigeAdresse) {
		if (newZukuenftigeAdresse != zukuenftigeAdresse) {
			NotificationChain msgs = null;
			if (zukuenftigeAdresse != null)
				msgs = ((InternalEObject)zukuenftigeAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE, null, msgs);
			if (newZukuenftigeAdresse != null)
				msgs = ((InternalEObject)newZukuenftigeAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE, null, msgs);
			msgs = basicSetZukuenftigeAdresse(newZukuenftigeAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE, newZukuenftigeAdresse, newZukuenftigeAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZukuenftigeAdresseAb() {
		return zukuenftigeAdresseAb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZukuenftigeAdresseAb(XMLGregorianCalendar newZukuenftigeAdresseAb) {
		XMLGregorianCalendar oldZukuenftigeAdresseAb = zukuenftigeAdresseAb;
		zukuenftigeAdresseAb = newZukuenftigeAdresseAb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_AB, oldZukuenftigeAdresseAb, zukuenftigeAdresseAb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZukuenftigeAdresseMitAnderemElternteil() {
		return zukuenftigeAdresseMitAnderemElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZukuenftigeAdresseMitAnderemElternteil(boolean newZukuenftigeAdresseMitAnderemElternteil) {
		boolean oldZukuenftigeAdresseMitAnderemElternteil = zukuenftigeAdresseMitAnderemElternteil;
		zukuenftigeAdresseMitAnderemElternteil = newZukuenftigeAdresseMitAnderemElternteil;
		boolean oldZukuenftigeAdresseMitAnderemElternteilESet = zukuenftigeAdresseMitAnderemElternteilESet;
		zukuenftigeAdresseMitAnderemElternteilESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL, oldZukuenftigeAdresseMitAnderemElternteil, zukuenftigeAdresseMitAnderemElternteil, !oldZukuenftigeAdresseMitAnderemElternteilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZukuenftigeAdresseMitAnderemElternteil() {
		boolean oldZukuenftigeAdresseMitAnderemElternteil = zukuenftigeAdresseMitAnderemElternteil;
		boolean oldZukuenftigeAdresseMitAnderemElternteilESet = zukuenftigeAdresseMitAnderemElternteilESet;
		zukuenftigeAdresseMitAnderemElternteil = ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_EDEFAULT;
		zukuenftigeAdresseMitAnderemElternteilESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL, oldZukuenftigeAdresseMitAnderemElternteil, ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_EDEFAULT, oldZukuenftigeAdresseMitAnderemElternteilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZukuenftigeAdresseMitAnderemElternteil() {
		return zukuenftigeAdresseMitAnderemElternteilESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZukuenftigeAdresseMitAnderemElternteilAb() {
		return zukuenftigeAdresseMitAnderemElternteilAb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZukuenftigeAdresseMitAnderemElternteilAb(XMLGregorianCalendar newZukuenftigeAdresseMitAnderemElternteilAb) {
		XMLGregorianCalendar oldZukuenftigeAdresseMitAnderemElternteilAb = zukuenftigeAdresseMitAnderemElternteilAb;
		zukuenftigeAdresseMitAnderemElternteilAb = newZukuenftigeAdresseMitAnderemElternteilAb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB, oldZukuenftigeAdresseMitAnderemElternteilAb, zukuenftigeAdresseMitAnderemElternteilAb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisbezugType getNameNachweis() {
		return nameNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameNachweis(NachweisbezugType newNameNachweis, NotificationChain msgs) {
		NachweisbezugType oldNameNachweis = nameNachweis;
		nameNachweis = newNameNachweis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS, oldNameNachweis, newNameNachweis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameNachweis(NachweisbezugType newNameNachweis) {
		if (newNameNachweis != nameNachweis) {
			NotificationChain msgs = null;
			if (nameNachweis != null)
				msgs = ((InternalEObject)nameNachweis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS, null, msgs);
			if (newNameNachweis != null)
				msgs = ((InternalEObject)newNameNachweis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS, null, msgs);
			msgs = basicSetNameNachweis(newNameNachweis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS, newNameNachweis, newNameNachweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LohnsteuerklasseType getLohnsteuerklasse() {
		return lohnsteuerklasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLohnsteuerklasse(LohnsteuerklasseType newLohnsteuerklasse, NotificationChain msgs) {
		LohnsteuerklasseType oldLohnsteuerklasse = lohnsteuerklasse;
		lohnsteuerklasse = newLohnsteuerklasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE, oldLohnsteuerklasse, newLohnsteuerklasse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLohnsteuerklasse(LohnsteuerklasseType newLohnsteuerklasse) {
		if (newLohnsteuerklasse != lohnsteuerklasse) {
			NotificationChain msgs = null;
			if (lohnsteuerklasse != null)
				msgs = ((InternalEObject)lohnsteuerklasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE, null, msgs);
			if (newLohnsteuerklasse != null)
				msgs = ((InternalEObject)newLohnsteuerklasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE, null, msgs);
			msgs = basicSetLohnsteuerklasse(newLohnsteuerklasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE, newLohnsteuerklasse, newLohnsteuerklasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGeschlechtType getGeschlecht() {
		return geschlecht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschlecht(CodeGeschlechtType newGeschlecht, NotificationChain msgs) {
		CodeGeschlechtType oldGeschlecht = geschlecht;
		geschlecht = newGeschlecht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT, oldGeschlecht, newGeschlecht);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeschlecht(CodeGeschlechtType newGeschlecht) {
		if (newGeschlecht != geschlecht) {
			NotificationChain msgs = null;
			if (geschlecht != null)
				msgs = ((InternalEObject)geschlecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT, null, msgs);
			if (newGeschlecht != null)
				msgs = ((InternalEObject)newGeschlecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT, null, msgs);
			msgs = basicSetGeschlecht(newGeschlecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT, newGeschlecht, newGeschlecht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME:
				return basicSetName(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				return basicSetKindschaftsbeziehung(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT:
				return ((InternalEList<?>)getAufenthaltstitelEAT()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND:
				return basicSetFamilienstand(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				return ((InternalEList<?>)getErreichbarkeit()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG:
				return basicSetBankverbindung(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return basicSetStaatsangehoerigkeit(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE:
				return basicSetPostAdresse(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				return ((InternalEList<?>)getVertretung()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE:
				return basicSetZukuenftigeAdresse(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS:
				return basicSetNameNachweis(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE:
				return basicSetLohnsteuerklasse(null, msgs);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				return basicSetGeschlecht(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME:
				return getName();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				return getGeburt();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANREDE:
				return getAnrede();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				return getKindschaftsbeziehung();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				return getAnschrift();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT:
				return getAufenthaltstitelEAT();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_UPLOAD:
				return getAufenthaltstitelUpload();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND:
				return getFamilienstand();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				return getErreichbarkeit();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG:
				return getBankverbindung();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT:
				return isEinkommensgrenzeErfuellt();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE:
				return getPostAdresse();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				return getVertretung();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE:
				return getZukuenftigeAdresse();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_AB:
				return getZukuenftigeAdresseAb();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL:
				return isZukuenftigeAdresseMitAnderemElternteil();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB:
				return getZukuenftigeAdresseMitAnderemElternteilAb();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS:
				return getNameNachweis();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE:
				return getLohnsteuerklasse();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				return getGeschlecht();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME:
				setName((NameOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				setGeburt((GeburtNachweisbezugType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANREDE:
				setAnrede((String)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				setKindschaftsbeziehung((CodeKindschaftsbeziehungType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT:
				getAufenthaltstitelEAT().clear();
				getAufenthaltstitelEAT().addAll((Collection<? extends AufenthaltstitelNachweisbezugType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_UPLOAD:
				getAufenthaltstitelUpload().clear();
				getAufenthaltstitelUpload().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND:
				setFamilienstand((FamilienstandBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				getErreichbarkeit().addAll((Collection<? extends ErreichbarkeitType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG:
				setBankverbindung((BankverbindungType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT:
				setEinkommensgrenzeErfuellt((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE:
				setPostAdresse((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				getVertretung().clear();
				getVertretung().addAll((Collection<? extends VertretungType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE:
				setZukuenftigeAdresse((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_AB:
				setZukuenftigeAdresseAb((XMLGregorianCalendar)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL:
				setZukuenftigeAdresseMitAnderemElternteil((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB:
				setZukuenftigeAdresseMitAnderemElternteilAb((XMLGregorianCalendar)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS:
				setNameNachweis((NachweisbezugType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE:
				setLohnsteuerklasse((LohnsteuerklasseType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME:
				setName((NameOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				setGeburt((GeburtNachweisbezugType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANREDE:
				setAnrede(ANREDE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				setKindschaftsbeziehung((CodeKindschaftsbeziehungType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT:
				getAufenthaltstitelEAT().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_UPLOAD:
				getAufenthaltstitelUpload().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND:
				setFamilienstand((FamilienstandBasisType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG:
				setBankverbindung((BankverbindungType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT:
				unsetEinkommensgrenzeErfuellt();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE:
				setPostAdresse((PostalischeInlandsanschriftBasisType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				getVertretung().clear();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE:
				setZukuenftigeAdresse((PostalischeInlandsanschriftBasisType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_AB:
				setZukuenftigeAdresseAb(ZUKUENFTIGE_ADRESSE_AB_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL:
				unsetZukuenftigeAdresseMitAnderemElternteil();
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB:
				setZukuenftigeAdresseMitAnderemElternteilAb(ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS:
				setNameNachweis((NachweisbezugType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE:
				setLohnsteuerklasse((LohnsteuerklasseType)null);
				return;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME:
				return name != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				return geburt != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANREDE:
				return ANREDE_EDEFAULT == null ? anrede != null : !ANREDE_EDEFAULT.equals(anrede);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				return kindschaftsbeziehung != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				return anschrift != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_EAT:
				return aufenthaltstitelEAT != null && !aufenthaltstitelEAT.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__AUFENTHALTSTITEL_UPLOAD:
				return aufenthaltstitelUpload != null && !aufenthaltstitelUpload.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__FAMILIENSTAND:
				return familienstand != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				return erreichbarkeit != null && !erreichbarkeit.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__BANKVERBINDUNG:
				return bankverbindung != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__EINKOMMENSGRENZE_ERFUELLT:
				return isSetEinkommensgrenzeErfuellt();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__POST_ADRESSE:
				return postAdresse != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				return vertretung != null && !vertretung.isEmpty();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE:
				return zukuenftigeAdresse != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_AB:
				return ZUKUENFTIGE_ADRESSE_AB_EDEFAULT == null ? zukuenftigeAdresseAb != null : !ZUKUENFTIGE_ADRESSE_AB_EDEFAULT.equals(zukuenftigeAdresseAb);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL:
				return isSetZukuenftigeAdresseMitAnderemElternteil();
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB:
				return ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB_EDEFAULT == null ? zukuenftigeAdresseMitAnderemElternteilAb != null : !ZUKUENFTIGE_ADRESSE_MIT_ANDEREM_ELTERNTEIL_AB_EDEFAULT.equals(zukuenftigeAdresseMitAnderemElternteilAb);
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__NAME_NACHWEIS:
				return nameNachweis != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__LOHNSTEUERKLASSE:
				return lohnsteuerklasse != null;
			case UnterhaltsvorschussPackage.ANTRAGSTELLENDER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				return geschlecht != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (anrede: ");
		result.append(anrede);
		result.append(", aufenthaltstitelUpload: ");
		result.append(aufenthaltstitelUpload);
		result.append(", einkommensgrenzeErfuellt: ");
		if (einkommensgrenzeErfuelltESet) result.append(einkommensgrenzeErfuellt); else result.append("<unset>");
		result.append(", zukuenftigeAdresseAb: ");
		result.append(zukuenftigeAdresseAb);
		result.append(", zukuenftigeAdresseMitAnderemElternteil: ");
		if (zukuenftigeAdresseMitAnderemElternteilESet) result.append(zukuenftigeAdresseMitAnderemElternteil); else result.append("<unset>");
		result.append(", zukuenftigeAdresseMitAnderemElternteilAb: ");
		result.append(zukuenftigeAdresseMitAnderemElternteilAb);
		result.append(')');
		return result.toString();
	}

} //AntragstellenderElternteilBasisTypeImpl
