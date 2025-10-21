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

import de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staatsangehoerigkeit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.StaatsangehoerigkeitTypeImpl#getStaatsangehoerigkeiten <em>Staatsangehoerigkeiten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.StaatsangehoerigkeitTypeImpl#isVerlustFreizuegigkeit <em>Verlust Freizuegigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.StaatsangehoerigkeitTypeImpl#getAufenthaltstitel <em>Aufenthaltstitel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaatsangehoerigkeitTypeImpl extends MinimalEObjectImpl.Container implements StaatsangehoerigkeitType {
	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeiten() <em>Staatsangehoerigkeiten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeiten()
	 * @generated
	 * @ordered
	 */
	protected StaatsangehoerigkeitenNachweisbezugType staatsangehoerigkeiten;

	/**
	 * The default value of the '{@link #isVerlustFreizuegigkeit() <em>Verlust Freizuegigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerlustFreizuegigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERLUST_FREIZUEGIGKEIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerlustFreizuegigkeit() <em>Verlust Freizuegigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerlustFreizuegigkeit()
	 * @generated
	 * @ordered
	 */
	protected boolean verlustFreizuegigkeit = VERLUST_FREIZUEGIGKEIT_EDEFAULT;

	/**
	 * This is true if the Verlust Freizuegigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verlustFreizuegigkeitESet;

	/**
	 * The cached value of the '{@link #getAufenthaltstitel() <em>Aufenthaltstitel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltstitel()
	 * @generated
	 * @ordered
	 */
	protected AufenthaltstitelNachweisbezugType aufenthaltstitel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaatsangehoerigkeitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getStaatsangehoerigkeitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitenNachweisbezugType getStaatsangehoerigkeiten() {
		return staatsangehoerigkeiten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaatsangehoerigkeiten(StaatsangehoerigkeitenNachweisbezugType newStaatsangehoerigkeiten, NotificationChain msgs) {
		StaatsangehoerigkeitenNachweisbezugType oldStaatsangehoerigkeiten = staatsangehoerigkeiten;
		staatsangehoerigkeiten = newStaatsangehoerigkeiten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN, oldStaatsangehoerigkeiten, newStaatsangehoerigkeiten);
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
	public void setStaatsangehoerigkeiten(StaatsangehoerigkeitenNachweisbezugType newStaatsangehoerigkeiten) {
		if (newStaatsangehoerigkeiten != staatsangehoerigkeiten) {
			NotificationChain msgs = null;
			if (staatsangehoerigkeiten != null)
				msgs = ((InternalEObject)staatsangehoerigkeiten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN, null, msgs);
			if (newStaatsangehoerigkeiten != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeiten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN, null, msgs);
			msgs = basicSetStaatsangehoerigkeiten(newStaatsangehoerigkeiten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN, newStaatsangehoerigkeiten, newStaatsangehoerigkeiten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerlustFreizuegigkeit() {
		return verlustFreizuegigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerlustFreizuegigkeit(boolean newVerlustFreizuegigkeit) {
		boolean oldVerlustFreizuegigkeit = verlustFreizuegigkeit;
		verlustFreizuegigkeit = newVerlustFreizuegigkeit;
		boolean oldVerlustFreizuegigkeitESet = verlustFreizuegigkeitESet;
		verlustFreizuegigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_FREIZUEGIGKEIT, oldVerlustFreizuegigkeit, verlustFreizuegigkeit, !oldVerlustFreizuegigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerlustFreizuegigkeit() {
		boolean oldVerlustFreizuegigkeit = verlustFreizuegigkeit;
		boolean oldVerlustFreizuegigkeitESet = verlustFreizuegigkeitESet;
		verlustFreizuegigkeit = VERLUST_FREIZUEGIGKEIT_EDEFAULT;
		verlustFreizuegigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_FREIZUEGIGKEIT, oldVerlustFreizuegigkeit, VERLUST_FREIZUEGIGKEIT_EDEFAULT, oldVerlustFreizuegigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerlustFreizuegigkeit() {
		return verlustFreizuegigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AufenthaltstitelNachweisbezugType getAufenthaltstitel() {
		return aufenthaltstitel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufenthaltstitel(AufenthaltstitelNachweisbezugType newAufenthaltstitel, NotificationChain msgs) {
		AufenthaltstitelNachweisbezugType oldAufenthaltstitel = aufenthaltstitel;
		aufenthaltstitel = newAufenthaltstitel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL, oldAufenthaltstitel, newAufenthaltstitel);
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
	public void setAufenthaltstitel(AufenthaltstitelNachweisbezugType newAufenthaltstitel) {
		if (newAufenthaltstitel != aufenthaltstitel) {
			NotificationChain msgs = null;
			if (aufenthaltstitel != null)
				msgs = ((InternalEObject)aufenthaltstitel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL, null, msgs);
			if (newAufenthaltstitel != null)
				msgs = ((InternalEObject)newAufenthaltstitel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL, null, msgs);
			msgs = basicSetAufenthaltstitel(newAufenthaltstitel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL, newAufenthaltstitel, newAufenthaltstitel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN:
				return basicSetStaatsangehoerigkeiten(null, msgs);
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL:
				return basicSetAufenthaltstitel(null, msgs);
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
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN:
				return getStaatsangehoerigkeiten();
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_FREIZUEGIGKEIT:
				return isVerlustFreizuegigkeit();
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL:
				return getAufenthaltstitel();
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
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN:
				setStaatsangehoerigkeiten((StaatsangehoerigkeitenNachweisbezugType)newValue);
				return;
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_FREIZUEGIGKEIT:
				setVerlustFreizuegigkeit((Boolean)newValue);
				return;
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL:
				setAufenthaltstitel((AufenthaltstitelNachweisbezugType)newValue);
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
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN:
				setStaatsangehoerigkeiten((StaatsangehoerigkeitenNachweisbezugType)null);
				return;
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_FREIZUEGIGKEIT:
				unsetVerlustFreizuegigkeit();
				return;
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL:
				setAufenthaltstitel((AufenthaltstitelNachweisbezugType)null);
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
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__STAATSANGEHOERIGKEITEN:
				return staatsangehoerigkeiten != null;
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__VERLUST_FREIZUEGIGKEIT:
				return isSetVerlustFreizuegigkeit();
			case ElterngeldPackage.STAATSANGEHOERIGKEIT_TYPE__AUFENTHALTSTITEL:
				return aufenthaltstitel != null;
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
		result.append(" (verlustFreizuegigkeit: ");
		if (verlustFreizuegigkeitESet) result.append(verlustFreizuegigkeit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StaatsangehoerigkeitTypeImpl
