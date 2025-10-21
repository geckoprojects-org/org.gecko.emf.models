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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachweise Kinderwunsch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl#getNachweisAktuellerWohnsitz <em>Nachweis Aktueller Wohnsitz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl#getNachweisEheurkunde <em>Nachweis Eheurkunde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl#getDauerAngelegtePartnerschaft <em>Dauer Angelegte Partnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl#getKostenuebernahmeerklaerungNegativbescheid <em>Kostenuebernahmeerklaerung Negativbescheid</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl#getNotwendigkeitsbescheinigungDesArztes <em>Notwendigkeitsbescheinigung Des Arztes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl#getBehandlungsplanKostenvoranschlag <em>Behandlungsplan Kostenvoranschlag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl#getErklaerungReproduktionseinrichtung <em>Erklaerung Reproduktionseinrichtung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweiseKinderwunschTypeImpl extends MinimalEObjectImpl.Container implements NachweiseKinderwunschType {
	/**
	 * The cached value of the '{@link #getNachweisAktuellerWohnsitz() <em>Nachweis Aktueller Wohnsitz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisAktuellerWohnsitz()
	 * @generated
	 * @ordered
	 */
	protected NachweisType nachweisAktuellerWohnsitz;

	/**
	 * The cached value of the '{@link #getNachweisEheurkunde() <em>Nachweis Eheurkunde</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisEheurkunde()
	 * @generated
	 * @ordered
	 */
	protected NachweisType nachweisEheurkunde;

	/**
	 * The cached value of the '{@link #getDauerAngelegtePartnerschaft() <em>Dauer Angelegte Partnerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauerAngelegtePartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected NachweisType dauerAngelegtePartnerschaft;

	/**
	 * The cached value of the '{@link #getKostenuebernahmeerklaerungNegativbescheid() <em>Kostenuebernahmeerklaerung Negativbescheid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKostenuebernahmeerklaerungNegativbescheid()
	 * @generated
	 * @ordered
	 */
	protected NachweisType kostenuebernahmeerklaerungNegativbescheid;

	/**
	 * The cached value of the '{@link #getNotwendigkeitsbescheinigungDesArztes() <em>Notwendigkeitsbescheinigung Des Arztes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotwendigkeitsbescheinigungDesArztes()
	 * @generated
	 * @ordered
	 */
	protected NachweisType notwendigkeitsbescheinigungDesArztes;

	/**
	 * The cached value of the '{@link #getBehandlungsplanKostenvoranschlag() <em>Behandlungsplan Kostenvoranschlag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehandlungsplanKostenvoranschlag()
	 * @generated
	 * @ordered
	 */
	protected NachweisType behandlungsplanKostenvoranschlag;

	/**
	 * The cached value of the '{@link #getErklaerungReproduktionseinrichtung() <em>Erklaerung Reproduktionseinrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErklaerungReproduktionseinrichtung()
	 * @generated
	 * @ordered
	 */
	protected NachweisType erklaerungReproduktionseinrichtung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweiseKinderwunschTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.NACHWEISE_KINDERWUNSCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType getNachweisAktuellerWohnsitz() {
		return nachweisAktuellerWohnsitz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweisAktuellerWohnsitz(NachweisType newNachweisAktuellerWohnsitz, NotificationChain msgs) {
		NachweisType oldNachweisAktuellerWohnsitz = nachweisAktuellerWohnsitz;
		nachweisAktuellerWohnsitz = newNachweisAktuellerWohnsitz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ, oldNachweisAktuellerWohnsitz, newNachweisAktuellerWohnsitz);
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
	public void setNachweisAktuellerWohnsitz(NachweisType newNachweisAktuellerWohnsitz) {
		if (newNachweisAktuellerWohnsitz != nachweisAktuellerWohnsitz) {
			NotificationChain msgs = null;
			if (nachweisAktuellerWohnsitz != null)
				msgs = ((InternalEObject)nachweisAktuellerWohnsitz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ, null, msgs);
			if (newNachweisAktuellerWohnsitz != null)
				msgs = ((InternalEObject)newNachweisAktuellerWohnsitz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ, null, msgs);
			msgs = basicSetNachweisAktuellerWohnsitz(newNachweisAktuellerWohnsitz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ, newNachweisAktuellerWohnsitz, newNachweisAktuellerWohnsitz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType getNachweisEheurkunde() {
		return nachweisEheurkunde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweisEheurkunde(NachweisType newNachweisEheurkunde, NotificationChain msgs) {
		NachweisType oldNachweisEheurkunde = nachweisEheurkunde;
		nachweisEheurkunde = newNachweisEheurkunde;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE, oldNachweisEheurkunde, newNachweisEheurkunde);
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
	public void setNachweisEheurkunde(NachweisType newNachweisEheurkunde) {
		if (newNachweisEheurkunde != nachweisEheurkunde) {
			NotificationChain msgs = null;
			if (nachweisEheurkunde != null)
				msgs = ((InternalEObject)nachweisEheurkunde).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE, null, msgs);
			if (newNachweisEheurkunde != null)
				msgs = ((InternalEObject)newNachweisEheurkunde).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE, null, msgs);
			msgs = basicSetNachweisEheurkunde(newNachweisEheurkunde, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE, newNachweisEheurkunde, newNachweisEheurkunde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType getDauerAngelegtePartnerschaft() {
		return dauerAngelegtePartnerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDauerAngelegtePartnerschaft(NachweisType newDauerAngelegtePartnerschaft, NotificationChain msgs) {
		NachweisType oldDauerAngelegtePartnerschaft = dauerAngelegtePartnerschaft;
		dauerAngelegtePartnerschaft = newDauerAngelegtePartnerschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT, oldDauerAngelegtePartnerschaft, newDauerAngelegtePartnerschaft);
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
	public void setDauerAngelegtePartnerschaft(NachweisType newDauerAngelegtePartnerschaft) {
		if (newDauerAngelegtePartnerschaft != dauerAngelegtePartnerschaft) {
			NotificationChain msgs = null;
			if (dauerAngelegtePartnerschaft != null)
				msgs = ((InternalEObject)dauerAngelegtePartnerschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT, null, msgs);
			if (newDauerAngelegtePartnerschaft != null)
				msgs = ((InternalEObject)newDauerAngelegtePartnerschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT, null, msgs);
			msgs = basicSetDauerAngelegtePartnerschaft(newDauerAngelegtePartnerschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT, newDauerAngelegtePartnerschaft, newDauerAngelegtePartnerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType getKostenuebernahmeerklaerungNegativbescheid() {
		return kostenuebernahmeerklaerungNegativbescheid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKostenuebernahmeerklaerungNegativbescheid(NachweisType newKostenuebernahmeerklaerungNegativbescheid, NotificationChain msgs) {
		NachweisType oldKostenuebernahmeerklaerungNegativbescheid = kostenuebernahmeerklaerungNegativbescheid;
		kostenuebernahmeerklaerungNegativbescheid = newKostenuebernahmeerklaerungNegativbescheid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID, oldKostenuebernahmeerklaerungNegativbescheid, newKostenuebernahmeerklaerungNegativbescheid);
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
	public void setKostenuebernahmeerklaerungNegativbescheid(NachweisType newKostenuebernahmeerklaerungNegativbescheid) {
		if (newKostenuebernahmeerklaerungNegativbescheid != kostenuebernahmeerklaerungNegativbescheid) {
			NotificationChain msgs = null;
			if (kostenuebernahmeerklaerungNegativbescheid != null)
				msgs = ((InternalEObject)kostenuebernahmeerklaerungNegativbescheid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID, null, msgs);
			if (newKostenuebernahmeerklaerungNegativbescheid != null)
				msgs = ((InternalEObject)newKostenuebernahmeerklaerungNegativbescheid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID, null, msgs);
			msgs = basicSetKostenuebernahmeerklaerungNegativbescheid(newKostenuebernahmeerklaerungNegativbescheid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID, newKostenuebernahmeerklaerungNegativbescheid, newKostenuebernahmeerklaerungNegativbescheid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType getNotwendigkeitsbescheinigungDesArztes() {
		return notwendigkeitsbescheinigungDesArztes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotwendigkeitsbescheinigungDesArztes(NachweisType newNotwendigkeitsbescheinigungDesArztes, NotificationChain msgs) {
		NachweisType oldNotwendigkeitsbescheinigungDesArztes = notwendigkeitsbescheinigungDesArztes;
		notwendigkeitsbescheinigungDesArztes = newNotwendigkeitsbescheinigungDesArztes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES, oldNotwendigkeitsbescheinigungDesArztes, newNotwendigkeitsbescheinigungDesArztes);
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
	public void setNotwendigkeitsbescheinigungDesArztes(NachweisType newNotwendigkeitsbescheinigungDesArztes) {
		if (newNotwendigkeitsbescheinigungDesArztes != notwendigkeitsbescheinigungDesArztes) {
			NotificationChain msgs = null;
			if (notwendigkeitsbescheinigungDesArztes != null)
				msgs = ((InternalEObject)notwendigkeitsbescheinigungDesArztes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES, null, msgs);
			if (newNotwendigkeitsbescheinigungDesArztes != null)
				msgs = ((InternalEObject)newNotwendigkeitsbescheinigungDesArztes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES, null, msgs);
			msgs = basicSetNotwendigkeitsbescheinigungDesArztes(newNotwendigkeitsbescheinigungDesArztes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES, newNotwendigkeitsbescheinigungDesArztes, newNotwendigkeitsbescheinigungDesArztes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType getBehandlungsplanKostenvoranschlag() {
		return behandlungsplanKostenvoranschlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehandlungsplanKostenvoranschlag(NachweisType newBehandlungsplanKostenvoranschlag, NotificationChain msgs) {
		NachweisType oldBehandlungsplanKostenvoranschlag = behandlungsplanKostenvoranschlag;
		behandlungsplanKostenvoranschlag = newBehandlungsplanKostenvoranschlag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG, oldBehandlungsplanKostenvoranschlag, newBehandlungsplanKostenvoranschlag);
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
	public void setBehandlungsplanKostenvoranschlag(NachweisType newBehandlungsplanKostenvoranschlag) {
		if (newBehandlungsplanKostenvoranschlag != behandlungsplanKostenvoranschlag) {
			NotificationChain msgs = null;
			if (behandlungsplanKostenvoranschlag != null)
				msgs = ((InternalEObject)behandlungsplanKostenvoranschlag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG, null, msgs);
			if (newBehandlungsplanKostenvoranschlag != null)
				msgs = ((InternalEObject)newBehandlungsplanKostenvoranschlag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG, null, msgs);
			msgs = basicSetBehandlungsplanKostenvoranschlag(newBehandlungsplanKostenvoranschlag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG, newBehandlungsplanKostenvoranschlag, newBehandlungsplanKostenvoranschlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType getErklaerungReproduktionseinrichtung() {
		return erklaerungReproduktionseinrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErklaerungReproduktionseinrichtung(NachweisType newErklaerungReproduktionseinrichtung, NotificationChain msgs) {
		NachweisType oldErklaerungReproduktionseinrichtung = erklaerungReproduktionseinrichtung;
		erklaerungReproduktionseinrichtung = newErklaerungReproduktionseinrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG, oldErklaerungReproduktionseinrichtung, newErklaerungReproduktionseinrichtung);
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
	public void setErklaerungReproduktionseinrichtung(NachweisType newErklaerungReproduktionseinrichtung) {
		if (newErklaerungReproduktionseinrichtung != erklaerungReproduktionseinrichtung) {
			NotificationChain msgs = null;
			if (erklaerungReproduktionseinrichtung != null)
				msgs = ((InternalEObject)erklaerungReproduktionseinrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG, null, msgs);
			if (newErklaerungReproduktionseinrichtung != null)
				msgs = ((InternalEObject)newErklaerungReproduktionseinrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG, null, msgs);
			msgs = basicSetErklaerungReproduktionseinrichtung(newErklaerungReproduktionseinrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG, newErklaerungReproduktionseinrichtung, newErklaerungReproduktionseinrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ:
				return basicSetNachweisAktuellerWohnsitz(null, msgs);
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE:
				return basicSetNachweisEheurkunde(null, msgs);
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT:
				return basicSetDauerAngelegtePartnerschaft(null, msgs);
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID:
				return basicSetKostenuebernahmeerklaerungNegativbescheid(null, msgs);
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES:
				return basicSetNotwendigkeitsbescheinigungDesArztes(null, msgs);
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG:
				return basicSetBehandlungsplanKostenvoranschlag(null, msgs);
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG:
				return basicSetErklaerungReproduktionseinrichtung(null, msgs);
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
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ:
				return getNachweisAktuellerWohnsitz();
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE:
				return getNachweisEheurkunde();
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT:
				return getDauerAngelegtePartnerschaft();
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID:
				return getKostenuebernahmeerklaerungNegativbescheid();
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES:
				return getNotwendigkeitsbescheinigungDesArztes();
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG:
				return getBehandlungsplanKostenvoranschlag();
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG:
				return getErklaerungReproduktionseinrichtung();
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
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ:
				setNachweisAktuellerWohnsitz((NachweisType)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE:
				setNachweisEheurkunde((NachweisType)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT:
				setDauerAngelegtePartnerschaft((NachweisType)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID:
				setKostenuebernahmeerklaerungNegativbescheid((NachweisType)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES:
				setNotwendigkeitsbescheinigungDesArztes((NachweisType)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG:
				setBehandlungsplanKostenvoranschlag((NachweisType)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG:
				setErklaerungReproduktionseinrichtung((NachweisType)newValue);
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
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ:
				setNachweisAktuellerWohnsitz((NachweisType)null);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE:
				setNachweisEheurkunde((NachweisType)null);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT:
				setDauerAngelegtePartnerschaft((NachweisType)null);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID:
				setKostenuebernahmeerklaerungNegativbescheid((NachweisType)null);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES:
				setNotwendigkeitsbescheinigungDesArztes((NachweisType)null);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG:
				setBehandlungsplanKostenvoranschlag((NachweisType)null);
				return;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG:
				setErklaerungReproduktionseinrichtung((NachweisType)null);
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
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ:
				return nachweisAktuellerWohnsitz != null;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE:
				return nachweisEheurkunde != null;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT:
				return dauerAngelegtePartnerschaft != null;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID:
				return kostenuebernahmeerklaerungNegativbescheid != null;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES:
				return notwendigkeitsbescheinigungDesArztes != null;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG:
				return behandlungsplanKostenvoranschlag != null;
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG:
				return erklaerungReproduktionseinrichtung != null;
		}
		return super.eIsSet(featureID);
	}

} //NachweiseKinderwunschTypeImpl
