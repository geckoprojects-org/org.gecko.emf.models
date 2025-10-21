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
import de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryOverlapTreatmentType;
import de.online.adv.namespaces.adv.sk.xml.skadv.GraphicFillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.RegularityType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic Fill Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getHorizontalDisplacementX <em>Horizontal Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getHorizontalDisplacementY <em>Horizontal Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getVerticalDisplacementX <em>Vertical Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getVerticalDisplacementY <em>Vertical Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getOriginX <em>Origin X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getOriginY <em>Origin Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getBoundaryOverlapTreatment <em>Boundary Overlap Treatment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicFillTypeImpl#getGraphic <em>Graphic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicFillTypeImpl extends FillTypeImpl implements GraphicFillType {
	/**
	 * The default value of the '{@link #getHorizontalDisplacementX() <em>Horizontal Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final double HORIZONTAL_DISPLACEMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHorizontalDisplacementX() <em>Horizontal Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected double horizontalDisplacementX = HORIZONTAL_DISPLACEMENT_X_EDEFAULT;

	/**
	 * This is true if the Horizontal Displacement X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalDisplacementXESet;

	/**
	 * The default value of the '{@link #getHorizontalDisplacementY() <em>Horizontal Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final double HORIZONTAL_DISPLACEMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHorizontalDisplacementY() <em>Horizontal Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected double horizontalDisplacementY = HORIZONTAL_DISPLACEMENT_Y_EDEFAULT;

	/**
	 * This is true if the Horizontal Displacement Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalDisplacementYESet;

	/**
	 * The default value of the '{@link #getVerticalDisplacementX() <em>Vertical Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final double VERTICAL_DISPLACEMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVerticalDisplacementX() <em>Vertical Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected double verticalDisplacementX = VERTICAL_DISPLACEMENT_X_EDEFAULT;

	/**
	 * This is true if the Vertical Displacement X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalDisplacementXESet;

	/**
	 * The default value of the '{@link #getVerticalDisplacementY() <em>Vertical Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final double VERTICAL_DISPLACEMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVerticalDisplacementY() <em>Vertical Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected double verticalDisplacementY = VERTICAL_DISPLACEMENT_Y_EDEFAULT;

	/**
	 * This is true if the Vertical Displacement Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalDisplacementYESet;

	/**
	 * The default value of the '{@link #getOriginX() <em>Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginX()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOriginX() <em>Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginX()
	 * @generated
	 * @ordered
	 */
	protected double originX = ORIGIN_X_EDEFAULT;

	/**
	 * This is true if the Origin X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean originXESet;

	/**
	 * The default value of the '{@link #getOriginY() <em>Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginY()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOriginY() <em>Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginY()
	 * @generated
	 * @ordered
	 */
	protected double originY = ORIGIN_Y_EDEFAULT;

	/**
	 * This is true if the Origin Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean originYESet;

	/**
	 * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final RegularityType PLACEMENT_EDEFAULT = RegularityType.REGULAR;

	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected RegularityType placement = PLACEMENT_EDEFAULT;

	/**
	 * This is true if the Placement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean placementESet;

	/**
	 * The default value of the '{@link #getBoundaryOverlapTreatment() <em>Boundary Overlap Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryOverlapTreatment()
	 * @generated
	 * @ordered
	 */
	protected static final BoundaryOverlapTreatmentType BOUNDARY_OVERLAP_TREATMENT_EDEFAULT = BoundaryOverlapTreatmentType.CLIP;

	/**
	 * The cached value of the '{@link #getBoundaryOverlapTreatment() <em>Boundary Overlap Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryOverlapTreatment()
	 * @generated
	 * @ordered
	 */
	protected BoundaryOverlapTreatmentType boundaryOverlapTreatment = BOUNDARY_OVERLAP_TREATMENT_EDEFAULT;

	/**
	 * This is true if the Boundary Overlap Treatment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boundaryOverlapTreatmentESet;

	/**
	 * The cached value of the '{@link #getGraphic() <em>Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphic()
	 * @generated
	 * @ordered
	 */
	protected GraphicType1 graphic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicFillTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getGraphicFillType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHorizontalDisplacementX() {
		return horizontalDisplacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalDisplacementX(double newHorizontalDisplacementX) {
		double oldHorizontalDisplacementX = horizontalDisplacementX;
		horizontalDisplacementX = newHorizontalDisplacementX;
		boolean oldHorizontalDisplacementXESet = horizontalDisplacementXESet;
		horizontalDisplacementXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_X, oldHorizontalDisplacementX, horizontalDisplacementX, !oldHorizontalDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHorizontalDisplacementX() {
		double oldHorizontalDisplacementX = horizontalDisplacementX;
		boolean oldHorizontalDisplacementXESet = horizontalDisplacementXESet;
		horizontalDisplacementX = HORIZONTAL_DISPLACEMENT_X_EDEFAULT;
		horizontalDisplacementXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_X, oldHorizontalDisplacementX, HORIZONTAL_DISPLACEMENT_X_EDEFAULT, oldHorizontalDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHorizontalDisplacementX() {
		return horizontalDisplacementXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHorizontalDisplacementY() {
		return horizontalDisplacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalDisplacementY(double newHorizontalDisplacementY) {
		double oldHorizontalDisplacementY = horizontalDisplacementY;
		horizontalDisplacementY = newHorizontalDisplacementY;
		boolean oldHorizontalDisplacementYESet = horizontalDisplacementYESet;
		horizontalDisplacementYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_Y, oldHorizontalDisplacementY, horizontalDisplacementY, !oldHorizontalDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHorizontalDisplacementY() {
		double oldHorizontalDisplacementY = horizontalDisplacementY;
		boolean oldHorizontalDisplacementYESet = horizontalDisplacementYESet;
		horizontalDisplacementY = HORIZONTAL_DISPLACEMENT_Y_EDEFAULT;
		horizontalDisplacementYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_Y, oldHorizontalDisplacementY, HORIZONTAL_DISPLACEMENT_Y_EDEFAULT, oldHorizontalDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHorizontalDisplacementY() {
		return horizontalDisplacementYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVerticalDisplacementX() {
		return verticalDisplacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDisplacementX(double newVerticalDisplacementX) {
		double oldVerticalDisplacementX = verticalDisplacementX;
		verticalDisplacementX = newVerticalDisplacementX;
		boolean oldVerticalDisplacementXESet = verticalDisplacementXESet;
		verticalDisplacementXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_X, oldVerticalDisplacementX, verticalDisplacementX, !oldVerticalDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerticalDisplacementX() {
		double oldVerticalDisplacementX = verticalDisplacementX;
		boolean oldVerticalDisplacementXESet = verticalDisplacementXESet;
		verticalDisplacementX = VERTICAL_DISPLACEMENT_X_EDEFAULT;
		verticalDisplacementXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_X, oldVerticalDisplacementX, VERTICAL_DISPLACEMENT_X_EDEFAULT, oldVerticalDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerticalDisplacementX() {
		return verticalDisplacementXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVerticalDisplacementY() {
		return verticalDisplacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDisplacementY(double newVerticalDisplacementY) {
		double oldVerticalDisplacementY = verticalDisplacementY;
		verticalDisplacementY = newVerticalDisplacementY;
		boolean oldVerticalDisplacementYESet = verticalDisplacementYESet;
		verticalDisplacementYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_Y, oldVerticalDisplacementY, verticalDisplacementY, !oldVerticalDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerticalDisplacementY() {
		double oldVerticalDisplacementY = verticalDisplacementY;
		boolean oldVerticalDisplacementYESet = verticalDisplacementYESet;
		verticalDisplacementY = VERTICAL_DISPLACEMENT_Y_EDEFAULT;
		verticalDisplacementYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_Y, oldVerticalDisplacementY, VERTICAL_DISPLACEMENT_Y_EDEFAULT, oldVerticalDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerticalDisplacementY() {
		return verticalDisplacementYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOriginX() {
		return originX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginX(double newOriginX) {
		double oldOriginX = originX;
		originX = newOriginX;
		boolean oldOriginXESet = originXESet;
		originXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_X, oldOriginX, originX, !oldOriginXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOriginX() {
		double oldOriginX = originX;
		boolean oldOriginXESet = originXESet;
		originX = ORIGIN_X_EDEFAULT;
		originXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_X, oldOriginX, ORIGIN_X_EDEFAULT, oldOriginXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOriginX() {
		return originXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOriginY() {
		return originY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginY(double newOriginY) {
		double oldOriginY = originY;
		originY = newOriginY;
		boolean oldOriginYESet = originYESet;
		originYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_Y, oldOriginY, originY, !oldOriginYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOriginY() {
		double oldOriginY = originY;
		boolean oldOriginYESet = originYESet;
		originY = ORIGIN_Y_EDEFAULT;
		originYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_Y, oldOriginY, ORIGIN_Y_EDEFAULT, oldOriginYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOriginY() {
		return originYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularityType getPlacement() {
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlacement(RegularityType newPlacement) {
		RegularityType oldPlacement = placement;
		placement = newPlacement == null ? PLACEMENT_EDEFAULT : newPlacement;
		boolean oldPlacementESet = placementESet;
		placementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__PLACEMENT, oldPlacement, placement, !oldPlacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPlacement() {
		RegularityType oldPlacement = placement;
		boolean oldPlacementESet = placementESet;
		placement = PLACEMENT_EDEFAULT;
		placementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_FILL_TYPE__PLACEMENT, oldPlacement, PLACEMENT_EDEFAULT, oldPlacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPlacement() {
		return placementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryOverlapTreatmentType getBoundaryOverlapTreatment() {
		return boundaryOverlapTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundaryOverlapTreatment(BoundaryOverlapTreatmentType newBoundaryOverlapTreatment) {
		BoundaryOverlapTreatmentType oldBoundaryOverlapTreatment = boundaryOverlapTreatment;
		boundaryOverlapTreatment = newBoundaryOverlapTreatment == null ? BOUNDARY_OVERLAP_TREATMENT_EDEFAULT : newBoundaryOverlapTreatment;
		boolean oldBoundaryOverlapTreatmentESet = boundaryOverlapTreatmentESet;
		boundaryOverlapTreatmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__BOUNDARY_OVERLAP_TREATMENT, oldBoundaryOverlapTreatment, boundaryOverlapTreatment, !oldBoundaryOverlapTreatmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoundaryOverlapTreatment() {
		BoundaryOverlapTreatmentType oldBoundaryOverlapTreatment = boundaryOverlapTreatment;
		boolean oldBoundaryOverlapTreatmentESet = boundaryOverlapTreatmentESet;
		boundaryOverlapTreatment = BOUNDARY_OVERLAP_TREATMENT_EDEFAULT;
		boundaryOverlapTreatmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_FILL_TYPE__BOUNDARY_OVERLAP_TREATMENT, oldBoundaryOverlapTreatment, BOUNDARY_OVERLAP_TREATMENT_EDEFAULT, oldBoundaryOverlapTreatmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoundaryOverlapTreatment() {
		return boundaryOverlapTreatmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType1 getGraphic() {
		return graphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphic(GraphicType1 newGraphic, NotificationChain msgs) {
		GraphicType1 oldGraphic = graphic;
		graphic = newGraphic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC, oldGraphic, newGraphic);
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
	public void setGraphic(GraphicType1 newGraphic) {
		if (newGraphic != graphic) {
			NotificationChain msgs = null;
			if (graphic != null)
				msgs = ((InternalEObject)graphic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC, null, msgs);
			if (newGraphic != null)
				msgs = ((InternalEObject)newGraphic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC, null, msgs);
			msgs = basicSetGraphic(newGraphic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC, newGraphic, newGraphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC:
				return basicSetGraphic(null, msgs);
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
			case AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_X:
				return getHorizontalDisplacementX();
			case AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_Y:
				return getHorizontalDisplacementY();
			case AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_X:
				return getVerticalDisplacementX();
			case AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_Y:
				return getVerticalDisplacementY();
			case AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_X:
				return getOriginX();
			case AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_Y:
				return getOriginY();
			case AAAPackage.GRAPHIC_FILL_TYPE__PLACEMENT:
				return getPlacement();
			case AAAPackage.GRAPHIC_FILL_TYPE__BOUNDARY_OVERLAP_TREATMENT:
				return getBoundaryOverlapTreatment();
			case AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC:
				return getGraphic();
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
			case AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_X:
				setHorizontalDisplacementX((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_Y:
				setHorizontalDisplacementY((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_X:
				setVerticalDisplacementX((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_Y:
				setVerticalDisplacementY((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_X:
				setOriginX((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_Y:
				setOriginY((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__PLACEMENT:
				setPlacement((RegularityType)newValue);
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__BOUNDARY_OVERLAP_TREATMENT:
				setBoundaryOverlapTreatment((BoundaryOverlapTreatmentType)newValue);
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC:
				setGraphic((GraphicType1)newValue);
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
			case AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_X:
				unsetHorizontalDisplacementX();
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_Y:
				unsetHorizontalDisplacementY();
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_X:
				unsetVerticalDisplacementX();
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_Y:
				unsetVerticalDisplacementY();
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_X:
				unsetOriginX();
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_Y:
				unsetOriginY();
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__PLACEMENT:
				unsetPlacement();
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__BOUNDARY_OVERLAP_TREATMENT:
				unsetBoundaryOverlapTreatment();
				return;
			case AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC:
				setGraphic((GraphicType1)null);
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
			case AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_X:
				return isSetHorizontalDisplacementX();
			case AAAPackage.GRAPHIC_FILL_TYPE__HORIZONTAL_DISPLACEMENT_Y:
				return isSetHorizontalDisplacementY();
			case AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_X:
				return isSetVerticalDisplacementX();
			case AAAPackage.GRAPHIC_FILL_TYPE__VERTICAL_DISPLACEMENT_Y:
				return isSetVerticalDisplacementY();
			case AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_X:
				return isSetOriginX();
			case AAAPackage.GRAPHIC_FILL_TYPE__ORIGIN_Y:
				return isSetOriginY();
			case AAAPackage.GRAPHIC_FILL_TYPE__PLACEMENT:
				return isSetPlacement();
			case AAAPackage.GRAPHIC_FILL_TYPE__BOUNDARY_OVERLAP_TREATMENT:
				return isSetBoundaryOverlapTreatment();
			case AAAPackage.GRAPHIC_FILL_TYPE__GRAPHIC:
				return graphic != null;
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
		result.append(" (horizontalDisplacementX: ");
		if (horizontalDisplacementXESet) result.append(horizontalDisplacementX); else result.append("<unset>");
		result.append(", horizontalDisplacementY: ");
		if (horizontalDisplacementYESet) result.append(horizontalDisplacementY); else result.append("<unset>");
		result.append(", verticalDisplacementX: ");
		if (verticalDisplacementXESet) result.append(verticalDisplacementX); else result.append("<unset>");
		result.append(", verticalDisplacementY: ");
		if (verticalDisplacementYESet) result.append(verticalDisplacementY); else result.append("<unset>");
		result.append(", originX: ");
		if (originXESet) result.append(originX); else result.append("<unset>");
		result.append(", originY: ");
		if (originYESet) result.append(originY); else result.append("<unset>");
		result.append(", placement: ");
		if (placementESet) result.append(placement); else result.append("<unset>");
		result.append(", boundaryOverlapTreatment: ");
		if (boundaryOverlapTreatmentESet) result.append(boundaryOverlapTreatment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GraphicFillTypeImpl
