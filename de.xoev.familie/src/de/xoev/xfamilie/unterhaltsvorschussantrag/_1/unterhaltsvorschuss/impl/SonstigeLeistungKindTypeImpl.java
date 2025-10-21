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

import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BezugUvKindType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSonstigeLeistungenUVType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungsgewaehrungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Sonstige Leistung Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getLeistungserhaltKindergeld <em>Leistungserhalt Kindergeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getLeistungsgewaehrung <em>Leistungsgewaehrung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getNameJobcenter <em>Name Jobcenter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getBedarfsgemeinschaftsnummer <em>Bedarfsgemeinschaftsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getNameTraeger <em>Name Traeger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getBetraegeZurLeistungshoehe <em>Betraege Zur Leistungshoehe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getBezugUV <em>Bezug UV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungKindTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SonstigeLeistungKindTypeImpl extends MinimalEObjectImpl.Container implements SonstigeLeistungKindType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeSonstigeLeistungenUVType art;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nachweis;

	/**
	 * The cached value of the '{@link #getLeistungserhaltKindergeld() <em>Leistungserhalt Kindergeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeistungserhaltKindergeld()
	 * @generated
	 * @ordered
	 */
	protected LeistungserhaltType leistungserhaltKindergeld;

	/**
	 * The cached value of the '{@link #getLeistungsgewaehrung() <em>Leistungsgewaehrung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeistungsgewaehrung()
	 * @generated
	 * @ordered
	 */
	protected LeistungsgewaehrungType leistungsgewaehrung;

	/**
	 * The default value of the '{@link #getNameJobcenter() <em>Name Jobcenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameJobcenter()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_JOBCENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameJobcenter() <em>Name Jobcenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameJobcenter()
	 * @generated
	 * @ordered
	 */
	protected String nameJobcenter = NAME_JOBCENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBedarfsgemeinschaftsnummer() <em>Bedarfsgemeinschaftsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedarfsgemeinschaftsnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBedarfsgemeinschaftsnummer() <em>Bedarfsgemeinschaftsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedarfsgemeinschaftsnummer()
	 * @generated
	 * @ordered
	 */
	protected String bedarfsgemeinschaftsnummer = BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameTraeger() <em>Name Traeger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTraeger()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TRAEGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTraeger() <em>Name Traeger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTraeger()
	 * @generated
	 * @ordered
	 */
	protected String nameTraeger = NAME_TRAEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAktenzeichen() <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichen()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichen() <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichen()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichen = AKTENZEICHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBetraegeZurLeistungshoehe() <em>Betraege Zur Leistungshoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetraegeZurLeistungshoehe()
	 * @generated
	 * @ordered
	 */
	protected static final String BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetraegeZurLeistungshoehe() <em>Betraege Zur Leistungshoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetraegeZurLeistungshoehe()
	 * @generated
	 * @ordered
	 */
	protected String betraegeZurLeistungshoehe = BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBezugUV() <em>Bezug UV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugUV()
	 * @generated
	 * @ordered
	 */
	protected BezugUvKindType bezugUV;

	/**
	 * The cached value of the '{@link #getZeitraum() <em>Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SonstigeLeistungKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getSonstigeLeistungKindType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSonstigeLeistungenUVType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeSonstigeLeistungenUVType newArt, NotificationChain msgs) {
		CodeSonstigeLeistungenUVType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeSonstigeLeistungenUVType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNachweis() {
		if (nachweis == null) {
			nachweis = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeistungserhaltType getLeistungserhaltKindergeld() {
		return leistungserhaltKindergeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeistungserhaltKindergeld(LeistungserhaltType newLeistungserhaltKindergeld, NotificationChain msgs) {
		LeistungserhaltType oldLeistungserhaltKindergeld = leistungserhaltKindergeld;
		leistungserhaltKindergeld = newLeistungserhaltKindergeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD, oldLeistungserhaltKindergeld, newLeistungserhaltKindergeld);
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
	public void setLeistungserhaltKindergeld(LeistungserhaltType newLeistungserhaltKindergeld) {
		if (newLeistungserhaltKindergeld != leistungserhaltKindergeld) {
			NotificationChain msgs = null;
			if (leistungserhaltKindergeld != null)
				msgs = ((InternalEObject)leistungserhaltKindergeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD, null, msgs);
			if (newLeistungserhaltKindergeld != null)
				msgs = ((InternalEObject)newLeistungserhaltKindergeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD, null, msgs);
			msgs = basicSetLeistungserhaltKindergeld(newLeistungserhaltKindergeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD, newLeistungserhaltKindergeld, newLeistungserhaltKindergeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeistungsgewaehrungType getLeistungsgewaehrung() {
		return leistungsgewaehrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeistungsgewaehrung(LeistungsgewaehrungType newLeistungsgewaehrung, NotificationChain msgs) {
		LeistungsgewaehrungType oldLeistungsgewaehrung = leistungsgewaehrung;
		leistungsgewaehrung = newLeistungsgewaehrung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG, oldLeistungsgewaehrung, newLeistungsgewaehrung);
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
	public void setLeistungsgewaehrung(LeistungsgewaehrungType newLeistungsgewaehrung) {
		if (newLeistungsgewaehrung != leistungsgewaehrung) {
			NotificationChain msgs = null;
			if (leistungsgewaehrung != null)
				msgs = ((InternalEObject)leistungsgewaehrung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG, null, msgs);
			if (newLeistungsgewaehrung != null)
				msgs = ((InternalEObject)newLeistungsgewaehrung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG, null, msgs);
			msgs = basicSetLeistungsgewaehrung(newLeistungsgewaehrung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG, newLeistungsgewaehrung, newLeistungsgewaehrung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameJobcenter() {
		return nameJobcenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameJobcenter(String newNameJobcenter) {
		String oldNameJobcenter = nameJobcenter;
		nameJobcenter = newNameJobcenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_JOBCENTER, oldNameJobcenter, nameJobcenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBedarfsgemeinschaftsnummer() {
		return bedarfsgemeinschaftsnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBedarfsgemeinschaftsnummer(String newBedarfsgemeinschaftsnummer) {
		String oldBedarfsgemeinschaftsnummer = bedarfsgemeinschaftsnummer;
		bedarfsgemeinschaftsnummer = newBedarfsgemeinschaftsnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEDARFSGEMEINSCHAFTSNUMMER, oldBedarfsgemeinschaftsnummer, bedarfsgemeinschaftsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameTraeger() {
		return nameTraeger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameTraeger(String newNameTraeger) {
		String oldNameTraeger = nameTraeger;
		nameTraeger = newNameTraeger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_TRAEGER, oldNameTraeger, nameTraeger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichen() {
		return aktenzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichen(String newAktenzeichen) {
		String oldAktenzeichen = aktenzeichen;
		aktenzeichen = newAktenzeichen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__AKTENZEICHEN, oldAktenzeichen, aktenzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBetraegeZurLeistungshoehe() {
		return betraegeZurLeistungshoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetraegeZurLeistungshoehe(String newBetraegeZurLeistungshoehe) {
		String oldBetraegeZurLeistungshoehe = betraegeZurLeistungshoehe;
		betraegeZurLeistungshoehe = newBetraegeZurLeistungshoehe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE, oldBetraegeZurLeistungshoehe, betraegeZurLeistungshoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BezugUvKindType getBezugUV() {
		return bezugUV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugUV(BezugUvKindType newBezugUV, NotificationChain msgs) {
		BezugUvKindType oldBezugUV = bezugUV;
		bezugUV = newBezugUV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV, oldBezugUV, newBezugUV);
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
	public void setBezugUV(BezugUvKindType newBezugUV) {
		if (newBezugUV != bezugUV) {
			NotificationChain msgs = null;
			if (bezugUV != null)
				msgs = ((InternalEObject)bezugUV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV, null, msgs);
			if (newBezugUV != null)
				msgs = ((InternalEObject)newBezugUV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV, null, msgs);
			msgs = basicSetBezugUV(newBezugUV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV, newBezugUV, newBezugUV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraum() {
		if (zeitraum == null) {
			zeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ZEITRAUM);
		}
		return zeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART:
				return basicSetArt(null, msgs);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD:
				return basicSetLeistungserhaltKindergeld(null, msgs);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG:
				return basicSetLeistungsgewaehrung(null, msgs);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV:
				return basicSetBezugUV(null, msgs);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ZEITRAUM:
				return ((InternalEList<?>)getZeitraum()).basicRemove(otherEnd, msgs);
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
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NACHWEIS:
				return getNachweis();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD:
				return getLeistungserhaltKindergeld();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG:
				return getLeistungsgewaehrung();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_JOBCENTER:
				return getNameJobcenter();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEDARFSGEMEINSCHAFTSNUMMER:
				return getBedarfsgemeinschaftsnummer();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_TRAEGER:
				return getNameTraeger();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__AKTENZEICHEN:
				return getAktenzeichen();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE:
				return getBetraegeZurLeistungshoehe();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV:
				return getBezugUV();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ZEITRAUM:
				return getZeitraum();
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
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART:
				setArt((CodeSonstigeLeistungenUVType)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD:
				setLeistungserhaltKindergeld((LeistungserhaltType)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG:
				setLeistungsgewaehrung((LeistungsgewaehrungType)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_JOBCENTER:
				setNameJobcenter((String)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEDARFSGEMEINSCHAFTSNUMMER:
				setBedarfsgemeinschaftsnummer((String)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_TRAEGER:
				setNameTraeger((String)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__AKTENZEICHEN:
				setAktenzeichen((String)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE:
				setBetraegeZurLeistungshoehe((String)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV:
				setBezugUV((BezugUvKindType)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ZEITRAUM:
				getZeitraum().clear();
				getZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
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
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART:
				setArt((CodeSonstigeLeistungenUVType)null);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NACHWEIS:
				getNachweis().clear();
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD:
				setLeistungserhaltKindergeld((LeistungserhaltType)null);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG:
				setLeistungsgewaehrung((LeistungsgewaehrungType)null);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_JOBCENTER:
				setNameJobcenter(NAME_JOBCENTER_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEDARFSGEMEINSCHAFTSNUMMER:
				setBedarfsgemeinschaftsnummer(BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_TRAEGER:
				setNameTraeger(NAME_TRAEGER_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__AKTENZEICHEN:
				setAktenzeichen(AKTENZEICHEN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE:
				setBetraegeZurLeistungshoehe(BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV:
				setBezugUV((BezugUvKindType)null);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ZEITRAUM:
				getZeitraum().clear();
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
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSERHALT_KINDERGELD:
				return leistungserhaltKindergeld != null;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__LEISTUNGSGEWAEHRUNG:
				return leistungsgewaehrung != null;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_JOBCENTER:
				return NAME_JOBCENTER_EDEFAULT == null ? nameJobcenter != null : !NAME_JOBCENTER_EDEFAULT.equals(nameJobcenter);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEDARFSGEMEINSCHAFTSNUMMER:
				return BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT == null ? bedarfsgemeinschaftsnummer != null : !BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT.equals(bedarfsgemeinschaftsnummer);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__NAME_TRAEGER:
				return NAME_TRAEGER_EDEFAULT == null ? nameTraeger != null : !NAME_TRAEGER_EDEFAULT.equals(nameTraeger);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__AKTENZEICHEN:
				return AKTENZEICHEN_EDEFAULT == null ? aktenzeichen != null : !AKTENZEICHEN_EDEFAULT.equals(aktenzeichen);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE:
				return BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT == null ? betraegeZurLeistungshoehe != null : !BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT.equals(betraegeZurLeistungshoehe);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__BEZUG_UV:
				return bezugUV != null;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_KIND_TYPE__ZEITRAUM:
				return zeitraum != null && !zeitraum.isEmpty();
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
		result.append(" (nachweis: ");
		result.append(nachweis);
		result.append(", nameJobcenter: ");
		result.append(nameJobcenter);
		result.append(", bedarfsgemeinschaftsnummer: ");
		result.append(bedarfsgemeinschaftsnummer);
		result.append(", nameTraeger: ");
		result.append(nameTraeger);
		result.append(", aktenzeichen: ");
		result.append(aktenzeichen);
		result.append(", betraegeZurLeistungshoehe: ");
		result.append(betraegeZurLeistungshoehe);
		result.append(')');
		return result.toString();
	}

} //SonstigeLeistungKindTypeImpl
