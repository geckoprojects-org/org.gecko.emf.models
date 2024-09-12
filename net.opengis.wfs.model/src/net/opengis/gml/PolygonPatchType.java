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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Patch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PolygonPatch is a surface patch that is defined by a set of boundary curves and an underlying surface to which these curves adhere. The curves are coplanar and the polygon uses planar interpolation in its interior. Implements GM_Polygon of ISO 19107.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.PolygonPatchType#getExteriorGroup <em>Exterior Group</em>}</li>
 *   <li>{@link net.opengis.gml.PolygonPatchType#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml.PolygonPatchType#getInteriorGroup <em>Interior Group</em>}</li>
 *   <li>{@link net.opengis.gml.PolygonPatchType#getInterior <em>Interior</em>}</li>
 *   <li>{@link net.opengis.gml.PolygonPatchType#getInterpolation <em>Interpolation</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getPolygonPatchType()
 * @model extendedMetaData="name='PolygonPatchType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PolygonPatchType extends AbstractSurfacePatchType {
	/**
	 * Returns the value of the '<em><b>Exterior Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. In the normal 2D case, one of these rings is distinguished as being the exterior boundary. In a general manifold this is not always possible, in which case all boundaries shall be listed as interior boundaries, and the exterior will be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exterior Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getPolygonPatchType_ExteriorGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='exterior:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExteriorGroup();

	/**
	 * Returns the value of the '<em><b>Exterior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. In the normal 2D case, one of these rings is distinguished as being the exterior boundary. In a general manifold this is not always possible, in which case all boundaries shall be listed as interior boundaries, and the exterior will be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exterior</em>' containment reference.
	 * @see #setExterior(AbstractRingPropertyType)
	 * @see net.opengis.gml.GMLPackage#getPolygonPatchType_Exterior()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exterior' namespace='##targetNamespace' group='exterior:group'"
	 * @generated
	 */
	AbstractRingPropertyType getExterior();

	/**
	 * Sets the value of the '{@link net.opengis.gml.PolygonPatchType#getExterior <em>Exterior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior</em>' containment reference.
	 * @see #getExterior()
	 * @generated
	 */
	void setExterior(AbstractRingPropertyType value);

	/**
	 * Returns the value of the '<em><b>Interior Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. The "interior" rings seperate the surface / surface patch from the area enclosed by the rings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interior Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getPolygonPatchType_InteriorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='interior:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInteriorGroup();

	/**
	 * Returns the value of the '<em><b>Interior</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AbstractRingPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. The "interior" rings seperate the surface / surface patch from the area enclosed by the rings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interior</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getPolygonPatchType_Interior()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interior' namespace='##targetNamespace' group='interior:group'"
	 * @generated
	 */
	EList<AbstractRingPropertyType> getInterior();

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' attribute.
	 * The default value is <code>"planar"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml.SurfaceInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute "interpolation" specifies the interpolation mechanism used for this surface patch. Currently only planar surface patches are defined in GML 3, the attribute is fixed to "planar", i.e. the interpolation method shall return points on a single plane. The boundary of the patch shall be contained within that plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml.SurfaceInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #setInterpolation(SurfaceInterpolationType)
	 * @see net.opengis.gml.GMLPackage#getPolygonPatchType_Interpolation()
	 * @model default="planar" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interpolation'"
	 * @generated
	 */
	SurfaceInterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.PolygonPatchType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml.SurfaceInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(SurfaceInterpolationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.PolygonPatchType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(SurfaceInterpolationType)
	 * @generated
	 */
	void unsetInterpolation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.PolygonPatchType#getInterpolation <em>Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolation</em>' attribute is set.
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(SurfaceInterpolationType)
	 * @generated
	 */
	boolean isSetInterpolation();

} // PolygonPatchType
