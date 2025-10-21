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

import de.xoev.domea.domea.AnschriftstypCodeType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.UnstrukturierteAnschriftType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstrukturierte Anschrift Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl#getZeile1 <em>Zeile1</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl#getZeile2 <em>Zeile2</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl#getZeile3 <em>Zeile3</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl#getZeile4 <em>Zeile4</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl#getZeile5 <em>Zeile5</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl#getZeile6 <em>Zeile6</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl#getZusatz <em>Zusatz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnstrukturierteAnschriftTypeImpl extends MinimalEObjectImpl.Container implements UnstrukturierteAnschriftType {
	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected AnschriftstypCodeType typ;

	/**
	 * The default value of the '{@link #getZeile1() <em>Zeile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile1()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEILE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeile1() <em>Zeile1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile1()
	 * @generated
	 * @ordered
	 */
	protected String zeile1 = ZEILE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeile2() <em>Zeile2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile2()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEILE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeile2() <em>Zeile2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile2()
	 * @generated
	 * @ordered
	 */
	protected String zeile2 = ZEILE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeile3() <em>Zeile3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile3()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEILE3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeile3() <em>Zeile3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile3()
	 * @generated
	 * @ordered
	 */
	protected String zeile3 = ZEILE3_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeile4() <em>Zeile4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile4()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEILE4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeile4() <em>Zeile4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile4()
	 * @generated
	 * @ordered
	 */
	protected String zeile4 = ZEILE4_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeile5() <em>Zeile5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile5()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEILE5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeile5() <em>Zeile5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile5()
	 * @generated
	 * @ordered
	 */
	protected String zeile5 = ZEILE5_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeile6() <em>Zeile6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile6()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEILE6_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeile6() <em>Zeile6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeile6()
	 * @generated
	 * @ordered
	 */
	protected String zeile6 = ZEILE6_EDEFAULT;

	/**
	 * The default value of the '{@link #getZusatz() <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatz()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSATZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZusatz() <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatz()
	 * @generated
	 * @ordered
	 */
	protected String zusatz = ZUSATZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstrukturierteAnschriftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.UNSTRUKTURIERTE_ANSCHRIFT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftstypCodeType getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTyp(AnschriftstypCodeType newTyp, NotificationChain msgs) {
		AnschriftstypCodeType oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP, oldTyp, newTyp);
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
	public void setTyp(AnschriftstypCodeType newTyp) {
		if (newTyp != typ) {
			NotificationChain msgs = null;
			if (typ != null)
				msgs = ((InternalEObject)typ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP, null, msgs);
			if (newTyp != null)
				msgs = ((InternalEObject)newTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP, null, msgs);
			msgs = basicSetTyp(newTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP, newTyp, newTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZeile1() {
		return zeile1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeile1(String newZeile1) {
		String oldZeile1 = zeile1;
		zeile1 = newZeile1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE1, oldZeile1, zeile1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZeile2() {
		return zeile2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeile2(String newZeile2) {
		String oldZeile2 = zeile2;
		zeile2 = newZeile2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE2, oldZeile2, zeile2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZeile3() {
		return zeile3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeile3(String newZeile3) {
		String oldZeile3 = zeile3;
		zeile3 = newZeile3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE3, oldZeile3, zeile3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZeile4() {
		return zeile4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeile4(String newZeile4) {
		String oldZeile4 = zeile4;
		zeile4 = newZeile4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE4, oldZeile4, zeile4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZeile5() {
		return zeile5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeile5(String newZeile5) {
		String oldZeile5 = zeile5;
		zeile5 = newZeile5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE5, oldZeile5, zeile5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZeile6() {
		return zeile6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeile6(String newZeile6) {
		String oldZeile6 = zeile6;
		zeile6 = newZeile6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE6, oldZeile6, zeile6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZusatz() {
		return zusatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusatz(String newZusatz) {
		String oldZusatz = zusatz;
		zusatz = newZusatz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZUSATZ, oldZusatz, zusatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP:
				return basicSetTyp(null, msgs);
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
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP:
				return getTyp();
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE1:
				return getZeile1();
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE2:
				return getZeile2();
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE3:
				return getZeile3();
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE4:
				return getZeile4();
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE5:
				return getZeile5();
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE6:
				return getZeile6();
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZUSATZ:
				return getZusatz();
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
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP:
				setTyp((AnschriftstypCodeType)newValue);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE1:
				setZeile1((String)newValue);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE2:
				setZeile2((String)newValue);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE3:
				setZeile3((String)newValue);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE4:
				setZeile4((String)newValue);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE5:
				setZeile5((String)newValue);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE6:
				setZeile6((String)newValue);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZUSATZ:
				setZusatz((String)newValue);
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
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP:
				setTyp((AnschriftstypCodeType)null);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE1:
				setZeile1(ZEILE1_EDEFAULT);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE2:
				setZeile2(ZEILE2_EDEFAULT);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE3:
				setZeile3(ZEILE3_EDEFAULT);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE4:
				setZeile4(ZEILE4_EDEFAULT);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE5:
				setZeile5(ZEILE5_EDEFAULT);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE6:
				setZeile6(ZEILE6_EDEFAULT);
				return;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZUSATZ:
				setZusatz(ZUSATZ_EDEFAULT);
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
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP:
				return typ != null;
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE1:
				return ZEILE1_EDEFAULT == null ? zeile1 != null : !ZEILE1_EDEFAULT.equals(zeile1);
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE2:
				return ZEILE2_EDEFAULT == null ? zeile2 != null : !ZEILE2_EDEFAULT.equals(zeile2);
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE3:
				return ZEILE3_EDEFAULT == null ? zeile3 != null : !ZEILE3_EDEFAULT.equals(zeile3);
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE4:
				return ZEILE4_EDEFAULT == null ? zeile4 != null : !ZEILE4_EDEFAULT.equals(zeile4);
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE5:
				return ZEILE5_EDEFAULT == null ? zeile5 != null : !ZEILE5_EDEFAULT.equals(zeile5);
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE6:
				return ZEILE6_EDEFAULT == null ? zeile6 != null : !ZEILE6_EDEFAULT.equals(zeile6);
			case DomeaPackage.UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZUSATZ:
				return ZUSATZ_EDEFAULT == null ? zusatz != null : !ZUSATZ_EDEFAULT.equals(zusatz);
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
		result.append(" (zeile1: ");
		result.append(zeile1);
		result.append(", zeile2: ");
		result.append(zeile2);
		result.append(", zeile3: ");
		result.append(zeile3);
		result.append(", zeile4: ");
		result.append(zeile4);
		result.append(", zeile5: ");
		result.append(zeile5);
		result.append(", zeile6: ");
		result.append(zeile6);
		result.append(", zusatz: ");
		result.append(zusatz);
		result.append(')');
		return result.toString();
	}

} //UnstrukturierteAnschriftTypeImpl
