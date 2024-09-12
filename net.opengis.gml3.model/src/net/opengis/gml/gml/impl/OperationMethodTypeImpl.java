/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.gml.gml.impl;

import java.math.BigInteger;

import java.util.Collection;

import net.opengis.gml.gml.AbstractGeneralOperationParameterPropertyType;
import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.FormulaCitationType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.OperationMethodType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.OperationMethodTypeImpl#getFormulaCitation <em>Formula Citation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.OperationMethodTypeImpl#getFormulaGroup <em>Formula Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.OperationMethodTypeImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.OperationMethodTypeImpl#getSourceDimensions <em>Source Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.OperationMethodTypeImpl#getTargetDimensions <em>Target Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.OperationMethodTypeImpl#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.OperationMethodTypeImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationMethodTypeImpl extends IdentifiedObjectTypeImpl implements OperationMethodType {
	/**
	 * The cached value of the '{@link #getFormulaCitation() <em>Formula Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaCitation()
	 * @generated
	 * @ordered
	 */
	protected FormulaCitationType formulaCitation;

	/**
	 * The cached value of the '{@link #getFormulaGroup() <em>Formula Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap formulaGroup;

	/**
	 * The default value of the '{@link #getSourceDimensions() <em>Source Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOURCE_DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDimensions() <em>Source Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDimensions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sourceDimensions = SOURCE_DIMENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDimensions() <em>Target Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TARGET_DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDimensions() <em>Target Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDimensions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger targetDimensions = TARGET_DIMENSIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterGroup() <em>Parameter Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap parameterGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getOperationMethodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulaCitationType getFormulaCitation() {
		return formulaCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormulaCitation(FormulaCitationType newFormulaCitation, NotificationChain msgs) {
		FormulaCitationType oldFormulaCitation = formulaCitation;
		formulaCitation = newFormulaCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION, oldFormulaCitation, newFormulaCitation);
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
	public void setFormulaCitation(FormulaCitationType newFormulaCitation) {
		if (newFormulaCitation != formulaCitation) {
			NotificationChain msgs = null;
			if (formulaCitation != null)
				msgs = ((InternalEObject)formulaCitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION, null, msgs);
			if (newFormulaCitation != null)
				msgs = ((InternalEObject)newFormulaCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION, null, msgs);
			msgs = basicSetFormulaCitation(newFormulaCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION, newFormulaCitation, newFormulaCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFormulaGroup() {
		if (formulaGroup == null) {
			formulaGroup = new BasicFeatureMap(this, GMLPackage.OPERATION_METHOD_TYPE__FORMULA_GROUP);
		}
		return formulaGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getFormula() {
		return (CodeType)getFormulaGroup().get(GMLPackage.eINSTANCE.getOperationMethodType_Formula(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(CodeType newFormula, NotificationChain msgs) {
		return ((FeatureMap.Internal)getFormulaGroup()).basicAdd(GMLPackage.eINSTANCE.getOperationMethodType_Formula(), newFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormula(CodeType newFormula) {
		((FeatureMap.Internal)getFormulaGroup()).set(GMLPackage.eINSTANCE.getOperationMethodType_Formula(), newFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSourceDimensions() {
		return sourceDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceDimensions(BigInteger newSourceDimensions) {
		BigInteger oldSourceDimensions = sourceDimensions;
		sourceDimensions = newSourceDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS, oldSourceDimensions, sourceDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTargetDimensions() {
		return targetDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDimensions(BigInteger newTargetDimensions) {
		BigInteger oldTargetDimensions = targetDimensions;
		targetDimensions = newTargetDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS, oldTargetDimensions, targetDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getParameterGroup() {
		if (parameterGroup == null) {
			parameterGroup = new BasicFeatureMap(this, GMLPackage.OPERATION_METHOD_TYPE__PARAMETER_GROUP);
		}
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeneralOperationParameterPropertyType> getParameter() {
		return getParameterGroup().list(GMLPackage.eINSTANCE.getOperationMethodType_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION:
				return basicSetFormulaCitation(null, msgs);
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_GROUP:
				return ((InternalEList<?>)getFormulaGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA:
				return basicSetFormula(null, msgs);
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER_GROUP:
				return ((InternalEList<?>)getParameterGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION:
				return getFormulaCitation();
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_GROUP:
				if (coreType) return getFormulaGroup();
				return ((FeatureMap.Internal)getFormulaGroup()).getWrapper();
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA:
				return getFormula();
			case GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS:
				return getSourceDimensions();
			case GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS:
				return getTargetDimensions();
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER_GROUP:
				if (coreType) return getParameterGroup();
				return ((FeatureMap.Internal)getParameterGroup()).getWrapper();
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER:
				return getParameter();
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
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION:
				setFormulaCitation((FormulaCitationType)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_GROUP:
				((FeatureMap.Internal)getFormulaGroup()).set(newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA:
				setFormula((CodeType)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS:
				setSourceDimensions((BigInteger)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS:
				setTargetDimensions((BigInteger)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER_GROUP:
				((FeatureMap.Internal)getParameterGroup()).set(newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends AbstractGeneralOperationParameterPropertyType>)newValue);
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
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION:
				setFormulaCitation((FormulaCitationType)null);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_GROUP:
				getFormulaGroup().clear();
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA:
				setFormula((CodeType)null);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS:
				setSourceDimensions(SOURCE_DIMENSIONS_EDEFAULT);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS:
				setTargetDimensions(TARGET_DIMENSIONS_EDEFAULT);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER_GROUP:
				getParameterGroup().clear();
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER:
				getParameter().clear();
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
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_CITATION:
				return formulaCitation != null;
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA_GROUP:
				return formulaGroup != null && !formulaGroup.isEmpty();
			case GMLPackage.OPERATION_METHOD_TYPE__FORMULA:
				return getFormula() != null;
			case GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS:
				return SOURCE_DIMENSIONS_EDEFAULT == null ? sourceDimensions != null : !SOURCE_DIMENSIONS_EDEFAULT.equals(sourceDimensions);
			case GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS:
				return TARGET_DIMENSIONS_EDEFAULT == null ? targetDimensions != null : !TARGET_DIMENSIONS_EDEFAULT.equals(targetDimensions);
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER_GROUP:
				return parameterGroup != null && !parameterGroup.isEmpty();
			case GMLPackage.OPERATION_METHOD_TYPE__PARAMETER:
				return !getParameter().isEmpty();
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
		result.append(" (formulaGroup: ");
		result.append(formulaGroup);
		result.append(", sourceDimensions: ");
		result.append(sourceDimensions);
		result.append(", targetDimensions: ");
		result.append(targetDimensions);
		result.append(", parameterGroup: ");
		result.append(parameterGroup);
		result.append(')');
		return result.toString();
	}

} //OperationMethodTypeImpl
