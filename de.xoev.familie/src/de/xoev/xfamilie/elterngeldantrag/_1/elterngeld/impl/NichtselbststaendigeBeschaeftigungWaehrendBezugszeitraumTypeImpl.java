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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MidijobType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MinijobType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TeilzeittaetigkeitType;

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
 * An implementation of the model object '<em><b>Nichtselbststaendige Beschaeftigung Waehrend Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#isTeilzeittaetigkeit <em>Teilzeittaetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#getAngabenTeilzeittaetigkeit <em>Angaben Teilzeittaetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#isMidijob <em>Midijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#getAngabenMidijob <em>Angaben Midijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#isMinijob <em>Minijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#getAngabenMinijob <em>Angaben Minijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#isSteuerfreibetrag <em>Steuerfreibetrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#getBerufsausbildung <em>Berufsausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl#getFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl extends MinimalEObjectImpl.Container implements NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType {
	/**
	 * The default value of the '{@link #isTeilzeittaetigkeit() <em>Teilzeittaetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTeilzeittaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEILZEITTAETIGKEIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTeilzeittaetigkeit() <em>Teilzeittaetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTeilzeittaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected boolean teilzeittaetigkeit = TEILZEITTAETIGKEIT_EDEFAULT;

	/**
	 * This is true if the Teilzeittaetigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean teilzeittaetigkeitESet;

	/**
	 * The cached value of the '{@link #getAngabenTeilzeittaetigkeit() <em>Angaben Teilzeittaetigkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenTeilzeittaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<TeilzeittaetigkeitType> angabenTeilzeittaetigkeit;

	/**
	 * The default value of the '{@link #isMidijob() <em>Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMidijob()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIDIJOB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMidijob() <em>Midijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMidijob()
	 * @generated
	 * @ordered
	 */
	protected boolean midijob = MIDIJOB_EDEFAULT;

	/**
	 * This is true if the Midijob attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean midijobESet;

	/**
	 * The cached value of the '{@link #getAngabenMidijob() <em>Angaben Midijob</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenMidijob()
	 * @generated
	 * @ordered
	 */
	protected EList<MidijobType> angabenMidijob;

	/**
	 * The default value of the '{@link #isMinijob() <em>Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinijob()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MINIJOB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinijob() <em>Minijob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinijob()
	 * @generated
	 * @ordered
	 */
	protected boolean minijob = MINIJOB_EDEFAULT;

	/**
	 * This is true if the Minijob attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minijobESet;

	/**
	 * The cached value of the '{@link #getAngabenMinijob() <em>Angaben Minijob</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenMinijob()
	 * @generated
	 * @ordered
	 */
	protected EList<MinijobType> angabenMinijob;

	/**
	 * The default value of the '{@link #isSteuerfreibetrag() <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSteuerfreibetrag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STEUERFREIBETRAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSteuerfreibetrag() <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSteuerfreibetrag()
	 * @generated
	 * @ordered
	 */
	protected boolean steuerfreibetrag = STEUERFREIBETRAG_EDEFAULT;

	/**
	 * This is true if the Steuerfreibetrag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steuerfreibetragESet;

	/**
	 * The cached value of the '{@link #getBerufsausbildung() <em>Berufsausbildung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBerufsausbildung()
	 * @generated
	 * @ordered
	 */
	protected BerufsausbildungType berufsausbildung;

	/**
	 * The cached value of the '{@link #getFreiwilligendienst() <em>Freiwilligendienst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreiwilligendienst()
	 * @generated
	 * @ordered
	 */
	protected FreiwilligendienstType freiwilligendienst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getNichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTeilzeittaetigkeit() {
		return teilzeittaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeilzeittaetigkeit(boolean newTeilzeittaetigkeit) {
		boolean oldTeilzeittaetigkeit = teilzeittaetigkeit;
		teilzeittaetigkeit = newTeilzeittaetigkeit;
		boolean oldTeilzeittaetigkeitESet = teilzeittaetigkeitESet;
		teilzeittaetigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__TEILZEITTAETIGKEIT, oldTeilzeittaetigkeit, teilzeittaetigkeit, !oldTeilzeittaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTeilzeittaetigkeit() {
		boolean oldTeilzeittaetigkeit = teilzeittaetigkeit;
		boolean oldTeilzeittaetigkeitESet = teilzeittaetigkeitESet;
		teilzeittaetigkeit = TEILZEITTAETIGKEIT_EDEFAULT;
		teilzeittaetigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__TEILZEITTAETIGKEIT, oldTeilzeittaetigkeit, TEILZEITTAETIGKEIT_EDEFAULT, oldTeilzeittaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTeilzeittaetigkeit() {
		return teilzeittaetigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TeilzeittaetigkeitType> getAngabenTeilzeittaetigkeit() {
		if (angabenTeilzeittaetigkeit == null) {
			angabenTeilzeittaetigkeit = new EObjectContainmentEList<TeilzeittaetigkeitType>(TeilzeittaetigkeitType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_TEILZEITTAETIGKEIT);
		}
		return angabenTeilzeittaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMidijob() {
		return midijob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMidijob(boolean newMidijob) {
		boolean oldMidijob = midijob;
		midijob = newMidijob;
		boolean oldMidijobESet = midijobESet;
		midijobESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MIDIJOB, oldMidijob, midijob, !oldMidijobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMidijob() {
		boolean oldMidijob = midijob;
		boolean oldMidijobESet = midijobESet;
		midijob = MIDIJOB_EDEFAULT;
		midijobESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MIDIJOB, oldMidijob, MIDIJOB_EDEFAULT, oldMidijobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMidijob() {
		return midijobESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MidijobType> getAngabenMidijob() {
		if (angabenMidijob == null) {
			angabenMidijob = new EObjectContainmentEList<MidijobType>(MidijobType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MIDIJOB);
		}
		return angabenMidijob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMinijob() {
		return minijob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinijob(boolean newMinijob) {
		boolean oldMinijob = minijob;
		minijob = newMinijob;
		boolean oldMinijobESet = minijobESet;
		minijobESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MINIJOB, oldMinijob, minijob, !oldMinijobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinijob() {
		boolean oldMinijob = minijob;
		boolean oldMinijobESet = minijobESet;
		minijob = MINIJOB_EDEFAULT;
		minijobESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MINIJOB, oldMinijob, MINIJOB_EDEFAULT, oldMinijobESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinijob() {
		return minijobESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MinijobType> getAngabenMinijob() {
		if (angabenMinijob == null) {
			angabenMinijob = new EObjectContainmentEList<MinijobType>(MinijobType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MINIJOB);
		}
		return angabenMinijob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSteuerfreibetrag() {
		return steuerfreibetrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteuerfreibetrag(boolean newSteuerfreibetrag) {
		boolean oldSteuerfreibetrag = steuerfreibetrag;
		steuerfreibetrag = newSteuerfreibetrag;
		boolean oldSteuerfreibetragESet = steuerfreibetragESet;
		steuerfreibetragESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG, oldSteuerfreibetrag, steuerfreibetrag, !oldSteuerfreibetragESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSteuerfreibetrag() {
		boolean oldSteuerfreibetrag = steuerfreibetrag;
		boolean oldSteuerfreibetragESet = steuerfreibetragESet;
		steuerfreibetrag = STEUERFREIBETRAG_EDEFAULT;
		steuerfreibetragESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG, oldSteuerfreibetrag, STEUERFREIBETRAG_EDEFAULT, oldSteuerfreibetragESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSteuerfreibetrag() {
		return steuerfreibetragESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BerufsausbildungType getBerufsausbildung() {
		return berufsausbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBerufsausbildung(BerufsausbildungType newBerufsausbildung, NotificationChain msgs) {
		BerufsausbildungType oldBerufsausbildung = berufsausbildung;
		berufsausbildung = newBerufsausbildung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG, oldBerufsausbildung, newBerufsausbildung);
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
	public void setBerufsausbildung(BerufsausbildungType newBerufsausbildung) {
		if (newBerufsausbildung != berufsausbildung) {
			NotificationChain msgs = null;
			if (berufsausbildung != null)
				msgs = ((InternalEObject)berufsausbildung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG, null, msgs);
			if (newBerufsausbildung != null)
				msgs = ((InternalEObject)newBerufsausbildung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG, null, msgs);
			msgs = basicSetBerufsausbildung(newBerufsausbildung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG, newBerufsausbildung, newBerufsausbildung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreiwilligendienstType getFreiwilligendienst() {
		return freiwilligendienst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreiwilligendienst(FreiwilligendienstType newFreiwilligendienst, NotificationChain msgs) {
		FreiwilligendienstType oldFreiwilligendienst = freiwilligendienst;
		freiwilligendienst = newFreiwilligendienst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, newFreiwilligendienst);
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
	public void setFreiwilligendienst(FreiwilligendienstType newFreiwilligendienst) {
		if (newFreiwilligendienst != freiwilligendienst) {
			NotificationChain msgs = null;
			if (freiwilligendienst != null)
				msgs = ((InternalEObject)freiwilligendienst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST, null, msgs);
			if (newFreiwilligendienst != null)
				msgs = ((InternalEObject)newFreiwilligendienst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST, null, msgs);
			msgs = basicSetFreiwilligendienst(newFreiwilligendienst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST, newFreiwilligendienst, newFreiwilligendienst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_TEILZEITTAETIGKEIT:
				return ((InternalEList<?>)getAngabenTeilzeittaetigkeit()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MIDIJOB:
				return ((InternalEList<?>)getAngabenMidijob()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MINIJOB:
				return ((InternalEList<?>)getAngabenMinijob()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG:
				return basicSetBerufsausbildung(null, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				return basicSetFreiwilligendienst(null, msgs);
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__TEILZEITTAETIGKEIT:
				return isTeilzeittaetigkeit();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_TEILZEITTAETIGKEIT:
				return getAngabenTeilzeittaetigkeit();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MIDIJOB:
				return isMidijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MIDIJOB:
				return getAngabenMidijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MINIJOB:
				return isMinijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MINIJOB:
				return getAngabenMinijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG:
				return isSteuerfreibetrag();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG:
				return getBerufsausbildung();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				return getFreiwilligendienst();
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__TEILZEITTAETIGKEIT:
				setTeilzeittaetigkeit((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_TEILZEITTAETIGKEIT:
				getAngabenTeilzeittaetigkeit().clear();
				getAngabenTeilzeittaetigkeit().addAll((Collection<? extends TeilzeittaetigkeitType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MIDIJOB:
				setMidijob((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MIDIJOB:
				getAngabenMidijob().clear();
				getAngabenMidijob().addAll((Collection<? extends MidijobType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MINIJOB:
				setMinijob((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MINIJOB:
				getAngabenMinijob().clear();
				getAngabenMinijob().addAll((Collection<? extends MinijobType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG:
				setSteuerfreibetrag((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG:
				setBerufsausbildung((BerufsausbildungType)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				setFreiwilligendienst((FreiwilligendienstType)newValue);
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__TEILZEITTAETIGKEIT:
				unsetTeilzeittaetigkeit();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_TEILZEITTAETIGKEIT:
				getAngabenTeilzeittaetigkeit().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MIDIJOB:
				unsetMidijob();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MIDIJOB:
				getAngabenMidijob().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MINIJOB:
				unsetMinijob();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MINIJOB:
				getAngabenMinijob().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG:
				unsetSteuerfreibetrag();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG:
				setBerufsausbildung((BerufsausbildungType)null);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				setFreiwilligendienst((FreiwilligendienstType)null);
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__TEILZEITTAETIGKEIT:
				return isSetTeilzeittaetigkeit();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_TEILZEITTAETIGKEIT:
				return angabenTeilzeittaetigkeit != null && !angabenTeilzeittaetigkeit.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MIDIJOB:
				return isSetMidijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MIDIJOB:
				return angabenMidijob != null && !angabenMidijob.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__MINIJOB:
				return isSetMinijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__ANGABEN_MINIJOB:
				return angabenMinijob != null && !angabenMinijob.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__STEUERFREIBETRAG:
				return isSetSteuerfreibetrag();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__BERUFSAUSBILDUNG:
				return berufsausbildung != null;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_WAEHREND_BEZUGSZEITRAUM_TYPE__FREIWILLIGENDIENST:
				return freiwilligendienst != null;
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
		result.append(" (teilzeittaetigkeit: ");
		if (teilzeittaetigkeitESet) result.append(teilzeittaetigkeit); else result.append("<unset>");
		result.append(", midijob: ");
		if (midijobESet) result.append(midijob); else result.append("<unset>");
		result.append(", minijob: ");
		if (minijobESet) result.append(minijob); else result.append("<unset>");
		result.append(", steuerfreibetrag: ");
		if (steuerfreibetragESet) result.append(steuerfreibetrag); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NichtselbststaendigeBeschaeftigungWaehrendBezugszeitraumTypeImpl
