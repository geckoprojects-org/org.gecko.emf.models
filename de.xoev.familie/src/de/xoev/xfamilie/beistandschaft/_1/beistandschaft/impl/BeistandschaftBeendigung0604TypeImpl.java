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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftBeendigung0604Type;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beendigung0604 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl#getAntragstellenderElternteilBeendigung <em>Antragstellender Elternteil Beendigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl#getAngabenZumKindBeendigung <em>Angaben Zum Kind Beendigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl#isBeendigungBestaetigung <em>Beendigung Bestaetigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftBeendigung0604TypeImpl#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeistandschaftBeendigung0604TypeImpl extends AntragsnachrichtTypeImpl implements BeistandschaftBeendigung0604Type {
	/**
	 * The cached value of the '{@link #getAntragstellenderElternteilBeendigung() <em>Antragstellender Elternteil Beendigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragstellenderElternteilBeendigung()
	 * @generated
	 * @ordered
	 */
	protected AntragstellenderElternteilBeendigungType antragstellenderElternteilBeendigung;

	/**
	 * The cached value of the '{@link #getAngabenZumKindBeendigung() <em>Angaben Zum Kind Beendigung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumKindBeendigung()
	 * @generated
	 * @ordered
	 */
	protected EList<AngabenZumKindBeendigungType> angabenZumKindBeendigung;

	/**
	 * The default value of the '{@link #isBeendigungBestaetigung() <em>Beendigung Bestaetigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeendigungBestaetigung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEENDIGUNG_BESTAETIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeendigungBestaetigung() <em>Beendigung Bestaetigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeendigungBestaetigung()
	 * @generated
	 * @ordered
	 */
	protected boolean beendigungBestaetigung = BEENDIGUNG_BESTAETIGUNG_EDEFAULT;

	/**
	 * This is true if the Beendigung Bestaetigung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beendigungBestaetigungESet;

	/**
	 * The cached value of the '{@link #getDsgvo() <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgvo()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzerklaerungenType dsgvo;

	/**
	 * The default value of the '{@link #isRichtigkeitDerAngaben() <em>Richtigkeit Der Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRichtigkeitDerAngaben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RICHTIGKEIT_DER_ANGABEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRichtigkeitDerAngaben() <em>Richtigkeit Der Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRichtigkeitDerAngaben()
	 * @generated
	 * @ordered
	 */
	protected boolean richtigkeitDerAngaben = RICHTIGKEIT_DER_ANGABEN_EDEFAULT;

	/**
	 * This is true if the Richtigkeit Der Angaben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean richtigkeitDerAngabenESet;

	/**
	 * The default value of the '{@link #isWartenAufUnterschrift() <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWartenAufUnterschrift()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WARTEN_AUF_UNTERSCHRIFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWartenAufUnterschrift() <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWartenAufUnterschrift()
	 * @generated
	 * @ordered
	 */
	protected boolean wartenAufUnterschrift = WARTEN_AUF_UNTERSCHRIFT_EDEFAULT;

	/**
	 * This is true if the Warten Auf Unterschrift attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wartenAufUnterschriftESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeistandschaftBeendigung0604TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilBeendigungType getAntragstellenderElternteilBeendigung() {
		return antragstellenderElternteilBeendigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragstellenderElternteilBeendigung(AntragstellenderElternteilBeendigungType newAntragstellenderElternteilBeendigung, NotificationChain msgs) {
		AntragstellenderElternteilBeendigungType oldAntragstellenderElternteilBeendigung = antragstellenderElternteilBeendigung;
		antragstellenderElternteilBeendigung = newAntragstellenderElternteilBeendigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG, oldAntragstellenderElternteilBeendigung, newAntragstellenderElternteilBeendigung);
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
	public void setAntragstellenderElternteilBeendigung(AntragstellenderElternteilBeendigungType newAntragstellenderElternteilBeendigung) {
		if (newAntragstellenderElternteilBeendigung != antragstellenderElternteilBeendigung) {
			NotificationChain msgs = null;
			if (antragstellenderElternteilBeendigung != null)
				msgs = ((InternalEObject)antragstellenderElternteilBeendigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG, null, msgs);
			if (newAntragstellenderElternteilBeendigung != null)
				msgs = ((InternalEObject)newAntragstellenderElternteilBeendigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG, null, msgs);
			msgs = basicSetAntragstellenderElternteilBeendigung(newAntragstellenderElternteilBeendigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG, newAntragstellenderElternteilBeendigung, newAntragstellenderElternteilBeendigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenZumKindBeendigungType> getAngabenZumKindBeendigung() {
		if (angabenZumKindBeendigung == null) {
			angabenZumKindBeendigung = new EObjectContainmentEList<AngabenZumKindBeendigungType>(AngabenZumKindBeendigungType.class, this, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG);
		}
		return angabenZumKindBeendigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeendigungBestaetigung() {
		return beendigungBestaetigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeendigungBestaetigung(boolean newBeendigungBestaetigung) {
		boolean oldBeendigungBestaetigung = beendigungBestaetigung;
		beendigungBestaetigung = newBeendigungBestaetigung;
		boolean oldBeendigungBestaetigungESet = beendigungBestaetigungESet;
		beendigungBestaetigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG, oldBeendigungBestaetigung, beendigungBestaetigung, !oldBeendigungBestaetigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBeendigungBestaetigung() {
		boolean oldBeendigungBestaetigung = beendigungBestaetigung;
		boolean oldBeendigungBestaetigungESet = beendigungBestaetigungESet;
		beendigungBestaetigung = BEENDIGUNG_BESTAETIGUNG_EDEFAULT;
		beendigungBestaetigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG, oldBeendigungBestaetigung, BEENDIGUNG_BESTAETIGUNG_EDEFAULT, oldBeendigungBestaetigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBeendigungBestaetigung() {
		return beendigungBestaetigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzerklaerungenType getDsgvo() {
		return dsgvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgvo(DatenschutzerklaerungenType newDsgvo, NotificationChain msgs) {
		DatenschutzerklaerungenType oldDsgvo = dsgvo;
		dsgvo = newDsgvo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO, oldDsgvo, newDsgvo);
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
	public void setDsgvo(DatenschutzerklaerungenType newDsgvo) {
		if (newDsgvo != dsgvo) {
			NotificationChain msgs = null;
			if (dsgvo != null)
				msgs = ((InternalEObject)dsgvo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO, null, msgs);
			if (newDsgvo != null)
				msgs = ((InternalEObject)newDsgvo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO, null, msgs);
			msgs = basicSetDsgvo(newDsgvo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO, newDsgvo, newDsgvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRichtigkeitDerAngaben() {
		return richtigkeitDerAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRichtigkeitDerAngaben(boolean newRichtigkeitDerAngaben) {
		boolean oldRichtigkeitDerAngaben = richtigkeitDerAngaben;
		richtigkeitDerAngaben = newRichtigkeitDerAngaben;
		boolean oldRichtigkeitDerAngabenESet = richtigkeitDerAngabenESet;
		richtigkeitDerAngabenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN, oldRichtigkeitDerAngaben, richtigkeitDerAngaben, !oldRichtigkeitDerAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRichtigkeitDerAngaben() {
		boolean oldRichtigkeitDerAngaben = richtigkeitDerAngaben;
		boolean oldRichtigkeitDerAngabenESet = richtigkeitDerAngabenESet;
		richtigkeitDerAngaben = RICHTIGKEIT_DER_ANGABEN_EDEFAULT;
		richtigkeitDerAngabenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN, oldRichtigkeitDerAngaben, RICHTIGKEIT_DER_ANGABEN_EDEFAULT, oldRichtigkeitDerAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRichtigkeitDerAngaben() {
		return richtigkeitDerAngabenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWartenAufUnterschrift() {
		return wartenAufUnterschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWartenAufUnterschrift(boolean newWartenAufUnterschrift) {
		boolean oldWartenAufUnterschrift = wartenAufUnterschrift;
		wartenAufUnterschrift = newWartenAufUnterschrift;
		boolean oldWartenAufUnterschriftESet = wartenAufUnterschriftESet;
		wartenAufUnterschriftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT, oldWartenAufUnterschrift, wartenAufUnterschrift, !oldWartenAufUnterschriftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWartenAufUnterschrift() {
		boolean oldWartenAufUnterschrift = wartenAufUnterschrift;
		boolean oldWartenAufUnterschriftESet = wartenAufUnterschriftESet;
		wartenAufUnterschrift = WARTEN_AUF_UNTERSCHRIFT_EDEFAULT;
		wartenAufUnterschriftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT, oldWartenAufUnterschrift, WARTEN_AUF_UNTERSCHRIFT_EDEFAULT, oldWartenAufUnterschriftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWartenAufUnterschrift() {
		return wartenAufUnterschriftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG:
				return basicSetAntragstellenderElternteilBeendigung(null, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG:
				return ((InternalEList<?>)getAngabenZumKindBeendigung()).basicRemove(otherEnd, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO:
				return basicSetDsgvo(null, msgs);
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
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG:
				return getAntragstellenderElternteilBeendigung();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG:
				return getAngabenZumKindBeendigung();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG:
				return isBeendigungBestaetigung();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO:
				return getDsgvo();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN:
				return isRichtigkeitDerAngaben();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				return isWartenAufUnterschrift();
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
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG:
				setAntragstellenderElternteilBeendigung((AntragstellenderElternteilBeendigungType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG:
				getAngabenZumKindBeendigung().clear();
				getAngabenZumKindBeendigung().addAll((Collection<? extends AngabenZumKindBeendigungType>)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG:
				setBeendigungBestaetigung((Boolean)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN:
				setRichtigkeitDerAngaben((Boolean)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				setWartenAufUnterschrift((Boolean)newValue);
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
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG:
				setAntragstellenderElternteilBeendigung((AntragstellenderElternteilBeendigungType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG:
				getAngabenZumKindBeendigung().clear();
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG:
				unsetBeendigungBestaetigung();
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN:
				unsetRichtigkeitDerAngaben();
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				unsetWartenAufUnterschrift();
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
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG:
				return antragstellenderElternteilBeendigung != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__ANGABEN_ZUM_KIND_BEENDIGUNG:
				return angabenZumKindBeendigung != null && !angabenZumKindBeendigung.isEmpty();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__BEENDIGUNG_BESTAETIGUNG:
				return isSetBeendigungBestaetigung();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__DSGVO:
				return dsgvo != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__RICHTIGKEIT_DER_ANGABEN:
				return isSetRichtigkeitDerAngaben();
			case BeistandschaftPackage.BEISTANDSCHAFT_BEENDIGUNG0604_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				return isSetWartenAufUnterschrift();
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
		result.append(" (beendigungBestaetigung: ");
		if (beendigungBestaetigungESet) result.append(beendigungBestaetigung); else result.append("<unset>");
		result.append(", richtigkeitDerAngaben: ");
		if (richtigkeitDerAngabenESet) result.append(richtigkeitDerAngaben); else result.append("<unset>");
		result.append(", wartenAufUnterschrift: ");
		if (wartenAufUnterschriftESet) result.append(wartenAufUnterschrift); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BeistandschaftBeendigung0604TypeImpl
