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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nichtselbststaendige Beschaeftigung Vor Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl#getNichtselbststaendigkeitAusklammerungstatbestaende <em>Nichtselbststaendigkeit Ausklammerungstatbestaende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl#isBerufsbildung <em>Berufsbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl#isMidijob <em>Midijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl#isSteuerfreibetrag <em>Steuerfreibetrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl#isMinijob <em>Minijob</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl#isFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl extends MinimalEObjectImpl.Container implements NichtselbststaendigeBeschaeftigungVorGeburtType {
	/**
	 * The cached value of the '{@link #getNichtselbststaendigkeitAusklammerungstatbestaende() <em>Nichtselbststaendigkeit Ausklammerungstatbestaende</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNichtselbststaendigkeitAusklammerungstatbestaende()
	 * @generated
	 * @ordered
	 */
	protected NichtselbststaendigkeitAusklammerungstatbestaendeType nichtselbststaendigkeitAusklammerungstatbestaende;

	/**
	 * The default value of the '{@link #isBerufsbildung() <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBerufsbildung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BERUFSBILDUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBerufsbildung() <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBerufsbildung()
	 * @generated
	 * @ordered
	 */
	protected boolean berufsbildung = BERUFSBILDUNG_EDEFAULT;

	/**
	 * This is true if the Berufsbildung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean berufsbildungESet;

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
	protected NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getNichtselbststaendigeBeschaeftigungVorGeburtType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NichtselbststaendigkeitAusklammerungstatbestaendeType getNichtselbststaendigkeitAusklammerungstatbestaende() {
		return nichtselbststaendigkeitAusklammerungstatbestaende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNichtselbststaendigkeitAusklammerungstatbestaende(NichtselbststaendigkeitAusklammerungstatbestaendeType newNichtselbststaendigkeitAusklammerungstatbestaende, NotificationChain msgs) {
		NichtselbststaendigkeitAusklammerungstatbestaendeType oldNichtselbststaendigkeitAusklammerungstatbestaende = nichtselbststaendigkeitAusklammerungstatbestaende;
		nichtselbststaendigkeitAusklammerungstatbestaende = newNichtselbststaendigkeitAusklammerungstatbestaende;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE, oldNichtselbststaendigkeitAusklammerungstatbestaende, newNichtselbststaendigkeitAusklammerungstatbestaende);
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
	public void setNichtselbststaendigkeitAusklammerungstatbestaende(NichtselbststaendigkeitAusklammerungstatbestaendeType newNichtselbststaendigkeitAusklammerungstatbestaende) {
		if (newNichtselbststaendigkeitAusklammerungstatbestaende != nichtselbststaendigkeitAusklammerungstatbestaende) {
			NotificationChain msgs = null;
			if (nichtselbststaendigkeitAusklammerungstatbestaende != null)
				msgs = ((InternalEObject)nichtselbststaendigkeitAusklammerungstatbestaende).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE, null, msgs);
			if (newNichtselbststaendigkeitAusklammerungstatbestaende != null)
				msgs = ((InternalEObject)newNichtselbststaendigkeitAusklammerungstatbestaende).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE, null, msgs);
			msgs = basicSetNichtselbststaendigkeitAusklammerungstatbestaende(newNichtselbststaendigkeitAusklammerungstatbestaende, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE, newNichtselbststaendigkeitAusklammerungstatbestaende, newNichtselbststaendigkeitAusklammerungstatbestaende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBerufsbildung() {
		return berufsbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBerufsbildung(boolean newBerufsbildung) {
		boolean oldBerufsbildung = berufsbildung;
		berufsbildung = newBerufsbildung;
		boolean oldBerufsbildungESet = berufsbildungESet;
		berufsbildungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__BERUFSBILDUNG, oldBerufsbildung, berufsbildung, !oldBerufsbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBerufsbildung() {
		boolean oldBerufsbildung = berufsbildung;
		boolean oldBerufsbildungESet = berufsbildungESet;
		berufsbildung = BERUFSBILDUNG_EDEFAULT;
		berufsbildungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__BERUFSBILDUNG, oldBerufsbildung, BERUFSBILDUNG_EDEFAULT, oldBerufsbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBerufsbildung() {
		return berufsbildungESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MIDIJOB, oldMidijob, midijob, !oldMidijobESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MIDIJOB, oldMidijob, MIDIJOB_EDEFAULT, oldMidijobESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__STEUERFREIBETRAG, oldSteuerfreibetrag, steuerfreibetrag, !oldSteuerfreibetragESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__STEUERFREIBETRAG, oldSteuerfreibetrag, STEUERFREIBETRAG_EDEFAULT, oldSteuerfreibetragESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MINIJOB, oldMinijob, minijob, !oldMinijobESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MINIJOB, oldMinijob, MINIJOB_EDEFAULT, oldMinijobESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, freiwilligendienst, !oldFreiwilligendienstESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, FREIWILLIGENDIENST_EDEFAULT, oldFreiwilligendienstESet));
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE:
				return basicSetNichtselbststaendigkeitAusklammerungstatbestaende(null, msgs);
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE:
				return getNichtselbststaendigkeitAusklammerungstatbestaende();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__BERUFSBILDUNG:
				return isBerufsbildung();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MIDIJOB:
				return isMidijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__STEUERFREIBETRAG:
				return isSteuerfreibetrag();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MINIJOB:
				return isMinijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__FREIWILLIGENDIENST:
				return isFreiwilligendienst();
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE:
				setNichtselbststaendigkeitAusklammerungstatbestaende((NichtselbststaendigkeitAusklammerungstatbestaendeType)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__BERUFSBILDUNG:
				setBerufsbildung((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MIDIJOB:
				setMidijob((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__STEUERFREIBETRAG:
				setSteuerfreibetrag((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MINIJOB:
				setMinijob((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__FREIWILLIGENDIENST:
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE:
				setNichtselbststaendigkeitAusklammerungstatbestaende((NichtselbststaendigkeitAusklammerungstatbestaendeType)null);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__BERUFSBILDUNG:
				unsetBerufsbildung();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MIDIJOB:
				unsetMidijob();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__STEUERFREIBETRAG:
				unsetSteuerfreibetrag();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MINIJOB:
				unsetMinijob();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__FREIWILLIGENDIENST:
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE:
				return nichtselbststaendigkeitAusklammerungstatbestaende != null;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__BERUFSBILDUNG:
				return isSetBerufsbildung();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MIDIJOB:
				return isSetMidijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__STEUERFREIBETRAG:
				return isSetSteuerfreibetrag();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__MINIJOB:
				return isSetMinijob();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG_VOR_GEBURT_TYPE__FREIWILLIGENDIENST:
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
		result.append(" (berufsbildung: ");
		if (berufsbildungESet) result.append(berufsbildung); else result.append("<unset>");
		result.append(", midijob: ");
		if (midijobESet) result.append(midijob); else result.append("<unset>");
		result.append(", steuerfreibetrag: ");
		if (steuerfreibetragESet) result.append(steuerfreibetrag); else result.append("<unset>");
		result.append(", minijob: ");
		if (minijobESet) result.append(minijob); else result.append("<unset>");
		result.append(", freiwilligendienst: ");
		if (freiwilligendienstESet) result.append(freiwilligendienst); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NichtselbststaendigeBeschaeftigungVorGeburtTypeImpl
