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

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.LebenssituationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lebenssituation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.LebenssituationTypeImpl#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.LebenssituationTypeImpl#getUnverheiratetesZusammenlebenSeit <em>Unverheiratetes Zusammenleben Seit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.LebenssituationTypeImpl#isDauerndesGetrenntLeben <em>Dauerndes Getrennt Leben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.LebenssituationTypeImpl#getDauerndesGetrenntLebenSeit <em>Dauerndes Getrennt Leben Seit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LebenssituationTypeImpl extends MinimalEObjectImpl.Container implements LebenssituationType {
	/**
	 * The default value of the '{@link #isUnverheiratetesZusammenleben() <em>Unverheiratetes Zusammenleben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnverheiratetesZusammenleben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNVERHEIRATETES_ZUSAMMENLEBEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnverheiratetesZusammenleben() <em>Unverheiratetes Zusammenleben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnverheiratetesZusammenleben()
	 * @generated
	 * @ordered
	 */
	protected boolean unverheiratetesZusammenleben = UNVERHEIRATETES_ZUSAMMENLEBEN_EDEFAULT;

	/**
	 * This is true if the Unverheiratetes Zusammenleben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unverheiratetesZusammenlebenESet;

	/**
	 * The cached value of the '{@link #getUnverheiratetesZusammenlebenSeit() <em>Unverheiratetes Zusammenleben Seit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnverheiratetesZusammenlebenSeit()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType unverheiratetesZusammenlebenSeit;

	/**
	 * The default value of the '{@link #isDauerndesGetrenntLeben() <em>Dauerndes Getrennt Leben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDauerndesGetrenntLeben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAUERNDES_GETRENNT_LEBEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDauerndesGetrenntLeben() <em>Dauerndes Getrennt Leben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDauerndesGetrenntLeben()
	 * @generated
	 * @ordered
	 */
	protected boolean dauerndesGetrenntLeben = DAUERNDES_GETRENNT_LEBEN_EDEFAULT;

	/**
	 * This is true if the Dauerndes Getrennt Leben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dauerndesGetrenntLebenESet;

	/**
	 * The cached value of the '{@link #getDauerndesGetrenntLebenSeit() <em>Dauerndes Getrennt Leben Seit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauerndesGetrenntLebenSeit()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType dauerndesGetrenntLebenSeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LebenssituationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getLebenssituationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnverheiratetesZusammenleben() {
		return unverheiratetesZusammenleben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnverheiratetesZusammenleben(boolean newUnverheiratetesZusammenleben) {
		boolean oldUnverheiratetesZusammenleben = unverheiratetesZusammenleben;
		unverheiratetesZusammenleben = newUnverheiratetesZusammenleben;
		boolean oldUnverheiratetesZusammenlebenESet = unverheiratetesZusammenlebenESet;
		unverheiratetesZusammenlebenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN, oldUnverheiratetesZusammenleben, unverheiratetesZusammenleben, !oldUnverheiratetesZusammenlebenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnverheiratetesZusammenleben() {
		boolean oldUnverheiratetesZusammenleben = unverheiratetesZusammenleben;
		boolean oldUnverheiratetesZusammenlebenESet = unverheiratetesZusammenlebenESet;
		unverheiratetesZusammenleben = UNVERHEIRATETES_ZUSAMMENLEBEN_EDEFAULT;
		unverheiratetesZusammenlebenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN, oldUnverheiratetesZusammenleben, UNVERHEIRATETES_ZUSAMMENLEBEN_EDEFAULT, oldUnverheiratetesZusammenlebenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnverheiratetesZusammenleben() {
		return unverheiratetesZusammenlebenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getUnverheiratetesZusammenlebenSeit() {
		return unverheiratetesZusammenlebenSeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnverheiratetesZusammenlebenSeit(TeilbekanntesDatumType newUnverheiratetesZusammenlebenSeit, NotificationChain msgs) {
		TeilbekanntesDatumType oldUnverheiratetesZusammenlebenSeit = unverheiratetesZusammenlebenSeit;
		unverheiratetesZusammenlebenSeit = newUnverheiratetesZusammenlebenSeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT, oldUnverheiratetesZusammenlebenSeit, newUnverheiratetesZusammenlebenSeit);
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
	public void setUnverheiratetesZusammenlebenSeit(TeilbekanntesDatumType newUnverheiratetesZusammenlebenSeit) {
		if (newUnverheiratetesZusammenlebenSeit != unverheiratetesZusammenlebenSeit) {
			NotificationChain msgs = null;
			if (unverheiratetesZusammenlebenSeit != null)
				msgs = ((InternalEObject)unverheiratetesZusammenlebenSeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT, null, msgs);
			if (newUnverheiratetesZusammenlebenSeit != null)
				msgs = ((InternalEObject)newUnverheiratetesZusammenlebenSeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT, null, msgs);
			msgs = basicSetUnverheiratetesZusammenlebenSeit(newUnverheiratetesZusammenlebenSeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT, newUnverheiratetesZusammenlebenSeit, newUnverheiratetesZusammenlebenSeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDauerndesGetrenntLeben() {
		return dauerndesGetrenntLeben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDauerndesGetrenntLeben(boolean newDauerndesGetrenntLeben) {
		boolean oldDauerndesGetrenntLeben = dauerndesGetrenntLeben;
		dauerndesGetrenntLeben = newDauerndesGetrenntLeben;
		boolean oldDauerndesGetrenntLebenESet = dauerndesGetrenntLebenESet;
		dauerndesGetrenntLebenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN, oldDauerndesGetrenntLeben, dauerndesGetrenntLeben, !oldDauerndesGetrenntLebenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDauerndesGetrenntLeben() {
		boolean oldDauerndesGetrenntLeben = dauerndesGetrenntLeben;
		boolean oldDauerndesGetrenntLebenESet = dauerndesGetrenntLebenESet;
		dauerndesGetrenntLeben = DAUERNDES_GETRENNT_LEBEN_EDEFAULT;
		dauerndesGetrenntLebenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN, oldDauerndesGetrenntLeben, DAUERNDES_GETRENNT_LEBEN_EDEFAULT, oldDauerndesGetrenntLebenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDauerndesGetrenntLeben() {
		return dauerndesGetrenntLebenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getDauerndesGetrenntLebenSeit() {
		return dauerndesGetrenntLebenSeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDauerndesGetrenntLebenSeit(TeilbekanntesDatumType newDauerndesGetrenntLebenSeit, NotificationChain msgs) {
		TeilbekanntesDatumType oldDauerndesGetrenntLebenSeit = dauerndesGetrenntLebenSeit;
		dauerndesGetrenntLebenSeit = newDauerndesGetrenntLebenSeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT, oldDauerndesGetrenntLebenSeit, newDauerndesGetrenntLebenSeit);
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
	public void setDauerndesGetrenntLebenSeit(TeilbekanntesDatumType newDauerndesGetrenntLebenSeit) {
		if (newDauerndesGetrenntLebenSeit != dauerndesGetrenntLebenSeit) {
			NotificationChain msgs = null;
			if (dauerndesGetrenntLebenSeit != null)
				msgs = ((InternalEObject)dauerndesGetrenntLebenSeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT, null, msgs);
			if (newDauerndesGetrenntLebenSeit != null)
				msgs = ((InternalEObject)newDauerndesGetrenntLebenSeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT, null, msgs);
			msgs = basicSetDauerndesGetrenntLebenSeit(newDauerndesGetrenntLebenSeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT, newDauerndesGetrenntLebenSeit, newDauerndesGetrenntLebenSeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT:
				return basicSetUnverheiratetesZusammenlebenSeit(null, msgs);
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT:
				return basicSetDauerndesGetrenntLebenSeit(null, msgs);
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
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN:
				return isUnverheiratetesZusammenleben();
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT:
				return getUnverheiratetesZusammenlebenSeit();
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN:
				return isDauerndesGetrenntLeben();
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT:
				return getDauerndesGetrenntLebenSeit();
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
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN:
				setUnverheiratetesZusammenleben((Boolean)newValue);
				return;
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT:
				setUnverheiratetesZusammenlebenSeit((TeilbekanntesDatumType)newValue);
				return;
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN:
				setDauerndesGetrenntLeben((Boolean)newValue);
				return;
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT:
				setDauerndesGetrenntLebenSeit((TeilbekanntesDatumType)newValue);
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
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN:
				unsetUnverheiratetesZusammenleben();
				return;
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT:
				setUnverheiratetesZusammenlebenSeit((TeilbekanntesDatumType)null);
				return;
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN:
				unsetDauerndesGetrenntLeben();
				return;
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT:
				setDauerndesGetrenntLebenSeit((TeilbekanntesDatumType)null);
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
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN:
				return isSetUnverheiratetesZusammenleben();
			case ElterngeldPackage.LEBENSSITUATION_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN_SEIT:
				return unverheiratetesZusammenlebenSeit != null;
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN:
				return isSetDauerndesGetrenntLeben();
			case ElterngeldPackage.LEBENSSITUATION_TYPE__DAUERNDES_GETRENNT_LEBEN_SEIT:
				return dauerndesGetrenntLebenSeit != null;
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
		result.append(" (unverheiratetesZusammenleben: ");
		if (unverheiratetesZusammenlebenESet) result.append(unverheiratetesZusammenleben); else result.append("<unset>");
		result.append(", dauerndesGetrenntLeben: ");
		if (dauerndesGetrenntLebenESet) result.append(dauerndesGetrenntLeben); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LebenssituationTypeImpl
