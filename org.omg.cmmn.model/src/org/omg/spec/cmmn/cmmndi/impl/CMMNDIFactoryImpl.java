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
package org.omg.spec.cmmn.cmmndi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.omg.spec.cmmn.cmmndi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNDIFactoryImpl extends EFactoryImpl implements CMMNDIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMMNDIFactory init() {
		try {
			CMMNDIFactory theCMMNDIFactory = (CMMNDIFactory)EPackage.Registry.INSTANCE.getEFactory(CMMNDIPackage.eNS_URI);
			if (theCMMNDIFactory != null) {
				return theCMMNDIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CMMNDIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNDIFactoryImpl() {
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
			case CMMNDIPackage.CMMNDI: return createCMMNDI();
			case CMMNDIPackage.CMMN_DIAGRAM: return createCMMNDiagram();
			case CMMNDIPackage.CMMN_EDGE: return createCMMNEdge();
			case CMMNDIPackage.CMMN_LABEL: return createCMMNLabel();
			case CMMNDIPackage.CMMN_SHAPE: return createCMMNShape();
			case CMMNDIPackage.CMMN_STYLE: return createCMMNStyle();
			case CMMNDIPackage.CMMNDI_ROOT: return createCMMNDIRoot();
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
	public CMMNDI createCMMNDI() {
		CMMNDIImpl cmmndi = new CMMNDIImpl();
		return cmmndi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNDiagram createCMMNDiagram() {
		CMMNDiagramImpl cmmnDiagram = new CMMNDiagramImpl();
		return cmmnDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNEdge createCMMNEdge() {
		CMMNEdgeImpl cmmnEdge = new CMMNEdgeImpl();
		return cmmnEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNLabel createCMMNLabel() {
		CMMNLabelImpl cmmnLabel = new CMMNLabelImpl();
		return cmmnLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNShape createCMMNShape() {
		CMMNShapeImpl cmmnShape = new CMMNShapeImpl();
		return cmmnShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNStyle createCMMNStyle() {
		CMMNStyleImpl cmmnStyle = new CMMNStyleImpl();
		return cmmnStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNDIRoot createCMMNDIRoot() {
		CMMNDIRootImpl cmmndiRoot = new CMMNDIRootImpl();
		return cmmndiRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNDIPackage getCMMNDIPackage() {
		return (CMMNDIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CMMNDIPackage getPackage() {
		return CMMNDIPackage.eINSTANCE;
	}

} //CMMNDIFactoryImpl
