/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AkteType;
import de.xoev.domea.domea.AkteninhaltType;
import de.xoev.domea.domea.AllgemeineMetadatenType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType;
import de.xoev.domea.domea.AussonderungsmetadatenType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.GeschaeftsgangType;
import de.xoev.domea.domea.HistorienProtokollInformationType;
import de.xoev.domea.domea.IdentifikationObjektType;
import de.xoev.domea.domea.KontaktType;
import de.xoev.domea.domea.VerweisType;
import de.xoev.domea.domea.ZeitraumType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Akte Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getIdentifikation <em>Identifikation</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getAussonderungsmetadaten <em>Aussonderungsmetadaten</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getStandort <em>Standort</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getLaufzeit <em>Laufzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getHistorienProtokollInformation <em>Historien Protokoll Information</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getInternerGeschaeftsgang <em>Interner Geschaeftsgang</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getAkteninhalt <em>Akteninhalt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getVerweis <em>Verweis</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getKontakt <em>Kontakt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#isZdA <em>Zd A</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getZdADatum <em>Zd ADatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteTypeImpl#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AkteTypeImpl extends MinimalEObjectImpl.Container implements AkteType {
	/**
	 * The cached value of the '{@link #getIdentifikation() <em>Identifikation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifikation()
	 * @generated
	 * @ordered
	 */
	protected IdentifikationObjektType identifikation;

	/**
	 * The cached value of the '{@link #getAllgemeineMetadaten() <em>Allgemeine Metadaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineMetadaten()
	 * @generated
	 * @ordered
	 */
	protected AllgemeineMetadatenType allgemeineMetadaten;

	/**
	 * The cached value of the '{@link #getAussonderungsmetadaten() <em>Aussonderungsmetadaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussonderungsmetadaten()
	 * @generated
	 * @ordered
	 */
	protected AussonderungsmetadatenType aussonderungsmetadaten;

	/**
	 * The default value of the '{@link #getStandort() <em>Standort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandort()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandort() <em>Standort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandort()
	 * @generated
	 * @ordered
	 */
	protected String standort = STANDORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final String TYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected String typ = TYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLaufzeit() <em>Laufzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaufzeit()
	 * @generated
	 * @ordered
	 */
	protected ZeitraumType laufzeit;

	/**
	 * The cached value of the '{@link #getHistorienProtokollInformation() <em>Historien Protokoll Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorienProtokollInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<HistorienProtokollInformationType> historienProtokollInformation;

	/**
	 * The cached value of the '{@link #getInternerGeschaeftsgang() <em>Interner Geschaeftsgang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternerGeschaeftsgang()
	 * @generated
	 * @ordered
	 */
	protected EList<GeschaeftsgangType> internerGeschaeftsgang;

	/**
	 * The cached value of the '{@link #getAkteninhalt() <em>Akteninhalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAkteninhalt()
	 * @generated
	 * @ordered
	 */
	protected AkteninhaltType akteninhalt;

	/**
	 * The cached value of the '{@link #getVerweis() <em>Verweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerweis()
	 * @generated
	 * @ordered
	 */
	protected EList<VerweisType> verweis;

	/**
	 * The cached value of the '{@link #getKontakt() <em>Kontakt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontakt()
	 * @generated
	 * @ordered
	 */
	protected EList<KontaktType> kontakt;

	/**
	 * The default value of the '{@link #isZdA() <em>Zd A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZdA()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZD_A_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZdA() <em>Zd A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZdA()
	 * @generated
	 * @ordered
	 */
	protected boolean zdA = ZD_A_EDEFAULT;

	/**
	 * This is true if the Zd A attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zdAESet;

	/**
	 * The default value of the '{@link #getZdADatum() <em>Zd ADatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZdADatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZD_ADATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZdADatum() <em>Zd ADatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZdADatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zdADatum = ZD_ADATUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterung() <em>Anwendungsspezifische Erweiterung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterung()
	 * @generated
	 * @ordered
	 */
	protected EList<AnwendungsspezifischeErweiterungType> anwendungsspezifischeErweiterung;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterungXML() <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 * @ordered
	 */
	protected AnwendungsspezifischeErweiterungXMLType anwendungsspezifischeErweiterungXML;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AkteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.AKTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationObjektType getIdentifikation() {
		return identifikation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifikation(IdentifikationObjektType newIdentifikation, NotificationChain msgs) {
		IdentifikationObjektType oldIdentifikation = identifikation;
		identifikation = newIdentifikation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__IDENTIFIKATION, oldIdentifikation, newIdentifikation);
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
	public void setIdentifikation(IdentifikationObjektType newIdentifikation) {
		if (newIdentifikation != identifikation) {
			NotificationChain msgs = null;
			if (identifikation != null)
				msgs = ((InternalEObject)identifikation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__IDENTIFIKATION, null, msgs);
			if (newIdentifikation != null)
				msgs = ((InternalEObject)newIdentifikation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__IDENTIFIKATION, null, msgs);
			msgs = basicSetIdentifikation(newIdentifikation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__IDENTIFIKATION, newIdentifikation, newIdentifikation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineMetadatenType getAllgemeineMetadaten() {
		return allgemeineMetadaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllgemeineMetadaten(AllgemeineMetadatenType newAllgemeineMetadaten, NotificationChain msgs) {
		AllgemeineMetadatenType oldAllgemeineMetadaten = allgemeineMetadaten;
		allgemeineMetadaten = newAllgemeineMetadaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN, oldAllgemeineMetadaten, newAllgemeineMetadaten);
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
	public void setAllgemeineMetadaten(AllgemeineMetadatenType newAllgemeineMetadaten) {
		if (newAllgemeineMetadaten != allgemeineMetadaten) {
			NotificationChain msgs = null;
			if (allgemeineMetadaten != null)
				msgs = ((InternalEObject)allgemeineMetadaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN, null, msgs);
			if (newAllgemeineMetadaten != null)
				msgs = ((InternalEObject)newAllgemeineMetadaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN, null, msgs);
			msgs = basicSetAllgemeineMetadaten(newAllgemeineMetadaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN, newAllgemeineMetadaten, newAllgemeineMetadaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AussonderungsmetadatenType getAussonderungsmetadaten() {
		return aussonderungsmetadaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAussonderungsmetadaten(AussonderungsmetadatenType newAussonderungsmetadaten, NotificationChain msgs) {
		AussonderungsmetadatenType oldAussonderungsmetadaten = aussonderungsmetadaten;
		aussonderungsmetadaten = newAussonderungsmetadaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN, oldAussonderungsmetadaten, newAussonderungsmetadaten);
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
	public void setAussonderungsmetadaten(AussonderungsmetadatenType newAussonderungsmetadaten) {
		if (newAussonderungsmetadaten != aussonderungsmetadaten) {
			NotificationChain msgs = null;
			if (aussonderungsmetadaten != null)
				msgs = ((InternalEObject)aussonderungsmetadaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN, null, msgs);
			if (newAussonderungsmetadaten != null)
				msgs = ((InternalEObject)newAussonderungsmetadaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN, null, msgs);
			msgs = basicSetAussonderungsmetadaten(newAussonderungsmetadaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN, newAussonderungsmetadaten, newAussonderungsmetadaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandort() {
		return standort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandort(String newStandort) {
		String oldStandort = standort;
		standort = newStandort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__STANDORT, oldStandort, standort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTyp(String newTyp) {
		String oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType getLaufzeit() {
		return laufzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaufzeit(ZeitraumType newLaufzeit, NotificationChain msgs) {
		ZeitraumType oldLaufzeit = laufzeit;
		laufzeit = newLaufzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__LAUFZEIT, oldLaufzeit, newLaufzeit);
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
	public void setLaufzeit(ZeitraumType newLaufzeit) {
		if (newLaufzeit != laufzeit) {
			NotificationChain msgs = null;
			if (laufzeit != null)
				msgs = ((InternalEObject)laufzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__LAUFZEIT, null, msgs);
			if (newLaufzeit != null)
				msgs = ((InternalEObject)newLaufzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__LAUFZEIT, null, msgs);
			msgs = basicSetLaufzeit(newLaufzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__LAUFZEIT, newLaufzeit, newLaufzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistorienProtokollInformationType> getHistorienProtokollInformation() {
		if (historienProtokollInformation == null) {
			historienProtokollInformation = new EObjectContainmentEList<HistorienProtokollInformationType>(HistorienProtokollInformationType.class, this, DomeaPackage.AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION);
		}
		return historienProtokollInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeschaeftsgangType> getInternerGeschaeftsgang() {
		if (internerGeschaeftsgang == null) {
			internerGeschaeftsgang = new EObjectContainmentEList<GeschaeftsgangType>(GeschaeftsgangType.class, this, DomeaPackage.AKTE_TYPE__INTERNER_GESCHAEFTSGANG);
		}
		return internerGeschaeftsgang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AkteninhaltType getAkteninhalt() {
		return akteninhalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAkteninhalt(AkteninhaltType newAkteninhalt, NotificationChain msgs) {
		AkteninhaltType oldAkteninhalt = akteninhalt;
		akteninhalt = newAkteninhalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__AKTENINHALT, oldAkteninhalt, newAkteninhalt);
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
	public void setAkteninhalt(AkteninhaltType newAkteninhalt) {
		if (newAkteninhalt != akteninhalt) {
			NotificationChain msgs = null;
			if (akteninhalt != null)
				msgs = ((InternalEObject)akteninhalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__AKTENINHALT, null, msgs);
			if (newAkteninhalt != null)
				msgs = ((InternalEObject)newAkteninhalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__AKTENINHALT, null, msgs);
			msgs = basicSetAkteninhalt(newAkteninhalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__AKTENINHALT, newAkteninhalt, newAkteninhalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerweisType> getVerweis() {
		if (verweis == null) {
			verweis = new EObjectContainmentEList<VerweisType>(VerweisType.class, this, DomeaPackage.AKTE_TYPE__VERWEIS);
		}
		return verweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KontaktType> getKontakt() {
		if (kontakt == null) {
			kontakt = new EObjectContainmentEList<KontaktType>(KontaktType.class, this, DomeaPackage.AKTE_TYPE__KONTAKT);
		}
		return kontakt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZdA() {
		return zdA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZdA(boolean newZdA) {
		boolean oldZdA = zdA;
		zdA = newZdA;
		boolean oldZdAESet = zdAESet;
		zdAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__ZD_A, oldZdA, zdA, !oldZdAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZdA() {
		boolean oldZdA = zdA;
		boolean oldZdAESet = zdAESet;
		zdA = ZD_A_EDEFAULT;
		zdAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.AKTE_TYPE__ZD_A, oldZdA, ZD_A_EDEFAULT, oldZdAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZdA() {
		return zdAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZdADatum() {
		return zdADatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZdADatum(XMLGregorianCalendar newZdADatum) {
		XMLGregorianCalendar oldZdADatum = zdADatum;
		zdADatum = newZdADatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__ZD_ADATUM, oldZdADatum, zdADatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung() {
		if (anwendungsspezifischeErweiterung == null) {
			anwendungsspezifischeErweiterung = new EObjectContainmentEList<AnwendungsspezifischeErweiterungType>(AnwendungsspezifischeErweiterungType.class, this, DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		}
		return anwendungsspezifischeErweiterung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML() {
		return anwendungsspezifischeErweiterungXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML, NotificationChain msgs) {
		AnwendungsspezifischeErweiterungXMLType oldAnwendungsspezifischeErweiterungXML = anwendungsspezifischeErweiterungXML;
		anwendungsspezifischeErweiterungXML = newAnwendungsspezifischeErweiterungXML;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, oldAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML);
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
	public void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML) {
		if (newAnwendungsspezifischeErweiterungXML != anwendungsspezifischeErweiterungXML) {
			NotificationChain msgs = null;
			if (anwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)anwendungsspezifischeErweiterungXML).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			if (newAnwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)newAnwendungsspezifischeErweiterungXML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			msgs = basicSetAnwendungsspezifischeErweiterungXML(newAnwendungsspezifischeErweiterungXML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, newAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.AKTE_TYPE__IDENTIFIKATION:
				return basicSetIdentifikation(null, msgs);
			case DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN:
				return basicSetAllgemeineMetadaten(null, msgs);
			case DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN:
				return basicSetAussonderungsmetadaten(null, msgs);
			case DomeaPackage.AKTE_TYPE__LAUFZEIT:
				return basicSetLaufzeit(null, msgs);
			case DomeaPackage.AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				return ((InternalEList<?>)getHistorienProtokollInformation()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTE_TYPE__INTERNER_GESCHAEFTSGANG:
				return ((InternalEList<?>)getInternerGeschaeftsgang()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTE_TYPE__AKTENINHALT:
				return basicSetAkteninhalt(null, msgs);
			case DomeaPackage.AKTE_TYPE__VERWEIS:
				return ((InternalEList<?>)getVerweis()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTE_TYPE__KONTAKT:
				return ((InternalEList<?>)getKontakt()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return ((InternalEList<?>)getAnwendungsspezifischeErweiterung()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return basicSetAnwendungsspezifischeErweiterungXML(null, msgs);
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
			case DomeaPackage.AKTE_TYPE__IDENTIFIKATION:
				return getIdentifikation();
			case DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN:
				return getAllgemeineMetadaten();
			case DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN:
				return getAussonderungsmetadaten();
			case DomeaPackage.AKTE_TYPE__STANDORT:
				return getStandort();
			case DomeaPackage.AKTE_TYPE__TYP:
				return getTyp();
			case DomeaPackage.AKTE_TYPE__LAUFZEIT:
				return getLaufzeit();
			case DomeaPackage.AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				return getHistorienProtokollInformation();
			case DomeaPackage.AKTE_TYPE__INTERNER_GESCHAEFTSGANG:
				return getInternerGeschaeftsgang();
			case DomeaPackage.AKTE_TYPE__AKTENINHALT:
				return getAkteninhalt();
			case DomeaPackage.AKTE_TYPE__VERWEIS:
				return getVerweis();
			case DomeaPackage.AKTE_TYPE__KONTAKT:
				return getKontakt();
			case DomeaPackage.AKTE_TYPE__ZD_A:
				return isZdA();
			case DomeaPackage.AKTE_TYPE__ZD_ADATUM:
				return getZdADatum();
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return getAnwendungsspezifischeErweiterung();
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return getAnwendungsspezifischeErweiterungXML();
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
			case DomeaPackage.AKTE_TYPE__IDENTIFIKATION:
				setIdentifikation((IdentifikationObjektType)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN:
				setAllgemeineMetadaten((AllgemeineMetadatenType)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN:
				setAussonderungsmetadaten((AussonderungsmetadatenType)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__STANDORT:
				setStandort((String)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__TYP:
				setTyp((String)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__LAUFZEIT:
				setLaufzeit((ZeitraumType)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				getHistorienProtokollInformation().clear();
				getHistorienProtokollInformation().addAll((Collection<? extends HistorienProtokollInformationType>)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__INTERNER_GESCHAEFTSGANG:
				getInternerGeschaeftsgang().clear();
				getInternerGeschaeftsgang().addAll((Collection<? extends GeschaeftsgangType>)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__AKTENINHALT:
				setAkteninhalt((AkteninhaltType)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__VERWEIS:
				getVerweis().clear();
				getVerweis().addAll((Collection<? extends VerweisType>)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__KONTAKT:
				getKontakt().clear();
				getKontakt().addAll((Collection<? extends KontaktType>)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__ZD_A:
				setZdA((Boolean)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__ZD_ADATUM:
				setZdADatum((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				getAnwendungsspezifischeErweiterung().addAll((Collection<? extends AnwendungsspezifischeErweiterungType>)newValue);
				return;
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)newValue);
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
			case DomeaPackage.AKTE_TYPE__IDENTIFIKATION:
				setIdentifikation((IdentifikationObjektType)null);
				return;
			case DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN:
				setAllgemeineMetadaten((AllgemeineMetadatenType)null);
				return;
			case DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN:
				setAussonderungsmetadaten((AussonderungsmetadatenType)null);
				return;
			case DomeaPackage.AKTE_TYPE__STANDORT:
				setStandort(STANDORT_EDEFAULT);
				return;
			case DomeaPackage.AKTE_TYPE__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case DomeaPackage.AKTE_TYPE__LAUFZEIT:
				setLaufzeit((ZeitraumType)null);
				return;
			case DomeaPackage.AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				getHistorienProtokollInformation().clear();
				return;
			case DomeaPackage.AKTE_TYPE__INTERNER_GESCHAEFTSGANG:
				getInternerGeschaeftsgang().clear();
				return;
			case DomeaPackage.AKTE_TYPE__AKTENINHALT:
				setAkteninhalt((AkteninhaltType)null);
				return;
			case DomeaPackage.AKTE_TYPE__VERWEIS:
				getVerweis().clear();
				return;
			case DomeaPackage.AKTE_TYPE__KONTAKT:
				getKontakt().clear();
				return;
			case DomeaPackage.AKTE_TYPE__ZD_A:
				unsetZdA();
				return;
			case DomeaPackage.AKTE_TYPE__ZD_ADATUM:
				setZdADatum(ZD_ADATUM_EDEFAULT);
				return;
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				return;
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)null);
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
			case DomeaPackage.AKTE_TYPE__IDENTIFIKATION:
				return identifikation != null;
			case DomeaPackage.AKTE_TYPE__ALLGEMEINE_METADATEN:
				return allgemeineMetadaten != null;
			case DomeaPackage.AKTE_TYPE__AUSSONDERUNGSMETADATEN:
				return aussonderungsmetadaten != null;
			case DomeaPackage.AKTE_TYPE__STANDORT:
				return STANDORT_EDEFAULT == null ? standort != null : !STANDORT_EDEFAULT.equals(standort);
			case DomeaPackage.AKTE_TYPE__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
			case DomeaPackage.AKTE_TYPE__LAUFZEIT:
				return laufzeit != null;
			case DomeaPackage.AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				return historienProtokollInformation != null && !historienProtokollInformation.isEmpty();
			case DomeaPackage.AKTE_TYPE__INTERNER_GESCHAEFTSGANG:
				return internerGeschaeftsgang != null && !internerGeschaeftsgang.isEmpty();
			case DomeaPackage.AKTE_TYPE__AKTENINHALT:
				return akteninhalt != null;
			case DomeaPackage.AKTE_TYPE__VERWEIS:
				return verweis != null && !verweis.isEmpty();
			case DomeaPackage.AKTE_TYPE__KONTAKT:
				return kontakt != null && !kontakt.isEmpty();
			case DomeaPackage.AKTE_TYPE__ZD_A:
				return isSetZdA();
			case DomeaPackage.AKTE_TYPE__ZD_ADATUM:
				return ZD_ADATUM_EDEFAULT == null ? zdADatum != null : !ZD_ADATUM_EDEFAULT.equals(zdADatum);
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return anwendungsspezifischeErweiterung != null && !anwendungsspezifischeErweiterung.isEmpty();
			case DomeaPackage.AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return anwendungsspezifischeErweiterungXML != null;
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
		result.append(" (standort: ");
		result.append(standort);
		result.append(", typ: ");
		result.append(typ);
		result.append(", zdA: ");
		if (zdAESet) result.append(zdA); else result.append("<unset>");
		result.append(", zdADatum: ");
		result.append(zdADatum);
		result.append(')');
		return result.toString();
	}

} //AkteTypeImpl
