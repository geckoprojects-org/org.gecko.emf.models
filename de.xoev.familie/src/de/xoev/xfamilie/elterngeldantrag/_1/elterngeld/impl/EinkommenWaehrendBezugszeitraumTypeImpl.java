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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Einkommen Waehrend Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#getNichtselbststaendigeBeschaeftigung <em>Nichtselbststaendige Beschaeftigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#isGewerbebetrieb <em>Gewerbebetrieb</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft <em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#isBeruecksichtigungBetriebsausgaben <em>Beruecksichtigung Betriebsausgaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#getNachweisBetriebsausgaben <em>Nachweis Betriebsausgaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#getEinkommensersatzleistungenBezugszeitraum <em>Einkommensersatzleistungen Bezugszeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#getArbeitgeberformblatt <em>Arbeitgeberformblatt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenWaehrendBezugszeitraumTypeImpl#isFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkommenWaehrendBezugszeitraumTypeImpl extends MinimalEObjectImpl.Container implements EinkommenWaehrendBezugszeitraumType {
	/**
	 * The cached value of the '{@link #getNichtselbststaendigeBeschaeftigung() <em>Nichtselbststaendige Beschaeftigung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNichtselbststaendigeBeschaeftigung()
	 * @generated
	 * @ordered
	 */
	protected EList<NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType> nichtselbststaendigeBeschaeftigung;

	/**
	 * The default value of the '{@link #isSelbstaendigeBeschaeftigung() <em>Selbstaendige Beschaeftigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelbstaendigeBeschaeftigung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELBSTAENDIGE_BESCHAEFTIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelbstaendigeBeschaeftigung() <em>Selbstaendige Beschaeftigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelbstaendigeBeschaeftigung()
	 * @generated
	 * @ordered
	 */
	protected boolean selbstaendigeBeschaeftigung = SELBSTAENDIGE_BESCHAEFTIGUNG_EDEFAULT;

	/**
	 * This is true if the Selbstaendige Beschaeftigung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selbstaendigeBeschaeftigungESet;

	/**
	 * The default value of the '{@link #isLandUndForstwirtschaft() <em>Land Und Forstwirtschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLandUndForstwirtschaft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAND_UND_FORSTWIRTSCHAFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLandUndForstwirtschaft() <em>Land Und Forstwirtschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLandUndForstwirtschaft()
	 * @generated
	 * @ordered
	 */
	protected boolean landUndForstwirtschaft = LAND_UND_FORSTWIRTSCHAFT_EDEFAULT;

	/**
	 * This is true if the Land Und Forstwirtschaft attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean landUndForstwirtschaftESet;

	/**
	 * The default value of the '{@link #isGewerbebetrieb() <em>Gewerbebetrieb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGewerbebetrieb()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GEWERBEBETRIEB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGewerbebetrieb() <em>Gewerbebetrieb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGewerbebetrieb()
	 * @generated
	 * @ordered
	 */
	protected boolean gewerbebetrieb = GEWERBEBETRIEB_EDEFAULT;

	/**
	 * This is true if the Gewerbebetrieb attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gewerbebetriebESet;

	/**
	 * The cached value of the '{@link #getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft() <em>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft()
	 * @generated
	 * @ordered
	 */
	protected EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft;

	/**
	 * The default value of the '{@link #isBeruecksichtigungBetriebsausgaben() <em>Beruecksichtigung Betriebsausgaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeruecksichtigungBetriebsausgaben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BERUECKSICHTIGUNG_BETRIEBSAUSGABEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeruecksichtigungBetriebsausgaben() <em>Beruecksichtigung Betriebsausgaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeruecksichtigungBetriebsausgaben()
	 * @generated
	 * @ordered
	 */
	protected boolean beruecksichtigungBetriebsausgaben = BERUECKSICHTIGUNG_BETRIEBSAUSGABEN_EDEFAULT;

	/**
	 * This is true if the Beruecksichtigung Betriebsausgaben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beruecksichtigungBetriebsausgabenESet;

	/**
	 * The cached value of the '{@link #getNachweisBetriebsausgaben() <em>Nachweis Betriebsausgaben</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisBetriebsausgaben()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisBetriebsausgaben;

	/**
	 * The cached value of the '{@link #getEinkommensersatzleistungenBezugszeitraum() <em>Einkommensersatzleistungen Bezugszeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommensersatzleistungenBezugszeitraum()
	 * @generated
	 * @ordered
	 */
	protected EinkommensersatzleistungenBezugszeitraumType einkommensersatzleistungenBezugszeitraum;

	/**
	 * The default value of the '{@link #isEinkommenAusNichtselbststaendigerTaetigkeit() <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinkommenAusNichtselbststaendigerTaetigkeit() <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected boolean einkommenAusNichtselbststaendigerTaetigkeit = EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT_EDEFAULT;

	/**
	 * This is true if the Einkommen Aus Nichtselbststaendiger Taetigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkommenAusNichtselbststaendigerTaetigkeitESet;

	/**
	 * The cached value of the '{@link #getArbeitgeberformblatt() <em>Arbeitgeberformblatt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbeitgeberformblatt()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> arbeitgeberformblatt;

	/**
	 * The default value of the '{@link #isFreiwilligendienst() <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreiwilligendienst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FREIWILLIGENDIENST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFreiwilligendienst() <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreiwilligendienst()
	 * @generated
	 * @ordered
	 */
	protected boolean freiwilligendienst = FREIWILLIGENDIENST_EDEFAULT;

	/**
	 * This is true if the Freiwilligendienst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freiwilligendienstESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkommenWaehrendBezugszeitraumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getEinkommenWaehrendBezugszeitraumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType> getNichtselbststaendigeBeschaeftigung() {
		if (nichtselbststaendigeBeschaeftigung == null) {
			nichtselbststaendigeBeschaeftigung = new EObjectContainmentEList<NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType>(NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType.class, this, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG);
		}
		return nichtselbststaendigeBeschaeftigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSelbstaendigeBeschaeftigung() {
		return selbstaendigeBeschaeftigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelbstaendigeBeschaeftigung(boolean newSelbstaendigeBeschaeftigung) {
		boolean oldSelbstaendigeBeschaeftigung = selbstaendigeBeschaeftigung;
		selbstaendigeBeschaeftigung = newSelbstaendigeBeschaeftigung;
		boolean oldSelbstaendigeBeschaeftigungESet = selbstaendigeBeschaeftigungESet;
		selbstaendigeBeschaeftigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG, oldSelbstaendigeBeschaeftigung, selbstaendigeBeschaeftigung, !oldSelbstaendigeBeschaeftigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSelbstaendigeBeschaeftigung() {
		boolean oldSelbstaendigeBeschaeftigung = selbstaendigeBeschaeftigung;
		boolean oldSelbstaendigeBeschaeftigungESet = selbstaendigeBeschaeftigungESet;
		selbstaendigeBeschaeftigung = SELBSTAENDIGE_BESCHAEFTIGUNG_EDEFAULT;
		selbstaendigeBeschaeftigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG, oldSelbstaendigeBeschaeftigung, SELBSTAENDIGE_BESCHAEFTIGUNG_EDEFAULT, oldSelbstaendigeBeschaeftigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSelbstaendigeBeschaeftigung() {
		return selbstaendigeBeschaeftigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLandUndForstwirtschaft() {
		return landUndForstwirtschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLandUndForstwirtschaft(boolean newLandUndForstwirtschaft) {
		boolean oldLandUndForstwirtschaft = landUndForstwirtschaft;
		landUndForstwirtschaft = newLandUndForstwirtschaft;
		boolean oldLandUndForstwirtschaftESet = landUndForstwirtschaftESet;
		landUndForstwirtschaftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__LAND_UND_FORSTWIRTSCHAFT, oldLandUndForstwirtschaft, landUndForstwirtschaft, !oldLandUndForstwirtschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLandUndForstwirtschaft() {
		boolean oldLandUndForstwirtschaft = landUndForstwirtschaft;
		boolean oldLandUndForstwirtschaftESet = landUndForstwirtschaftESet;
		landUndForstwirtschaft = LAND_UND_FORSTWIRTSCHAFT_EDEFAULT;
		landUndForstwirtschaftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__LAND_UND_FORSTWIRTSCHAFT, oldLandUndForstwirtschaft, LAND_UND_FORSTWIRTSCHAFT_EDEFAULT, oldLandUndForstwirtschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLandUndForstwirtschaft() {
		return landUndForstwirtschaftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGewerbebetrieb() {
		return gewerbebetrieb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGewerbebetrieb(boolean newGewerbebetrieb) {
		boolean oldGewerbebetrieb = gewerbebetrieb;
		gewerbebetrieb = newGewerbebetrieb;
		boolean oldGewerbebetriebESet = gewerbebetriebESet;
		gewerbebetriebESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__GEWERBEBETRIEB, oldGewerbebetrieb, gewerbebetrieb, !oldGewerbebetriebESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGewerbebetrieb() {
		boolean oldGewerbebetrieb = gewerbebetrieb;
		boolean oldGewerbebetriebESet = gewerbebetriebESet;
		gewerbebetrieb = GEWERBEBETRIEB_EDEFAULT;
		gewerbebetriebESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__GEWERBEBETRIEB, oldGewerbebetrieb, GEWERBEBETRIEB_EDEFAULT, oldGewerbebetriebESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGewerbebetrieb() {
		return gewerbebetriebESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft() {
		return einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft(EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft, NotificationChain msgs) {
		EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType oldEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft = einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft;
		einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft = newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT, oldEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft, newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft);
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
	public void setEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft(EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft) {
		if (newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft != einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft) {
			NotificationChain msgs = null;
			if (einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft != null)
				msgs = ((InternalEObject)einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT, null, msgs);
			if (newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft != null)
				msgs = ((InternalEObject)newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT, null, msgs);
			msgs = basicSetEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft(newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT, newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft, newEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeruecksichtigungBetriebsausgaben() {
		return beruecksichtigungBetriebsausgaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeruecksichtigungBetriebsausgaben(boolean newBeruecksichtigungBetriebsausgaben) {
		boolean oldBeruecksichtigungBetriebsausgaben = beruecksichtigungBetriebsausgaben;
		beruecksichtigungBetriebsausgaben = newBeruecksichtigungBetriebsausgaben;
		boolean oldBeruecksichtigungBetriebsausgabenESet = beruecksichtigungBetriebsausgabenESet;
		beruecksichtigungBetriebsausgabenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUECKSICHTIGUNG_BETRIEBSAUSGABEN, oldBeruecksichtigungBetriebsausgaben, beruecksichtigungBetriebsausgaben, !oldBeruecksichtigungBetriebsausgabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBeruecksichtigungBetriebsausgaben() {
		boolean oldBeruecksichtigungBetriebsausgaben = beruecksichtigungBetriebsausgaben;
		boolean oldBeruecksichtigungBetriebsausgabenESet = beruecksichtigungBetriebsausgabenESet;
		beruecksichtigungBetriebsausgaben = BERUECKSICHTIGUNG_BETRIEBSAUSGABEN_EDEFAULT;
		beruecksichtigungBetriebsausgabenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUECKSICHTIGUNG_BETRIEBSAUSGABEN, oldBeruecksichtigungBetriebsausgaben, BERUECKSICHTIGUNG_BETRIEBSAUSGABEN_EDEFAULT, oldBeruecksichtigungBetriebsausgabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBeruecksichtigungBetriebsausgaben() {
		return beruecksichtigungBetriebsausgabenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisBetriebsausgaben() {
		if (nachweisBetriebsausgaben == null) {
			nachweisBetriebsausgaben = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NACHWEIS_BETRIEBSAUSGABEN);
		}
		return nachweisBetriebsausgaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommensersatzleistungenBezugszeitraumType getEinkommensersatzleistungenBezugszeitraum() {
		return einkommensersatzleistungenBezugszeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinkommensersatzleistungenBezugszeitraum(EinkommensersatzleistungenBezugszeitraumType newEinkommensersatzleistungenBezugszeitraum, NotificationChain msgs) {
		EinkommensersatzleistungenBezugszeitraumType oldEinkommensersatzleistungenBezugszeitraum = einkommensersatzleistungenBezugszeitraum;
		einkommensersatzleistungenBezugszeitraum = newEinkommensersatzleistungenBezugszeitraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM, oldEinkommensersatzleistungenBezugszeitraum, newEinkommensersatzleistungenBezugszeitraum);
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
	public void setEinkommensersatzleistungenBezugszeitraum(EinkommensersatzleistungenBezugszeitraumType newEinkommensersatzleistungenBezugszeitraum) {
		if (newEinkommensersatzleistungenBezugszeitraum != einkommensersatzleistungenBezugszeitraum) {
			NotificationChain msgs = null;
			if (einkommensersatzleistungenBezugszeitraum != null)
				msgs = ((InternalEObject)einkommensersatzleistungenBezugszeitraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM, null, msgs);
			if (newEinkommensersatzleistungenBezugszeitraum != null)
				msgs = ((InternalEObject)newEinkommensersatzleistungenBezugszeitraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM, null, msgs);
			msgs = basicSetEinkommensersatzleistungenBezugszeitraum(newEinkommensersatzleistungenBezugszeitraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM, newEinkommensersatzleistungenBezugszeitraum, newEinkommensersatzleistungenBezugszeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinkommenAusNichtselbststaendigerTaetigkeit() {
		return einkommenAusNichtselbststaendigerTaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommenAusNichtselbststaendigerTaetigkeit(boolean newEinkommenAusNichtselbststaendigerTaetigkeit) {
		boolean oldEinkommenAusNichtselbststaendigerTaetigkeit = einkommenAusNichtselbststaendigerTaetigkeit;
		einkommenAusNichtselbststaendigerTaetigkeit = newEinkommenAusNichtselbststaendigerTaetigkeit;
		boolean oldEinkommenAusNichtselbststaendigerTaetigkeitESet = einkommenAusNichtselbststaendigerTaetigkeitESet;
		einkommenAusNichtselbststaendigerTaetigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT, oldEinkommenAusNichtselbststaendigerTaetigkeit, einkommenAusNichtselbststaendigerTaetigkeit, !oldEinkommenAusNichtselbststaendigerTaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkommenAusNichtselbststaendigerTaetigkeit() {
		boolean oldEinkommenAusNichtselbststaendigerTaetigkeit = einkommenAusNichtselbststaendigerTaetigkeit;
		boolean oldEinkommenAusNichtselbststaendigerTaetigkeitESet = einkommenAusNichtselbststaendigerTaetigkeitESet;
		einkommenAusNichtselbststaendigerTaetigkeit = EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT_EDEFAULT;
		einkommenAusNichtselbststaendigerTaetigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT, oldEinkommenAusNichtselbststaendigerTaetigkeit, EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT_EDEFAULT, oldEinkommenAusNichtselbststaendigerTaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkommenAusNichtselbststaendigerTaetigkeit() {
		return einkommenAusNichtselbststaendigerTaetigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getArbeitgeberformblatt() {
		if (arbeitgeberformblatt == null) {
			arbeitgeberformblatt = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__ARBEITGEBERFORMBLATT);
		}
		return arbeitgeberformblatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFreiwilligendienst() {
		return freiwilligendienst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreiwilligendienst(boolean newFreiwilligendienst) {
		boolean oldFreiwilligendienst = freiwilligendienst;
		freiwilligendienst = newFreiwilligendienst;
		boolean oldFreiwilligendienstESet = freiwilligendienstESet;
		freiwilligendienstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, freiwilligendienst, !oldFreiwilligendienstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFreiwilligendienst() {
		boolean oldFreiwilligendienst = freiwilligendienst;
		boolean oldFreiwilligendienstESet = freiwilligendienstESet;
		freiwilligendienst = FREIWILLIGENDIENST_EDEFAULT;
		freiwilligendienstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, FREIWILLIGENDIENST_EDEFAULT, oldFreiwilligendienstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFreiwilligendienst() {
		return freiwilligendienstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				return ((InternalEList<?>)getNichtselbststaendigeBeschaeftigung()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				return basicSetEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft(null, msgs);
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NACHWEIS_BETRIEBSAUSGABEN:
				return ((InternalEList<?>)getNachweisBetriebsausgaben()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM:
				return basicSetEinkommensersatzleistungenBezugszeitraum(null, msgs);
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__ARBEITGEBERFORMBLATT:
				return ((InternalEList<?>)getArbeitgeberformblatt()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				return getNichtselbststaendigeBeschaeftigung();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG:
				return isSelbstaendigeBeschaeftigung();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__LAND_UND_FORSTWIRTSCHAFT:
				return isLandUndForstwirtschaft();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__GEWERBEBETRIEB:
				return isGewerbebetrieb();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				return getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUECKSICHTIGUNG_BETRIEBSAUSGABEN:
				return isBeruecksichtigungBetriebsausgaben();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NACHWEIS_BETRIEBSAUSGABEN:
				return getNachweisBetriebsausgaben();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM:
				return getEinkommensersatzleistungenBezugszeitraum();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT:
				return isEinkommenAusNichtselbststaendigerTaetigkeit();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__ARBEITGEBERFORMBLATT:
				return getArbeitgeberformblatt();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				return isFreiwilligendienst();
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
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				getNichtselbststaendigeBeschaeftigung().clear();
				getNichtselbststaendigeBeschaeftigung().addAll((Collection<? extends NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType>)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG:
				setSelbstaendigeBeschaeftigung((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__LAND_UND_FORSTWIRTSCHAFT:
				setLandUndForstwirtschaft((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__GEWERBEBETRIEB:
				setGewerbebetrieb((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				setEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft((EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUECKSICHTIGUNG_BETRIEBSAUSGABEN:
				setBeruecksichtigungBetriebsausgaben((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NACHWEIS_BETRIEBSAUSGABEN:
				getNachweisBetriebsausgaben().clear();
				getNachweisBetriebsausgaben().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM:
				setEinkommensersatzleistungenBezugszeitraum((EinkommensersatzleistungenBezugszeitraumType)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT:
				setEinkommenAusNichtselbststaendigerTaetigkeit((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__ARBEITGEBERFORMBLATT:
				getArbeitgeberformblatt().clear();
				getArbeitgeberformblatt().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				setFreiwilligendienst((Boolean)newValue);
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
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				getNichtselbststaendigeBeschaeftigung().clear();
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG:
				unsetSelbstaendigeBeschaeftigung();
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__LAND_UND_FORSTWIRTSCHAFT:
				unsetLandUndForstwirtschaft();
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__GEWERBEBETRIEB:
				unsetGewerbebetrieb();
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				setEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft((EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType)null);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUECKSICHTIGUNG_BETRIEBSAUSGABEN:
				unsetBeruecksichtigungBetriebsausgaben();
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NACHWEIS_BETRIEBSAUSGABEN:
				getNachweisBetriebsausgaben().clear();
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM:
				setEinkommensersatzleistungenBezugszeitraum((EinkommensersatzleistungenBezugszeitraumType)null);
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT:
				unsetEinkommenAusNichtselbststaendigerTaetigkeit();
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__ARBEITGEBERFORMBLATT:
				getArbeitgeberformblatt().clear();
				return;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				unsetFreiwilligendienst();
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
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				return nichtselbststaendigeBeschaeftigung != null && !nichtselbststaendigeBeschaeftigung.isEmpty();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG:
				return isSetSelbstaendigeBeschaeftigung();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__LAND_UND_FORSTWIRTSCHAFT:
				return isSetLandUndForstwirtschaft();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__GEWERBEBETRIEB:
				return isSetGewerbebetrieb();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKUENFTE_SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				return einkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft != null;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUECKSICHTIGUNG_BETRIEBSAUSGABEN:
				return isSetBeruecksichtigungBetriebsausgaben();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__NACHWEIS_BETRIEBSAUSGABEN:
				return nachweisBetriebsausgaben != null && !nachweisBetriebsausgaben.isEmpty();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM:
				return einkommensersatzleistungenBezugszeitraum != null;
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT:
				return isSetEinkommenAusNichtselbststaendigerTaetigkeit();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__ARBEITGEBERFORMBLATT:
				return arbeitgeberformblatt != null && !arbeitgeberformblatt.isEmpty();
			case ElterngeldPackage.EINKOMMEN_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				return isSetFreiwilligendienst();
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
		result.append(" (selbstaendigeBeschaeftigung: ");
		if (selbstaendigeBeschaeftigungESet) result.append(selbstaendigeBeschaeftigung); else result.append("<unset>");
		result.append(", landUndForstwirtschaft: ");
		if (landUndForstwirtschaftESet) result.append(landUndForstwirtschaft); else result.append("<unset>");
		result.append(", gewerbebetrieb: ");
		if (gewerbebetriebESet) result.append(gewerbebetrieb); else result.append("<unset>");
		result.append(", beruecksichtigungBetriebsausgaben: ");
		if (beruecksichtigungBetriebsausgabenESet) result.append(beruecksichtigungBetriebsausgaben); else result.append("<unset>");
		result.append(", einkommenAusNichtselbststaendigerTaetigkeit: ");
		if (einkommenAusNichtselbststaendigerTaetigkeitESet) result.append(einkommenAusNichtselbststaendigerTaetigkeit); else result.append("<unset>");
		result.append(", freiwilligendienst: ");
		if (freiwilligendienstESet) result.append(freiwilligendienst); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EinkommenWaehrendBezugszeitraumTypeImpl
