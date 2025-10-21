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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AktenplaneinheitType;
import de.xoev.domea.domea.AllgemeineMetadatenType;
import de.xoev.domea.domea.DatenschutzstufeCodeType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.GeheimhaltungType;
import de.xoev.domea.domea.MediumCodeType;
import de.xoev.domea.domea.StrukturpfadType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeine Metadaten Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getBetreff <em>Betreff</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getKennzeichen <em>Kennzeichen</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getFederfuehrung <em>Federfuehrung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getAktenfuehrung <em>Aktenfuehrung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getGeheimhaltung <em>Geheimhaltung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getBemerkung <em>Bemerkung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getAktenplaneinheit <em>Aktenplaneinheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getZeitpunktLetzteAenderung <em>Zeitpunkt Letzte Aenderung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getStrukturpfad <em>Strukturpfad</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getDatenschutzstufe <em>Datenschutzstufe</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl#getDatenschutzstufeCode <em>Datenschutzstufe Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeineMetadatenTypeImpl extends MinimalEObjectImpl.Container implements AllgemeineMetadatenType {
	/**
	 * The default value of the '{@link #getBetreff() <em>Betreff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreff()
	 * @generated
	 * @ordered
	 */
	protected static final String BETREFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetreff() <em>Betreff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreff()
	 * @generated
	 * @ordered
	 */
	protected String betreff = BETREFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getKennzeichen() <em>Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzeichen()
	 * @generated
	 * @ordered
	 */
	protected static final String KENNZEICHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKennzeichen() <em>Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzeichen()
	 * @generated
	 * @ordered
	 */
	protected String kennzeichen = KENNZEICHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFederfuehrung() <em>Federfuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederfuehrung()
	 * @generated
	 * @ordered
	 */
	protected static final String FEDERFUEHRUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFederfuehrung() <em>Federfuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederfuehrung()
	 * @generated
	 * @ordered
	 */
	protected String federfuehrung = FEDERFUEHRUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAktenfuehrung() <em>Aktenfuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenfuehrung()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENFUEHRUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenfuehrung() <em>Aktenfuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenfuehrung()
	 * @generated
	 * @ordered
	 */
	protected String aktenfuehrung = AKTENFUEHRUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeheimhaltung() <em>Geheimhaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeheimhaltung()
	 * @generated
	 * @ordered
	 */
	protected GeheimhaltungType geheimhaltung;

	/**
	 * The default value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEMERKUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected String bemerkung = BEMERKUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected MediumCodeType medium;

	/**
	 * The cached value of the '{@link #getAktenplaneinheit() <em>Aktenplaneinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenplaneinheit()
	 * @generated
	 * @ordered
	 */
	protected AktenplaneinheitType aktenplaneinheit;

	/**
	 * The default value of the '{@link #getZeitpunktLetzteAenderung() <em>Zeitpunkt Letzte Aenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitpunktLetzteAenderung()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitpunktLetzteAenderung() <em>Zeitpunkt Letzte Aenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitpunktLetzteAenderung()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitpunktLetzteAenderung = ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStrukturpfad() <em>Strukturpfad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrukturpfad()
	 * @generated
	 * @ordered
	 */
	protected StrukturpfadType strukturpfad;

	/**
	 * The default value of the '{@link #getDatenschutzstufe() <em>Datenschutzstufe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzstufe()
	 * @generated
	 * @ordered
	 */
	protected static final String DATENSCHUTZSTUFE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatenschutzstufe() <em>Datenschutzstufe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzstufe()
	 * @generated
	 * @ordered
	 */
	protected String datenschutzstufe = DATENSCHUTZSTUFE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatenschutzstufeCode() <em>Datenschutzstufe Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzstufeCode()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzstufeCodeType datenschutzstufeCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeineMetadatenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.ALLGEMEINE_METADATEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBetreff() {
		return betreff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetreff(String newBetreff) {
		String oldBetreff = betreff;
		betreff = newBetreff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BETREFF, oldBetreff, betreff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKennzeichen() {
		return kennzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKennzeichen(String newKennzeichen) {
		String oldKennzeichen = kennzeichen;
		kennzeichen = newKennzeichen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__KENNZEICHEN, oldKennzeichen, kennzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFederfuehrung() {
		return federfuehrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFederfuehrung(String newFederfuehrung) {
		String oldFederfuehrung = federfuehrung;
		federfuehrung = newFederfuehrung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__FEDERFUEHRUNG, oldFederfuehrung, federfuehrung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenfuehrung() {
		return aktenfuehrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenfuehrung(String newAktenfuehrung) {
		String oldAktenfuehrung = aktenfuehrung;
		aktenfuehrung = newAktenfuehrung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENFUEHRUNG, oldAktenfuehrung, aktenfuehrung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeheimhaltungType getGeheimhaltung() {
		return geheimhaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeheimhaltung(GeheimhaltungType newGeheimhaltung, NotificationChain msgs) {
		GeheimhaltungType oldGeheimhaltung = geheimhaltung;
		geheimhaltung = newGeheimhaltung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG, oldGeheimhaltung, newGeheimhaltung);
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
	public void setGeheimhaltung(GeheimhaltungType newGeheimhaltung) {
		if (newGeheimhaltung != geheimhaltung) {
			NotificationChain msgs = null;
			if (geheimhaltung != null)
				msgs = ((InternalEObject)geheimhaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG, null, msgs);
			if (newGeheimhaltung != null)
				msgs = ((InternalEObject)newGeheimhaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG, null, msgs);
			msgs = basicSetGeheimhaltung(newGeheimhaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG, newGeheimhaltung, newGeheimhaltung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBemerkung() {
		return bemerkung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBemerkung(String newBemerkung) {
		String oldBemerkung = bemerkung;
		bemerkung = newBemerkung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BEMERKUNG, oldBemerkung, bemerkung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediumCodeType getMedium() {
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedium(MediumCodeType newMedium, NotificationChain msgs) {
		MediumCodeType oldMedium = medium;
		medium = newMedium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM, oldMedium, newMedium);
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
	public void setMedium(MediumCodeType newMedium) {
		if (newMedium != medium) {
			NotificationChain msgs = null;
			if (medium != null)
				msgs = ((InternalEObject)medium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM, null, msgs);
			if (newMedium != null)
				msgs = ((InternalEObject)newMedium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM, null, msgs);
			msgs = basicSetMedium(newMedium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM, newMedium, newMedium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AktenplaneinheitType getAktenplaneinheit() {
		return aktenplaneinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAktenplaneinheit(AktenplaneinheitType newAktenplaneinheit, NotificationChain msgs) {
		AktenplaneinheitType oldAktenplaneinheit = aktenplaneinheit;
		aktenplaneinheit = newAktenplaneinheit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT, oldAktenplaneinheit, newAktenplaneinheit);
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
	public void setAktenplaneinheit(AktenplaneinheitType newAktenplaneinheit) {
		if (newAktenplaneinheit != aktenplaneinheit) {
			NotificationChain msgs = null;
			if (aktenplaneinheit != null)
				msgs = ((InternalEObject)aktenplaneinheit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT, null, msgs);
			if (newAktenplaneinheit != null)
				msgs = ((InternalEObject)newAktenplaneinheit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT, null, msgs);
			msgs = basicSetAktenplaneinheit(newAktenplaneinheit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT, newAktenplaneinheit, newAktenplaneinheit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitpunktLetzteAenderung() {
		return zeitpunktLetzteAenderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitpunktLetzteAenderung(XMLGregorianCalendar newZeitpunktLetzteAenderung) {
		XMLGregorianCalendar oldZeitpunktLetzteAenderung = zeitpunktLetzteAenderung;
		zeitpunktLetzteAenderung = newZeitpunktLetzteAenderung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__ZEITPUNKT_LETZTE_AENDERUNG, oldZeitpunktLetzteAenderung, zeitpunktLetzteAenderung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrukturpfadType getStrukturpfad() {
		return strukturpfad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrukturpfad(StrukturpfadType newStrukturpfad, NotificationChain msgs) {
		StrukturpfadType oldStrukturpfad = strukturpfad;
		strukturpfad = newStrukturpfad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD, oldStrukturpfad, newStrukturpfad);
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
	public void setStrukturpfad(StrukturpfadType newStrukturpfad) {
		if (newStrukturpfad != strukturpfad) {
			NotificationChain msgs = null;
			if (strukturpfad != null)
				msgs = ((InternalEObject)strukturpfad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD, null, msgs);
			if (newStrukturpfad != null)
				msgs = ((InternalEObject)newStrukturpfad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD, null, msgs);
			msgs = basicSetStrukturpfad(newStrukturpfad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD, newStrukturpfad, newStrukturpfad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatenschutzstufe() {
		return datenschutzstufe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatenschutzstufe(String newDatenschutzstufe) {
		String oldDatenschutzstufe = datenschutzstufe;
		datenschutzstufe = newDatenschutzstufe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE, oldDatenschutzstufe, datenschutzstufe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzstufeCodeType getDatenschutzstufeCode() {
		return datenschutzstufeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenschutzstufeCode(DatenschutzstufeCodeType newDatenschutzstufeCode, NotificationChain msgs) {
		DatenschutzstufeCodeType oldDatenschutzstufeCode = datenschutzstufeCode;
		datenschutzstufeCode = newDatenschutzstufeCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE, oldDatenschutzstufeCode, newDatenschutzstufeCode);
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
	public void setDatenschutzstufeCode(DatenschutzstufeCodeType newDatenschutzstufeCode) {
		if (newDatenschutzstufeCode != datenschutzstufeCode) {
			NotificationChain msgs = null;
			if (datenschutzstufeCode != null)
				msgs = ((InternalEObject)datenschutzstufeCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE, null, msgs);
			if (newDatenschutzstufeCode != null)
				msgs = ((InternalEObject)newDatenschutzstufeCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE, null, msgs);
			msgs = basicSetDatenschutzstufeCode(newDatenschutzstufeCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE, newDatenschutzstufeCode, newDatenschutzstufeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG:
				return basicSetGeheimhaltung(null, msgs);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM:
				return basicSetMedium(null, msgs);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT:
				return basicSetAktenplaneinheit(null, msgs);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD:
				return basicSetStrukturpfad(null, msgs);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE:
				return basicSetDatenschutzstufeCode(null, msgs);
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
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BETREFF:
				return getBetreff();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__KENNZEICHEN:
				return getKennzeichen();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__FEDERFUEHRUNG:
				return getFederfuehrung();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENFUEHRUNG:
				return getAktenfuehrung();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG:
				return getGeheimhaltung();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BEMERKUNG:
				return getBemerkung();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM:
				return getMedium();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT:
				return getAktenplaneinheit();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__ZEITPUNKT_LETZTE_AENDERUNG:
				return getZeitpunktLetzteAenderung();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD:
				return getStrukturpfad();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE:
				return getDatenschutzstufe();
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE:
				return getDatenschutzstufeCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BETREFF:
				setBetreff((String)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__KENNZEICHEN:
				setKennzeichen((String)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__FEDERFUEHRUNG:
				setFederfuehrung((String)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENFUEHRUNG:
				setAktenfuehrung((String)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG:
				setGeheimhaltung((GeheimhaltungType)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BEMERKUNG:
				setBemerkung((String)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM:
				setMedium((MediumCodeType)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT:
				setAktenplaneinheit((AktenplaneinheitType)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__ZEITPUNKT_LETZTE_AENDERUNG:
				setZeitpunktLetzteAenderung((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD:
				setStrukturpfad((StrukturpfadType)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE:
				setDatenschutzstufe((String)newValue);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE:
				setDatenschutzstufeCode((DatenschutzstufeCodeType)newValue);
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
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BETREFF:
				setBetreff(BETREFF_EDEFAULT);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__KENNZEICHEN:
				setKennzeichen(KENNZEICHEN_EDEFAULT);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__FEDERFUEHRUNG:
				setFederfuehrung(FEDERFUEHRUNG_EDEFAULT);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENFUEHRUNG:
				setAktenfuehrung(AKTENFUEHRUNG_EDEFAULT);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG:
				setGeheimhaltung((GeheimhaltungType)null);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BEMERKUNG:
				setBemerkung(BEMERKUNG_EDEFAULT);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM:
				setMedium((MediumCodeType)null);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT:
				setAktenplaneinheit((AktenplaneinheitType)null);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__ZEITPUNKT_LETZTE_AENDERUNG:
				setZeitpunktLetzteAenderung(ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD:
				setStrukturpfad((StrukturpfadType)null);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE:
				setDatenschutzstufe(DATENSCHUTZSTUFE_EDEFAULT);
				return;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE:
				setDatenschutzstufeCode((DatenschutzstufeCodeType)null);
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
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BETREFF:
				return BETREFF_EDEFAULT == null ? betreff != null : !BETREFF_EDEFAULT.equals(betreff);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__KENNZEICHEN:
				return KENNZEICHEN_EDEFAULT == null ? kennzeichen != null : !KENNZEICHEN_EDEFAULT.equals(kennzeichen);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__FEDERFUEHRUNG:
				return FEDERFUEHRUNG_EDEFAULT == null ? federfuehrung != null : !FEDERFUEHRUNG_EDEFAULT.equals(federfuehrung);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENFUEHRUNG:
				return AKTENFUEHRUNG_EDEFAULT == null ? aktenfuehrung != null : !AKTENFUEHRUNG_EDEFAULT.equals(aktenfuehrung);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG:
				return geheimhaltung != null;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__BEMERKUNG:
				return BEMERKUNG_EDEFAULT == null ? bemerkung != null : !BEMERKUNG_EDEFAULT.equals(bemerkung);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__MEDIUM:
				return medium != null;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT:
				return aktenplaneinheit != null;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__ZEITPUNKT_LETZTE_AENDERUNG:
				return ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT == null ? zeitpunktLetzteAenderung != null : !ZEITPUNKT_LETZTE_AENDERUNG_EDEFAULT.equals(zeitpunktLetzteAenderung);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD:
				return strukturpfad != null;
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE:
				return DATENSCHUTZSTUFE_EDEFAULT == null ? datenschutzstufe != null : !DATENSCHUTZSTUFE_EDEFAULT.equals(datenschutzstufe);
			case DomeaPackage.ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE:
				return datenschutzstufeCode != null;
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
		result.append(" (betreff: ");
		result.append(betreff);
		result.append(", kennzeichen: ");
		result.append(kennzeichen);
		result.append(", federfuehrung: ");
		result.append(federfuehrung);
		result.append(", aktenfuehrung: ");
		result.append(aktenfuehrung);
		result.append(", bemerkung: ");
		result.append(bemerkung);
		result.append(", zeitpunktLetzteAenderung: ");
		result.append(zeitpunktLetzteAenderung);
		result.append(", datenschutzstufe: ");
		result.append(datenschutzstufe);
		result.append(')');
		return result.toString();
	}

} //AllgemeineMetadatenTypeImpl
