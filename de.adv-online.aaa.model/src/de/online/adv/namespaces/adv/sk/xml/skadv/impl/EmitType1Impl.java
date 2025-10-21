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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType;
import de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.LabelTextType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Emit Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.EmitType1Impl#getLabelText <em>Label Text</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.EmitType1Impl#getZIndex <em>ZIndex</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.EmitType1Impl#isPermitApDarst <em>Permit Ap Darst</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.EmitType1Impl#isPermitPraesobj <em>Permit Praesobj</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.EmitType1Impl#isPermitStdpraes <em>Permit Stdpraes</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.EmitType1Impl#getSymbolClass <em>Symbol Class</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.EmitType1Impl#getDesignRule <em>Design Rule</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.EmitType1Impl#getSymbolizer <em>Symbolizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmitType1Impl extends ElementType1Impl implements EmitType1 {
	/**
	 * The cached value of the '{@link #getLabelText() <em>Label Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelText()
	 * @generated
	 * @ordered
	 */
	protected LabelTextType1 labelText;

	/**
	 * The default value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ZINDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger zIndex = ZINDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isPermitApDarst() <em>Permit Ap Darst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermitApDarst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERMIT_AP_DARST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPermitApDarst() <em>Permit Ap Darst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermitApDarst()
	 * @generated
	 * @ordered
	 */
	protected boolean permitApDarst = PERMIT_AP_DARST_EDEFAULT;

	/**
	 * This is true if the Permit Ap Darst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean permitApDarstESet;

	/**
	 * The default value of the '{@link #isPermitPraesobj() <em>Permit Praesobj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermitPraesobj()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERMIT_PRAESOBJ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPermitPraesobj() <em>Permit Praesobj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermitPraesobj()
	 * @generated
	 * @ordered
	 */
	protected boolean permitPraesobj = PERMIT_PRAESOBJ_EDEFAULT;

	/**
	 * This is true if the Permit Praesobj attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean permitPraesobjESet;

	/**
	 * The default value of the '{@link #isPermitStdpraes() <em>Permit Stdpraes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermitStdpraes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERMIT_STDPRAES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPermitStdpraes() <em>Permit Stdpraes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermitStdpraes()
	 * @generated
	 * @ordered
	 */
	protected boolean permitStdpraes = PERMIT_STDPRAES_EDEFAULT;

	/**
	 * This is true if the Permit Stdpraes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean permitStdpraesESet;

	/**
	 * The default value of the '{@link #getSymbolClass() <em>Symbol Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolClass() <em>Symbol Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolClass()
	 * @generated
	 * @ordered
	 */
	protected String symbolClass = SYMBOL_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDesignRule() <em>Design Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignRule()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignRuleType> designRule;

	/**
	 * The cached value of the '{@link #getSymbolizer() <em>Symbolizer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolizer()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolizerType> symbolizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmitType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getEmitType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelTextType1 getLabelText() {
		return labelText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelText(LabelTextType1 newLabelText, NotificationChain msgs) {
		LabelTextType1 oldLabelText = labelText;
		labelText = newLabelText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.EMIT_TYPE1__LABEL_TEXT, oldLabelText, newLabelText);
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
	public void setLabelText(LabelTextType1 newLabelText) {
		if (newLabelText != labelText) {
			NotificationChain msgs = null;
			if (labelText != null)
				msgs = ((InternalEObject)labelText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.EMIT_TYPE1__LABEL_TEXT, null, msgs);
			if (newLabelText != null)
				msgs = ((InternalEObject)newLabelText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.EMIT_TYPE1__LABEL_TEXT, null, msgs);
			msgs = basicSetLabelText(newLabelText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.EMIT_TYPE1__LABEL_TEXT, newLabelText, newLabelText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getZIndex() {
		return zIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZIndex(BigInteger newZIndex) {
		BigInteger oldZIndex = zIndex;
		zIndex = newZIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.EMIT_TYPE1__ZINDEX, oldZIndex, zIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPermitApDarst() {
		return permitApDarst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermitApDarst(boolean newPermitApDarst) {
		boolean oldPermitApDarst = permitApDarst;
		permitApDarst = newPermitApDarst;
		boolean oldPermitApDarstESet = permitApDarstESet;
		permitApDarstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.EMIT_TYPE1__PERMIT_AP_DARST, oldPermitApDarst, permitApDarst, !oldPermitApDarstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPermitApDarst() {
		boolean oldPermitApDarst = permitApDarst;
		boolean oldPermitApDarstESet = permitApDarstESet;
		permitApDarst = PERMIT_AP_DARST_EDEFAULT;
		permitApDarstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.EMIT_TYPE1__PERMIT_AP_DARST, oldPermitApDarst, PERMIT_AP_DARST_EDEFAULT, oldPermitApDarstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPermitApDarst() {
		return permitApDarstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPermitPraesobj() {
		return permitPraesobj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermitPraesobj(boolean newPermitPraesobj) {
		boolean oldPermitPraesobj = permitPraesobj;
		permitPraesobj = newPermitPraesobj;
		boolean oldPermitPraesobjESet = permitPraesobjESet;
		permitPraesobjESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.EMIT_TYPE1__PERMIT_PRAESOBJ, oldPermitPraesobj, permitPraesobj, !oldPermitPraesobjESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPermitPraesobj() {
		boolean oldPermitPraesobj = permitPraesobj;
		boolean oldPermitPraesobjESet = permitPraesobjESet;
		permitPraesobj = PERMIT_PRAESOBJ_EDEFAULT;
		permitPraesobjESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.EMIT_TYPE1__PERMIT_PRAESOBJ, oldPermitPraesobj, PERMIT_PRAESOBJ_EDEFAULT, oldPermitPraesobjESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPermitPraesobj() {
		return permitPraesobjESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPermitStdpraes() {
		return permitStdpraes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermitStdpraes(boolean newPermitStdpraes) {
		boolean oldPermitStdpraes = permitStdpraes;
		permitStdpraes = newPermitStdpraes;
		boolean oldPermitStdpraesESet = permitStdpraesESet;
		permitStdpraesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.EMIT_TYPE1__PERMIT_STDPRAES, oldPermitStdpraes, permitStdpraes, !oldPermitStdpraesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPermitStdpraes() {
		boolean oldPermitStdpraes = permitStdpraes;
		boolean oldPermitStdpraesESet = permitStdpraesESet;
		permitStdpraes = PERMIT_STDPRAES_EDEFAULT;
		permitStdpraesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.EMIT_TYPE1__PERMIT_STDPRAES, oldPermitStdpraes, PERMIT_STDPRAES_EDEFAULT, oldPermitStdpraesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPermitStdpraes() {
		return permitStdpraesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbolClass() {
		return symbolClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbolClass(String newSymbolClass) {
		String oldSymbolClass = symbolClass;
		symbolClass = newSymbolClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.EMIT_TYPE1__SYMBOL_CLASS, oldSymbolClass, symbolClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DesignRuleType> getDesignRule() {
		if (designRule == null) {
			designRule = new EObjectContainmentEList<DesignRuleType>(DesignRuleType.class, this, AAAPackage.EMIT_TYPE1__DESIGN_RULE);
		}
		return designRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SymbolizerType> getSymbolizer() {
		if (symbolizer == null) {
			symbolizer = new EObjectContainmentEList<SymbolizerType>(SymbolizerType.class, this, AAAPackage.EMIT_TYPE1__SYMBOLIZER);
		}
		return symbolizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.EMIT_TYPE1__LABEL_TEXT:
				return basicSetLabelText(null, msgs);
			case AAAPackage.EMIT_TYPE1__DESIGN_RULE:
				return ((InternalEList<?>)getDesignRule()).basicRemove(otherEnd, msgs);
			case AAAPackage.EMIT_TYPE1__SYMBOLIZER:
				return ((InternalEList<?>)getSymbolizer()).basicRemove(otherEnd, msgs);
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
			case AAAPackage.EMIT_TYPE1__LABEL_TEXT:
				return getLabelText();
			case AAAPackage.EMIT_TYPE1__ZINDEX:
				return getZIndex();
			case AAAPackage.EMIT_TYPE1__PERMIT_AP_DARST:
				return isPermitApDarst();
			case AAAPackage.EMIT_TYPE1__PERMIT_PRAESOBJ:
				return isPermitPraesobj();
			case AAAPackage.EMIT_TYPE1__PERMIT_STDPRAES:
				return isPermitStdpraes();
			case AAAPackage.EMIT_TYPE1__SYMBOL_CLASS:
				return getSymbolClass();
			case AAAPackage.EMIT_TYPE1__DESIGN_RULE:
				return getDesignRule();
			case AAAPackage.EMIT_TYPE1__SYMBOLIZER:
				return getSymbolizer();
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
			case AAAPackage.EMIT_TYPE1__LABEL_TEXT:
				setLabelText((LabelTextType1)newValue);
				return;
			case AAAPackage.EMIT_TYPE1__ZINDEX:
				setZIndex((BigInteger)newValue);
				return;
			case AAAPackage.EMIT_TYPE1__PERMIT_AP_DARST:
				setPermitApDarst((Boolean)newValue);
				return;
			case AAAPackage.EMIT_TYPE1__PERMIT_PRAESOBJ:
				setPermitPraesobj((Boolean)newValue);
				return;
			case AAAPackage.EMIT_TYPE1__PERMIT_STDPRAES:
				setPermitStdpraes((Boolean)newValue);
				return;
			case AAAPackage.EMIT_TYPE1__SYMBOL_CLASS:
				setSymbolClass((String)newValue);
				return;
			case AAAPackage.EMIT_TYPE1__DESIGN_RULE:
				getDesignRule().clear();
				getDesignRule().addAll((Collection<? extends DesignRuleType>)newValue);
				return;
			case AAAPackage.EMIT_TYPE1__SYMBOLIZER:
				getSymbolizer().clear();
				getSymbolizer().addAll((Collection<? extends SymbolizerType>)newValue);
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
			case AAAPackage.EMIT_TYPE1__LABEL_TEXT:
				setLabelText((LabelTextType1)null);
				return;
			case AAAPackage.EMIT_TYPE1__ZINDEX:
				setZIndex(ZINDEX_EDEFAULT);
				return;
			case AAAPackage.EMIT_TYPE1__PERMIT_AP_DARST:
				unsetPermitApDarst();
				return;
			case AAAPackage.EMIT_TYPE1__PERMIT_PRAESOBJ:
				unsetPermitPraesobj();
				return;
			case AAAPackage.EMIT_TYPE1__PERMIT_STDPRAES:
				unsetPermitStdpraes();
				return;
			case AAAPackage.EMIT_TYPE1__SYMBOL_CLASS:
				setSymbolClass(SYMBOL_CLASS_EDEFAULT);
				return;
			case AAAPackage.EMIT_TYPE1__DESIGN_RULE:
				getDesignRule().clear();
				return;
			case AAAPackage.EMIT_TYPE1__SYMBOLIZER:
				getSymbolizer().clear();
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
			case AAAPackage.EMIT_TYPE1__LABEL_TEXT:
				return labelText != null;
			case AAAPackage.EMIT_TYPE1__ZINDEX:
				return ZINDEX_EDEFAULT == null ? zIndex != null : !ZINDEX_EDEFAULT.equals(zIndex);
			case AAAPackage.EMIT_TYPE1__PERMIT_AP_DARST:
				return isSetPermitApDarst();
			case AAAPackage.EMIT_TYPE1__PERMIT_PRAESOBJ:
				return isSetPermitPraesobj();
			case AAAPackage.EMIT_TYPE1__PERMIT_STDPRAES:
				return isSetPermitStdpraes();
			case AAAPackage.EMIT_TYPE1__SYMBOL_CLASS:
				return SYMBOL_CLASS_EDEFAULT == null ? symbolClass != null : !SYMBOL_CLASS_EDEFAULT.equals(symbolClass);
			case AAAPackage.EMIT_TYPE1__DESIGN_RULE:
				return designRule != null && !designRule.isEmpty();
			case AAAPackage.EMIT_TYPE1__SYMBOLIZER:
				return symbolizer != null && !symbolizer.isEmpty();
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
		result.append(" (zIndex: ");
		result.append(zIndex);
		result.append(", permitApDarst: ");
		if (permitApDarstESet) result.append(permitApDarst); else result.append("<unset>");
		result.append(", permitPraesobj: ");
		if (permitPraesobjESet) result.append(permitPraesobj); else result.append("<unset>");
		result.append(", permitStdpraes: ");
		if (permitStdpraesESet) result.append(permitStdpraes); else result.append("<unset>");
		result.append(", symbolClass: ");
		result.append(symbolClass);
		result.append(')');
		return result.toString();
	}

} //EmitType1Impl
