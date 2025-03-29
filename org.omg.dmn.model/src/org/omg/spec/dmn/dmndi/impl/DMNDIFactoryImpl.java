/**
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
package org.omg.spec.dmn.dmndi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.omg.spec.dmn.dmndi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DMNDIFactoryImpl extends EFactoryImpl implements DMNDIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DMNDIFactory init() {
		try {
			DMNDIFactory theDMNDIFactory = (DMNDIFactory)EPackage.Registry.INSTANCE.getEFactory(DMNDIPackage.eNS_URI);
			if (theDMNDIFactory != null) {
				return theDMNDIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DMNDIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMNDIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DMNDIPackage.DMN_DECISION_SERVICE_DIVIDER_LINE: return createDMNDecisionServiceDividerLine();
			case DMNDIPackage.DMNDI: return createDMNDI();
			case DMNDIPackage.DMN_DIAGRAM: return createDMNDiagram();
			case DMNDIPackage.DMN_EDGE: return createDMNEdge();
			case DMNDIPackage.DMN_LABEL: return createDMNLabel();
			case DMNDIPackage.DMN_SHAPE: return createDMNShape();
			case DMNDIPackage.DMN_STYLE: return createDMNStyle();
			case DMNDIPackage.DMNDI_ROOT: return createDMNDIRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDecisionServiceDividerLine createDMNDecisionServiceDividerLine() {
		DMNDecisionServiceDividerLineImpl dmnDecisionServiceDividerLine = new DMNDecisionServiceDividerLineImpl();
		return dmnDecisionServiceDividerLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDI createDMNDI() {
		DMNDIImpl dmndi = new DMNDIImpl();
		return dmndi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDiagram createDMNDiagram() {
		DMNDiagramImpl dmnDiagram = new DMNDiagramImpl();
		return dmnDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNEdge createDMNEdge() {
		DMNEdgeImpl dmnEdge = new DMNEdgeImpl();
		return dmnEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNLabel createDMNLabel() {
		DMNLabelImpl dmnLabel = new DMNLabelImpl();
		return dmnLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNShape createDMNShape() {
		DMNShapeImpl dmnShape = new DMNShapeImpl();
		return dmnShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNStyle createDMNStyle() {
		DMNStyleImpl dmnStyle = new DMNStyleImpl();
		return dmnStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDIRoot createDMNDIRoot() {
		DMNDIRootImpl dmndiRoot = new DMNDIRootImpl();
		return dmndiRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDIPackage getDMNDIPackage() {
		return (DMNDIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DMNDIPackage getPackage() {
		return DMNDIPackage.eINSTANCE;
	}

} //DMNDIFactoryImpl
