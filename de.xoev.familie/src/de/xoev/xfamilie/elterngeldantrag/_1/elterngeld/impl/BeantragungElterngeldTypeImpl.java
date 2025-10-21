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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeLeistungshoeheType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beantragung Elterngeld Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl#getLeistungshoehe <em>Leistungshoehe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl#isBasisElterngeld <em>Basis Elterngeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl#getZeitraumBasisElterngeld <em>Zeitraum Basis Elterngeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl#isElterngeldPlus <em>Elterngeld Plus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl#getZeitraumElterngeldPlus <em>Zeitraum Elterngeld Plus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl#isPartnerschaftsBonusMonate <em>Partnerschafts Bonus Monate</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BeantragungElterngeldTypeImpl#getZeitraumPartnerschaftsBonusMonate <em>Zeitraum Partnerschafts Bonus Monate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeantragungElterngeldTypeImpl extends MinimalEObjectImpl.Container implements BeantragungElterngeldType {
	/**
	 * The cached value of the '{@link #getLeistungshoehe() <em>Leistungshoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeistungshoehe()
	 * @generated
	 * @ordered
	 */
	protected CodeLeistungshoeheType leistungshoehe;

	/**
	 * The default value of the '{@link #isBasisElterngeld() <em>Basis Elterngeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBasisElterngeld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BASIS_ELTERNGELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBasisElterngeld() <em>Basis Elterngeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBasisElterngeld()
	 * @generated
	 * @ordered
	 */
	protected boolean basisElterngeld = BASIS_ELTERNGELD_EDEFAULT;

	/**
	 * This is true if the Basis Elterngeld attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean basisElterngeldESet;

	/**
	 * The cached value of the '{@link #getZeitraumBasisElterngeld() <em>Zeitraum Basis Elterngeld</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumBasisElterngeld()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> zeitraumBasisElterngeld;

	/**
	 * The default value of the '{@link #isElterngeldPlus() <em>Elterngeld Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElterngeldPlus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELTERNGELD_PLUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElterngeldPlus() <em>Elterngeld Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElterngeldPlus()
	 * @generated
	 * @ordered
	 */
	protected boolean elterngeldPlus = ELTERNGELD_PLUS_EDEFAULT;

	/**
	 * This is true if the Elterngeld Plus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elterngeldPlusESet;

	/**
	 * The cached value of the '{@link #getZeitraumElterngeldPlus() <em>Zeitraum Elterngeld Plus</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumElterngeldPlus()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> zeitraumElterngeldPlus;

	/**
	 * The default value of the '{@link #isPartnerschaftsBonusMonate() <em>Partnerschafts Bonus Monate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartnerschaftsBonusMonate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTNERSCHAFTS_BONUS_MONATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPartnerschaftsBonusMonate() <em>Partnerschafts Bonus Monate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartnerschaftsBonusMonate()
	 * @generated
	 * @ordered
	 */
	protected boolean partnerschaftsBonusMonate = PARTNERSCHAFTS_BONUS_MONATE_EDEFAULT;

	/**
	 * This is true if the Partnerschafts Bonus Monate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean partnerschaftsBonusMonateESet;

	/**
	 * The cached value of the '{@link #getZeitraumPartnerschaftsBonusMonate() <em>Zeitraum Partnerschafts Bonus Monate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumPartnerschaftsBonusMonate()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> zeitraumPartnerschaftsBonusMonate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeantragungElterngeldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getBeantragungElterngeldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLeistungshoeheType getLeistungshoehe() {
		return leistungshoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeistungshoehe(CodeLeistungshoeheType newLeistungshoehe, NotificationChain msgs) {
		CodeLeistungshoeheType oldLeistungshoehe = leistungshoehe;
		leistungshoehe = newLeistungshoehe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE, oldLeistungshoehe, newLeistungshoehe);
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
	public void setLeistungshoehe(CodeLeistungshoeheType newLeistungshoehe) {
		if (newLeistungshoehe != leistungshoehe) {
			NotificationChain msgs = null;
			if (leistungshoehe != null)
				msgs = ((InternalEObject)leistungshoehe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE, null, msgs);
			if (newLeistungshoehe != null)
				msgs = ((InternalEObject)newLeistungshoehe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE, null, msgs);
			msgs = basicSetLeistungshoehe(newLeistungshoehe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE, newLeistungshoehe, newLeistungshoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBasisElterngeld() {
		return basisElterngeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasisElterngeld(boolean newBasisElterngeld) {
		boolean oldBasisElterngeld = basisElterngeld;
		basisElterngeld = newBasisElterngeld;
		boolean oldBasisElterngeldESet = basisElterngeldESet;
		basisElterngeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__BASIS_ELTERNGELD, oldBasisElterngeld, basisElterngeld, !oldBasisElterngeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBasisElterngeld() {
		boolean oldBasisElterngeld = basisElterngeld;
		boolean oldBasisElterngeldESet = basisElterngeldESet;
		basisElterngeld = BASIS_ELTERNGELD_EDEFAULT;
		basisElterngeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__BASIS_ELTERNGELD, oldBasisElterngeld, BASIS_ELTERNGELD_EDEFAULT, oldBasisElterngeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBasisElterngeld() {
		return basisElterngeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getZeitraumBasisElterngeld() {
		if (zeitraumBasisElterngeld == null) {
			zeitraumBasisElterngeld = new EDataTypeEList<BigInteger>(BigInteger.class, this, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_BASIS_ELTERNGELD);
		}
		return zeitraumBasisElterngeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElterngeldPlus() {
		return elterngeldPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldPlus(boolean newElterngeldPlus) {
		boolean oldElterngeldPlus = elterngeldPlus;
		elterngeldPlus = newElterngeldPlus;
		boolean oldElterngeldPlusESet = elterngeldPlusESet;
		elterngeldPlusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ELTERNGELD_PLUS, oldElterngeldPlus, elterngeldPlus, !oldElterngeldPlusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetElterngeldPlus() {
		boolean oldElterngeldPlus = elterngeldPlus;
		boolean oldElterngeldPlusESet = elterngeldPlusESet;
		elterngeldPlus = ELTERNGELD_PLUS_EDEFAULT;
		elterngeldPlusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ELTERNGELD_PLUS, oldElterngeldPlus, ELTERNGELD_PLUS_EDEFAULT, oldElterngeldPlusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetElterngeldPlus() {
		return elterngeldPlusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getZeitraumElterngeldPlus() {
		if (zeitraumElterngeldPlus == null) {
			zeitraumElterngeldPlus = new EDataTypeEList<BigInteger>(BigInteger.class, this, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_ELTERNGELD_PLUS);
		}
		return zeitraumElterngeldPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPartnerschaftsBonusMonate() {
		return partnerschaftsBonusMonate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartnerschaftsBonusMonate(boolean newPartnerschaftsBonusMonate) {
		boolean oldPartnerschaftsBonusMonate = partnerschaftsBonusMonate;
		partnerschaftsBonusMonate = newPartnerschaftsBonusMonate;
		boolean oldPartnerschaftsBonusMonateESet = partnerschaftsBonusMonateESet;
		partnerschaftsBonusMonateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__PARTNERSCHAFTS_BONUS_MONATE, oldPartnerschaftsBonusMonate, partnerschaftsBonusMonate, !oldPartnerschaftsBonusMonateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPartnerschaftsBonusMonate() {
		boolean oldPartnerschaftsBonusMonate = partnerschaftsBonusMonate;
		boolean oldPartnerschaftsBonusMonateESet = partnerschaftsBonusMonateESet;
		partnerschaftsBonusMonate = PARTNERSCHAFTS_BONUS_MONATE_EDEFAULT;
		partnerschaftsBonusMonateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__PARTNERSCHAFTS_BONUS_MONATE, oldPartnerschaftsBonusMonate, PARTNERSCHAFTS_BONUS_MONATE_EDEFAULT, oldPartnerschaftsBonusMonateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPartnerschaftsBonusMonate() {
		return partnerschaftsBonusMonateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getZeitraumPartnerschaftsBonusMonate() {
		if (zeitraumPartnerschaftsBonusMonate == null) {
			zeitraumPartnerschaftsBonusMonate = new EDataTypeEList<BigInteger>(BigInteger.class, this, ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_PARTNERSCHAFTS_BONUS_MONATE);
		}
		return zeitraumPartnerschaftsBonusMonate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE:
				return basicSetLeistungshoehe(null, msgs);
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
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE:
				return getLeistungshoehe();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__BASIS_ELTERNGELD:
				return isBasisElterngeld();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_BASIS_ELTERNGELD:
				return getZeitraumBasisElterngeld();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ELTERNGELD_PLUS:
				return isElterngeldPlus();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_ELTERNGELD_PLUS:
				return getZeitraumElterngeldPlus();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__PARTNERSCHAFTS_BONUS_MONATE:
				return isPartnerschaftsBonusMonate();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_PARTNERSCHAFTS_BONUS_MONATE:
				return getZeitraumPartnerschaftsBonusMonate();
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
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE:
				setLeistungshoehe((CodeLeistungshoeheType)newValue);
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__BASIS_ELTERNGELD:
				setBasisElterngeld((Boolean)newValue);
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_BASIS_ELTERNGELD:
				getZeitraumBasisElterngeld().clear();
				getZeitraumBasisElterngeld().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ELTERNGELD_PLUS:
				setElterngeldPlus((Boolean)newValue);
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_ELTERNGELD_PLUS:
				getZeitraumElterngeldPlus().clear();
				getZeitraumElterngeldPlus().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__PARTNERSCHAFTS_BONUS_MONATE:
				setPartnerschaftsBonusMonate((Boolean)newValue);
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_PARTNERSCHAFTS_BONUS_MONATE:
				getZeitraumPartnerschaftsBonusMonate().clear();
				getZeitraumPartnerschaftsBonusMonate().addAll((Collection<? extends BigInteger>)newValue);
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
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE:
				setLeistungshoehe((CodeLeistungshoeheType)null);
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__BASIS_ELTERNGELD:
				unsetBasisElterngeld();
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_BASIS_ELTERNGELD:
				getZeitraumBasisElterngeld().clear();
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ELTERNGELD_PLUS:
				unsetElterngeldPlus();
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_ELTERNGELD_PLUS:
				getZeitraumElterngeldPlus().clear();
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__PARTNERSCHAFTS_BONUS_MONATE:
				unsetPartnerschaftsBonusMonate();
				return;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_PARTNERSCHAFTS_BONUS_MONATE:
				getZeitraumPartnerschaftsBonusMonate().clear();
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
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__LEISTUNGSHOEHE:
				return leistungshoehe != null;
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__BASIS_ELTERNGELD:
				return isSetBasisElterngeld();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_BASIS_ELTERNGELD:
				return zeitraumBasisElterngeld != null && !zeitraumBasisElterngeld.isEmpty();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ELTERNGELD_PLUS:
				return isSetElterngeldPlus();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_ELTERNGELD_PLUS:
				return zeitraumElterngeldPlus != null && !zeitraumElterngeldPlus.isEmpty();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__PARTNERSCHAFTS_BONUS_MONATE:
				return isSetPartnerschaftsBonusMonate();
			case ElterngeldPackage.BEANTRAGUNG_ELTERNGELD_TYPE__ZEITRAUM_PARTNERSCHAFTS_BONUS_MONATE:
				return zeitraumPartnerschaftsBonusMonate != null && !zeitraumPartnerschaftsBonusMonate.isEmpty();
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
		result.append(" (basisElterngeld: ");
		if (basisElterngeldESet) result.append(basisElterngeld); else result.append("<unset>");
		result.append(", zeitraumBasisElterngeld: ");
		result.append(zeitraumBasisElterngeld);
		result.append(", elterngeldPlus: ");
		if (elterngeldPlusESet) result.append(elterngeldPlus); else result.append("<unset>");
		result.append(", zeitraumElterngeldPlus: ");
		result.append(zeitraumElterngeldPlus);
		result.append(", partnerschaftsBonusMonate: ");
		if (partnerschaftsBonusMonateESet) result.append(partnerschaftsBonusMonate); else result.append("<unset>");
		result.append(", zeitraumPartnerschaftsBonusMonate: ");
		result.append(zeitraumPartnerschaftsBonusMonate);
		result.append(')');
		return result.toString();
	}

} //BeantragungElterngeldTypeImpl
